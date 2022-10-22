package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.LibraryAlbums
import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.RecordLabels
import typingsJapgolly.musickitJs.MusicKit.Relationship
import typingsJapgolly.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artists extends StObject {
  
  var artists: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists]
  
  var genres: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres]
  
  var library: Relationship[LibraryAlbums]
  
  var `record-labels`: Relationship[RecordLabels]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Artists {
  
  inline def apply(
    artists: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists],
    genres: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres],
    library: Relationship[LibraryAlbums],
    `record-labels`: Relationship[RecordLabels],
    tracks: Relationship[MusicVideos | Songs]
  ): Artists = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.updateDynamic("record-labels")(`record-labels`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artists]
  }
  
  extension [Self <: Artists](x: Self) {
    
    inline def setArtists(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Genres]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryAlbums]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def `setRecord-labels`(value: Relationship[RecordLabels]): Self = StObject.set(x, "record-labels", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
