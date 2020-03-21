package typingsJapgolly.reactTable

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableCellProps> */
trait PartialTableCellProps extends js.Object {
  var key: js.UndefOr[Key] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTableCellProps {
  @scala.inline
  def apply(key: Key = null, style: CSSProperties = null): PartialTableCellProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableCellProps]
  }
}

