package typingsJapgolly.reactMotionUiPack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotionUiPack.mod.Transition.TransitionProps
import typingsJapgolly.reactMotionUiPack.mod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionUiPack {
  def apply(
    appear: Style = null,
    component: String | Boolean | Element = null,
    enter: Style = null,
    leave: Style = null,
    onEnter: /* style */ PlainStyle => Callback = null,
    onLeave: /* style */ Style => Callback = null,
    runOnMount: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransitionProps, ^, Unit, TransitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.reactMotion.mod.PlainStyle) => onEnter(t0).runNow()))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.reactMotion.mod.Style) => onLeave(t0).runNow()))
    if (!js.isUndefined(runOnMount)) __obj.updateDynamic("runOnMount")(runOnMount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotionUiPack.mod.Transition.TransitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMotionUiPack.mod.default.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotionUiPack.mod.Transition.TransitionProps])(children: _*)
  }
  @JSImport("react-motion-ui-pack", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

