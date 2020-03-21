package typingsJapgolly.antDesignReactNative.portalHostMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalGuard extends js.Object {
  var nextKey: js.Any
  def add(e: Node): Double
  def remove(key: Double): Unit
}

object PortalGuard {
  @scala.inline
  def apply(add: Node => CallbackTo[Double], nextKey: js.Any, remove: Double => Callback): PortalGuard = {
    val __obj = js.Dynamic.literal(nextKey = nextKey.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Node) => add(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.asInstanceOf[PortalGuard]
  }
}

