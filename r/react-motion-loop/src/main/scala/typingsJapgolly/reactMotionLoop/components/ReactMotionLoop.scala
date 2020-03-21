package typingsJapgolly.reactMotionLoop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotionLoop.mod.ReactMotionLoopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionLoop {
  def apply(
    styleFrom: Style,
    styleTo: Style,
    defaultStyle: PlainStyle = null,
    onRest: js.UndefOr[Callback] = js.undefined,
    style: Style = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* interpolatedStyle */ PlainStyle => CallbackTo[Element | Element] = null
  ): UnmountedWithRoot[
    ReactMotionLoopProps, 
    typingsJapgolly.reactMotionLoop.mod.ReactMotionLoop, 
    Unit, 
    ReactMotionLoopProps
  ] = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* interpolatedStyle */ typingsJapgolly.reactMotion.mod.PlainStyle) => children(t0).runNow()))
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotionLoop.mod.ReactMotionLoopProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactMotionLoop.mod.ReactMotionLoop](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotionLoop.mod.ReactMotionLoopProps])
  }
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  object componentImport extends js.Object
  
}

