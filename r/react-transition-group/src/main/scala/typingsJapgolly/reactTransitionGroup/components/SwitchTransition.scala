package typingsJapgolly.reactTransitionGroup.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import typingsJapgolly.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps
import typingsJapgolly.reactTransitionGroup.switchTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchTransition {
  def apply(
    mode: `out-in` | `in-out` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchTransitionProps, default, Unit, SwitchTransitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTransitionGroup.switchTransitionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps])(children: _*)
  }
  @JSImport("react-transition-group/SwitchTransition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

