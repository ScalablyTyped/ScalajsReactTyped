package typingsJapgolly.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceState extends StObject {
  
  /**
    * The state of the instance as a 16-bit unsigned integer.  The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored.  The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.  The valid values for the instance state code are all in the range of the low byte. These values are:     0 : pending     16 : running     32 : shutting-down     48 : terminated     64 : stopping     80 : stopped    You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal. 
    */
  var code: js.UndefOr[Integer] = js.undefined
  
  /**
    * The current state of the instance.
    */
  var name: js.UndefOr[InstanceStateName] = js.undefined
}
object InstanceState {
  
  inline def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  
  extension [Self <: InstanceState](x: Self) {
    
    inline def setCode(value: Integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: InstanceStateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
