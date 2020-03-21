package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionStats extends js.Object {
  def changedTableCount(): Double
  def deletedRowCount(): Double
  def insertedRowCount(): Double
  def success(): Boolean
  def updatedRowCount(): Double
}

object TransactionStats {
  @scala.inline
  def apply(
    changedTableCount: CallbackTo[Double],
    deletedRowCount: CallbackTo[Double],
    insertedRowCount: CallbackTo[Double],
    success: CallbackTo[Boolean],
    updatedRowCount: CallbackTo[Double]
  ): TransactionStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedTableCount")(changedTableCount.toJsFn)
    __obj.updateDynamic("deletedRowCount")(deletedRowCount.toJsFn)
    __obj.updateDynamic("insertedRowCount")(insertedRowCount.toJsFn)
    __obj.updateDynamic("success")(success.toJsFn)
    __obj.updateDynamic("updatedRowCount")(updatedRowCount.toJsFn)
    __obj.asInstanceOf[TransactionStats]
  }
}

