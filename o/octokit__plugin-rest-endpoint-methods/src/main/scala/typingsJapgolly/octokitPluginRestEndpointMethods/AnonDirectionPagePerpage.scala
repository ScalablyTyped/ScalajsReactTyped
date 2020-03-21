package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionPagePerpage extends js.Object {
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var team_id: AnonRequired
}

object AnonDirectionPagePerpage {
  @scala.inline
  def apply(direction: AnonEnum, page: AnonType, per_page: AnonType, team_id: AnonRequired): AnonDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionPagePerpage]
  }
}

