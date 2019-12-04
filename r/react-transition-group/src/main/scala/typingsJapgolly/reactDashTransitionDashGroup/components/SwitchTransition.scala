package typingsJapgolly.reactDashTransitionDashGroup.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`in-out`
import typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`out-in`
import typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod.SwitchTransitionProps
import typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchTransition {
  def apply(
    mode: `out-in` | `in-out` = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchTransitionProps, default, Unit, SwitchTransitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod.SwitchTransitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod.SwitchTransitionProps])(children: _*)
  }
  @JSImport("react-transition-group/SwitchTransition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

