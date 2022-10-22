package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`0`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerId
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `0`
  
  var triggerName: TaskStarted
}
object TriggerId {
  
  inline def apply(triggerName: TaskStarted): TriggerId = {
    val __obj = js.Dynamic.literal(triggerId = 0, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerId]
  }
  
  extension [Self <: TriggerId](x: Self) {
    
    inline def setTriggerId(value: `0`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskStarted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
