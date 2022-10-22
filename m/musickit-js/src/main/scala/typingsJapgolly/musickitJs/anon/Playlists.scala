package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Playlists extends StObject {
  
  var playlists: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]
}
object Playlists {
  
  inline def apply(playlists: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]): Playlists = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlists]
  }
  
  extension [Self <: Playlists](x: Self) {
    
    inline def setPlaylists(value: Relationship[typingsJapgolly.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
