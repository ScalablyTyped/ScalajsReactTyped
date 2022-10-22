package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.LibraryAlbums
import typingsJapgolly.musickitJs.MusicKit.Relationship
import typingsJapgolly.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Genres extends StObject {
  
  var albums: Relationship[typingsJapgolly.musickitJs.MusicKit.Albums]
  
  var genres: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres]
  
  var library: Relationship[LibraryAlbums]
  
  var songs: Relationship[Songs]
}
object Genres {
  
  inline def apply(
    albums: Relationship[typingsJapgolly.musickitJs.MusicKit.Albums],
    genres: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres],
    library: Relationship[LibraryAlbums],
    songs: Relationship[Songs]
  ): Genres = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], songs = songs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genres]
  }
  
  extension [Self <: Genres](x: Self) {
    
    inline def setAlbums(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryAlbums]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setSongs(value: Relationship[Songs]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
  }
}
