package typingsJapgolly.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents settings for an AdvancedPhotoControl object. */
trait AdvancedPhotoCaptureSettings extends StObject {
  
  /** Gets or sets the advanced capture mode for which an AdvancedPhotoControl will be configured. */
  var mode: AdvancedPhotoMode
}
object AdvancedPhotoCaptureSettings {
  
  inline def apply(mode: AdvancedPhotoMode): AdvancedPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoCaptureSettings]
  }
  
  extension [Self <: AdvancedPhotoCaptureSettings](x: Self) {
    
    inline def setMode(value: AdvancedPhotoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
