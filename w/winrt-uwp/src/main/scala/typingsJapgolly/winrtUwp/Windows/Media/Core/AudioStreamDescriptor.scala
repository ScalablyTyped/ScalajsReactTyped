package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an audio media stream. */
trait AudioStreamDescriptor extends StObject {
  
  /** The encoding properties of the stream. */
  var encodingProperties: AudioEncodingProperties
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  
  /** Gets or sets the name of the stream. */
  var name: String
}
object AudioStreamDescriptor {
  
  inline def apply(encodingProperties: AudioEncodingProperties, isSelected: Boolean, language: String, name: String): AudioStreamDescriptor = {
    val __obj = js.Dynamic.literal(encodingProperties = encodingProperties.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioStreamDescriptor]
  }
  
  extension [Self <: AudioStreamDescriptor](x: Self) {
    
    inline def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
