package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryKeys extends js.Object {
  val Count: Double
  def Clone(): IAccessControlEntryKeys
  def Item(Index: Double): IAccessControlEntryKey
}

object IAccessControlEntryKeys {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAccessControlEntryKeys],
    Count: Double,
    Item: Double => CallbackTo[IAccessControlEntryKey]
  ): IAccessControlEntryKeys = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IAccessControlEntryKeys]
  }
}

