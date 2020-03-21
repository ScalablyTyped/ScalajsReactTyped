package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antd.tableInterfaceMod.CompareFn
import typingsJapgolly.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompare[RecordType] extends js.Object {
  var compare: CompareFn[RecordType]
  /** Config multiple sorter order priority */
  var multiple: Double
}

object AnonCompare {
  @scala.inline
  def apply[RecordType](
    compare: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => CallbackTo[Double],
    multiple: Double
  ): AnonCompare[RecordType] = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.updateDynamic("compare")(js.Any.fromFunction3((t0: RecordType, t1: RecordType, t2: /* sortOrder */ js.UndefOr[typingsJapgolly.antd.tableInterfaceMod.SortOrder]) => compare(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonCompare[RecordType]]
  }
}

