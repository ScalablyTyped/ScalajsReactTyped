package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoResponsePermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object TeamsCheckManagesRepoResponsePermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): TeamsCheckManagesRepoResponsePermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsCheckManagesRepoResponsePermissions]
  }
}

