package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeviceInput
import typingsJapgolly.babylonjs.BABYLON.DeviceSourceEvent
import typingsJapgolly.babylonjs.BABYLON.IDeviceInputSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSource")
@js.native
open class DeviceSource[T /* <: typingsJapgolly.babylonjs.BABYLON.DeviceType */] protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DeviceSource[T] {
  /**
    * Default Constructor
    * @param deviceInputSystem - Reference to DeviceInputSystem
    * @param deviceType - Type of device
    * @param deviceSlot - "Slot" or index that device is referenced in
    */
  def this(deviceInputSystem: IDeviceInputSystem, /** Type of device */
  deviceType: T) = this()
  def this(
    deviceInputSystem: IDeviceInputSystem,
    /** Type of device */
  deviceType: T,
    /** "Slot" or index that device is referenced in */
  deviceSlot: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  override val _deviceInputSystem: Any = js.native
  
  /** "Slot" or index that device is referenced in */
  /* CompleteClass */
  override val deviceSlot: Double = js.native
  
  /** Type of device */
  /* CompleteClass */
  override val deviceType: T = js.native
  
  /**
    * Get input for specific input
    * @param inputIndex - index of specific input on device
    * @returns Input value from DeviceInputSystem
    */
  /* CompleteClass */
  override def getInput(inputIndex: DeviceInput[T]): Double = js.native
  
  /**
    * Observable to handle device input changes per device
    */
  /* CompleteClass */
  override val onInputChangedObservable: typingsJapgolly.babylonjs.BABYLON.Observable[DeviceSourceEvent[T]] = js.native
}
