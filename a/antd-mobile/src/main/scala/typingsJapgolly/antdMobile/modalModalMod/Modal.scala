package typingsJapgolly.antdMobile.modalModalMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobile.modalPropsTypeMod.Action
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends ModalComponent[ModalProps, js.Any] {
  def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): Element = js.native
  def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): Element = js.native
}

