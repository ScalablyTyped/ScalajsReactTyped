package typingsJapgolly.imperium.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleActions extends js.Object {
  var actions: js.Array[Action]
  var getAcl: js.UndefOr[GetAcl] = js.undefined
}

object RoleActions {
  @scala.inline
  def apply(
    actions: js.Array[Action],
    getAcl: /* req */ Request_[ParamsDictionary] => CallbackTo[js.Promise[Boolean | js.Object]] = null
  ): RoleActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (getAcl != null) __obj.updateDynamic("getAcl")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => getAcl(t0).runNow()))
    __obj.asInstanceOf[RoleActions]
  }
}

