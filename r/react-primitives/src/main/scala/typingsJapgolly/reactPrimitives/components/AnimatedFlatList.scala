package typingsJapgolly.reactPrimitives.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.AnimatedProps
import typingsJapgolly.reactNative.mod.Animated.ComponentProps
import typingsJapgolly.reactNative.mod.FlatList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object AnimatedFlatList {
  def apply(
    props: AnimatedProps[ComponentProps[FlatList[js.Any]]] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnimatedProps[ComponentProps[FlatList[js.Any]]] with js.Object, 
    MountedWithRawType[
      AnimatedProps[ComponentProps[FlatList[js.Any]]] with js.Object, 
      js.Object, 
      RawMounted[AnimatedProps[ComponentProps[FlatList[js.Any]]] with js.Object, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  (typingsJapgolly.reactNative.mod.Animated.AnimatedProps[
    typingsJapgolly.reactNative.mod.Animated.ComponentProps[typingsJapgolly.reactNative.mod.FlatList[js.Any]]
  ]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[(typingsJapgolly.reactNative.mod.Animated.AnimatedProps[
  typingsJapgolly.reactNative.mod.Animated.ComponentProps[typingsJapgolly.reactNative.mod.FlatList[js.Any]]]) with js.Object])(children: _*)
  }
  @JSImport("react-primitives", "Animated.FlatList")
  @js.native
  object componentImport extends js.Object
  
}

