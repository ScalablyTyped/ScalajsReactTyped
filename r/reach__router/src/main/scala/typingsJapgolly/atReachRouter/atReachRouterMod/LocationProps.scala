package typingsJapgolly.atReachRouter.atReachRouterMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProps extends js.Object {
  var children: LocationProviderRenderFn
}

object LocationProps {
  @scala.inline
  def apply(children: /* context */ LocationContext => CallbackTo[Node]): LocationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.atReachRouter.atReachRouterMod.LocationContext) => children(t0).runNow()))
    __obj.asInstanceOf[LocationProps]
  }
}

