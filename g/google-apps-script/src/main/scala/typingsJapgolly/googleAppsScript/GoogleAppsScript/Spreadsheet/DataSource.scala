package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify existing data source. To create a data source table with new data source, see
  * DataSourceTable.
  */
trait DataSource extends js.Object {
  def getSpec(): DataSourceSpec
  def updateSpec(spec: DataSourceSpec): DataSource
}

object DataSource {
  @scala.inline
  def apply(getSpec: CallbackTo[DataSourceSpec], updateSpec: DataSourceSpec => CallbackTo[DataSource]): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSpec")(getSpec.toJsFn)
    __obj.updateDynamic("updateSpec")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceSpec) => updateSpec(t0).runNow()))
    __obj.asInstanceOf[DataSource]
  }
}

