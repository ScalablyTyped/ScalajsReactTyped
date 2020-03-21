package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartMapAreaLevel
import typingsJapgolly.officeJs.Excel.ChartMapLabelStrategy
import typingsJapgolly.officeJs.Excel.ChartMapProjectionType
import typingsJapgolly.officeJs.officeJsStrings.Albers
import typingsJapgolly.officeJs.officeJsStrings.Automatic
import typingsJapgolly.officeJs.officeJsStrings.BestFit
import typingsJapgolly.officeJs.officeJsStrings.City
import typingsJapgolly.officeJs.officeJsStrings.Continent
import typingsJapgolly.officeJs.officeJsStrings.Country
import typingsJapgolly.officeJs.officeJsStrings.County
import typingsJapgolly.officeJs.officeJsStrings.DataOnly
import typingsJapgolly.officeJs.officeJsStrings.Mercator
import typingsJapgolly.officeJs.officeJsStrings.Miller
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Robinson
import typingsJapgolly.officeJs.officeJsStrings.ShowAll
import typingsJapgolly.officeJs.officeJsStrings.State
import typingsJapgolly.officeJs.officeJsStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.undefined
}

object ChartMapOptionsData {
  @scala.inline
  def apply(
    labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = null,
    level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = null,
    projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = null
  ): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsData]
  }
}

