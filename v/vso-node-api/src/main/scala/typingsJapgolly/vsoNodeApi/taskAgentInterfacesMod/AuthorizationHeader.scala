package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationHeader extends js.Object {
  var name: String
  var value: String
}

object AuthorizationHeader {
  @scala.inline
  def apply(name: String, value: String): AuthorizationHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorizationHeader]
  }
}

