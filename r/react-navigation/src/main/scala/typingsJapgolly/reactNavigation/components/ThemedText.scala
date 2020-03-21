package typingsJapgolly.reactNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.Themed.Text
import typingsJapgolly.reactNavigation.mod.ThemedTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ThemedText {
  def apply(
    props: ThemedTextProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ThemedTextProps with js.Object, Text, Unit, ThemedTextProps with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigation.mod.ThemedTextProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigation.mod.Themed.Text](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.ThemedTextProps with js.Object])(children: _*)
  }
  @JSImport("react-navigation", "Themed.Text")
  @js.native
  object componentImport extends js.Object
  
}

