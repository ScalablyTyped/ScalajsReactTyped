package typingsJapgolly.reactCssTransitionReplace.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCssTransitionReplace.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Class {
  def apply(
    changeWidth: js.UndefOr[Boolean] = js.undefined,
    overflowHidden: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.reactCssTransitionReplace.mod.Class, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(changeWidth)) __obj.updateDynamic("changeWidth")(changeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowHidden)) __obj.updateDynamic("overflowHidden")(overflowHidden.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCssTransitionReplace.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCssTransitionReplace.mod.Class](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCssTransitionReplace.mod.Props])(children: _*)
  }
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

