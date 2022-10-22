package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsPlaylistItem extends StObject {
  
  /** The value that YouTube uses to uniquely identify the playlist. */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /** ID of the item within the playlist. */
  var playlistItemId: js.UndefOr[String] = js.undefined
  
  /** The resourceId object contains information about the resource that was added to the playlist. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}
object ActivityContentDetailsPlaylistItem {
  
  inline def apply(): ActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
  }
  
  extension [Self <: ActivityContentDetailsPlaylistItem](x: Self) {
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setPlaylistItemId(value: String): Self = StObject.set(x, "playlistItemId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistItemIdUndefined: Self = StObject.set(x, "playlistItemId", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
