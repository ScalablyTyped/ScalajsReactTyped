package typingsJapgolly.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityTrackMetadata extends StObject {
  
  // Optionals
  var album: String
  
  var artLocation: String
  
  var artist: String
  
  var title: String
}
object UnityTrackMetadata {
  
  inline def apply(album: String, artLocation: String, artist: String, title: String): UnityTrackMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artLocation = artLocation.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityTrackMetadata]
  }
  
  extension [Self <: UnityTrackMetadata](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setArtLocation(value: String): Self = StObject.set(x, "artLocation", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
