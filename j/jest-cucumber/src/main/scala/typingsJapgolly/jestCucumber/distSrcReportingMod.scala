package typingsJapgolly.jestCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReportingMod {
  
  @JSImport("jest-cucumber/dist/src/reporting", "Reporter")
  @js.native
  open class Reporter protected () extends StObject {
    def this(globalConfig: Any, options: Any) = this()
    
    def onRunComplete(contexts: Any, results: Any): Unit = js.native
    
    def onTestResult(test: Any, results: Any): js.Promise[js.Tuple10[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]] = js.native
    
    /* private */ var reportEventGenerator: Any = js.native
  }
}
