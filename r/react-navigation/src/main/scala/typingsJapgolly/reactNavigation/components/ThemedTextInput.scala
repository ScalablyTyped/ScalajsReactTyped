package typingsJapgolly.reactNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.Themed.TextInput
import typingsJapgolly.reactNavigation.mod.ThemedTextInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ThemedTextInput {
  def apply(
    props: ThemedTextInputProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemedTextInputProps with js.Object, 
    TextInput, 
    Unit, 
    ThemedTextInputProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigation.mod.ThemedTextInputProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigation.mod.Themed.TextInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.ThemedTextInputProps with js.Object])(children: _*)
  }
  @JSImport("react-navigation", "Themed.TextInput")
  @js.native
  object componentImport extends js.Object
  
}

