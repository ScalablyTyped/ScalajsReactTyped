package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConvertMemberToOutsideCollaboratorParams extends js.Object {
  var org: String
  var username: String
}

object OrgsConvertMemberToOutsideCollaboratorParams {
  @scala.inline
  def apply(org: String, username: String): OrgsConvertMemberToOutsideCollaboratorParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsConvertMemberToOutsideCollaboratorParams]
  }
}

