package typingsJapgolly.reactNativeKeepAwake.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeKeepAwake.AnonChildren
import typingsJapgolly.reactNativeKeepAwake.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeKeepAwake {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonChildren, default, Unit, AnonChildren] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeKeepAwake.AnonChildren, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeKeepAwake.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeKeepAwake.AnonChildren])(children: _*)
  }
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

