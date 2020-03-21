package typingsJapgolly.antdMobile.modalModalMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antdMobile.AnonClose
import typingsJapgolly.antdMobile.antdMobileStrings.`login-password`
import typingsJapgolly.antdMobile.antdMobileStrings.`secure-text`
import typingsJapgolly.antdMobile.modalPropsTypeMod.Action
import typingsJapgolly.antdMobile.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
abstract class ModalComponent[P, S] ()
  extends Component[P, S, js.Any]

/* static members */
@JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
@js.native
object ModalComponent extends js.Object {
  def alert(title: Node, message: Node): AnonClose = js.native
  def alert(title: Node, message: Node, actions: js.Array[Action[CSSProperties]]): AnonClose = js.native
  def alert(title: Node, message: Node, actions: js.Array[Action[CSSProperties]], platform: String): AnonClose = js.native
  def operation(): AnonClose = js.native
  def operation(actions: js.Array[Action[CSSProperties]]): AnonClose = js.native
  def operation(actions: js.Array[Action[CSSProperties]], platform: String): AnonClose = js.native
  def prompt(title: Node, message: Node, callbackOrActions: CallbackOrActions[CSSProperties]): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsJapgolly.antdMobile.antdMobileStrings.default
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsJapgolly.antdMobile.antdMobileStrings.default,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsJapgolly.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: typingsJapgolly.antdMobile.antdMobileStrings.default,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_loginpassword(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `login-password`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  @JSName("prompt")
  def prompt_securetext(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: `secure-text`,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
}

