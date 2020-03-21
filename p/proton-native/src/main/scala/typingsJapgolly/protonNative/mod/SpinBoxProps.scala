package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinBoxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the Spinbox is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * When the Spinbox value is changed. The current value is passed as a parameter.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * What the value of the Spinbox is set to.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Whether the Spinbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SpinBoxProps {
  @scala.inline
  def apply(
    align: AnonH = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: AnonH = null,
    label: String = null,
    onChange: /* value */ Double => Callback = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SpinBoxProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinBoxProps]
  }
}

