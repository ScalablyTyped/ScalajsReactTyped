package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceInputSystem
  extends StObject
     with IDisposable {
  
  /**
    * Check for a specific device in the DeviceInputSystem
    * @param deviceType Type of device to check for
    * @returns bool with status of device's existence
    */
  def isDeviceAvailable(deviceType: DeviceType): Boolean
  
  /**
    * Checks for current device input value, given an id and input index. Throws exception if requested device not initialized.
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param inputIndex Id of input to be checked
    * @returns Current value of input
    */
  def pollInput(deviceType: DeviceType, deviceSlot: Double, inputIndex: Double): Double
}
object IDeviceInputSystem {
  
  inline def apply(
    dispose: Callback,
    isDeviceAvailable: DeviceType => Boolean,
    pollInput: (DeviceType, Double, Double) => Double
  ): IDeviceInputSystem = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, isDeviceAvailable = js.Any.fromFunction1(isDeviceAvailable), pollInput = js.Any.fromFunction3(pollInput))
    __obj.asInstanceOf[IDeviceInputSystem]
  }
  
  extension [Self <: IDeviceInputSystem](x: Self) {
    
    inline def setIsDeviceAvailable(value: DeviceType => Boolean): Self = StObject.set(x, "isDeviceAvailable", js.Any.fromFunction1(value))
    
    inline def setPollInput(value: (DeviceType, Double, Double) => Double): Self = StObject.set(x, "pollInput", js.Any.fromFunction3(value))
  }
}
