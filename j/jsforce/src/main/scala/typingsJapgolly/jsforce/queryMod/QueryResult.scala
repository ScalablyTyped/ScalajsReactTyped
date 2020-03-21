package typingsJapgolly.jsforce.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[T] extends js.Object {
  var done: Boolean
  var nextRecordsUrl: js.UndefOr[String] = js.undefined
  var records: js.Array[T]
  var totalSize: Double
}

object QueryResult {
  @scala.inline
  def apply[T](done: Boolean, records: js.Array[T], totalSize: Double, nextRecordsUrl: String = null): QueryResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    if (nextRecordsUrl != null) __obj.updateDynamic("nextRecordsUrl")(nextRecordsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[T]]
  }
}

