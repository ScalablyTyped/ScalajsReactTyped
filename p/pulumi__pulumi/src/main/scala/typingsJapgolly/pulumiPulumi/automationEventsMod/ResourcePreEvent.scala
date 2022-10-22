package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePreEvent extends StObject {
  
  var metadata: StepEventMetadata
  
  var planning: js.UndefOr[Boolean] = js.undefined
}
object ResourcePreEvent {
  
  inline def apply(metadata: StepEventMetadata): ResourcePreEvent = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePreEvent]
  }
  
  extension [Self <: ResourcePreEvent](x: Self) {
    
    inline def setMetadata(value: StepEventMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPlanning(value: Boolean): Self = StObject.set(x, "planning", value.asInstanceOf[js.Any])
    
    inline def setPlanningUndefined: Self = StObject.set(x, "planning", js.undefined)
  }
}
