package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroups extends js.Object {
  val Count: Double
  def Clone(): IClassGroups
  def Item(Index: Double): IClassGroup
}

object IClassGroups {
  @scala.inline
  def apply(Clone: CallbackTo[IClassGroups], Count: Double, Item: Double => CallbackTo[IClassGroup]): IClassGroups = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IClassGroups]
  }
}

