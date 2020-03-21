package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSelectionSettingsBorder extends js.Object {
  /** Border color of the series/point on selection.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the series/point on selection.
    * @Default {2}
    */
  var width: js.UndefOr[String] = js.undefined
}

object SeriesSelectionSettingsBorder {
  @scala.inline
  def apply(color: String = null, width: String = null): SeriesSelectionSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSelectionSettingsBorder]
  }
}

