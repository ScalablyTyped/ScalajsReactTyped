package typingsJapgolly.datatablesNetRowreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Enable and configure the RowReorder extension for DataTables
    */
  var rowReorder: js.UndefOr[RowReorderSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(rowReorder: RowReorderSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (rowReorder != null) __obj.updateDynamic("rowReorder")(rowReorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

