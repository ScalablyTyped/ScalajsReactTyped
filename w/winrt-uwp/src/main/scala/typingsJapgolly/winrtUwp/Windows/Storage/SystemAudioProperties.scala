package typingsJapgolly.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows audio file properties. */
trait SystemAudioProperties extends StObject {
  
  /** Gets the name of the System.Audio.EncodingBitrate property (one of the Windows audio file properties). */
  var encodingBitrate: String
}
object SystemAudioProperties {
  
  inline def apply(encodingBitrate: String): SystemAudioProperties = {
    val __obj = js.Dynamic.literal(encodingBitrate = encodingBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemAudioProperties]
  }
  
  extension [Self <: SystemAudioProperties](x: Self) {
    
    inline def setEncodingBitrate(value: String): Self = StObject.set(x, "encodingBitrate", value.asInstanceOf[js.Any])
  }
}
