package typingsJapgolly.grommet.rangeSelectorMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.grommet.AnonLower
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.weak
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorProps extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[AnonLower] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.undefined
  var round: js.UndefOr[xsmall | small | medium | large | full | String] = js.undefined
  var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var values: js.Array[Double]
}

object RangeSelectorProps {
  @scala.inline
  def apply(
    values: js.Array[Double],
    color: ColorType = null,
    direction: horizontal | vertical = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    messages: AnonLower = null,
    min: Int | Double = null,
    onChange: /* repeated */ js.Any => Callback = null,
    opacity: weak | medium | strong | String | Boolean = null,
    round: xsmall | small | medium | large | full | String = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | String = null,
    step: Int | Double = null
  ): RangeSelectorProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onChange(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorProps]
  }
}

