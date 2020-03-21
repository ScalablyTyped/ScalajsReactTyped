package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPages extends js.Object {
  val Count: Double
  def Add(Index: Double, OCRPage: IOCRPage): Unit
  def Clone(): IOCRPages
  def Item(Index: Double): IOCRPage
  def Remove(Index: Double): Unit
}

object IOCRPages {
  @scala.inline
  def apply(
    Add: (Double, IOCRPage) => Callback,
    Clone: CallbackTo[IOCRPages],
    Count: Double,
    Item: Double => CallbackTo[IOCRPage],
    Remove: Double => Callback
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IOCRPage) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IOCRPages]
  }
}

