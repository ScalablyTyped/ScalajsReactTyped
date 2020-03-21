package typingsJapgolly.antdMobile

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antdMobile.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/prompt", JSImport.Namespace)
@js.native
object promptMod extends js.Object {
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[CSSProperties]): AnonClose = js.native
  def default(title: Node, message: Node, callbackOrActions: CallbackOrActions[CSSProperties], `type`: String): AnonClose = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String
  ): AnonClose = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): AnonClose = js.native
  def default(
    title: Node,
    message: Node,
    callbackOrActions: CallbackOrActions[CSSProperties],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    platform: String
  ): AnonClose = js.native
}

