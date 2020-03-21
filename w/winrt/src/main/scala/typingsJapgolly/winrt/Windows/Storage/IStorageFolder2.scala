package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolder2 extends js.Object {
  def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem]
}

object IStorageFolder2 {
  @scala.inline
  def apply(tryGetItemAsync: String => CallbackTo[IAsyncOperation[IStorageItem]]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tryGetItemAsync")(js.Any.fromFunction1((t0: java.lang.String) => tryGetItemAsync(t0).runNow()))
    __obj.asInstanceOf[IStorageFolder2]
  }
}

