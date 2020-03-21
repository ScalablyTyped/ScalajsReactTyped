package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKeys extends js.Object {
  val Count: Double
  def Clone(): IAccessControlListComponentKeys
  def Item(Index: Double): IAccessControlListComponentKey
}

object IAccessControlListComponentKeys {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAccessControlListComponentKeys],
    Count: Double,
    Item: Double => CallbackTo[IAccessControlListComponentKey]
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
}

