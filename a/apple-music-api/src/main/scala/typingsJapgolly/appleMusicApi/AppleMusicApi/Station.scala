package typingsJapgolly.appleMusicApi.AppleMusicApi

import typingsJapgolly.appleMusicApi.appleMusicApiStrings.stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/station
trait Station
  extends StObject
     with Resource {
  
  var artwork: Artwork
  
  var durationInMillis: js.UndefOr[Double] = js.undefined
  
  var editorialNotes: js.UndefOr[EditorialNotes] = js.undefined
  
  var episodeNumber: js.UndefOr[Double] = js.undefined
  
  var isLive: Boolean
  
  var name: String
  
  @JSName("type")
  var type_Station: stations
  
  var url: String
}
object Station {
  
  inline def apply(artwork: Artwork, id: String, isLive: Boolean, name: String, url: String): Station = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLive = isLive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stations")
    __obj.asInstanceOf[Station]
  }
  
  extension [Self <: Station](x: Self) {
    
    inline def setArtwork(value: Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationInMillisUndefined: Self = StObject.set(x, "durationInMillis", js.undefined)
    
    inline def setEditorialNotes(value: EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setEpisodeNumber(value: Double): Self = StObject.set(x, "episodeNumber", value.asInstanceOf[js.Any])
    
    inline def setEpisodeNumberUndefined: Self = StObject.set(x, "episodeNumber", js.undefined)
    
    inline def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: stations): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
