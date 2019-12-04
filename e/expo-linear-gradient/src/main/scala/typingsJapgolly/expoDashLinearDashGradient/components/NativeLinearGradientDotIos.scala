package typingsJapgolly.expoDashLinearDashGradient.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.Props
import typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object NativeLinearGradientDotIos {
  def apply(
    props: Props with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props with js.Object, default, Unit, Props with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.Props with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.Props with js.Object])(children: _*)
  }
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

