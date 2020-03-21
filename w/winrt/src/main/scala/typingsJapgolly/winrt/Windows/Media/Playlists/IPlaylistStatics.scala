package typingsJapgolly.winrt.Windows.Media.Playlists

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistStatics extends js.Object {
  def loadAsync(file: IStorageFile): IAsyncOperation[Playlist]
}

object IPlaylistStatics {
  @scala.inline
  def apply(loadAsync: IStorageFile => CallbackTo[IAsyncOperation[Playlist]]): IPlaylistStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => loadAsync(t0).runNow()))
    __obj.asInstanceOf[IPlaylistStatics]
  }
}

