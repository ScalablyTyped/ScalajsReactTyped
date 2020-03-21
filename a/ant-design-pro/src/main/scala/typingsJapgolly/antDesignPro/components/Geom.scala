package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antvG2.mod.Styles.line
import typingsJapgolly.bizcharts.AnonDodgeBy
import typingsJapgolly.bizcharts.AnonName
import typingsJapgolly.bizcharts.mod.GeomProps
import typingsJapgolly.bizcharts.mod.GeomType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geom {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    adjust: String | (js.Array[AnonDodgeBy | String]) = null,
    animate: js.Any = null,
    color: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String]) = null,
    line: line | Boolean = null,
    opacity: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]]) = null,
    position: String = null,
    select: Boolean | (js.Tuple2[Boolean, _]) = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])]) = null,
    size: Double | String | (js.Tuple2[
      String, 
      (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
    ]) = null,
    style: js.Object | (js.Tuple2[String, js.Object]) = null,
    tooltip: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, AnonName]]) = null,
    `type`: GeomType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GeomProps, typingsJapgolly.antDesignPro.bizchartsMod.Geom, Unit, GeomProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (adjust != null) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.GeomProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.bizchartsMod.Geom](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.GeomProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Geom")
  @js.native
  object componentImport extends js.Object
  
}

