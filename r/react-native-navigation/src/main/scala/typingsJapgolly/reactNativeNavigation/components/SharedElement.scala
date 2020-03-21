package typingsJapgolly.reactNativeNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeNavigation.sharedElementMod.SharedElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SharedElement {
  def apply(
    elementId: String,
    resizeMode: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SharedElementProps, 
    typingsJapgolly.reactNativeNavigation.sharedElementMod.SharedElement, 
    Unit, 
    SharedElementProps
  ] = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeNavigation.sharedElementMod.SharedElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeNavigation.sharedElementMod.SharedElement](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeNavigation.sharedElementMod.SharedElementProps])(children: _*)
  }
  @JSImport("react-native-navigation/lib/dist/adapters/SharedElement", "SharedElement")
  @js.native
  object componentImport extends js.Object
  
}

