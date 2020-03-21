package typingsJapgolly.rmcSteps.stepMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStepProps extends js.Object {
  var adjustMarginRight: js.UndefOr[Double | String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var itemWidth: js.UndefOr[Double | String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var progressDot: js.UndefOr[Boolean | js.Function] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var stepNumber: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var wrapperStyle: js.UndefOr[js.Any] = js.undefined
}

object IStepProps {
  @scala.inline
  def apply(
    adjustMarginRight: Double | String = null,
    className: String = null,
    description: js.Any = null,
    icon: VdomNode = null,
    iconPrefix: String = null,
    itemWidth: Double | String = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    status: String = null,
    stepNumber: Int | Double = null,
    style: js.Any = null,
    title: js.Any = null,
    wrapperStyle: js.Any = null
  ): IStepProps = {
    val __obj = js.Dynamic.literal()
    if (adjustMarginRight != null) __obj.updateDynamic("adjustMarginRight")(adjustMarginRight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stepNumber != null) __obj.updateDynamic("stepNumber")(stepNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStepProps]
  }
}

