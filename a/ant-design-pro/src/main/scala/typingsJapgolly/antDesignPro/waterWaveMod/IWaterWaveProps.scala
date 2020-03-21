package typingsJapgolly.antDesignPro.waterWaveMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaterWaveProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var height: Double
  var percent: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: Node
}

object IWaterWaveProps {
  @scala.inline
  def apply(
    height: Double,
    percent: Double,
    color: String = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): IWaterWaveProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaterWaveProps]
  }
}

