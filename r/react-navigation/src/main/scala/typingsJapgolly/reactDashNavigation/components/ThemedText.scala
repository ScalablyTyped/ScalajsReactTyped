package typingsJapgolly.reactDashNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.Themed.Text
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.ThemedTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object ThemedText {
  def apply(
    props: ThemedTextProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ThemedTextProps with js.Object, Text, Unit, ThemedTextProps with js.Object] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigation.reactDashNavigationMod.ThemedTextProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigation.reactDashNavigationMod.Themed.Text](js.constructorOf[typingsJapgolly.reactDashNavigation.reactDashNavigationMod.Themed.Text])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigation.reactDashNavigationMod.ThemedTextProps with js.Object])(children: _*)
  }
}

