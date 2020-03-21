package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/prompt", JSImport.Namespace)
@js.native
object promptMod extends js.Object {
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle]): js.UndefOr[Double] = js.native
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle], `type`: String): js.UndefOr[Double] = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): js.UndefOr[Double] = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): js.UndefOr[Double] = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    onBackHandler: CallbackOnBackHandler
  ): js.UndefOr[Double] = js.native
}

