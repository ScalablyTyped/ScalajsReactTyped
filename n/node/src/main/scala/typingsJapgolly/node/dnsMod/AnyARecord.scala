package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.nodeStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyARecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: A
}

object AnyARecord {
  @scala.inline
  def apply(address: java.lang.String, ttl: Double, `type`: A): AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyARecord]
  }
}

