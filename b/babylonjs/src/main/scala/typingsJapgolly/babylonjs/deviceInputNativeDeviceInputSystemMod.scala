package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typingsJapgolly.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typingsJapgolly.babylonjs.eventsDeviceInputEventsMod.IUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputNativeDeviceInputSystemMod {
  
  @JSImport("babylonjs/DeviceInput/nativeDeviceInputSystem", "NativeDeviceInputSystem")
  @js.native
  open class NativeDeviceInputSystem protected ()
    extends StObject
       with IDeviceInputSystem {
    def this(
      onDeviceConnected: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit],
      onDeviceDisconnected: js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit],
      onInputChanged: js.Function3[/* deviceType */ DeviceType, /* deviceSlot */ Double, /* eventData */ IUIEvent, Unit]
    ) = this()
    
    /**
      * For versions of BabylonNative that don't have the NativeInput plugin initialized, create a dummy version
      * @returns Object with dummy functions
      */
    /* private */ var _createDummyNativeInput: Any = js.native
    
    /* private */ val _nativeInput: Any = js.native
    
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
    override def isDeviceAvailable(deviceType: DeviceType): Boolean = js.native
    
    /**
      * Checks for current device input value, given an id and input index. Throws exception if requested device not initialized.
      * @param deviceType Enum specifying device type
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @returns Current value of input
      */
    /* CompleteClass */
    override def pollInput(deviceType: DeviceType, deviceSlot: Double, inputIndex: Double): Double = js.native
  }
}
