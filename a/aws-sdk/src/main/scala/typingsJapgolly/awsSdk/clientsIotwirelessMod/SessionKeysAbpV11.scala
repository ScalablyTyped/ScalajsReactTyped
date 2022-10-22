package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionKeysAbpV11 extends StObject {
  
  /**
    * The AppSKey value.
    */
  var AppSKey: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.AppSKey] = js.undefined
  
  /**
    * The FNwkSIntKey value.
    */
  var FNwkSIntKey: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.FNwkSIntKey] = js.undefined
  
  /**
    * The NwkSEncKey value.
    */
  var NwkSEncKey: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.NwkSEncKey] = js.undefined
  
  /**
    * The SNwkSIntKey value.
    */
  var SNwkSIntKey: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.SNwkSIntKey] = js.undefined
}
object SessionKeysAbpV11 {
  
  inline def apply(): SessionKeysAbpV11 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionKeysAbpV11]
  }
  
  extension [Self <: SessionKeysAbpV11](x: Self) {
    
    inline def setAppSKey(value: AppSKey): Self = StObject.set(x, "AppSKey", value.asInstanceOf[js.Any])
    
    inline def setAppSKeyUndefined: Self = StObject.set(x, "AppSKey", js.undefined)
    
    inline def setFNwkSIntKey(value: FNwkSIntKey): Self = StObject.set(x, "FNwkSIntKey", value.asInstanceOf[js.Any])
    
    inline def setFNwkSIntKeyUndefined: Self = StObject.set(x, "FNwkSIntKey", js.undefined)
    
    inline def setNwkSEncKey(value: NwkSEncKey): Self = StObject.set(x, "NwkSEncKey", value.asInstanceOf[js.Any])
    
    inline def setNwkSEncKeyUndefined: Self = StObject.set(x, "NwkSEncKey", js.undefined)
    
    inline def setSNwkSIntKey(value: SNwkSIntKey): Self = StObject.set(x, "SNwkSIntKey", value.asInstanceOf[js.Any])
    
    inline def setSNwkSIntKeyUndefined: Self = StObject.set(x, "SNwkSIntKey", js.undefined)
  }
}
