package typingsJapgolly.conductorAnimate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var animation: String
}

object Config {
  @scala.inline
  def apply(animation: String): Config = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

