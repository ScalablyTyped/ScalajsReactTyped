package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for BigQueryDataSourceSpecBuilder.
  */
trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getProjectId(): String
  def getRawQuery(): String
  def getType(): DataSourceType
  def removeAllParameters(): BigQueryDataSourceSpecBuilder
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder
}

object BigQueryDataSourceSpecBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[DataSourceSpec],
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getProjectId: CallbackTo[String],
    getRawQuery: CallbackTo[String],
    getType: CallbackTo[DataSourceType],
    removeAllParameters: CallbackTo[BigQueryDataSourceSpecBuilder],
    removeParameter: String => CallbackTo[BigQueryDataSourceSpecBuilder],
    setParameterFromCell: (String, String) => CallbackTo[BigQueryDataSourceSpecBuilder],
    setProjectId: String => CallbackTo[BigQueryDataSourceSpecBuilder],
    setRawQuery: String => CallbackTo[BigQueryDataSourceSpecBuilder]
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.updateDynamic("getProjectId")(getProjectId.toJsFn)
    __obj.updateDynamic("getRawQuery")(getRawQuery.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("removeAllParameters")(removeAllParameters.toJsFn)
    __obj.updateDynamic("removeParameter")(js.Any.fromFunction1((t0: java.lang.String) => removeParameter(t0).runNow()))
    __obj.updateDynamic("setParameterFromCell")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setParameterFromCell(t0, t1).runNow()))
    __obj.updateDynamic("setProjectId")(js.Any.fromFunction1((t0: java.lang.String) => setProjectId(t0).runNow()))
    __obj.updateDynamic("setRawQuery")(js.Any.fromFunction1((t0: java.lang.String) => setRawQuery(t0).runNow()))
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
}

