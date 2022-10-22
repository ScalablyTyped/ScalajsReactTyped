package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.venue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultVenue
  extends StObject
     with InlineQueryResultLocationBase
     with InlineQueryResult {
  
  var address: String
  
  var foursquare_id: js.UndefOr[String] = js.undefined
  
  var `type`: venue
}
object InlineQueryResultVenue {
  
  inline def apply(address: String, id: String, latitude: Double, longitude: Double, title: String): InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("venue")
    __obj.asInstanceOf[InlineQueryResultVenue]
  }
  
  extension [Self <: InlineQueryResultVenue](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_id(value: String): Self = StObject.set(x, "foursquare_id", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_idUndefined: Self = StObject.set(x, "foursquare_id", js.undefined)
    
    inline def setType(value: venue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
