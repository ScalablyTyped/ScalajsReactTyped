package typingsJapgolly.winrt.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageQueryResultBase extends js.Object {
  var folder: StorageFolder
  var oncontentschanged: js.Any
  var onoptionschanged: js.Any
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  def findStartIndexAsync(value: js.Any): IAsyncOperation[Double]
  def getCurrentQueryOptions(): QueryOptions
  def getItemCountAsync(): IAsyncOperation[Double]
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Callback,
    findStartIndexAsync: js.Any => CallbackTo[IAsyncOperation[Double]],
    folder: StorageFolder,
    getCurrentQueryOptions: CallbackTo[QueryOptions],
    getItemCountAsync: CallbackTo[IAsyncOperation[Double]],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.updateDynamic("applyNewQueryOptions")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions) => applyNewQueryOptions(t0).runNow()))
    __obj.updateDynamic("findStartIndexAsync")(js.Any.fromFunction1((t0: js.Any) => findStartIndexAsync(t0).runNow()))
    __obj.updateDynamic("getCurrentQueryOptions")(getCurrentQueryOptions.toJsFn)
    __obj.updateDynamic("getItemCountAsync")(getItemCountAsync.toJsFn)
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

