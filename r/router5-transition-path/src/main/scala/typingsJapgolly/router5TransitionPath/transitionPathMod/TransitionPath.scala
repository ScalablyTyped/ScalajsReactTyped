package typingsJapgolly.router5TransitionPath.transitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionPath extends js.Object {
  var intersection: String
  var toActivate: js.Array[String]
  var toDeactivate: js.Array[String]
}

object TransitionPath {
  @scala.inline
  def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
    val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], toActivate = toActivate.asInstanceOf[js.Any], toDeactivate = toDeactivate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionPath]
  }
}

