package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItemSearchResults extends js.Object {
  val Count: Double
  var MoreResults: Boolean
  def Add(Index: Double, ValueListItem: IValueListItem): Unit
  def Clone(): IValueListItemSearchResults
  def Item(Index: Double): IValueListItem
  def Remove(Index: Double): Unit
}

object IValueListItemSearchResults {
  @scala.inline
  def apply(
    Add: (Double, IValueListItem) => Callback,
    Clone: CallbackTo[IValueListItemSearchResults],
    Count: Double,
    Item: Double => CallbackTo[IValueListItem],
    MoreResults: Boolean,
    Remove: Double => Callback
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IValueListItem) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
}

