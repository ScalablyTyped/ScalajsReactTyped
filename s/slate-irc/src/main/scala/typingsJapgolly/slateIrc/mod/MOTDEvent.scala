package typingsJapgolly.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MOTDEvent extends js.Object {
  var motd: js.Array[String]
}

object MOTDEvent {
  @scala.inline
  def apply(motd: js.Array[String]): MOTDEvent = {
    val __obj = js.Dynamic.literal(motd = motd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MOTDEvent]
  }
}

