package typingsJapgolly.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoBattery
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Indicates whether the battery source is currently charging.
    */
  val isCharging: Boolean
  
  /**
    * An attribute to specify the remaining level of an internal battery, scaled from 0 to 1:
    *
    * *   0 indicates that the battery level is the lowest and the system is about to enter shutdown mode.
    * *   1 indicates that the system's charge is maximum.
    * Any threshold parameter used in a watch operation to monitor this property applies to this attribute.
    */
  val level: Double
  
  /**
    * Estimated time to discharge, in minutes.
    *
    * This parameter is mutually exclusive with parameter _timeToFullCharge_.
    * An attribute _timeToDischarge_ becomes null when device is plugged.
    *
    * This attribute may equal to \-1 indicating there is no enough collected data, which means
    * that the device is still learning device's power usage characteristics and cannot predict the time yet.
    * This process may take up to few days.
    *
    * @since 4.0
    */
  val timeToDischarge: Double | Null
  
  /**
    * Estimated time to finish charging battery, in minutes.
    *
    * This parameter is mutually exclusive with parameter _timeToDischarge_.
    * An attribute _timeToFullCharge_ becomes null when device is unplugged.
    *
    * This attribute may equal to \-1 indicating there is no enough collected data, which means
    * that the device is still learning device's power usage characteristics and cannot predict the time yet.
    * This process may take up to few days.
    *
    * @since 4.0
    */
  val timeToFullCharge: Double | Null
}
object SystemInfoBattery {
  
  inline def apply(isCharging: Boolean, level: Double): SystemInfoBattery = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], timeToDischarge = null, timeToFullCharge = null)
    __obj.asInstanceOf[SystemInfoBattery]
  }
  
  extension [Self <: SystemInfoBattery](x: Self) {
    
    inline def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setTimeToDischarge(value: Double): Self = StObject.set(x, "timeToDischarge", value.asInstanceOf[js.Any])
    
    inline def setTimeToDischargeNull: Self = StObject.set(x, "timeToDischarge", null)
    
    inline def setTimeToFullCharge(value: Double): Self = StObject.set(x, "timeToFullCharge", value.asInstanceOf[js.Any])
    
    inline def setTimeToFullChargeNull: Self = StObject.set(x, "timeToFullCharge", null)
  }
}
