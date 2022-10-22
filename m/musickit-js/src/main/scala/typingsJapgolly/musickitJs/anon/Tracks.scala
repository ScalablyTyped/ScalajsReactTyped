package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.Relationship
import typingsJapgolly.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracks extends StObject {
  
  var catalog: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Tracks {
  
  inline def apply(
    catalog: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists],
    tracks: Relationship[MusicVideos | Songs]
  ): Tracks = {
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracks]
  }
  
  extension [Self <: Tracks](x: Self) {
    
    inline def setCatalog(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
