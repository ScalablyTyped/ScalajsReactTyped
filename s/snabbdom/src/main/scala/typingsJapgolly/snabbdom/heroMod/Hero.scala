package typingsJapgolly.snabbdom.heroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hero extends js.Object {
  var id: String
}

object Hero {
  @scala.inline
  def apply(id: String): Hero = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Hero]
  }
}

