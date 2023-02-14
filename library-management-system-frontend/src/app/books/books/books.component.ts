import { Component, OnInit } from '@angular/core';
import { Book } from '../model/book';
import { BooksService } from '../services/books.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
})
export class BooksComponent implements OnInit {
  displayedColumns: string[] = [
    'Titulo',
    'Autor',
    'Ano de Publicação',
    'Gênero',
    'Páginas',
  ];

  dataSource: Book[] = [];

  constructor(private service: BooksService) {}

  ngOnInit(): void {
    this.dataSource = this.service.list();
  }
}
