package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.SlicerSortType
import typingsJapgolly.officeJs.officeJsStrings.Ascending
import typingsJapgolly.officeJs.officeJsStrings.DataSourceOrder
import typingsJapgolly.officeJs.officeJsStrings.Descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicer.toJSON()`. */
trait SlicerData extends StObject {
  
  /**
    * Represents the caption of the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the height, in points, of the slicer.
    Throws an `InvalidArgument` exception when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the unique ID of the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Value is `true` if all filters currently applied on the slicer are cleared.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var isFilterCleared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an `InvalidArgument` error when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the name of the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the collection of slicer items that are part of the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var slicerItems: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
  
  /**
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[SlicerSortType | DataSourceOrder | Ascending | Descending] = js.undefined
  
  /**
    * Constant value that represents the slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an `InvalidArgument` error when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the width, in points, of the slicer.
    Throws an `InvalidArgument` error when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the worksheet containing the slicer.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetData] = js.undefined
}
object SlicerData {
  
  inline def apply(): SlicerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerData]
  }
  
  extension [Self <: SlicerData](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFilterCleared(value: Boolean): Self = StObject.set(x, "isFilterCleared", value.asInstanceOf[js.Any])
    
    inline def setIsFilterClearedUndefined: Self = StObject.set(x, "isFilterCleared", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlicerItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "slicerItems", value.asInstanceOf[js.Any])
    
    inline def setSlicerItemsUndefined: Self = StObject.set(x, "slicerItems", js.undefined)
    
    inline def setSlicerItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "slicerItems", js.Array(value*))
    
    inline def setSortBy(value: SlicerSortType | DataSourceOrder | Ascending | Descending): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: WorksheetData): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
