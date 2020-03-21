package typingsJapgolly.antDesignPro.barMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.AnonX
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarProps extends js.Object {
  var autoLabel: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[AnonX]
  var height: Double
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: Node
}

object IBarProps {
  @scala.inline
  def apply(
    data: js.Array[AnonX],
    height: Double,
    autoLabel: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): IBarProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLabel)) __obj.updateDynamic("autoLabel")(autoLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarProps]
  }
}

