package typingsJapgolly.reduxLittleRouter.mod

import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO_FORWARD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoForwardAction extends RouterActions {
  var `type`: ROUTER_GO_FORWARD
}

object GoForwardAction {
  @scala.inline
  def apply(`type`: ROUTER_GO_FORWARD): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoForwardAction]
  }
}

