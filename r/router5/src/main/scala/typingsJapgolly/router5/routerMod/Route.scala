package typingsJapgolly.router5.routerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.router5.baseMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory] = js.undefined
  var children: js.UndefOr[js.Array[Route]] = js.undefined
  var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.undefined
  var defaultParams: js.UndefOr[Params] = js.undefined
  var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.undefined
  var forwardTo: js.UndefOr[String] = js.undefined
  var name: String
  var path: String
}

object Route {
  @scala.inline
  def apply(
    name: String,
    path: String,
    canActivate: (/* router */ Router, /* dependencies */ js.UndefOr[Dependencies]) => CallbackTo[ActivationFn] = null,
    children: js.Array[Route] = null,
    decodeParams: /* pathParams */ Params => CallbackTo[Params] = null,
    defaultParams: Params = null,
    encodeParams: /* stateParams */ Params => CallbackTo[Params] = null,
    forwardTo: String = null
  ): Route = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (canActivate != null) __obj.updateDynamic("canActivate")(js.Any.fromFunction2((t0: /* router */ typingsJapgolly.router5.routerMod.Router, t1: /* dependencies */ js.UndefOr[typingsJapgolly.router5.routerMod.Dependencies]) => canActivate(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (decodeParams != null) __obj.updateDynamic("decodeParams")(js.Any.fromFunction1((t0: /* pathParams */ typingsJapgolly.router5.baseMod.Params) => decodeParams(t0).runNow()))
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams.asInstanceOf[js.Any])
    if (encodeParams != null) __obj.updateDynamic("encodeParams")(js.Any.fromFunction1((t0: /* stateParams */ typingsJapgolly.router5.baseMod.Params) => encodeParams(t0).runNow()))
    if (forwardTo != null) __obj.updateDynamic("forwardTo")(forwardTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

