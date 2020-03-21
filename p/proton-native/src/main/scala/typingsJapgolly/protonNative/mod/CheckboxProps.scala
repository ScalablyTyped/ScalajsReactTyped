package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the checkbox is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display next to the check box.
    */
  var children: js.UndefOr[String] = js.undefined
  /**
    * Whether the checkbox can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when the checkbox is clicked. The current checkbox state is passed as an argument.
    */
  var onToggle: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  /**
    * Whether the checkbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    align: AnonH = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: AnonH = null,
    label: String = null,
    onToggle: /* checked */ Boolean => Callback = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onToggle(t0).runNow()))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

