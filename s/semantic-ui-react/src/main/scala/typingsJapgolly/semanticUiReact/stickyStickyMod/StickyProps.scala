package typingsJapgolly.semanticUiReact.stickyStickyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps
  extends StrictStickyProps
     with /* key */ StringDictionary[js.Any]

object StickyProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    bottomOffset: Int | Double = null,
    children: VdomNode = null,
    className: String = null,
    context: js.Object | Ref = null,
    offset: Int | Double = null,
    onBottom: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback = null,
    onStick: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback = null,
    onTop: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback = null,
    onUnstick: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback = null,
    pushing: js.UndefOr[Boolean] = js.undefined,
    scrollContext: js.Object | Ref = null,
    styleElement: js.Object = null
  ): StickyProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.stickyStickyMod.StickyProps) => onBottom(t0, t1).runNow()))
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.stickyStickyMod.StickyProps) => onStick(t0, t1).runNow()))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.stickyStickyMod.StickyProps) => onTop(t0, t1).runNow()))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.stickyStickyMod.StickyProps) => onUnstick(t0, t1).runNow()))
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.asInstanceOf[js.Any])
    if (scrollContext != null) __obj.updateDynamic("scrollContext")(scrollContext.asInstanceOf[js.Any])
    if (styleElement != null) __obj.updateDynamic("styleElement")(styleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyProps]
  }
}

