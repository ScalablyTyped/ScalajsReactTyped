package typingsJapgolly.jestCucumber

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReportingReportEventGenerationFeatureFileEventGeneratorMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/report-event-generation/FeatureFileEventGenerator", "FeatureFileEventGenerator")
  @js.native
  open class FeatureFileEventGenerator protected () extends StObject {
    def this(eventBroadcaster: EventEmitter) = this()
    
    /* private */ var eventBroadcaster: Any = js.native
    
    def generateEventsFromFeatureFile(featureFilePath: String): js.Promise[Unit] = js.native
    
    /* private */ var processedFeatureFiles: Any = js.native
  }
}
