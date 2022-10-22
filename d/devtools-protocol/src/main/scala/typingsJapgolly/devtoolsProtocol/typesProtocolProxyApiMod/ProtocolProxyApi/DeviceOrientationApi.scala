package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOrientationApi extends StObject {
  
  /**
    * Clears the overridden Device Orientation.
    */
  def clearDeviceOrientationOverride(): js.Promise[Unit]
  
  /**
    * Overrides the Device Orientation.
    */
  def setDeviceOrientationOverride(params: SetDeviceOrientationOverrideRequest): js.Promise[Unit]
}
object DeviceOrientationApi {
  
  inline def apply(
    clearDeviceOrientationOverride: CallbackTo[js.Promise[Unit]],
    setDeviceOrientationOverride: SetDeviceOrientationOverrideRequest => js.Promise[Unit]
  ): DeviceOrientationApi = {
    val __obj = js.Dynamic.literal(clearDeviceOrientationOverride = clearDeviceOrientationOverride.toJsFn, setDeviceOrientationOverride = js.Any.fromFunction1(setDeviceOrientationOverride))
    __obj.asInstanceOf[DeviceOrientationApi]
  }
  
  extension [Self <: DeviceOrientationApi](x: Self) {
    
    inline def setClearDeviceOrientationOverride(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearDeviceOrientationOverride", value.toJsFn)
    
    inline def setSetDeviceOrientationOverride(value: SetDeviceOrientationOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setDeviceOrientationOverride", js.Any.fromFunction1(value))
  }
}
