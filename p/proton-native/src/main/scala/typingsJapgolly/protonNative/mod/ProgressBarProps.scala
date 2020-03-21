package typingsJapgolly.protonNative.mod

import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the ProgressBar is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The current value of the ProgressBar (0-100). A value of -1 indicates an indeterminate progressbar.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Whether the ProgressBar can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    align: AnonH = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: AnonH = null,
    label: String = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

