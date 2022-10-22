package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingIndexMod {
  
  @JSImport("@angular/http/testing/index", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typingsJapgolly.angularHttp.testingPublicApiMod.MockBackend
  
  @JSImport("@angular/http/testing/index", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typingsJapgolly.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
}
