package typingsJapgolly.hiredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var return_buffers: Boolean
}

object Config {
  @scala.inline
  def apply(return_buffers: Boolean): Config = {
    val __obj = js.Dynamic.literal(return_buffers = return_buffers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

