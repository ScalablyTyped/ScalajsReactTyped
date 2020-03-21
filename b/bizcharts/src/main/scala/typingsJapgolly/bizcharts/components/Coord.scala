package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.bizchartsStrings.x
import typingsJapgolly.bizcharts.bizchartsStrings.y
import typingsJapgolly.bizcharts.mod.CoordProps
import typingsJapgolly.bizcharts.mod.CoordType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Coord {
  def apply(
    endAngle: Int | Double = null,
    innerRadius: Int | Double = null,
    radius: Int | Double = null,
    reflect: x | y = null,
    rotate: Int | Double = null,
    scale: js.Tuple2[Double, Double] = null,
    startAngle: Int | Double = null,
    transpose: js.UndefOr[Boolean] = js.undefined,
    `type`: CoordType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CoordProps, typingsJapgolly.bizcharts.mod.Coord, Unit, CoordProps] = {
    val __obj = js.Dynamic.literal()
  
      if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (reflect != null) __obj.updateDynamic("reflect")(reflect.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.CoordProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.bizcharts.mod.Coord](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.CoordProps])(children: _*)
  }
  @JSImport("bizcharts", "Coord")
  @js.native
  object componentImport extends js.Object
  
}

