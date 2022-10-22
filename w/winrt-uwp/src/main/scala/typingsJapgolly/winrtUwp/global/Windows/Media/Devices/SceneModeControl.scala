package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the scene mode settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.SceneModeControl")
@js.native
open class SceneModeControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.SceneModeControl {
  
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setValueAsync(sceneMode: typingsJapgolly.winrtUwp.Windows.Media.Devices.CaptureSceneMode): IPromiseWithIAsyncAction = js.native
  
  /** Gets the scene modes supported on the capture device. */
  /* CompleteClass */
  var supportedModes: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Devices.CaptureSceneMode] = js.native
  
  /** Gets the current scene mod ethe capture device is set to. */
  /* CompleteClass */
  var value: typingsJapgolly.winrtUwp.Windows.Media.Devices.CaptureSceneMode = js.native
}
