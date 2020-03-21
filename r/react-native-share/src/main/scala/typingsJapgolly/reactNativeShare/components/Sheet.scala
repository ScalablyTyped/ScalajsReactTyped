package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeShare.sheetMod.SheetProps
import typingsJapgolly.reactNativeShare.sheetMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sheet {
  def apply(
    visible: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SheetProps, default, Unit, SheetProps] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeShare.sheetMod.SheetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeShare.sheetMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeShare.sheetMod.SheetProps])(children: _*)
  }
  @JSImport("react-native-share/Sheet", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

