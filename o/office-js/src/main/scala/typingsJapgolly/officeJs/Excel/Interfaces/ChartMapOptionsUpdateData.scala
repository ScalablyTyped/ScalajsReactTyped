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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
trait ChartMapOptionsUpdateData extends StObject {
  
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
object ChartMapOptionsUpdateData {
  
  inline def apply(): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
  
  extension [Self <: ChartMapOptionsUpdateData](x: Self) {
    
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
