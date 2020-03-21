package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSparkline extends js.Object {
  /** This method used to change the sparkline color and marker point color in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {any}  pass the high point color as object.
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changePointColor(sparklineId: String, option: js.Any, sheetIdx: Double): Unit
  /** This method used to change the sparkline type in the spreadsheet.
    * @param {string} Pass the sparkline ID
    * @param {string} Pass the sparkline type
    * @param {number} Optional. Pass the sheet index
    * @returns {void}
    */
  def changeType(sparklineId: String, `type`: String, sheetIdx: Double): Unit
  /** This method used for creating the sparkline chart for specified range in spreadsheet.
    * @param {string} Pass the data range
    * @param {string} Pass the location range
    * @param {string} Pass the sparkline chart type
    * @param {Spreadsheet.SparklineOptions} Pass Object SparklineOptions.
    * @param {number} Pass the sheetIndex
    * @returns {void}
    */
  def createSparkline(
    dataRange: String,
    locationRange: String,
    `type`: String,
    options: SparklineOptions,
    sheetIndex: Double
  ): Unit
}

object XLSparkline {
  @scala.inline
  def apply(
    changePointColor: (String, js.Any, Double) => Callback,
    changeType: (String, String, Double) => Callback,
    createSparkline: (String, String, String, SparklineOptions, Double) => Callback
  ): XLSparkline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changePointColor")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: scala.Double) => changePointColor(t0, t1, t2).runNow()))
    __obj.updateDynamic("changeType")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => changeType(t0, t1, t2).runNow()))
    __obj.updateDynamic("createSparkline")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.ejWebAll.ej.Spreadsheet.SparklineOptions, t4: scala.Double) => createSparkline(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[XLSparkline]
  }
}

