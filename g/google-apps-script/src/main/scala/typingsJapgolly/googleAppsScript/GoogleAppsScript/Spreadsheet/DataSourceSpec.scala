package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the general settings of an existing data source spec. To access data source spec for
  * certain type, use as...() method. To create a new data source spec, use SpreadsheetApp.newDataSourceSpec().
  *
  * This example shows how to get information from a BigQuery data source spec.
  *
  *     var dataSourceTable =
  *         SpreadsheetApp.getActive().getSheetByName("Data Sheet 1").getDataSourceTables()[0];
  *     var spec = dataSourceTable.getDataSource().getSpec();
  *     if (spec.getType() == SpreadsheetApp.DataSourceType.BIGQUERY) {
  *       var bqSpec = spec.asBigQuery();
  *       Logger.log("Project ID: %s\n", bqSpec.getProjectId());
  *       Logger.log("Raw query string: %s\n", bqSpec.getRawQuery());
  *     }
  */
trait DataSourceSpec extends StObject {
  
  def asBigQuery(): BigQueryDataSourceSpec
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getType(): DataSourceType
}
object DataSourceSpec {
  
  inline def apply(
    asBigQuery: CallbackTo[BigQueryDataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getType: CallbackTo[DataSourceType]
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal(asBigQuery = asBigQuery.toJsFn, copy = copy.toJsFn, getParameters = getParameters.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[DataSourceSpec]
  }
  
  extension [Self <: DataSourceSpec](x: Self) {
    
    inline def setAsBigQuery(value: CallbackTo[BigQueryDataSourceSpec]): Self = StObject.set(x, "asBigQuery", value.toJsFn)
    
    inline def setCopy(value: CallbackTo[DataSourceSpecBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[js.Array[DataSourceParameter]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[DataSourceType]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}
