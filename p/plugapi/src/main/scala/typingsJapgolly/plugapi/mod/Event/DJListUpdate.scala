package typingsJapgolly.plugapi.mod.Event

import typingsJapgolly.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJListUpdate extends js.Object {
  var djs: js.Array[DJ]
  var remove: String
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DJListUpdate]
  }
}

