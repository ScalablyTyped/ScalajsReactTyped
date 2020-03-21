package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait DataSourceTable extends js.Object {
  def forceRefreshData(): DataSourceTable
  def getDataSource(): DataSource
  def getRange(): Range
  def getStatus(): DataExecutionStatus
  def refreshData(): DataSourceTable
  def waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus
}

object DataSourceTable {
  @scala.inline
  def apply(
    forceRefreshData: CallbackTo[DataSourceTable],
    getDataSource: CallbackTo[DataSource],
    getRange: CallbackTo[Range],
    getStatus: CallbackTo[DataExecutionStatus],
    refreshData: CallbackTo[DataSourceTable],
    waitForCompletion: Integer => CallbackTo[DataExecutionStatus]
  ): DataSourceTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceRefreshData")(forceRefreshData.toJsFn)
    __obj.updateDynamic("getDataSource")(getDataSource.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("refreshData")(refreshData.toJsFn)
    __obj.updateDynamic("waitForCompletion")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => waitForCompletion(t0).runNow()))
    __obj.asInstanceOf[DataSourceTable]
  }
}

