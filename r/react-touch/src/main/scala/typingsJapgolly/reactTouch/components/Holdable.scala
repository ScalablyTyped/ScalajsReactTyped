package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTouch.mod.HoldableConfig
import typingsJapgolly.reactTouch.mod.HoldableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Holdable {
  def apply(
    config: HoldableConfig = null,
    onHoldComplete: js.UndefOr[Callback] = js.undefined,
    onHoldProgress: js.UndefOr[Callback] = js.undefined,
    onMouseDown: js.UndefOr[Callback] = js.undefined,
    onTouchStart: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HoldableProps, typingsJapgolly.reactTouch.mod.Holdable, Unit, HoldableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    onHoldComplete.foreach(p => __obj.updateDynamic("onHoldComplete")(p.toJsFn))
    onHoldProgress.foreach(p => __obj.updateDynamic("onHoldProgress")(p.toJsFn))
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onTouchStart.foreach(p => __obj.updateDynamic("onTouchStart")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTouch.mod.HoldableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTouch.mod.Holdable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTouch.mod.HoldableProps])(children: _*)
  }
  @JSImport("react-touch", "Holdable")
  @js.native
  object componentImport extends js.Object
  
}

