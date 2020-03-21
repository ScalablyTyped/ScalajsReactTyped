package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigationStack.borderlessButtonMod.Props
import typingsJapgolly.reactNavigationStack.borderlessButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BorderlessButton {
  def apply(
    activeOpacity: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.borderlessButtonMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.borderlessButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.borderlessButtonMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/BorderlessButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

