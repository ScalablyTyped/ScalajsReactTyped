package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getData() response for your script project.
  *
  *     function getFields() {...}
  *     function getData() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *
  *       return cc.newGetDataResponse()
  *         .setFields(getFields())
  *         .addRow(['3', 'Foobar.com'])
  *         .addRow(['4', 'Foobaz.com'])
  *         .addRows([
  *           ['5', 'Fizzbuz.com'],
  *           ['6', 'Fizzbaz.com']
  *          ])
  *         .build();
  *     }
  */
trait GetDataResponse extends js.Object {
  def addAllRows(rows: js.Array[js.Array[String]]): GetDataResponse
  def addRow(row: js.Array[String]): GetDataResponse
  def build(): js.Any
  def setFields(fields: Fields): GetDataResponse
  def setFiltersApplied(filtersApplied: Boolean): GetDataResponse
}

object GetDataResponse {
  @scala.inline
  def apply(
    addAllRows: js.Array[js.Array[String]] => CallbackTo[GetDataResponse],
    addRow: js.Array[String] => CallbackTo[GetDataResponse],
    build: CallbackTo[js.Any],
    setFields: Fields => CallbackTo[GetDataResponse],
    setFiltersApplied: Boolean => CallbackTo[GetDataResponse]
  ): GetDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAllRows")(js.Any.fromFunction1((t0: js.Array[js.Array[java.lang.String]]) => addAllRows(t0).runNow()))
    __obj.updateDynamic("addRow")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addRow(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.Fields) => setFields(t0).runNow()))
    __obj.updateDynamic("setFiltersApplied")(js.Any.fromFunction1((t0: scala.Boolean) => setFiltersApplied(t0).runNow()))
    __obj.asInstanceOf[GetDataResponse]
  }
}

