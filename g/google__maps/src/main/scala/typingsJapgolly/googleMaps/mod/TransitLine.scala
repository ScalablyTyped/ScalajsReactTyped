package typingsJapgolly.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitLine extends StObject {
  
  /**
    * is an array containing a single `TransitAgency` object.
    * The `TransitAgency` object provides information about the operator of the line
    */
  var agencies: js.Array[TransitAgency]
  
  /** contains the color commonly used in signage for this transit line. The color will be specified as a hex string such as: #FF0033. */
  var color: String
  
  /** contains the URL for the icon associated with this line. */
  var icon: String
  
  /** contains the full name of this transit line. eg. "7 Avenue Express". */
  var name: String
  
  /** contains the short name of this transit line. This will normally be a line number, such as "M7" or "355". */
  var short_name: String
  
  /** contains the color of text commonly used for signage of this line. The color will be specified as a hex string. */
  var text_color: String
  
  /** contains the URL for this transit line as provided by the transit agency. */
  var url: String
  
  /** contains the type of vehicle used on this line. */
  var vehicle: TransitVehicle
}
object TransitLine {
  
  inline def apply(
    agencies: js.Array[TransitAgency],
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
  
  extension [Self <: TransitLine](x: Self) {
    
    inline def setAgencies(value: js.Array[TransitAgency]): Self = StObject.set(x, "agencies", value.asInstanceOf[js.Any])
    
    inline def setAgenciesVarargs(value: TransitAgency*): Self = StObject.set(x, "agencies", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVehicle(value: TransitVehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
  }
}
