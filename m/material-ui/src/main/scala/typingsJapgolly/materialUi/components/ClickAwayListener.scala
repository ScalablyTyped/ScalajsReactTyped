package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.clickAwayListenerMod.ClickAwayListenerProps
import typingsJapgolly.materialUi.clickAwayListenerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener {
  def apply(
    onClickAway: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClickAwayListenerProps, default, Unit, ClickAwayListenerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (onClickAway != null) __obj.updateDynamic("onClickAway")(onClickAway.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.clickAwayListenerMod.ClickAwayListenerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.clickAwayListenerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.clickAwayListenerMod.ClickAwayListenerProps])(children: _*)
  }
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

