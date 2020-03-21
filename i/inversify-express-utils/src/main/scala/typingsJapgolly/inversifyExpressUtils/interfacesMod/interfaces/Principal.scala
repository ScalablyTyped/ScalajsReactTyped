package typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  var details: js.Any
  def isAuthenticated(): js.Promise[Boolean]
  def isInRole(role: String): js.Promise[Boolean]
  def isResourceOwner(resourceId: js.Any): js.Promise[Boolean]
}

object Principal {
  @scala.inline
  def apply(
    details: js.Any,
    isAuthenticated: CallbackTo[js.Promise[Boolean]],
    isInRole: String => CallbackTo[js.Promise[Boolean]],
    isResourceOwner: js.Any => CallbackTo[js.Promise[Boolean]]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    __obj.updateDynamic("isAuthenticated")(isAuthenticated.toJsFn)
    __obj.updateDynamic("isInRole")(js.Any.fromFunction1((t0: java.lang.String) => isInRole(t0).runNow()))
    __obj.updateDynamic("isResourceOwner")(js.Any.fromFunction1((t0: js.Any) => isResourceOwner(t0).runNow()))
    __obj.asInstanceOf[Principal]
  }
}

