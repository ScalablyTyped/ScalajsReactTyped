package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a maintenance trigger. */
trait MaintenanceTrigger extends StObject {
  
  /** Gets the interval of a maintenance trigger. */
  var freshnessTime: Double
  
  /** Gets whether the maintenance trigger is used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean
}
object MaintenanceTrigger {
  
  inline def apply(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceTrigger]
  }
  
  extension [Self <: MaintenanceTrigger](x: Self) {
    
    inline def setFreshnessTime(value: Double): Self = StObject.set(x, "freshnessTime", value.asInstanceOf[js.Any])
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
  }
}
