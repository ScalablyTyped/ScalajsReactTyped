package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.AxisLabelCfg
import typingsJapgolly.antvComponent.libTypesMod.AxisLineCfg
import typingsJapgolly.antvComponent.libTypesMod.AxisSubTickLineCfg
import typingsJapgolly.antvComponent.libTypesMod.AxisTickLineCfg
import typingsJapgolly.antvComponent.libTypesMod.AxisTitleCfg
import typingsJapgolly.antvG2.libInterfaceMod.AxisGridCfg
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.bizcharts.bizchartsStrings.bottom
import typingsJapgolly.bizcharts.bizchartsStrings.left
import typingsJapgolly.bizcharts.bizchartsStrings.right
import typingsJapgolly.bizcharts.bizchartsStrings.top
import typingsJapgolly.bizcharts.libComponentsAxisMod.IAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axis {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Axis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
    
    inline def grid(value: AxisGridCfg | Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def gridNull: this.type = set("grid", null)
    
    inline def label(value: AxisLabelCfg | Boolean): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def line(value: AxisLineCfg | Boolean): this.type = set("line", value.asInstanceOf[js.Any])
    
    inline def lineNull: this.type = set("line", null)
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def position(value: top | bottom | right | left): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def subTickLine(value: AxisSubTickLineCfg | Boolean): this.type = set("subTickLine", value.asInstanceOf[js.Any])
    
    inline def subTickLineNull: this.type = set("subTickLine", null)
    
    inline def tickLine(value: AxisTickLineCfg | Boolean): this.type = set("tickLine", value.asInstanceOf[js.Any])
    
    inline def tickLineNull: this.type = set("tickLine", null)
    
    inline def title(value: Boolean | AxisTitleCfg): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def verticalFactor(value: Double): this.type = set("verticalFactor", value.asInstanceOf[js.Any])
    
    inline def view(
      value: typingsJapgolly.bizcharts.libComponentsChartMod.Chart | typingsJapgolly.bizcharts.libComponentsViewMod.View
    ): this.type = set("view", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Axis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IAxis): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
