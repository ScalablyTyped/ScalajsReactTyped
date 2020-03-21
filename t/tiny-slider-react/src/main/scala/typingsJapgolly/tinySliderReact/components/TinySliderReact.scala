package typingsJapgolly.tinySliderReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import typingsJapgolly.tinySliderReact.mod.TinySliderInfo
import typingsJapgolly.tinySliderReact.mod.TinySliderProps
import typingsJapgolly.tinySliderReact.mod.TinySliderSettings
import typingsJapgolly.tinySliderReact.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TinySliderReact {
  def apply(
    onClick: (/* slideClicked */ Double, /* info */ String, /* event */ Event_) => Callback = null,
    onIndexChanged: /* info */ TinySliderInfo => Callback = null,
    onTouchEnd: /* info */ TinySliderInfo => Callback = null,
    onTouchMove: /* info */ TinySliderInfo => Callback = null,
    onTouchStart: /* info */ TinySliderInfo => Callback = null,
    onTransitionEnd: /* info */ TinySliderInfo => Callback = null,
    onTransitionStart: /* info */ TinySliderInfo => Callback = null,
    settings: TinySliderSettings = null,
    startIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TinySliderProps, default, Unit, TinySliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: /* slideClicked */ scala.Double, t1: /* info */ java.lang.String, t2: /* event */ typingsJapgolly.std.Event_) => onClick(t0, t1, t2).runNow()))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onIndexChanged(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTransitionEnd(t0).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.tinySliderReact.mod.TinySliderInfo) => onTransitionStart(t0).runNow()))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.tinySliderReact.mod.TinySliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.tinySliderReact.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.tinySliderReact.mod.TinySliderProps])(children: _*)
  }
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

