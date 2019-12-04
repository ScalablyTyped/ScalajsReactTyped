package typingsJapgolly.expoDashLinearDashGradient.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object NativeLinearGradientDotWeb {
  def apply(
    props: Props with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    Props with js.Object, 
    MountedWithRawType[Props with js.Object, js.Object, RawMounted[Props with js.Object, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotWebMod.Props with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoDashLinearDashGradient.buildNativeLinearGradientDotWebMod.Props with js.Object])(children: _*)
  }
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

