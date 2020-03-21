package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[ResultTableColumnHeader]] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    columnHeaders: js.Array[ResultTableColumnHeader] = null,
    errors: Errors = null,
    kind: String = null,
    rows: js.Array[js.Array[_]] = null
  ): QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponse]
  }
}

