package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nightwatch.mod.NightwatchTestFunctions
  - typingsJapgolly.nightwatch.mod.NightwatchTestHooks
*/
trait NightwatchTests extends StObject
object NightwatchTests {
  
  inline def NightwatchTestFunctions(): typingsJapgolly.nightwatch.mod.NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.nightwatch.mod.NightwatchTestFunctions]
  }
  
  inline def NightwatchTestHooks(
    afterTestCase: Any => js.Promise[Unit],
    afterTestSuite: Any => js.Promise[Unit],
    beforeTestCase: Any => js.Promise[Unit],
    beforeTestSuite: Any => js.Promise[Unit],
    onBrowserNavigate: Any => js.Promise[Unit],
    onBrowserQuit: Any => js.Promise[Unit],
    reporter: (Any, Any) => Callback
  ): typingsJapgolly.nightwatch.mod.NightwatchTestHooks = {
    val __obj = js.Dynamic.literal(afterTestCase = js.Any.fromFunction1(afterTestCase), afterTestSuite = js.Any.fromFunction1(afterTestSuite), beforeTestCase = js.Any.fromFunction1(beforeTestCase), beforeTestSuite = js.Any.fromFunction1(beforeTestSuite), onBrowserNavigate = js.Any.fromFunction1(onBrowserNavigate), onBrowserQuit = js.Any.fromFunction1(onBrowserQuit), reporter = js.Any.fromFunction2((t0: Any, t1: Any) => (reporter(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nightwatch.mod.NightwatchTestHooks]
  }
}
