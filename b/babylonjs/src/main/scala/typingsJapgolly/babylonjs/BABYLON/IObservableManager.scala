package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObservableManager extends StObject {
  
  def _addDevice(deviceSource: DeviceSource[DeviceType]): Unit
  
  def _onInputChanged(deviceType: DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit
  
  def _removeDevice(deviceType: DeviceType, deviceSlot: Double): Unit
  
  var onDeviceConnectedObservable: Observable[DeviceSourceType]
  
  var onDeviceDisconnectedObservable: Observable[DeviceSourceType]
}
object IObservableManager {
  
  inline def apply(
    _addDevice: DeviceSource[DeviceType] => Callback,
    _onInputChanged: (DeviceType, Double, IUIEvent) => Callback,
    _removeDevice: (DeviceType, Double) => Callback,
    onDeviceConnectedObservable: Observable[DeviceSourceType],
    onDeviceDisconnectedObservable: Observable[DeviceSourceType]
  ): IObservableManager = {
    val __obj = js.Dynamic.literal(_addDevice = js.Any.fromFunction1((t0: DeviceSource[DeviceType]) => _addDevice(t0).runNow()), _onInputChanged = js.Any.fromFunction3((t0: DeviceType, t1: Double, t2: IUIEvent) => (_onInputChanged(t0, t1, t2)).runNow()), _removeDevice = js.Any.fromFunction2((t0: DeviceType, t1: Double) => (_removeDevice(t0, t1)).runNow()), onDeviceConnectedObservable = onDeviceConnectedObservable.asInstanceOf[js.Any], onDeviceDisconnectedObservable = onDeviceDisconnectedObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableManager]
  }
  
  extension [Self <: IObservableManager](x: Self) {
    
    inline def setOnDeviceConnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceConnectedObservable", value.asInstanceOf[js.Any])
    
    inline def setOnDeviceDisconnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceDisconnectedObservable", value.asInstanceOf[js.Any])
    
    inline def set_addDevice(value: DeviceSource[DeviceType] => Callback): Self = StObject.set(x, "_addDevice", js.Any.fromFunction1((t0: DeviceSource[DeviceType]) => value(t0).runNow()))
    
    inline def set_onInputChanged(value: (DeviceType, Double, IUIEvent) => Callback): Self = StObject.set(x, "_onInputChanged", js.Any.fromFunction3((t0: DeviceType, t1: Double, t2: IUIEvent) => (value(t0, t1, t2)).runNow()))
    
    inline def set_removeDevice(value: (DeviceType, Double) => Callback): Self = StObject.set(x, "_removeDevice", js.Any.fromFunction2((t0: DeviceType, t1: Double) => (value(t0, t1)).runNow()))
  }
}
