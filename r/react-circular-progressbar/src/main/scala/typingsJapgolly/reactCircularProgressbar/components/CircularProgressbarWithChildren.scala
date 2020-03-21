package typingsJapgolly.reactCircularProgressbar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCircularProgressbar.AnonBackground
import typingsJapgolly.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularProgressbarWithChildren {
  def apply(
    value: Double,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundPadding: Int | Double = null,
    circleRatio: Int | Double = null,
    className: String = null,
    classes: AnonBackground = null,
    counterClockwise: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    strokeWidth: Int | Double = null,
    styles: CircularProgressbarStyles = null,
    text: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CircularProgressbarWithChildrenProps, 
    MountedWithRawType[
      CircularProgressbarWithChildrenProps, 
      js.Object, 
      RawMounted[CircularProgressbarWithChildrenProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (circleRatio != null) __obj.updateDynamic("circleRatio")(circleRatio.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(counterClockwise)) __obj.updateDynamic("counterClockwise")(counterClockwise.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps])(children: _*)
  }
  @JSImport("react-circular-progressbar/dist/CircularProgressbarWithChildren", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

