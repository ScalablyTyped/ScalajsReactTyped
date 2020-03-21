package typingsJapgolly.cliColor.columnsMod

import typingsJapgolly.cliColor.cliColorStrings.left
import typingsJapgolly.cliColor.cliColorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnOptions extends js.Object {
  /**
    * align: Possible options: `'left'`, `'right'` (defaults to `'left'`)
    */
  var align: js.UndefOr[left | right] = js.undefined
}

object ColumnOptions {
  @scala.inline
  def apply(align: left | right = null): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnOptions]
  }
}

