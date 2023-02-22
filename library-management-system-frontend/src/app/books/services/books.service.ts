import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../model/book';
import { Observable } from 'rxjs';
import { first } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class BooksService {

  private readonly  API = 'api/book';

  constructor(private httpClient: HttpClient) {}

  listAll(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(this.API).pipe(first());
  }
}
