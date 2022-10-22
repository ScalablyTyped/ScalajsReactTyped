package typingsJapgolly.antDesignPro.components

import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.AdjustOption
import typingsJapgolly.antvG2.libInterfaceMod.AnimateOption
import typingsJapgolly.antvG2.libInterfaceMod.ColorAttrCallback
import typingsJapgolly.antvG2.libInterfaceMod.GeometryLabelCfg
import typingsJapgolly.antvG2.libInterfaceMod.GeometryTooltipOption
import typingsJapgolly.antvG2.libInterfaceMod.LabelCallback
import typingsJapgolly.antvG2.libInterfaceMod.LabelOption
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.ShapeAttrCallback
import typingsJapgolly.antvG2.libInterfaceMod.SizeAttrCallback
import typingsJapgolly.antvG2.libInterfaceMod.StateOption
import typingsJapgolly.antvG2.libInterfaceMod.StyleCallback
import typingsJapgolly.antvG2.libInterfaceMod.StyleOption
import typingsJapgolly.antvG2.libInterfaceMod.TooltipCallback
import typingsJapgolly.bizcharts.bizchartsBooleans.`false`
import typingsJapgolly.bizcharts.bizchartsStrings.dodge
import typingsJapgolly.bizcharts.bizchartsStrings.jitter
import typingsJapgolly.bizcharts.bizchartsStrings.stack
import typingsJapgolly.bizcharts.bizchartsStrings.symmetric
import typingsJapgolly.bizcharts.libInterfaceMod.ColorString
import typingsJapgolly.bizcharts.libInterfaceMod.FieldString
import typingsJapgolly.bizcharts.libInterfaceMod.IBaseGemoProps
import typingsJapgolly.bizcharts.libInterfaceMod.ShapeString
import typingsJapgolly.bizcharts.libInterfaceMod.SizeRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interval {
  
  inline def apply(position: String): Builder = {
    val __props = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBaseGemoProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Interval")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Interval] {
    
    inline def adjust(value: dodge | stack | symmetric | jitter | String | AdjustOption | js.Array[AdjustOption]): this.type = set("adjust", value.asInstanceOf[js.Any])
    
    inline def adjustVarargs(value: AdjustOption*): this.type = set("adjust", js.Array(value*))
    
    inline def animate(value: AnimateOption | Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def color(
      value: ColorString | FieldString | (js.Tuple2[FieldString, ColorString | js.Array[ColorString] | ColorAttrCallback])
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def label(
      value: LabelOption | `false` | FieldString | (js.Tuple2[FieldString, GeometryLabelCfg | LabelCallback]) | (js.Tuple3[FieldString, LabelCallback, GeometryLabelCfg])
    ): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def setElements(value: /* elements */ js.Array[Element] => js.Object): this.type = set("setElements", js.Any.fromFunction1(value))
    
    inline def shape(
      value: ShapeString | FieldString | (js.Tuple2[ShapeString, js.Array[ShapeString] | ShapeAttrCallback])
    ): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: Double | FieldString | (js.Tuple2[FieldString, SizeAttrCallback | SizeRange])): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def state(value: StateOption): this.type = set("state", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleOption | LooseObject | (js.Tuple2[FieldString, StyleCallback])): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: GeometryTooltipOption | Boolean | FieldString | (js.Tuple2[FieldString, TooltipCallback])): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBaseGemoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
