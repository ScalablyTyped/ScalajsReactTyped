package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.internalClickAwayListenerMod.ClickAwayListenerProps
import typingsJapgolly.materialDashUi.internalClickAwayListenerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener {
  def apply(
    onClickAway: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClickAwayListenerProps, default, Unit, ClickAwayListenerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (onClickAway != null) __obj.updateDynamic("onClickAway")(onClickAway.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.internalClickAwayListenerMod.ClickAwayListenerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.internalClickAwayListenerMod.default](js.constructorOf[typingsJapgolly.materialDashUi.internalClickAwayListenerMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.internalClickAwayListenerMod.ClickAwayListenerProps])(children: _*)
  }
}

