package typingsJapgolly.baseui.tooltipMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.AnonClose
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.close
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.open
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import typingsJapgolly.baseui.popoverMod.Overrides
import typingsJapgolly.baseui.popoverMod.State
import typingsJapgolly.baseui.popoverMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.StatefulPopoverProps */
trait StatefulTooltipProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
  var animateOutTime: js.UndefOr[Double] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var content: js.UndefOr[Node | (js.Function1[/* args */ AnonClose, Node])] = js.undefined
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
  var focusLock: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  var triggerType: js.UndefOr[click | hover] = js.undefined
}

object StatefulTooltipProps {
  @scala.inline
  def apply(
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: Int | Double = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    content: Node | (js.Function1[/* args */ AnonClose, Node]) = null,
    `data-baseweb`: String = null,
    dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[Boolean] = js.undefined,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    mountNode: HTMLElement = null,
    onClose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onMouseEnterDelay: Int | Double = null,
    onMouseLeaveDelay: Int | Double = null,
    onOpen: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    triggerType: click | hover = null
  ): StatefulTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateChangeType */ typingsJapgolly.baseui.baseuiStrings.open | typingsJapgolly.baseui.baseuiStrings.close, t1: /* nextState */ typingsJapgolly.baseui.popoverMod.State, t2: /* currentState */ typingsJapgolly.baseui.popoverMod.State) => stateReducer(t0, t1, t2).runNow()))
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulTooltipProps]
  }
}

