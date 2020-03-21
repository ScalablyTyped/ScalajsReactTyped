package typingsJapgolly.agGrid.clientSideRowModelMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchTransactionItem extends js.Object {
  var rowDataTransaction: RowDataTransaction
  def callback(res: RowNodeTransaction): Unit
}

object BatchTransactionItem {
  @scala.inline
  def apply(callback: RowNodeTransaction => Callback, rowDataTransaction: RowDataTransaction): BatchTransactionItem = {
    val __obj = js.Dynamic.literal(rowDataTransaction = rowDataTransaction.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.clientSideRowModelMod.RowNodeTransaction) => callback(t0).runNow()))
    __obj.asInstanceOf[BatchTransactionItem]
  }
}

