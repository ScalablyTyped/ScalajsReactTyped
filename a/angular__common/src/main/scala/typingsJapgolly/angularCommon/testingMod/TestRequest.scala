package typingsJapgolly.angularCommon.testingMod

import typingsJapgolly.angularCommon.httpHttpMod.HttpEvent
import typingsJapgolly.angularCommon.httpMod.HttpRequest
import typingsJapgolly.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing", "TestRequest")
@js.native
class TestRequest protected ()
  extends typingsJapgolly.angularCommon.testingTestingMod.TestRequest {
  def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
}

