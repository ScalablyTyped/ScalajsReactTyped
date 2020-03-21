package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.SymbolProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Symbol {
  def apply(
    id: String = null,
    opacity: NumberProp = null,
    preserveAspectRatio: String = null,
    viewBox: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SymbolProps, typingsJapgolly.reactNativeSvg.mod.Symbol, Unit, SymbolProps] = {
    val __obj = js.Dynamic.literal()
  
      if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.SymbolProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.Symbol](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.SymbolProps])(children: _*)
  }
  @JSImport("react-native-svg", "Symbol")
  @js.native
  object componentImport extends js.Object
  
}

