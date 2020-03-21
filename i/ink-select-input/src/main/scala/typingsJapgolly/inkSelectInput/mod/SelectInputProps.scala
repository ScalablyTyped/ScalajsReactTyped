package typingsJapgolly.inkSelectInput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var indicatorComponent: js.UndefOr[Component[js.Object, js.Object]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var itemComponent: js.UndefOr[Component[js.Object, js.Object]] = js.undefined
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply[T /* <: ItemOfSelectInput */](
    focus: js.UndefOr[Boolean] = js.undefined,
    indicatorComponent: Component[js.Object, js.Object] = null,
    initialIndex: Int | Double = null,
    itemComponent: Component[js.Object, js.Object] = null,
    items: js.Array[T] = null,
    limit: Int | Double = null,
    onSelect: /* item */ T => Callback = null
  ): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* item */ T) => onSelect(t0).runNow()))
    __obj.asInstanceOf[SelectInputProps[T]]
  }
}

