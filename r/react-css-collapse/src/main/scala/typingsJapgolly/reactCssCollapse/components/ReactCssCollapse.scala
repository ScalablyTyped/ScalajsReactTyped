package typingsJapgolly.reactCssCollapse.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCssCollapse.mod.Props
import typingsJapgolly.reactCssCollapse.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCssCollapse {
  def apply(
    isOpen: Boolean,
    className: String = null,
    onRest: js.UndefOr[Callback] = js.undefined,
    transition: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCssCollapse.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCssCollapse.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCssCollapse.mod.Props])(children: _*)
  }
  @JSImport("react-css-collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

