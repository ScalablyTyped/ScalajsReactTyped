package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/http/testing/testing", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typingsJapgolly.angularHttp.testingIndexMod.MockBackend
  
  @JSImport("@angular/http/testing/testing", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingIndexMod.MockConnection {
    def this(req: Request) = this()
  }
}
