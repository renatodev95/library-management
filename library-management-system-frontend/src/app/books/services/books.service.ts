import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root',
})
export class BooksService {
  constructor(private httpClient: HttpClient) {}

  list(): Book[] {
    return [
      {
        _id: 1,
        title: 'Dom Quixote',
        author: 'Miguel de Cervantes',
        publicationYear: 1605,
        publisher: 'Francisco de Robles',
        genre: 'Romance',
        pageCount: 863,
      },
      {
        _id: 2,
        title: 'Fausto',
        author: 'Johann Wolfgang von Goethe',
        publicationYear: 1808,
        publisher: 'Reclam',
        genre: 'Tragédia',
        pageCount: 328,
      },
      {
        _id: 3,
        title: 'Frankenstein',
        author: 'Mary Shelley',
        publicationYear: 1818,
        publisher: 'Lackington, Hughes, Harding, Mavor & Jones',
        genre: 'Romance gótico',
        pageCount: 280,
      },
      {
        _id: 4,
        title: 'Guerra e Paz',
        author: 'Lieon Tolstói',
        publicationYear: 1869,
        publisher: 'The Russian Messenger',
        genre: 'Romance histórico',
        pageCount: 1225,
      },
      {
        _id: 5,
        title: 'Hamlet',
        author: 'William Shakespeare',
        publicationYear: 1603,
        publisher: 'Lingua Franca',
        genre: 'Tragédia',
        pageCount: 304,
      },
    ];
  }
}
