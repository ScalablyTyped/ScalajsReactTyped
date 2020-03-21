package typingsJapgolly.antd.stepsMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.antdStrings.active
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.butt
import typingsJapgolly.antd.antdStrings.exception
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.normal
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.antdStrings.round
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.antd.progressProgressMod.ProgressGradient
import typingsJapgolly.antd.progressProgressMod.ProgressProps
import typingsJapgolly.antd.progressProgressMod.ProgressSize
import typingsJapgolly.antd.progressProgressMod.ProgressType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends ProgressProps {
  @JSName("steps")
  var steps_StepsProps: Double
}

object StepsProps {
  @scala.inline
  def apply(
    steps: Double,
    className: String = null,
    format: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => CallbackTo[Node] = null,
    gapDegree: Int | Double = null,
    gapPosition: top | bottom | left | right = null,
    percent: Int | Double = null,
    prefixCls: String = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    size: ProgressSize = null,
    status: normal | exception | active | success = null,
    strokeColor: String | ProgressGradient = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null,
    successPercent: Int | Double = null,
    trailColor: String = null,
    `type`: ProgressType = null,
    width: Int | Double = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2((t0: /* percent */ js.UndefOr[scala.Double], t1: /* successPercent */ js.UndefOr[scala.Double]) => format(t0, t1).runNow()))
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (successPercent != null) __obj.updateDynamic("successPercent")(successPercent.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
}

