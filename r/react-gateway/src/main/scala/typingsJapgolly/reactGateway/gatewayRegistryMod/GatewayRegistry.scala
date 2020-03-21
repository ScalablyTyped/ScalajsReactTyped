package typingsJapgolly.reactGateway.gatewayRegistryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayRegistry extends js.Object {
  var _children: StringDictionary[js.UndefOr[StringDictionary[Node]]]
  var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]]
  var _currentId: Double
  def _renderContainer(name: String): Unit
  def addChild(name: String, gatewayId: String, child: Node): Unit
  def addContainer(name: String, container: Component[js.Object, js.Object]): Unit
  def clearChild(name: String, gatewayId: String): Unit
  def register(name: String, child: Node): String
  def removeContainer(name: String): Unit
  def unregister(name: String, gatewayId: String): Unit
}

object GatewayRegistry {
  @scala.inline
  def apply(
    _children: StringDictionary[js.UndefOr[StringDictionary[Node]]],
    _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]],
    _currentId: Double,
    _renderContainer: String => Callback,
    addChild: (String, String, Node) => Callback,
    addContainer: (String, Component[js.Object, js.Object]) => Callback,
    clearChild: (String, String) => Callback,
    register: (String, Node) => CallbackTo[String],
    removeContainer: String => Callback,
    unregister: (String, String) => Callback
  ): GatewayRegistry = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any])
    __obj.updateDynamic("_renderContainer")(js.Any.fromFunction1((t0: java.lang.String) => _renderContainer(t0).runNow()))
    __obj.updateDynamic("addChild")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: japgolly.scalajs.react.raw.React.Node) => addChild(t0, t1, t2).runNow()))
    __obj.updateDynamic("addContainer")(js.Any.fromFunction2((t0: java.lang.String, t1: japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]) => addContainer(t0, t1).runNow()))
    __obj.updateDynamic("clearChild")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => clearChild(t0, t1).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: japgolly.scalajs.react.raw.React.Node) => register(t0, t1).runNow()))
    __obj.updateDynamic("removeContainer")(js.Any.fromFunction1((t0: java.lang.String) => removeContainer(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => unregister(t0, t1).runNow()))
    __obj.asInstanceOf[GatewayRegistry]
  }
}

