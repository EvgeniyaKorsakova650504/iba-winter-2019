import { Injectable } from '@angular/core';
import {STATUS_CODES} from '../mocks/status-codes-mock';

@Injectable({
  providedIn: 'root'
})
export class StatusCodeService {

  constructor() { }
  getStatusCode() {
    const statusCode = STATUS_CODES;
    return statusCode;
  }
}
