package typingsJapgolly.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a media container format. */
trait ContainerEncodingProperties extends StObject {
  
  /** Gets additional format properties for the media container. */
  var properties: MediaPropertySet
  
  /** Gets or sets the subtype of the media container. */
  var subtype: String
  
  /** Gets the format type. */
  var `type`: String
}
object ContainerEncodingProperties {
  
  inline def apply(properties: MediaPropertySet, subtype: String, `type`: String): ContainerEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEncodingProperties]
  }
  
  extension [Self <: ContainerEncodingProperties](x: Self) {
    
    inline def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
