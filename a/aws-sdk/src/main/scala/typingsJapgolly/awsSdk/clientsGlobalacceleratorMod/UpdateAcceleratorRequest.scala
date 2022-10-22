package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator to update.
    */
  var AcceleratorArn: GenericString
  
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The IP address type that an accelerator supports. For a standard accelerator, the value can be IPV4 or DUAL_STACK.
    */
  var IpAddressType: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.IpAddressType] = js.undefined
  
  /**
    * The name of the accelerator. The name can have a maximum of 64 characters, must contain only alphanumeric characters, periods (.), or hyphens (-), and must not begin or end with a hyphen or period.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
}
object UpdateAcceleratorRequest {
  
  inline def apply(AcceleratorArn: GenericString): UpdateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorRequest]
  }
  
  extension [Self <: UpdateAcceleratorRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: GenericBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setName(value: GenericString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
