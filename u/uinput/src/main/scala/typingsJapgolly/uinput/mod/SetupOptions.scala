package typingsJapgolly.uinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupOptions extends js.Object {
  var EV_KEY: js.Array[_]
}

object SetupOptions {
  @scala.inline
  def apply(EV_KEY: js.Array[_]): SetupOptions = {
    val __obj = js.Dynamic.literal(EV_KEY = EV_KEY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetupOptions]
  }
}

