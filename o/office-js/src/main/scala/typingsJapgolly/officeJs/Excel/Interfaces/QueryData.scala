package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.LoadToType
import typingsJapgolly.officeJs.Excel.QueryError
import typingsJapgolly.officeJs.officeJsStrings.ConnectionOnly
import typingsJapgolly.officeJs.officeJsStrings.FailedDownload
import typingsJapgolly.officeJs.officeJsStrings.FailedLoadToDataModel
import typingsJapgolly.officeJs.officeJsStrings.FailedLoadToWorksheet
import typingsJapgolly.officeJs.officeJsStrings.FailedToCompleteDownload
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.PivotChart
import typingsJapgolly.officeJs.officeJsStrings.PivotTable
import typingsJapgolly.officeJs.officeJsStrings.Table
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `query.toJSON()`. */
trait QueryData extends StObject {
  
  /**
    * Gets the query error message from when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var error: js.UndefOr[
    QueryError | Unknown_ | None | FailedLoadToWorksheet | FailedLoadToDataModel | FailedDownload | FailedToCompleteDownload
  ] = js.undefined
  
  /**
    * Gets the query loaded to object type.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var loadedTo: js.UndefOr[LoadToType | ConnectionOnly | Table | PivotTable | PivotChart] = js.undefined
  
  /**
    * Specifies if the query loaded to the data model.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var loadedToDataModel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the name of the query.
    Query names cannot contain periods or quotation marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the date and time when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var refreshDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets the number of rows that were loaded when the query was last refreshed.
    If last refresh has errors the value will be -1.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var rowsLoadedCount: js.UndefOr[Double] = js.undefined
}
object QueryData {
  
  inline def apply(): QueryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryData]
  }
  
  extension [Self <: QueryData](x: Self) {
    
    inline def setError(
      value: QueryError | Unknown_ | None | FailedLoadToWorksheet | FailedLoadToDataModel | FailedDownload | FailedToCompleteDownload
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLoadedTo(value: LoadToType | ConnectionOnly | Table | PivotTable | PivotChart): Self = StObject.set(x, "loadedTo", value.asInstanceOf[js.Any])
    
    inline def setLoadedToDataModel(value: Boolean): Self = StObject.set(x, "loadedToDataModel", value.asInstanceOf[js.Any])
    
    inline def setLoadedToDataModelUndefined: Self = StObject.set(x, "loadedToDataModel", js.undefined)
    
    inline def setLoadedToUndefined: Self = StObject.set(x, "loadedTo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefreshDate(value: js.Date): Self = StObject.set(x, "refreshDate", value.asInstanceOf[js.Any])
    
    inline def setRefreshDateUndefined: Self = StObject.set(x, "refreshDate", js.undefined)
    
    inline def setRowsLoadedCount(value: Double): Self = StObject.set(x, "rowsLoadedCount", value.asInstanceOf[js.Any])
    
    inline def setRowsLoadedCountUndefined: Self = StObject.set(x, "rowsLoadedCount", js.undefined)
  }
}
