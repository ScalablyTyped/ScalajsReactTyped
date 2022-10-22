package typingsJapgolly.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a default audio render device change event. */
trait DefaultAudioRenderDeviceChangedEventArgs extends StObject {
  
  /** Gets the ID of the newly selected default audio render device that caused the change event. */
  var id: String
  
  /** Gets the role of the newly selected default audio render device that caused the change event. */
  var role: AudioDeviceRole
}
object DefaultAudioRenderDeviceChangedEventArgs {
  
  inline def apply(id: String, role: AudioDeviceRole): DefaultAudioRenderDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioRenderDeviceChangedEventArgs]
  }
  
  extension [Self <: DefaultAudioRenderDeviceChangedEventArgs](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AudioDeviceRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
