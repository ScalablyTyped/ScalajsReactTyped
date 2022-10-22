package typingsJapgolly.winrt.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.IStorageFolder
import typingsJapgolly.winrt.Windows.Storage.NameCollisionOption
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Playlists {
  
  @js.native
  sealed trait PlaylistFormat extends StObject
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @js.native
    sealed trait m3u
      extends StObject
         with PlaylistFormat
    
    @js.native
    sealed trait windowsMedia
      extends StObject
         with PlaylistFormat
    
    @js.native
    sealed trait zune
      extends StObject
         with PlaylistFormat
  }
  
  @js.native
  trait IPlaylist extends StObject {
    
    var files: IVector[StorageFile] = js.native
    
    def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IAsyncOperation[StorageFile] = js.native
    def saveAsAsync(
      saveLocation: IStorageFolder,
      desiredName: String,
      option: NameCollisionOption,
      playlistFormat: PlaylistFormat
    ): IAsyncOperation[StorageFile] = js.native
    
    def saveAsync(): IAsyncAction = js.native
  }
  
  trait IPlaylistStatics extends StObject {
    
    def loadAsync(file: IStorageFile): IAsyncOperation[Playlist]
  }
  object IPlaylistStatics {
    
    inline def apply(loadAsync: IStorageFile => IAsyncOperation[Playlist]): IPlaylistStatics = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction1(loadAsync))
      __obj.asInstanceOf[IPlaylistStatics]
    }
    
    extension [Self <: IPlaylistStatics](x: Self) {
      
      inline def setLoadAsync(value: IStorageFile => IAsyncOperation[Playlist]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Playlist
    extends StObject
       with IPlaylist
}
