package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingSrcTestingMod {
  
  @JSImport("@angular/http/testing/src/testing", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typingsJapgolly.angularHttp.testingSrcMockBackendMod.MockBackend
  
  @JSImport("@angular/http/testing/src/testing", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingSrcMockBackendMod.MockConnection {
    def this(req: Request) = this()
  }
}
