package typingsJapgolly.winrtUwp.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
@JSGlobal("Windows.Media.Devices.AdvancedPhotoControl")
@js.native
abstract class AdvancedPhotoControl () extends js.Object {
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  var mode: AdvancedPhotoMode = js.native
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  var supported: Boolean = js.native
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  var supportedModes: IVectorView[AdvancedPhotoMode] = js.native
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  def configure(settings: AdvancedPhotoCaptureSettings): Unit = js.native
}

