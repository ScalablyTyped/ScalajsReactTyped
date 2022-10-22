package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResOpFailedEvent extends StObject {
  
  var metadata: StepEventMetadata
  
  var status: Double
  
  var steps: Double
}
object ResOpFailedEvent {
  
  inline def apply(metadata: StepEventMetadata, status: Double, steps: Double): ResOpFailedEvent = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResOpFailedEvent]
  }
  
  extension [Self <: ResOpFailedEvent](x: Self) {
    
    inline def setMetadata(value: StepEventMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}
