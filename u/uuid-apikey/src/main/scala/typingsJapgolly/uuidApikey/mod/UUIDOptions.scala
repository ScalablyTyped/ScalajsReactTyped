package typingsJapgolly.uuidApikey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDOptions extends js.Object {
  var noDashes: Boolean
}

object UUIDOptions {
  @scala.inline
  def apply(noDashes: Boolean): UUIDOptions = {
    val __obj = js.Dynamic.literal(noDashes = noDashes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UUIDOptions]
  }
}

