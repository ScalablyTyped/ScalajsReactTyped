package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`5`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameWorkerDuty
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `5`
  
  var triggerName: WorkerDuty
}
object TriggerNameWorkerDuty {
  
  inline def apply(triggerName: WorkerDuty): TriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = 5, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameWorkerDuty]
  }
  
  extension [Self <: TriggerNameWorkerDuty](x: Self) {
    
    inline def setTriggerId(value: `5`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: WorkerDuty): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
