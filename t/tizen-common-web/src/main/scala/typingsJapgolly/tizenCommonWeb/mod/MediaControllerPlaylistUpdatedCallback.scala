package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaylistUpdatedCallback extends StObject {
  
  /**
    * Event triggered when playlist is removed from database.
    *
    * @param serverName Name of server which triggered the event.
    * @param playlistName Name of playlist for which the event was triggered.
    */
  def onplaylistdeleted(serverName: String, playlistName: String): Unit
  
  /**
    * Event triggered when playlist is updated in database.
    *
    * @param serverName Name of server which triggered the event.
    * @param playlist Playlist for which event was triggered.
    */
  def onplaylistupdated(serverName: String, playlist: MediaControllerPlaylist): Unit
}
object MediaControllerPlaylistUpdatedCallback {
  
  inline def apply(
    onplaylistdeleted: (String, String) => Callback,
    onplaylistupdated: (String, MediaControllerPlaylist) => Callback
  ): MediaControllerPlaylistUpdatedCallback = {
    val __obj = js.Dynamic.literal(onplaylistdeleted = js.Any.fromFunction2((t0: String, t1: String) => (onplaylistdeleted(t0, t1)).runNow()), onplaylistupdated = js.Any.fromFunction2((t0: String, t1: MediaControllerPlaylist) => (onplaylistupdated(t0, t1)).runNow()))
    __obj.asInstanceOf[MediaControllerPlaylistUpdatedCallback]
  }
  
  extension [Self <: MediaControllerPlaylistUpdatedCallback](x: Self) {
    
    inline def setOnplaylistdeleted(value: (String, String) => Callback): Self = StObject.set(x, "onplaylistdeleted", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOnplaylistupdated(value: (String, MediaControllerPlaylist) => Callback): Self = StObject.set(x, "onplaylistupdated", js.Any.fromFunction2((t0: String, t1: MediaControllerPlaylist) => (value(t0, t1)).runNow()))
  }
}
