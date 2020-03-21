package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentname extends js.Object {
  var color: AnonType
  var current_name: AnonRequired
  var description: AnonType
  var name: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonCurrentname {
  @scala.inline
  def apply(
    color: AnonType,
    current_name: AnonRequired,
    description: AnonType,
    name: AnonType,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonCurrentname = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], current_name = current_name.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentname]
  }
}

