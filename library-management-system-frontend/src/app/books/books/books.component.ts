import { toArray } from 'rxjs/operators';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { Book } from '../model/book';
import { BooksService } from '../services/books.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
})
export class BooksComponent implements OnInit {

  displayedColumns: string[] = ['cover', 'title', 'author', 'pageCount'];
  books: Book[] = [];

  constructor(private booksService: BooksService) {
    this.refresh();
  }

  ngOnInit(): void {}

  refresh() {
    this.booksService.listAll()
    .subscribe(
      (books) => {
        this.books = books;
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
