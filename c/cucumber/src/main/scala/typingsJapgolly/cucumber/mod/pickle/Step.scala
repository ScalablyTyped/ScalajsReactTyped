package typingsJapgolly.cucumber.mod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var arguments: js.Array[Argument]
  var locations: js.Array[Location]
  var text: String
}

object Step {
  @scala.inline
  def apply(arguments: js.Array[Argument], locations: js.Array[Location], text: String): Step = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Step]
  }
}

