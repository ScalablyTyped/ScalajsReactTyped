package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeBorder extends Entity {
  /**
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color
    * (e.g. 'orange').
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft,
    * EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
    */
  var sideIndex: js.UndefOr[String] = js.undefined
  /**
    * One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous,
    * Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
    */
  var style: js.UndefOr[String] = js.undefined
  // Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
  var weight: js.UndefOr[String] = js.undefined
}

object WorkbookRangeBorder {
  @scala.inline
  def apply(
    color: String = null,
    id: String = null,
    sideIndex: String = null,
    style: String = null,
    weight: String = null
  ): WorkbookRangeBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRangeBorder]
  }
}

