import { Component, OnInit } from '@angular/core';
import { Book } from '../model/book';

const LIVROS: Book[] = [
  {
    title: '1984',
    author: 'George Orwell',
    publicationYear: 1949,
    publisher: 'Secker & Warburg',
    genre: 'Ficção distópica',
    pageCount: 328,
  },
  {
    title: 'A Revolução dos Bichos',
    author: 'George Orwell',
    publicationYear: 1945,
    publisher: 'Secker & Warburg',
    genre: 'Sátira',
    pageCount: 112,
  },
  {
    title: 'Cem Anos de Solidão',
    author: 'Gabriel García Márquez',
    publicationYear: 1967,
    publisher: 'Harper & Row',
    genre: 'Realismo mágico',
    pageCount: 448,
  },
  {
    title: 'Crime e Castigo',
    author: 'Fiódor Dostoiévski',
    publicationYear: 1866,
    publisher: 'publisher 34',
    genre: 'Romance psicológico',
    pageCount: 558,
  },
  {
    title: 'Dom Casmurro',
    author: 'Machado de Assis',
    publicationYear: 1899,
    publisher: 'Garnier',
    genre: 'Romance realista',
    pageCount: 256,
  },
  {
    title: 'Dom Quixote',
    author: 'Miguel de Cervantes',
    publicationYear: 1605,
    publisher: 'Francisco de Robles',
    genre: 'Romance',
    pageCount: 863,
  },
  {
    title: 'Fausto',
    author: 'Johann Wolfgang von Goethe',
    publicationYear: 1808,
    publisher: 'Reclam',
    genre: 'Tragédia',
    pageCount: 328,
  },
  {
    title: 'Frankenstein',
    author: 'Mary Shelley',
    publicationYear: 1818,
    publisher: 'Lackington, Hughes, Harding, Mavor & Jones',
    genre: 'Romance gótico',
    pageCount: 280,
  },
  {
    title: 'Guerra e Paz',
    author: 'Lieon Tolstói',
    publicationYear: 1869,
    publisher: 'The Russian Messenger',
    genre: 'Romance histórico',
    pageCount: 1225,
  },
  {
    title: 'Hamlet',
    author: 'William Shakespeare',
    publicationYear: 1603,
    publisher: 'Lingua Franca',
    genre: 'Tragédia',
    pageCount: 304,
  },
  {
    title: 'Moby Dick',
    author: 'Herman Melville',
    publicationYear: 1851,
    publisher: 'Harper & Brothers',
    genre: 'Romance',
    pageCount: 585,
  },
  {
    title: 'Lolita',
    author: 'Vladimir Nabokov',
    publicationYear: 1955,
    publisher: 'Olympia Press',
    genre: 'Romance erótico',
    pageCount: 336,
  },
];

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
  dataSource = LIVROS;

  constructor() {}

  ngOnInit(): void {}
}
