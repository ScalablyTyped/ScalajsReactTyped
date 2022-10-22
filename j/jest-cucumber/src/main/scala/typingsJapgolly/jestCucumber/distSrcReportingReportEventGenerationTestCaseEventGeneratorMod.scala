package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcReportingScenarioResultTrackingScenarioResultTrackerMod.IScenarioResult
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReportingReportEventGenerationTestCaseEventGeneratorMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/report-event-generation/TestCaseEventGenerator", "TestCaseEventGenerator")
  @js.native
  open class TestCaseEventGenerator protected () extends StObject {
    def this(eventBroadcaster: EventEmitter, eventDataCollector: Any) = this()
    
    /* private */ var eventBroadcaster: Any = js.native
    
    /* private */ var eventDataCollector: Any = js.native
    
    def generateTestCaseFinishedEvent(scenarioResult: IScenarioResult, testResult: Any): Unit = js.native
    
    def generateTestCasePreparedEvent(scenarioResult: IScenarioResult): Unit = js.native
    
    def generateTestCaseStepEvents(scenarioResult: IScenarioResult): Unit = js.native
    
    /* private */ var getTestCasePickle: Any = js.native
    
    /* private */ var getTestCaseSourceLocation: Any = js.native
  }
}
