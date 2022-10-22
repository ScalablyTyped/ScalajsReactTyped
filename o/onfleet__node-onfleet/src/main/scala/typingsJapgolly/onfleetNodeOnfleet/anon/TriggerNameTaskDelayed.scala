package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`12`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskDelayed
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `12`
  
  var triggerName: TaskDelayed
}
object TriggerNameTaskDelayed {
  
  inline def apply(triggerName: TaskDelayed): TriggerNameTaskDelayed = {
    val __obj = js.Dynamic.literal(triggerId = 12, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDelayed]
  }
  
  extension [Self <: TriggerNameTaskDelayed](x: Self) {
    
    inline def setTriggerId(value: `12`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskDelayed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
