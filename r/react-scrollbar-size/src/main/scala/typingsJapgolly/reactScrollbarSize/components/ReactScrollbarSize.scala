package typingsJapgolly.reactScrollbarSize.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactScrollbarSize.mod.Measurement
import typingsJapgolly.reactScrollbarSize.mod.ScrollbarSizeProps
import typingsJapgolly.reactScrollbarSize.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollbarSize {
  def apply(
    onChange: /* measurement */ Measurement => Callback = null,
    onLoad: /* measurement */ Measurement => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollbarSizeProps, default, Unit, ScrollbarSizeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* measurement */ typingsJapgolly.reactScrollbarSize.mod.Measurement) => onChange(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* measurement */ typingsJapgolly.reactScrollbarSize.mod.Measurement) => onLoad(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollbarSize.mod.ScrollbarSizeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScrollbarSize.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollbarSize.mod.ScrollbarSizeProps])(children: _*)
  }
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

