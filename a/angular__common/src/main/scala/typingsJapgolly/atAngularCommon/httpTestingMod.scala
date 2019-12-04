package typingsJapgolly.atAngularCommon

import typingsJapgolly.atAngularCommon.httpHttpMod.HttpEvent
import typingsJapgolly.atAngularCommon.httpMod.HttpRequest
import typingsJapgolly.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing", JSImport.Namespace)
@js.native
object httpTestingMod extends js.Object {
  @js.native
  class HttpClientTestingModule ()
    extends typingsJapgolly.atAngularCommon.httpTestingTestingMod.HttpClientTestingModule
  
  @js.native
  abstract class HttpTestingController ()
    extends typingsJapgolly.atAngularCommon.httpTestingTestingMod.HttpTestingController
  
  @js.native
  class TestRequest protected ()
    extends typingsJapgolly.atAngularCommon.httpTestingTestingMod.TestRequest {
    def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  }
  
  @js.native
  class ɵangular_packages_common_http_testing_testing_a ()
    extends typingsJapgolly.atAngularCommon.httpTestingTestingMod.ɵangular_packages_common_http_testing_testing_a
  
}

