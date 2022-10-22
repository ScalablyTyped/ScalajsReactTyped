package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeviceSourceType
import typingsJapgolly.babylonjs.BABYLON.IUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DeviceSourceManager")
@js.native
open class DeviceSourceManager protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DeviceSourceManager {
  /**
    * Default constructor
    * @param engine - Used to get canvas (if applicable)
    */
  def this(engine: typingsJapgolly.babylonjs.BABYLON.Engine) = this()
  
  /* CompleteClass */
  override def _addDevice(
    deviceSource: typingsJapgolly.babylonjs.BABYLON.DeviceSource[typingsJapgolly.babylonjs.BABYLON.DeviceType]
  ): Unit = js.native
  
  /* CompleteClass */
  override def _onInputChanged(deviceType: typingsJapgolly.babylonjs.BABYLON.DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit = js.native
  
  /* CompleteClass */
  override def _removeDevice(deviceType: typingsJapgolly.babylonjs.BABYLON.DeviceType, deviceSlot: Double): Unit = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  var onDeviceConnectedObservable: typingsJapgolly.babylonjs.BABYLON.Observable[DeviceSourceType] = js.native
  
  /* CompleteClass */
  var onDeviceDisconnectedObservable: typingsJapgolly.babylonjs.BABYLON.Observable[DeviceSourceType] = js.native
}
