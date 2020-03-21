package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPageResults extends js.Object {
  val Count: Double
  def Item(Index: Double): IOCRPageResult
}

object IOCRPageResults {
  @scala.inline
  def apply(Count: Double, Item: Double => CallbackTo[IOCRPageResult]): IOCRPageResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IOCRPageResults]
  }
}

