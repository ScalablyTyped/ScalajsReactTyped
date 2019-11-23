package typingsJapgolly.reactDashNativeDashVectorDashIcons.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5ProMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object FontAwesome5Pro {
  def apply(
    props: FontAwesome5IconProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FontAwesome5IconProps with js.Object, 
    default, 
    Unit, 
    FontAwesome5IconProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5ProMod.default](js.constructorOf[typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5ProMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps with js.Object])(children: _*)
  }
}

