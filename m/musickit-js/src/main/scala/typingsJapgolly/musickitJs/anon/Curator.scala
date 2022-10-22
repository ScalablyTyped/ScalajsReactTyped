package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.AppleCurators
import typingsJapgolly.musickitJs.MusicKit.Curators
import typingsJapgolly.musickitJs.MusicKit.LibraryPlaylists
import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.Relationship
import typingsJapgolly.musickitJs.MusicKit.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curator extends StObject {
  
  var curator: Relationship[typingsJapgolly.musickitJs.MusicKit.Activities | AppleCurators | Curators]
  
  var library: Relationship[LibraryPlaylists]
  
  var tracks: Relationship[MusicVideos | Songs]
}
object Curator {
  
  inline def apply(
    curator: Relationship[typingsJapgolly.musickitJs.MusicKit.Activities | AppleCurators | Curators],
    library: Relationship[LibraryPlaylists],
    tracks: Relationship[MusicVideos | Songs]
  ): Curator = {
    val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
  
  extension [Self <: Curator](x: Self) {
    
    inline def setCurator(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Activities | AppleCurators | Curators]): Self = StObject.set(x, "curator", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: Relationship[LibraryPlaylists]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Relationship[MusicVideos | Songs]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
