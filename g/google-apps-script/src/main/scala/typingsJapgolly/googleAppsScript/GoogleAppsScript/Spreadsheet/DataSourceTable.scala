package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing data source table. To create a new data source table on a new sheet,
  * use Spreadsheet.insertSheetWithDataSourceTable(spec).
  *
  * This example shows how to create a new data source table.
  *
  *     SpreadsheetApp.enableBigQueryExecution();
  *     var spreadsheet = SpreadsheetApp.getActive();
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  *     // Starts data execution asynchronously.
  *     var dataSheet = spreadsheet.insertSheetWithDataSourceTable(spec);
  *     var dataSourceTable = dataSheet.getDataSourceTables()[0];
  *     // waitForCompletion() blocks script execution until data execution completes.
  *     dataSourceTable.waitForCompletion(60);
  *     // Check status after execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  *
  * This example shows how to edit a data source.
  *
  *     SpreadsheetApp.enableBigQueryExecution();
  *     var dataSheet = SpreadsheetApp.getActive().getSheetByName("Data Sheet 1");
  *     var dataSourceTable = dataSheet.getDataSourceTables()[0];
  *     var dataSource = dataSourceTable.getDataSource();
  *     var newSpec = dataSource.getSpec()
  *                   .copy()
  *                   .asBigQuery()
  *                   .setRawQuery('select name from table limit 2')
  *                   .removeAllParameters()
  *                   .build();
  *     // Updates data source specification and starts data execution asynchronously.
  *     dataSource.updateSpec(newSpec);
  *     // Check status during execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  *     // waitForCompletion() blocks script execution until data execution completes.
  *     dataSourceTable.waitForCompletion(60);
  *     // Check status after execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  */
trait DataSourceTable extends StObject {
  
  def forceRefreshData(): DataSourceTable
  
  def getDataSource(): DataSource
  
  def getRange(): Range
  
  def getStatus(): DataExecutionStatus
  
  def refreshData(): DataSourceTable
  
  def waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus
}
object DataSourceTable {
  
  inline def apply(
    forceRefreshData: CallbackTo[DataSourceTable],
    getDataSource: CallbackTo[DataSource],
    getRange: CallbackTo[Range],
    getStatus: CallbackTo[DataExecutionStatus],
    refreshData: CallbackTo[DataSourceTable],
    waitForCompletion: Integer => DataExecutionStatus
  ): DataSourceTable = {
    val __obj = js.Dynamic.literal(forceRefreshData = forceRefreshData.toJsFn, getDataSource = getDataSource.toJsFn, getRange = getRange.toJsFn, getStatus = getStatus.toJsFn, refreshData = refreshData.toJsFn, waitForCompletion = js.Any.fromFunction1(waitForCompletion))
    __obj.asInstanceOf[DataSourceTable]
  }
  
  extension [Self <: DataSourceTable](x: Self) {
    
    inline def setForceRefreshData(value: CallbackTo[DataSourceTable]): Self = StObject.set(x, "forceRefreshData", value.toJsFn)
    
    inline def setGetDataSource(value: CallbackTo[DataSource]): Self = StObject.set(x, "getDataSource", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[Range]): Self = StObject.set(x, "getRange", value.toJsFn)
    
    inline def setGetStatus(value: CallbackTo[DataExecutionStatus]): Self = StObject.set(x, "getStatus", value.toJsFn)
    
    inline def setRefreshData(value: CallbackTo[DataSourceTable]): Self = StObject.set(x, "refreshData", value.toJsFn)
    
    inline def setWaitForCompletion(value: Integer => DataExecutionStatus): Self = StObject.set(x, "waitForCompletion", js.Any.fromFunction1(value))
  }
}
