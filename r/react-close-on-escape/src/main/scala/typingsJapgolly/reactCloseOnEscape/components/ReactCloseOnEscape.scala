package typingsJapgolly.reactCloseOnEscape.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCloseOnEscape.mod.CloseOnEscapeProps
import typingsJapgolly.reactCloseOnEscape.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCloseOnEscape {
  def apply(
    onEscape: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CloseOnEscapeProps, default, Unit, CloseOnEscapeProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onEscape")(onEscape.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCloseOnEscape.mod.CloseOnEscapeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCloseOnEscape.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCloseOnEscape.mod.CloseOnEscapeProps])(children: _*)
  }
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

