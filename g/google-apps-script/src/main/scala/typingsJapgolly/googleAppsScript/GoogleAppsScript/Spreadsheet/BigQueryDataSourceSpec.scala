package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the existing BigQuery data source specification. To create a new data source
  * specification, use SpreadsheetApp.newDataSourceSpec().
  */
trait BigQueryDataSourceSpec extends js.Object {
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getProjectId(): String
  def getRawQuery(): String
  def getType(): DataSourceType
}

object BigQueryDataSourceSpec {
  @scala.inline
  def apply(
    copy: CallbackTo[DataSourceSpecBuilder],
    getParameters: CallbackTo[js.Array[DataSourceParameter]],
    getProjectId: CallbackTo[String],
    getRawQuery: CallbackTo[String],
    getType: CallbackTo[DataSourceType]
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.updateDynamic("getProjectId")(getProjectId.toJsFn)
    __obj.updateDynamic("getRawQuery")(getRawQuery.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
}

