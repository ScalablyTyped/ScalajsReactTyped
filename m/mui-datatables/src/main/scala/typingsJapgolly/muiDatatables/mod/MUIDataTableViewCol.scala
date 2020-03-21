package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableViewCol extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var columns: js.Array[_]
  var `object`: js.Object
  def onColumnUpdate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTableViewCol {
  @scala.inline
  def apply(
    columns: js.Array[_],
    `object`: js.Object,
    onColumnUpdate: js.Any => CallbackTo[js.Any],
    classes: js.Object = null
  ): MUIDataTableViewCol = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("onColumnUpdate")(js.Any.fromFunction1((t0: js.Any) => onColumnUpdate(t0).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableViewCol]
  }
}

