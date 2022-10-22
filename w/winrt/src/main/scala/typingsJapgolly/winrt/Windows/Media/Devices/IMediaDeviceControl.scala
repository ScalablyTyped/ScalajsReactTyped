package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.anon.SucceededBoolean
import typingsJapgolly.winrt.anon.SucceededValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceControl extends StObject {
  
  var capabilities: MediaDeviceControlCapabilities
  
  def tryGetAuto(): SucceededBoolean
  
  def tryGetValue(): SucceededValue
  
  def trySetAuto(value: Boolean): Boolean
  
  def trySetValue(value: Double): Boolean
}
object IMediaDeviceControl {
  
  inline def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: CallbackTo[SucceededBoolean],
    tryGetValue: CallbackTo[SucceededValue],
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = tryGetAuto.toJsFn, tryGetValue = tryGetValue.toJsFn, trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[IMediaDeviceControl]
  }
  
  extension [Self <: IMediaDeviceControl](x: Self) {
    
    inline def setCapabilities(value: MediaDeviceControlCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setTryGetAuto(value: CallbackTo[SucceededBoolean]): Self = StObject.set(x, "tryGetAuto", value.toJsFn)
    
    inline def setTryGetValue(value: CallbackTo[SucceededValue]): Self = StObject.set(x, "tryGetValue", value.toJsFn)
    
    inline def setTrySetAuto(value: Boolean => Boolean): Self = StObject.set(x, "trySetAuto", js.Any.fromFunction1(value))
    
    inline def setTrySetValue(value: Double => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
  }
}
