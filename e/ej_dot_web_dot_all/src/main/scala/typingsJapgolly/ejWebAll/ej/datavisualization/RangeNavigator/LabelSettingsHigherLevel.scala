package typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevel extends js.Object {
  /** Options for customizing the border of grid lines in higher level.
    */
  var border: js.UndefOr[LabelSettingsHigherLevelBorder] = js.undefined
  /** Specifies the fill color of higher level labels.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the grid line colors, width, dashArray, border.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsHigherLevelGridLineStyle] = js.undefined
  /** Specifies the intervalType for higher level labels. See
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.undefined
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
  /** Specifies the position of the labels to render either inside or outside of plot area
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
  /** Specifies the position of the labels in higher level
    * @Default {top}
    */
  var position: js.UndefOr[Position | String] = js.undefined
  /** Options for customizing the style of higher level labels.
    */
  var style: js.UndefOr[LabelSettingsHigherLevelStyle] = js.undefined
  /** Toggles the visibility of higher level labels.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object LabelSettingsHigherLevel {
  @scala.inline
  def apply(
    border: LabelSettingsHigherLevelBorder = null,
    fill: String = null,
    gridLineStyle: LabelSettingsHigherLevelGridLineStyle = null,
    intervalType: IntervalType | String = null,
    labelIntersectAction: LabelIntersectAction | String = null,
    labelPlacement: LabelPlacement | String = null,
    position: Position | String = null,
    style: LabelSettingsHigherLevelStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LabelSettingsHigherLevel = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridLineStyle != null) __obj.updateDynamic("gridLineStyle")(gridLineStyle.asInstanceOf[js.Any])
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (labelIntersectAction != null) __obj.updateDynamic("labelIntersectAction")(labelIntersectAction.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsHigherLevel]
  }
}

