package typingsJapgolly.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedType[T] extends StObject {
  
  /** The active value currently used by the network configuration manager (e.g. Shill). */
  var Active: js.UndefOr[T] = js.undefined
  
  /**
    * Whether a DevicePolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var DeviceEditable: js.UndefOr[Boolean] = js.undefined
  
  /** The property value provided by the device policy. */
  var DevicePolicy: js.UndefOr[T] = js.undefined
  
  /** The source from which the effective property value was determined. */
  var Effective: js.UndefOr[String] = js.undefined
  
  /** The value set for all users of the device. Only provided if *DeviceEditiable* is true. */
  var SharedSetting: js.UndefOr[T] = js.undefined
  
  /**
    * Whether a UserPolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var UserEditable: js.UndefOr[Boolean] = js.undefined
  
  /** The property value provided by the user policy. */
  var UserPolicy: js.UndefOr[T] = js.undefined
  
  /** The property value set by the logged in user. Only provided if *UserEditable* is true. */
  var UserSetting: js.UndefOr[T] = js.undefined
}
object ManagedType {
  
  inline def apply[T](): ManagedType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedType[T]]
  }
  
  extension [Self <: ManagedType[?], T](x: Self & ManagedType[T]) {
    
    inline def setActive(value: T): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setDeviceEditable(value: Boolean): Self = StObject.set(x, "DeviceEditable", value.asInstanceOf[js.Any])
    
    inline def setDeviceEditableUndefined: Self = StObject.set(x, "DeviceEditable", js.undefined)
    
    inline def setDevicePolicy(value: T): Self = StObject.set(x, "DevicePolicy", value.asInstanceOf[js.Any])
    
    inline def setDevicePolicyUndefined: Self = StObject.set(x, "DevicePolicy", js.undefined)
    
    inline def setEffective(value: String): Self = StObject.set(x, "Effective", value.asInstanceOf[js.Any])
    
    inline def setEffectiveUndefined: Self = StObject.set(x, "Effective", js.undefined)
    
    inline def setSharedSetting(value: T): Self = StObject.set(x, "SharedSetting", value.asInstanceOf[js.Any])
    
    inline def setSharedSettingUndefined: Self = StObject.set(x, "SharedSetting", js.undefined)
    
    inline def setUserEditable(value: Boolean): Self = StObject.set(x, "UserEditable", value.asInstanceOf[js.Any])
    
    inline def setUserEditableUndefined: Self = StObject.set(x, "UserEditable", js.undefined)
    
    inline def setUserPolicy(value: T): Self = StObject.set(x, "UserPolicy", value.asInstanceOf[js.Any])
    
    inline def setUserPolicyUndefined: Self = StObject.set(x, "UserPolicy", js.undefined)
    
    inline def setUserSetting(value: T): Self = StObject.set(x, "UserSetting", value.asInstanceOf[js.Any])
    
    inline def setUserSettingUndefined: Self = StObject.set(x, "UserSetting", js.undefined)
  }
}
