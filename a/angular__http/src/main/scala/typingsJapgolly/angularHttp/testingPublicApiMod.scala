package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingPublicApiMod {
  
  @JSImport("@angular/http/testing/public_api", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typingsJapgolly.angularHttp.testingSrcTestingMod.MockBackend
  
  @JSImport("@angular/http/testing/public_api", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingSrcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
