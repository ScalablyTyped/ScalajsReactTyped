package typingsJapgolly.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterDto extends js.Object {
  var memberList: js.Array[TeamMemberInfoDto]
  var ownerId: Double
}

object RosterDto {
  @scala.inline
  def apply(memberList: js.Array[TeamMemberInfoDto], ownerId: Double): RosterDto = {
    val __obj = js.Dynamic.literal(memberList = memberList.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RosterDto]
  }
}

