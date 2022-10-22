package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalDeviceSourceManager
  extends StObject
     with IDisposable {
  
  val _deviceInputSystem: IDeviceInputSystem
  
  /* private */ val _devices: Any
  
  var _refCount: Double
  
  /* private */ val _registeredManagers: Any
  
  def registerManager(manager: IObservableManager): Unit
  
  def unregisterManager(manager: IObservableManager): Unit
}
object InternalDeviceSourceManager {
  
  inline def apply(
    _deviceInputSystem: IDeviceInputSystem,
    _devices: Any,
    _refCount: Double,
    _registeredManagers: Any,
    dispose: Callback,
    registerManager: IObservableManager => Callback,
    unregisterManager: IObservableManager => Callback
  ): InternalDeviceSourceManager = {
    val __obj = js.Dynamic.literal(_deviceInputSystem = _deviceInputSystem.asInstanceOf[js.Any], _devices = _devices.asInstanceOf[js.Any], _refCount = _refCount.asInstanceOf[js.Any], _registeredManagers = _registeredManagers.asInstanceOf[js.Any], dispose = dispose.toJsFn, registerManager = js.Any.fromFunction1((t0: IObservableManager) => registerManager(t0).runNow()), unregisterManager = js.Any.fromFunction1((t0: IObservableManager) => unregisterManager(t0).runNow()))
    __obj.asInstanceOf[InternalDeviceSourceManager]
  }
  
  extension [Self <: InternalDeviceSourceManager](x: Self) {
    
    inline def setRegisterManager(value: IObservableManager => Callback): Self = StObject.set(x, "registerManager", js.Any.fromFunction1((t0: IObservableManager) => value(t0).runNow()))
    
    inline def setUnregisterManager(value: IObservableManager => Callback): Self = StObject.set(x, "unregisterManager", js.Any.fromFunction1((t0: IObservableManager) => value(t0).runNow()))
    
    inline def set_deviceInputSystem(value: IDeviceInputSystem): Self = StObject.set(x, "_deviceInputSystem", value.asInstanceOf[js.Any])
    
    inline def set_devices(value: Any): Self = StObject.set(x, "_devices", value.asInstanceOf[js.Any])
    
    inline def set_refCount(value: Double): Self = StObject.set(x, "_refCount", value.asInstanceOf[js.Any])
    
    inline def set_registeredManagers(value: Any): Self = StObject.set(x, "_registeredManagers", value.asInstanceOf[js.Any])
  }
}
