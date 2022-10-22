package typingsJapgolly.winrtUwp.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the scene mode settings on a capture device. */
trait SceneModeControl extends StObject {
  
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(sceneMode: CaptureSceneMode): IPromiseWithIAsyncAction
  
  /** Gets the scene modes supported on the capture device. */
  var supportedModes: IVectorView[CaptureSceneMode]
  
  /** Gets the current scene mod ethe capture device is set to. */
  var value: CaptureSceneMode
}
object SceneModeControl {
  
  inline def apply(
    setValueAsync: CaptureSceneMode => IPromiseWithIAsyncAction,
    supportedModes: IVectorView[CaptureSceneMode],
    value: CaptureSceneMode
  ): SceneModeControl = {
    val __obj = js.Dynamic.literal(setValueAsync = js.Any.fromFunction1(setValueAsync), supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneModeControl]
  }
  
  extension [Self <: SceneModeControl](x: Self) {
    
    inline def setSetValueAsync(value: CaptureSceneMode => IPromiseWithIAsyncAction): Self = StObject.set(x, "setValueAsync", js.Any.fromFunction1(value))
    
    inline def setSupportedModes(value: IVectorView[CaptureSceneMode]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CaptureSceneMode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
