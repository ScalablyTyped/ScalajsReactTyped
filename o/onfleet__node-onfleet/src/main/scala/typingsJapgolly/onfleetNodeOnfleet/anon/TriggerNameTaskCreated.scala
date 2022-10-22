package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`6`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskCreated
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `6`
  
  var triggerName: TaskCreated
}
object TriggerNameTaskCreated {
  
  inline def apply(triggerName: TaskCreated): TriggerNameTaskCreated = {
    val __obj = js.Dynamic.literal(triggerId = 6, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCreated]
  }
  
  extension [Self <: TriggerNameTaskCreated](x: Self) {
    
    inline def setTriggerId(value: `6`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskCreated): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
