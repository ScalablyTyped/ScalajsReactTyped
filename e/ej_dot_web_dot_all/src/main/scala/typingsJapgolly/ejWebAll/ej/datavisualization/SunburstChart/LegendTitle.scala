package typingsJapgolly.ejWebAll.ej.datavisualization.SunburstChart

import typingsJapgolly.ejWebAll.ej.datavisualization.Sunburst.SunburstAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitle extends js.Object {
  /** Options to customize the font used for legend title
    */
  var font: js.UndefOr[LegendTitleFont] = js.undefined
  /** Text to be displayed in legend title.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Alignment of the legend title.
    * @Default {center. See Alignment}
    */
  var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
  /** Enables or disables the legend title.
    * @Default {true}
    */
  var visible: js.UndefOr[String] = js.undefined
}

object LegendTitle {
  @scala.inline
  def apply(
    font: LegendTitleFont = null,
    text: String = null,
    textAlignment: SunburstAlignment | String = null,
    visible: String = null
  ): LegendTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendTitle]
  }
}

