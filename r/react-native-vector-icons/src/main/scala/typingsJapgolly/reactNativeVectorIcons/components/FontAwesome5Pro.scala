package typingsJapgolly.reactNativeVectorIcons.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsJapgolly.reactNativeVectorIcons.fontAwesome5ProMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object FontAwesome5Pro {
  def apply(
    props: FontAwesome5IconProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeVectorIcons.fontAwesome5ProMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps with js.Object])(children: _*)
  }
  @JSImport("react-native-vector-icons/FontAwesome5Pro", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

