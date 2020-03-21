package typingsJapgolly.reactCircularProgressbar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCircularProgressbar.AnonBackground
import typingsJapgolly.reactCircularProgressbar.circularProgressbarMod.default
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarProps
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularProgressbar {
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: AnonBackground,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String,
    value: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CircularProgressbarProps, default, Unit, CircularProgressbarProps] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCircularProgressbar.circularProgressbarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarProps])(children: _*)
  }
  @JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

