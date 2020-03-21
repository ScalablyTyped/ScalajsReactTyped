package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function.
  *
  *     chart = chart.modify().setPosition(5, 5, 0, 0).build();
  *     sheet.updateChart(chart);
  */
trait ContainerInfo extends js.Object {
  def getAnchorColumn(): Integer
  def getAnchorRow(): Integer
  def getOffsetX(): Integer
  def getOffsetY(): Integer
}

object ContainerInfo {
  @scala.inline
  def apply(
    getAnchorColumn: CallbackTo[Integer],
    getAnchorRow: CallbackTo[Integer],
    getOffsetX: CallbackTo[Integer],
    getOffsetY: CallbackTo[Integer]
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnchorColumn")(getAnchorColumn.toJsFn)
    __obj.updateDynamic("getAnchorRow")(getAnchorRow.toJsFn)
    __obj.updateDynamic("getOffsetX")(getOffsetX.toJsFn)
    __obj.updateDynamic("getOffsetY")(getOffsetY.toJsFn)
    __obj.asInstanceOf[ContainerInfo]
  }
}

