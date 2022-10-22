package typingsJapgolly.appleMusicApi.AppleMusicApi

import typingsJapgolly.appleMusicApi.appleMusicApiStrings.playlists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/playlist
trait Playlist
  extends StObject
     with Resource {
  
  var attributes: js.UndefOr[typingsJapgolly.appleMusicApi.anon.Artwork] = js.undefined
  
  var relationships: js.UndefOr[typingsJapgolly.appleMusicApi.anon.Curator] = js.undefined
  
  @JSName("type")
  var type_Playlist: playlists
}
object Playlist {
  
  inline def apply(id: String): Playlist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("playlists")
    __obj.asInstanceOf[Playlist]
  }
  
  extension [Self <: Playlist](x: Self) {
    
    inline def setAttributes(value: typingsJapgolly.appleMusicApi.anon.Artwork): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: typingsJapgolly.appleMusicApi.anon.Curator): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: playlists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
