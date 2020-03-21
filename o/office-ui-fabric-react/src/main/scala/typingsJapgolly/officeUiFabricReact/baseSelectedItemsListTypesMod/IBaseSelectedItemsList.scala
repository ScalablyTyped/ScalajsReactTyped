package typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseSelectedItemsList[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  def addItems(items: js.Array[T]): Unit
}

object IBaseSelectedItemsList {
  @scala.inline
  def apply[T](addItems: js.Array[T] => Callback, items: js.Array[T] = null): IBaseSelectedItemsList[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItems")(js.Any.fromFunction1((t0: js.Array[T]) => addItems(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseSelectedItemsList[T]]
  }
}

