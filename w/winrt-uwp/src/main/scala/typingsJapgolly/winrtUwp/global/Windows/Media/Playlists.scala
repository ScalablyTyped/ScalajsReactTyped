package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and saving media playlists for playback. */
object Playlists {
  
  /** Provides access to a media playlist. */
  @JSGlobal("Windows.Media.Playlists.Playlist")
  @js.native
  /** Creates a new instance of a Playlist object. */
  open class Playlist ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playlists.Playlist
  object Playlist {
    
    @JSGlobal("Windows.Media.Playlists.Playlist")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously loads files into a playlist.
      * @param file Represents the files to load.
      * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
      */
    /* static member */
    inline def loadAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Playlists.Playlist] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Playlists.Playlist]]
  }
  
  /** Indicates the format of a playlist file. */
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Playlists.PlaylistFormat & Double] = js.native
    
    /* 2 */ val m3u: typingsJapgolly.winrtUwp.Windows.Media.Playlists.PlaylistFormat.m3u & Double = js.native
    
    /* 0 */ val windowsMedia: typingsJapgolly.winrtUwp.Windows.Media.Playlists.PlaylistFormat.windowsMedia & Double = js.native
    
    /* 1 */ val zune: typingsJapgolly.winrtUwp.Windows.Media.Playlists.PlaylistFormat.zune & Double = js.native
  }
}
