package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolderStatics extends js.Object {
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder]
}

object IStorageFolderStatics {
  @scala.inline
  def apply(getFolderFromPathAsync: String => CallbackTo[IAsyncOperation[StorageFolder]]): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFolderFromPathAsync")(js.Any.fromFunction1((t0: java.lang.String) => getFolderFromPathAsync(t0).runNow()))
    __obj.asInstanceOf[IStorageFolderStatics]
  }
}

