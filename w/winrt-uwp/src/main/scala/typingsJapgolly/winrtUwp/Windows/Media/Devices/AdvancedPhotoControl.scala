package typingsJapgolly.winrtUwp.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
trait AdvancedPhotoControl extends StObject {
  
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  def configure(settings: AdvancedPhotoCaptureSettings): Unit
  
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  var mode: AdvancedPhotoMode
  
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  var supported: Boolean
  
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  var supportedModes: IVectorView[AdvancedPhotoMode]
}
object AdvancedPhotoControl {
  
  inline def apply(
    configure: AdvancedPhotoCaptureSettings => Callback,
    mode: AdvancedPhotoMode,
    supported: Boolean,
    supportedModes: IVectorView[AdvancedPhotoMode]
  ): AdvancedPhotoControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1((t0: AdvancedPhotoCaptureSettings) => configure(t0).runNow()), mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoControl]
  }
  
  extension [Self <: AdvancedPhotoControl](x: Self) {
    
    inline def setConfigure(value: AdvancedPhotoCaptureSettings => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: AdvancedPhotoCaptureSettings) => value(t0).runNow()))
    
    inline def setMode(value: AdvancedPhotoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedModes(value: IVectorView[AdvancedPhotoMode]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
  }
}
