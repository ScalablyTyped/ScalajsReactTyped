package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Album Object in Playlists
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-album-object)
  */
trait SavedAlbumObject extends StObject {
  
  var added_at: String
  
  var album: AlbumObjectFull
}
object SavedAlbumObject {
  
  inline def apply(added_at: String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAlbumObject]
  }
  
  extension [Self <: SavedAlbumObject](x: Self) {
    
    inline def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    inline def setAlbum(value: AlbumObjectFull): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
  }
}
