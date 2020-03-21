package typingsJapgolly.nivoTooltip.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.nivoTooltip.Pickanytooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicTooltipProps extends js.Object {
  var color: String
  var enableChip: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ Double | String, Double | String]] = js.undefined
  var id: Node
  var renderContent: js.UndefOr[js.Function0[Node]] = js.undefined
  var theme: Pickanytooltip
  var value: js.UndefOr[String | Double] = js.undefined
}

object BasicTooltipProps {
  @scala.inline
  def apply(
    color: String,
    theme: Pickanytooltip,
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => CallbackTo[Double | String] = null,
    id: VdomNode = null,
    renderContent: js.UndefOr[CallbackTo[Node]] = js.undefined,
    value: String | Double = null
  ): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* value */ scala.Double | java.lang.String) => format(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.rawNode.asInstanceOf[js.Any])
    renderContent.foreach(p => __obj.updateDynamic("renderContent")(p.toJsFn))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
}

