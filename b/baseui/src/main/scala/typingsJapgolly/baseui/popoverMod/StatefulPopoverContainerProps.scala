package typingsJapgolly.baseui.popoverMod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.AnonClose
import typingsJapgolly.baseui.PopoverPropschildrennever
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.StatefulPopoverProps & {children (props : baseui.baseui/popover.PopoverProps & {  children  :never}): react.react.ReactNode} */
@js.native
trait StatefulPopoverContainerProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  var animateOutTime: js.UndefOr[Double] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Node] = js.native
  var content: js.UndefOr[Node | (js.Function1[/* args */ AnonClose, Node])] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
  var dismissOnEsc: js.UndefOr[Boolean] = js.native
  var focusLock: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[State] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var returnFocus: js.UndefOr[Boolean] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
  var triggerType: js.UndefOr[click | hover] = js.native
  def children(props: PopoverPropschildrennever): Node = js.native
}

