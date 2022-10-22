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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends StObject {
  
  /**
    * Specifies the series map labels strategy of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  
  /**
    * Specifies the series mapping level of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  
  /**
    * Specifies the series projection type of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.undefined
}
object ChartMapOptionsData {
  
  inline def apply(): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsData]
  }
  
  extension [Self <: ChartMapOptionsData](x: Self) {
    
    inline def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = StObject.set(x, "labelStrategy", value.asInstanceOf[js.Any])
    
    inline def setLabelStrategyUndefined: Self = StObject.set(x, "labelStrategy", js.undefined)
    
    inline def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
  }
}
