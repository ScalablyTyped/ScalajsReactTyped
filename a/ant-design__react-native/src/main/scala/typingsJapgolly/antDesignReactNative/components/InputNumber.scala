package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.inputNumberMod.InputNumberProps
import typingsJapgolly.antDesignReactNative.inputNumberMod.InputNumberState
import typingsJapgolly.antDesignReactNative.inputNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object InputNumber {
  def apply[P /* <: InputNumberProps */, S /* <: InputNumberState */](
    props: P with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[P with js.Object, default[P, S], Unit, P with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  P with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.inputNumberMod.default[P, S]](this.componentImport)
    f(__obj.asInstanceOf[P with js.Object])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

