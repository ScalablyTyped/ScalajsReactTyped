package typingsJapgolly.reactSmoothScrollbar.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.smoothScrollbar.mod.default
import typingsJapgolly.smoothScrollbar.scrollbarMod.ScrollStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
trait ScrollbarProps extends js.Object {
  /**
    * Keep scrollbar tracks visible whether it's scrolling or not
    * @default false
    */
  var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional class name
    */
  var className: js.UndefOr[String] = js.undefined
  var continuousScrolling: js.UndefOr[Boolean] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var delegateTo: js.UndefOr[EventTarget] = js.undefined
  /**
    * Pipe to scrollbar.addListener()
    */
  var onScroll: js.UndefOr[js.Function2[/* status */ ScrollStatus, /* scrollbarInstance */ default, Unit]] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var renderByPixels: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional style
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  var thumbMinSize: js.UndefOr[Double] = js.undefined
  var wheelEventTarget: js.UndefOr[EventTarget] = js.undefined
}

object ScrollbarProps {
  @scala.inline
  def apply(
    alwaysShowTracks: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    continuousScrolling: js.UndefOr[Boolean] = js.undefined,
    damping: Int | Double = null,
    delegateTo: EventTarget = null,
    onScroll: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Callback = null,
    plugins: js.Any = null,
    renderByPixels: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    thumbMinSize: Int | Double = null,
    wheelEventTarget: EventTarget = null
  ): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousScrolling)) __obj.updateDynamic("continuousScrolling")(continuousScrolling.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2((t0: /* status */ typingsJapgolly.smoothScrollbar.scrollbarMod.ScrollStatus, t1: /* scrollbarInstance */ typingsJapgolly.smoothScrollbar.mod.default) => onScroll(t0, t1).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(renderByPixels)) __obj.updateDynamic("renderByPixels")(renderByPixels.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarProps]
  }
}

