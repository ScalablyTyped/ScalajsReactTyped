package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputVenueMessageContent
  extends StObject
     with InputLocationMessageContent {
  
  var address: String
  
  var foursquare_id: js.UndefOr[String] = js.undefined
  
  var title: String
}
object InputVenueMessageContent {
  
  inline def apply(address: String, latitude: Double, longitude: Double, title: String): InputVenueMessageContent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVenueMessageContent]
  }
  
  extension [Self <: InputVenueMessageContent](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_id(value: String): Self = StObject.set(x, "foursquare_id", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_idUndefined: Self = StObject.set(x, "foursquare_id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
