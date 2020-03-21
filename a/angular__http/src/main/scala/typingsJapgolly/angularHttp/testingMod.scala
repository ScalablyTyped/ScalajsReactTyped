package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsJapgolly.angularHttp.testingTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

