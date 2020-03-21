package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/public_api", JSImport.Namespace)
@js.native
object testingPublicApiMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsJapgolly.angularHttp.srcTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsJapgolly.angularHttp.srcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

