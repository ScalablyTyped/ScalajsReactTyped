package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreNumbers.`false`
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import typingsJapgolly.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typingsJapgolly.atMaterialDashUiCore.clickAwayListenerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener {
  def apply(
    onClickAway: ReactEventFrom[js.Object with Element] => Callback,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClickAwayListenerProps, default, Unit, ClickAwayListenerProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onClickAway")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClickAway(t0).runNow()))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.clickAwayListenerMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.clickAwayListenerMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps])(children: _*)
  }
}

