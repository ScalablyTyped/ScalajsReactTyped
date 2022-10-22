package typingsJapgolly.musickitJs.MusicKit

import typingsJapgolly.musickitJs.musickitJsStrings.stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a station.
  * https://developer.apple.com/documentation/applemusicapi/stations/
  */
trait Stations
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Stations: js.UndefOr[typingsJapgolly.musickitJs.anon.ContentRating] = js.undefined
  
  @JSName("type")
  var type_Stations: stations
}
object Stations {
  
  inline def apply(href: String, id: String): Stations = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stations")
    __obj.asInstanceOf[Stations]
  }
  
  extension [Self <: Stations](x: Self) {
    
    inline def setAttributes(value: typingsJapgolly.musickitJs.anon.ContentRating): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setType(value: stations): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
