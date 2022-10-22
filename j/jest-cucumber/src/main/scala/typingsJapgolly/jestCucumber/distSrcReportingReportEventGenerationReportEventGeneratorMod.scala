package typingsJapgolly.jestCucumber

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReportingReportEventGenerationReportEventGeneratorMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/report-event-generation/ReportEventGenerator", "ReportEventGenerator")
  @js.native
  open class ReportEventGenerator () extends StObject {
    
    /* private */ var calculateTotalDuration: Any = js.native
    
    var eventBroadcaster: EventEmitter = js.native
    
    var eventDataCollector: Any = js.native
    
    /* private */ var featureFileEventGenerator: Any = js.native
    
    def onScenarioComplete(jestTestResult: Any): js.Promise[js.Tuple10[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]] = js.native
    
    def onTestRunComplete(jestTestResult: Any): Unit = js.native
    
    /* private */ var testCaseEventGenerator: Any = js.native
  }
}
