package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a location event that triggers a background task. This is used for Geofencing. */
trait LocationTrigger extends StObject {
  
  /** The type of location event for this trigger. */
  var triggerType: LocationTriggerType
}
object LocationTrigger {
  
  inline def apply(triggerType: LocationTriggerType): LocationTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTrigger]
  }
  
  extension [Self <: LocationTrigger](x: Self) {
    
    inline def setTriggerType(value: LocationTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
