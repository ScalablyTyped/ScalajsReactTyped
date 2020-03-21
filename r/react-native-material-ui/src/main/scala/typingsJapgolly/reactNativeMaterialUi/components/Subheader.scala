package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonText
import typingsJapgolly.reactNativeMaterialUi.mod.SubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subheader {
  def apply(
    text: String,
    inset: js.UndefOr[Boolean] = js.undefined,
    lines: Int | Double = null,
    style: AnonText = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SubheaderProps, 
    typingsJapgolly.reactNativeMaterialUi.mod.Subheader, 
    Unit, 
    SubheaderProps
  ] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
      if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.SubheaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Subheader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.SubheaderProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Subheader")
  @js.native
  object componentImport extends js.Object
  
}

