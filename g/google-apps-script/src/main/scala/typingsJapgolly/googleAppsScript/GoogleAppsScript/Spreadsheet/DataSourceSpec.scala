package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait DataSourceSpec extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getType(): DataSourceType
}

object DataSourceSpec {
  @scala.inline
  def apply(
    asBigQuery: CallbackTo[BigQueryDataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getType: CallbackTo[DataSourceType]
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBigQuery")(asBigQuery.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[DataSourceSpec]
  }
}

