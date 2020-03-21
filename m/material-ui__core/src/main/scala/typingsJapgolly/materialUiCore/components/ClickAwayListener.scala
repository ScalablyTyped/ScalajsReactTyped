package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typingsJapgolly.materialUiCore.clickAwayListenerMod.default
import typingsJapgolly.materialUiCore.materialUiCoreBooleans.`false`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onClick
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsJapgolly.materialUiCore.materialUiCoreStrings.onTouchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener {
  def apply(
    onClickAway: ReactEventFrom[js.Object with Element] => Callback,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClickAwayListenerProps, default, Unit, ClickAwayListenerProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onClickAway")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClickAway(t0).runNow()))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.clickAwayListenerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps])(children: _*)
  }
  @JSImport("@material-ui/core/ClickAwayListener", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

