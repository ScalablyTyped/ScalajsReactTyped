package typingsJapgolly.rcResizeObserver.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcResizeObserver.AnonHeight
import typingsJapgolly.rcResizeObserver.mod.ResizeObserverProps
import typingsJapgolly.rcResizeObserver.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ AnonHeight => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResizeObserverProps, default, Unit, ResizeObserverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.rcResizeObserver.AnonHeight) => onResize(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcResizeObserver.mod.ResizeObserverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcResizeObserver.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcResizeObserver.mod.ResizeObserverProps])(children: _*)
  }
  @JSImport("rc-resize-observer/lib", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

