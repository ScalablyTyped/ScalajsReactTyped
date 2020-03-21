package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisMultiLevelLabelsFont extends js.Object {
  /** Font color of the multi level labels text.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font family of the multi level labels text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style of the multi level labels text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight of the multi level label text.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Opacity of the multi level label text.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size of the multi level label text.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object PrimaryYAxisMultiLevelLabelsFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: String = null,
    opacity: Int | Double = null,
    size: String = null
  ): PrimaryYAxisMultiLevelLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsFont]
  }
}

