package typingsJapgolly.reactDaterangePicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactDaterangePicker.reactDaterangePickerStrings.next
import typingsJapgolly.reactDaterangePicker.reactDaterangePickerStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationArrowProps[T]
  extends typingsJapgolly.react.mod.Props[T] {
  var direction: js.UndefOr[next | previous] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onTrigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PaginationArrowProps {
  @scala.inline
  def apply[T](
    children: VdomNode = null,
    direction: next | previous = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onTrigger: js.UndefOr[Callback] = js.undefined,
    ref: LegacyRef[T] = null
  ): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    onTrigger.foreach(p => __obj.updateDynamic("onTrigger")(p.toJsFn))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
}

