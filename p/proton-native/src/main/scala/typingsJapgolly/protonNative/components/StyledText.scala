package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.AnonBackgroundColor
import typingsJapgolly.protonNative.mod.StyledTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledText {
  def apply(
    style: AnonBackgroundColor = null,
    x: Double | String = null,
    y: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StyledTextProps, typingsJapgolly.protonNative.mod.StyledText, Unit, StyledTextProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.StyledTextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.protonNative.mod.StyledText](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.StyledTextProps])(children: _*)
  }
  @JSImport("proton-native", "StyledText")
  @js.native
  object componentImport extends js.Object
  
}

