package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsJapgolly.angularHttp.indexMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsJapgolly.angularHttp.indexMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

