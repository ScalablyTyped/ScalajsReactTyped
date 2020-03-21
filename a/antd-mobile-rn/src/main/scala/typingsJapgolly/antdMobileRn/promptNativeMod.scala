package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
@js.native
object promptNativeMod extends js.Object {
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle]): Unit = js.native
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle], `type`: String): Unit = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): Unit = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = js.native
}

