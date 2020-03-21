package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for DataSourceSpec. To create a specification for certain type, use as...() method. To create a new builder, use SpreadsheetApp.newDataSourceSpec(). To use the specification, see DataSourceTable.
  *
  * This examples show how to build a BigQuery data source specification.
  *
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  */
trait DataSourceSpecBuilder extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpecBuilder
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getType(): DataSourceType
  def removeAllParameters(): DataSourceSpecBuilder
  def removeParameter(parameterName: String): DataSourceSpecBuilder
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder
}

object DataSourceSpecBuilder {
  @scala.inline
  def apply(
    asBigQuery: CallbackTo[BigQueryDataSourceSpecBuilder],
    build: CallbackTo[DataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getType: CallbackTo[DataSourceType],
    removeAllParameters: CallbackTo[DataSourceSpecBuilder],
    removeParameter: String => CallbackTo[DataSourceSpecBuilder],
    setParameterFromCell: (String, String) => CallbackTo[DataSourceSpecBuilder]
  ): DataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBigQuery")(asBigQuery.toJsFn)
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("removeAllParameters")(removeAllParameters.toJsFn)
    __obj.updateDynamic("removeParameter")(js.Any.fromFunction1((t0: java.lang.String) => removeParameter(t0).runNow()))
    __obj.updateDynamic("setParameterFromCell")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setParameterFromCell(t0, t1).runNow()))
    __obj.asInstanceOf[DataSourceSpecBuilder]
  }
}

