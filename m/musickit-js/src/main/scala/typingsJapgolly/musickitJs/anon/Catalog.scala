package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.Relationship
import typingsJapgolly.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Catalog extends StObject {
  
  var artists: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists]
  
  var catalog: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Catalog {
  
  inline def apply(
    artists: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists],
    catalog: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists],
    tracks: Relationship[MusicVideos | Songs]
  ): Catalog = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Catalog]
  }
  
  extension [Self <: Catalog](x: Self) {
    
    inline def setArtists(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setCatalog(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
