package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/http/testing", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typingsJapgolly.angularHttp.testingTestingMod.MockBackend
  
  @JSImport("@angular/http/testing", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
