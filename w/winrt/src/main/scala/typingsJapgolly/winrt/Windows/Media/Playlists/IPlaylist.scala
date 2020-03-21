package typingsJapgolly.winrt.Windows.Media.Playlists

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFolder
import typingsJapgolly.winrt.Windows.Storage.NameCollisionOption
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylist extends js.Object {
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

