package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IDeviceInputSystem
import typingsJapgolly.babylonjs.BABYLON.IObservableManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InternalDeviceSourceManager")
@js.native
open class InternalDeviceSourceManager protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.InternalDeviceSourceManager {
  def this(engine: typingsJapgolly.babylonjs.BABYLON.Engine) = this()
  
  /* CompleteClass */
  override val _deviceInputSystem: IDeviceInputSystem = js.native
  
  /* private */ /* CompleteClass */
  override val _devices: Any = js.native
  
  /* CompleteClass */
  var _refCount: Double = js.native
  
  /* private */ /* CompleteClass */
  override val _registeredManagers: Any = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def registerManager(manager: IObservableManager): Unit = js.native
  
  /* CompleteClass */
  override def unregisterManager(manager: IObservableManager): Unit = js.native
}
