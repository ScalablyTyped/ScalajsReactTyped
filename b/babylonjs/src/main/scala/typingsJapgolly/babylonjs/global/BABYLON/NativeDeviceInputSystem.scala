package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeDeviceInputSystem")
@js.native
open class NativeDeviceInputSystem protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NativeDeviceInputSystem {
  def this(
    onDeviceConnected: js.Function2[
        /* deviceType */ typingsJapgolly.babylonjs.BABYLON.DeviceType, 
        /* deviceSlot */ Double, 
        Unit
      ],
    onDeviceDisconnected: js.Function2[
        /* deviceType */ typingsJapgolly.babylonjs.BABYLON.DeviceType, 
        /* deviceSlot */ Double, 
        Unit
      ],
    onInputChanged: js.Function3[
        /* deviceType */ typingsJapgolly.babylonjs.BABYLON.DeviceType, 
        /* deviceSlot */ Double, 
        /* eventData */ IUIEvent, 
        Unit
      ]
  ) = this()
  
  /**
    * For versions of BabylonNative that don't have the NativeInput plugin initialized, create a dummy version
    * @returns Object with dummy functions
    */
  /* private */ /* CompleteClass */
  var _createDummyNativeInput: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _nativeInput: Any = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Check for a specific device in the DeviceInputSystem
    * @param deviceType Type of device to check for
    * @returns bool with status of device's existence
    */
  /* CompleteClass */
  override def isDeviceAvailable(deviceType: typingsJapgolly.babylonjs.BABYLON.DeviceType): Boolean = js.native
  
  /**
    * Checks for current device input value, given an id and input index. Throws exception if requested device not initialized.
    * @param deviceType Enum specifying device type
    * @param deviceSlot "Slot" or index that device is referenced in
    * @param inputIndex Id of input to be checked
    * @returns Current value of input
    */
  /* CompleteClass */
  override def pollInput(deviceType: typingsJapgolly.babylonjs.BABYLON.DeviceType, deviceSlot: Double, inputIndex: Double): Double = js.native
}
