package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseEnforceAdmins extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposGetBranchProtectionResponseEnforceAdmins {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetBranchProtectionResponseEnforceAdmins = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponseEnforceAdmins]
  }
}

