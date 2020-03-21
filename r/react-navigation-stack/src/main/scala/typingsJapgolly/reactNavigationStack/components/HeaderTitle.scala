package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNavigationStack.headerTitleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object HeaderTitle {
  def apply(
    props: ComponentProps[AnimatedComponent[Text]] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ComponentProps[AnimatedComponent[Text]] with js.Object, 
    default, 
    Unit, 
    ComponentProps[AnimatedComponent[Text]] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  (typingsJapgolly.react.mod.ComponentProps[
    typingsJapgolly.reactNative.mod.Animated.AnimatedComponent[typingsJapgolly.reactNative.mod.Text]
  ]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.headerTitleMod.default](this.componentImport)
    f(__obj.asInstanceOf[(typingsJapgolly.react.mod.ComponentProps[
  typingsJapgolly.reactNative.mod.Animated.AnimatedComponent[typingsJapgolly.reactNative.mod.Text]]) with js.Object])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

