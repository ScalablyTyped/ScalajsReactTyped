package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesBarsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesBars {
  def apply(
    barWidth: Int | Double = null,
    height: Int | Double = null,
    margin: Int | Double = null,
    onMouseMove: (/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement with Element]) => Callback = null,
    points: js.Array[Point] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SparklinesBarsProps, 
    typingsJapgolly.reactSparklines.mod.SparklinesBars, 
    Unit, 
    SparklinesBarsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* p */ typingsJapgolly.reactSparklines.mod.Point, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.react.mod.ReactSVGElement with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSparklines.mod.SparklinesBarsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSparklines.mod.SparklinesBars](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSparklines.mod.SparklinesBarsProps])(children: _*)
  }
  @JSImport("react-sparklines", "SparklinesBars")
  @js.native
  object componentImport extends js.Object
  
}

