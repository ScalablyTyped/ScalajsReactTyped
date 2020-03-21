package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.MotionProps
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Motion {
  def apply(
    style: Style,
    defaultStyle: PlainStyle = null,
    onRest: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* interpolatedStyle */ PlainStyle => CallbackTo[Element] = null
  ): UnmountedWithRoot[MotionProps, typingsJapgolly.reactMotion.mod.Motion, Unit, MotionProps] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* interpolatedStyle */ typingsJapgolly.reactMotion.mod.PlainStyle) => children(t0).runNow()))
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotion.mod.MotionProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactMotion.mod.Motion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotion.mod.MotionProps])
  }
  @JSImport("react-motion", "Motion")
  @js.native
  object componentImport extends js.Object
  
}

