package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antdMobileRn.libModalPropsTypeMod.CallbackOrActions
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalPromptDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[TextStyle], `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: Unit,
    placeholders: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: Unit,
    defaultValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: Unit,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: Unit,
    defaultValue: Unit,
    placeholders: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
