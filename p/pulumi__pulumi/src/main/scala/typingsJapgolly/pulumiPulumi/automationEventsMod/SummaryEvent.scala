package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.pulumiPulumi.automationStackMod.OpMap
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryEvent extends StObject {
  
  var durationSeconds: Double
  
  var maybeCorrupt: Boolean
  
  var policyPacks: Record[String, String]
  
  var resourceChanges: OpMap
}
object SummaryEvent {
  
  inline def apply(
    durationSeconds: Double,
    maybeCorrupt: Boolean,
    policyPacks: Record[String, String],
    resourceChanges: OpMap
  ): SummaryEvent = {
    val __obj = js.Dynamic.literal(durationSeconds = durationSeconds.asInstanceOf[js.Any], maybeCorrupt = maybeCorrupt.asInstanceOf[js.Any], policyPacks = policyPacks.asInstanceOf[js.Any], resourceChanges = resourceChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryEvent]
  }
  
  extension [Self <: SummaryEvent](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaybeCorrupt(value: Boolean): Self = StObject.set(x, "maybeCorrupt", value.asInstanceOf[js.Any])
    
    inline def setPolicyPacks(value: Record[String, String]): Self = StObject.set(x, "policyPacks", value.asInstanceOf[js.Any])
    
    inline def setResourceChanges(value: OpMap): Self = StObject.set(x, "resourceChanges", value.asInstanceOf[js.Any])
  }
}
