package typingsJapgolly.baseui.progressBarMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var getProgressLabel: js.UndefOr[js.Function2[/* value */ Double, /* successValue */ Double, Node]] = js.undefined
  var infinite: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[ProgressBarOverrides] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
  var successValue: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    getProgressLabel: (/* value */ Double, /* successValue */ Double) => CallbackTo[Node] = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    successValue: Int | Double = null,
    value: Int | Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2((t0: /* value */ scala.Double, t1: /* successValue */ scala.Double) => getProgressLabel(t0, t1).runNow()))
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (successValue != null) __obj.updateDynamic("successValue")(successValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

