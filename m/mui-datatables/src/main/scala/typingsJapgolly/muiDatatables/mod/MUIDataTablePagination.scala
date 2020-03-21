package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTablePagination extends js.Object {
  var count: Double
  var options: js.Object
  var page: Double
  var rowsPerPage: Double
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTablePagination {
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => CallbackTo[js.Any],
    count: Double,
    options: js.Object,
    page: Double,
    rowsPerPage: Double
  ): MUIDataTablePagination = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.updateDynamic("changeRowsPerPage")(js.Any.fromFunction1((t0: js.Any) => changeRowsPerPage(t0).runNow()))
    __obj.asInstanceOf[MUIDataTablePagination]
  }
}

