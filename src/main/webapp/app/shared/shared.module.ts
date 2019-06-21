import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Inochidemo1SharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [Inochidemo1SharedCommonModule],
  declarations: [HasAnyAuthorityDirective],
  exports: [Inochidemo1SharedCommonModule, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Inochidemo1SharedModule {
  static forRoot() {
    return {
      ngModule: Inochidemo1SharedModule
    };
  }
}
