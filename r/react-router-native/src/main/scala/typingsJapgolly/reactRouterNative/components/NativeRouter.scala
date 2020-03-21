package typingsJapgolly.reactRouterNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterNative.mod.NativeRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeRouter {
  def apply(
    getUserConfirmation: js.Function = null,
    initialEntries: js.Array[String] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NativeRouterProps, 
    typingsJapgolly.reactRouterNative.mod.NativeRouter, 
    Unit, 
    NativeRouterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation.asInstanceOf[js.Any])
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterNative.mod.NativeRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouterNative.mod.NativeRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNative.mod.NativeRouterProps])(children: _*)
  }
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  object componentImport extends js.Object
  
}

