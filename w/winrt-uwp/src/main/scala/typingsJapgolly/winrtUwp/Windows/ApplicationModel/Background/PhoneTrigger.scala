package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a phone event that triggers a background task. */
trait PhoneTrigger extends StObject {
  
  /** Gets a Boolean value indicating if the trigger is a one-shot notification. */
  var oneShot: Boolean
  
  /** Gets the type of phone event indicated by the trigger. */
  var triggerType: PhoneTriggerType
}
object PhoneTrigger {
  
  inline def apply(oneShot: Boolean, triggerType: PhoneTriggerType): PhoneTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneTrigger]
  }
  
  extension [Self <: PhoneTrigger](x: Self) {
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: PhoneTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
