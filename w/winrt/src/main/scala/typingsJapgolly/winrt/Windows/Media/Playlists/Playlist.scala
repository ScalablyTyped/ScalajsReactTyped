package typingsJapgolly.winrt.Windows.Media.Playlists

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
class Playlist () extends IPlaylist

/* static members */
@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
object Playlist extends js.Object {
  def loadAsync(file: IStorageFile): IAsyncOperation[Playlist] = js.native
}

