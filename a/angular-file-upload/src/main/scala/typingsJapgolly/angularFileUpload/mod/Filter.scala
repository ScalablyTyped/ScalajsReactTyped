package typingsJapgolly.angularFileUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var fn: SyncFilter | AsyncFilter
  var name: String
}

object Filter {
  @scala.inline
  def apply(fn: SyncFilter | AsyncFilter, name: String): Filter = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

