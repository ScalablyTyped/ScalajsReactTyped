package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`7`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskUpdated
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `7`
  
  var triggerName: TaskUpdated
}
object TriggerNameTaskUpdated {
  
  inline def apply(triggerName: TaskUpdated): TriggerNameTaskUpdated = {
    val __obj = js.Dynamic.literal(triggerId = 7, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUpdated]
  }
  
  extension [Self <: TriggerNameTaskUpdated](x: Self) {
    
    inline def setTriggerId(value: `7`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskUpdated): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
