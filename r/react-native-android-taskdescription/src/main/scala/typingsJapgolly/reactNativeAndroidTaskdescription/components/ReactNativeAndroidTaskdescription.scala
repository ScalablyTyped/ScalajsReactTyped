package typingsJapgolly.reactNativeAndroidTaskdescription.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeAndroidTaskdescription.mod.ReactNativeAndroidTaskDescriptionProps
import typingsJapgolly.reactNativeAndroidTaskdescription.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeAndroidTaskdescription {
  def apply(
    backgroundColor: String = null,
    label: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactNativeAndroidTaskDescriptionProps, 
    default, 
    Unit, 
    ReactNativeAndroidTaskDescriptionProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeAndroidTaskdescription.mod.ReactNativeAndroidTaskDescriptionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeAndroidTaskdescription.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeAndroidTaskdescription.mod.ReactNativeAndroidTaskDescriptionProps])(children: _*)
  }
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

