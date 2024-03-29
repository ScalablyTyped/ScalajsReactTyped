package typingsJapgolly.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
trait ArtistRelationships extends StObject {
  
  var albums: Relationship[Album]
  
  var genres: js.UndefOr[Relationship[Genre]] = js.undefined
}
object ArtistRelationships {
  
  inline def apply(albums: Relationship[Album]): ArtistRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelationships]
  }
  
  extension [Self <: ArtistRelationships](x: Self) {
    
    inline def setAlbums(value: Relationship[Album]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[Genre]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
  }
}
