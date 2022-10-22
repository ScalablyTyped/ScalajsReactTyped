package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSource[T /* <: DeviceType */] extends StObject {
  
  /* private */ val _deviceInputSystem: Any
  
  /** "Slot" or index that device is referenced in */
  val deviceSlot: Double
  
  /** Type of device */
  val deviceType: T
  
  /**
    * Get input for specific input
    * @param inputIndex - index of specific input on device
    * @returns Input value from DeviceInputSystem
    */
  def getInput(inputIndex: DeviceInput[T]): Double
  
  /**
    * Observable to handle device input changes per device
    */
  val onInputChangedObservable: Observable[DeviceSourceEvent[T]]
}
object DeviceSource {
  
  inline def apply[T /* <: DeviceType */](
    _deviceInputSystem: Any,
    deviceSlot: Double,
    deviceType: T,
    getInput: DeviceInput[T] => Double,
    onInputChangedObservable: Observable[DeviceSourceEvent[T]]
  ): DeviceSource[T] = {
    val __obj = js.Dynamic.literal(_deviceInputSystem = _deviceInputSystem.asInstanceOf[js.Any], deviceSlot = deviceSlot.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], getInput = js.Any.fromFunction1(getInput), onInputChangedObservable = onInputChangedObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSource[T]]
  }
  
  extension [Self <: DeviceSource[?], T /* <: DeviceType */](x: Self & DeviceSource[T]) {
    
    inline def setDeviceSlot(value: Double): Self = StObject.set(x, "deviceSlot", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: T): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setGetInput(value: DeviceInput[T] => Double): Self = StObject.set(x, "getInput", js.Any.fromFunction1(value))
    
    inline def setOnInputChangedObservable(value: Observable[DeviceSourceEvent[T]]): Self = StObject.set(x, "onInputChangedObservable", value.asInstanceOf[js.Any])
    
    inline def set_deviceInputSystem(value: Any): Self = StObject.set(x, "_deviceInputSystem", value.asInstanceOf[js.Any])
  }
}
