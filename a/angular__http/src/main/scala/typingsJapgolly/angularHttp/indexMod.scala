package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsJapgolly.angularHttp.testingPublicApiMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

