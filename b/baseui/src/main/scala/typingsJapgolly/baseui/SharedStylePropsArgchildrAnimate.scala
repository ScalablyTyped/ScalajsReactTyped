package typingsJapgolly.baseui

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.baseuiStrings.alertdialog
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.dialog
import typingsJapgolly.baseui.baseuiStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/modal.SharedStylePropsArg & {  children  :react.react.ReactNode} */
@js.native
trait SharedStylePropsArgchildrAnimate extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.native
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.native
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Node] = js.native
}

