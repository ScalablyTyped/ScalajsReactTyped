package typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPicker[T] extends js.Object {
  /** Forces the picker to resolve */
  var forceResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  /** Sets focus to the input. */
  def focus(): Unit
}

object IBaseExtendedPicker {
  @scala.inline
  def apply[T](focus: Callback, forceResolve: js.UndefOr[Callback] = js.undefined, items: js.Array[T] = null): IBaseExtendedPicker[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    forceResolve.foreach(p => __obj.updateDynamic("forceResolve")(p.toJsFn))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPicker[T]]
  }
}

