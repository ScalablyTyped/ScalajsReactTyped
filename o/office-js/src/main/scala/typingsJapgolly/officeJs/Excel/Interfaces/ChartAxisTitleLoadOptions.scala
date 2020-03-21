package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the title of a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxisTitleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formatting of chart axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatLoadOptions] = js.native
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * A boolean that specifies the visibility of an axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

