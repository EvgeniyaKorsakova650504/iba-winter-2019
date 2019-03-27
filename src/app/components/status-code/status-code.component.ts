import { Component, OnInit } from '@angular/core';
import {StatusCodeService} from '../../services/status-code.service';

@Component({
  selector: 'app-status-code',
  templateUrl: './status-code.component.html',
  styleUrls: ['./status-code.component.scss'],
  providers: [StatusCodeService]
})
export class StatusCodeComponent implements OnInit {

  public statusCodes ;
  public selectCode;
  constructor(private sampleService: StatusCodeService) {

  }
  ngOnInit() {
    this.statusCodes = this.sampleService.getStatusCode();
  }

  myClickFunction(event, code) {
    console.log(event);
    this.selectCode = code;
    console.log(this.selectCode);
  }
}
