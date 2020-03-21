package typingsJapgolly.antDesignReactNative.portalHostMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalMethods extends js.Object {
  def mount(children: Node): Double
  def unmount(key: Double): Unit
  def update(key: Double, children: Node): Unit
}

object PortalMethods {
  @scala.inline
  def apply(mount: Node => CallbackTo[Double], unmount: Double => Callback, update: (Double, Node) => Callback): PortalMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mount")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Node) => mount(t0).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction1((t0: scala.Double) => unmount(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: scala.Double, t1: japgolly.scalajs.react.raw.React.Node) => update(t0, t1).runNow()))
    __obj.asInstanceOf[PortalMethods]
  }
}

