package typingsJapgolly.reactSmoothScrollbar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSmoothScrollbar.mod.ScrollbarProps
import typingsJapgolly.reactSmoothScrollbar.mod.^
import typingsJapgolly.smoothScrollbar.mod.default
import typingsJapgolly.smoothScrollbar.scrollbarMod.ScrollStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSmoothScrollbar {
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
    wheelEventTarget: EventTarget = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollbarProps, ^, Unit, ScrollbarProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSmoothScrollbar.mod.ScrollbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSmoothScrollbar.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSmoothScrollbar.mod.ScrollbarProps])(children: _*)
  }
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

