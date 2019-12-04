package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.Props
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BorderlessButton {
  def apply(
    activeOpacity: Double,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsBorderlessButtonMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/BorderlessButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

