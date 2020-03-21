package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplications extends js.Object {
  val Count: Double
  def Clone(): ICustomApplications
  def Item(Index: Double): ICustomApplication
}

object ICustomApplications {
  @scala.inline
  def apply(
    Clone: CallbackTo[ICustomApplications],
    Count: Double,
    Item: Double => CallbackTo[ICustomApplication]
  ): ICustomApplications = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[ICustomApplications]
  }
}

