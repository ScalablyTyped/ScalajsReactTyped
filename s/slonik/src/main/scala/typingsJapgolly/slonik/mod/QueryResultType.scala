package typingsJapgolly.slonik.mod

import typingsJapgolly.slonik.slonikStrings.DELETE
import typingsJapgolly.slonik.slonikStrings.INSERT
import typingsJapgolly.slonik.slonikStrings.SELECT
import typingsJapgolly.slonik.slonikStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultType[T] extends js.Object {
  var command: DELETE | INSERT | SELECT | UPDATE
  var fields: js.Array[FieldType]
  var notices: js.Array[NoticeType]
  var oid: Double | Null
  var rowAsArray: Boolean
  var rowCount: Double
  var rows: js.Array[T]
}

object QueryResultType {
  @scala.inline
  def apply[T](
    command: DELETE | INSERT | SELECT | UPDATE,
    fields: js.Array[FieldType],
    notices: js.Array[NoticeType],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[T],
    oid: Int | Double = null
  ): QueryResultType[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (oid != null) __obj.updateDynamic("oid")(oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultType[T]]
  }
}

