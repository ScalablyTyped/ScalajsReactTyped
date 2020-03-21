package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartMapAreaLevel
import typingsJapgolly.officeJsPreview.Excel.ChartMapLabelStrategy
import typingsJapgolly.officeJsPreview.Excel.ChartMapProjectionType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Albers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.City
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Continent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Country
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.County
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataOnly
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mercator
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Miller
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Robinson
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ShowAll
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.State
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
trait ChartMapOptionsUpdateData extends js.Object {
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

object ChartMapOptionsUpdateData {
  @scala.inline
  def apply(
    labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = null,
    level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = null,
    projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = null
  ): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
}

