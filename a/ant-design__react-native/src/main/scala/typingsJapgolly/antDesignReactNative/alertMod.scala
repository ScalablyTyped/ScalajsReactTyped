package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  def default(title: Node, content: Node): Double = js.native
  def default(title: Node, content: Node, actions: js.Array[Action[TextStyle]]): Double = js.native
  def default(
    title: Node,
    content: Node,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
}

