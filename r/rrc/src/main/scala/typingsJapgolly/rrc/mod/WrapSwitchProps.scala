package typingsJapgolly.rrc.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.`match`
import typingsJapgolly.rrc.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](
    location: LocationDescriptorObjectL,
    routes: js.Array[RouteConfiguration],
    getKey: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => CallbackTo[String] = null
  ): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction3((t0: /* match */ typingsJapgolly.reactRouter.mod.`match`[Params], t1: /* route */ typingsJapgolly.rrc.mod.RouteConfiguration, t2: /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]) => getKey(t0, t1, t2).runNow()))
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
}

