package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponseEnforceAdmins extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposUpdateBranchProtectionResponseEnforceAdmins {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposUpdateBranchProtectionResponseEnforceAdmins = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseEnforceAdmins]
  }
}

