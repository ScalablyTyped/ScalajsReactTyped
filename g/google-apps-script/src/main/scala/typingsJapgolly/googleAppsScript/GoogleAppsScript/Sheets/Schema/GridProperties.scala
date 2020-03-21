package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProperties extends js.Object {
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  var frozenColumnCount: js.UndefOr[Double] = js.undefined
  var frozenRowCount: js.UndefOr[Double] = js.undefined
  var hideGridlines: js.UndefOr[Boolean] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
}

object GridProperties {
  @scala.inline
  def apply(
    columnCount: Int | Double = null,
    columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined,
    frozenColumnCount: Int | Double = null,
    frozenRowCount: Int | Double = null,
    hideGridlines: js.UndefOr[Boolean] = js.undefined,
    rowCount: Int | Double = null,
    rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  ): GridProperties = {
    val __obj = js.Dynamic.literal()
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (!js.isUndefined(columnGroupControlAfter)) __obj.updateDynamic("columnGroupControlAfter")(columnGroupControlAfter.asInstanceOf[js.Any])
    if (frozenColumnCount != null) __obj.updateDynamic("frozenColumnCount")(frozenColumnCount.asInstanceOf[js.Any])
    if (frozenRowCount != null) __obj.updateDynamic("frozenRowCount")(frozenRowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGridlines)) __obj.updateDynamic("hideGridlines")(hideGridlines.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupControlAfter)) __obj.updateDynamic("rowGroupControlAfter")(rowGroupControlAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProperties]
  }
}

