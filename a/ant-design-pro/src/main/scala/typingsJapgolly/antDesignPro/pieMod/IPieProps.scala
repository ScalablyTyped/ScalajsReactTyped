package typingsJapgolly.antDesignPro.pieMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.UndefOr[js.Array[AnonX]] = js.undefined
  var hasLegend: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var subTitle: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var total: js.UndefOr[Node | Double | (js.Function0[Node | Double])] = js.undefined
  var valueFormat: js.UndefOr[js.Function1[/* value */ String, String | Node]] = js.undefined
}

object IPieProps {
  @scala.inline
  def apply(
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    colors: js.Array[String] = null,
    data: js.Array[AnonX] = null,
    hasLegend: js.UndefOr[Boolean] = js.undefined,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    percent: Int | Double = null,
    subTitle: VdomNode = null,
    title: VdomNode = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    total: Node | Double | (js.Function0[Node | Double]) = null,
    valueFormat: /* value */ String => CallbackTo[String | Node] = null
  ): IPieProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLegend)) __obj.updateDynamic("hasLegend")(hasLegend.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => valueFormat(t0).runNow()))
    __obj.asInstanceOf[IPieProps]
  }
}

