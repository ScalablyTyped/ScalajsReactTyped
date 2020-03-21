package typingsJapgolly.aqb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertRet extends js.Object {
  def insert(insertExpr: js.Any): UpsertRetInsertRet
}

object UpsertRet {
  @scala.inline
  def apply(insert: js.Any => CallbackTo[UpsertRetInsertRet]): UpsertRet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: js.Any) => insert(t0).runNow()))
    __obj.asInstanceOf[UpsertRet]
  }
}

