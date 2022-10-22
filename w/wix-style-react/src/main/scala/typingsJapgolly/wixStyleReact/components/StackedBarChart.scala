package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.LeftRight
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesStackedBarChartMod.StackedBarChartProps
import typingsJapgolly.wixStyleReact.distTypesStackedBarChartMod.item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackedBarChart {
  
  @JSImport("wix-style-react", "StackedBarChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.StackedBarChart] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[item]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: item*): this.type = set("data", js.Array(value*))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def margin(value: LeftRight): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def tooltipCommonProps(value: TooltipCommonProps): this.type = set("tooltipCommonProps", value.asInstanceOf[js.Any])
    
    inline def tooltipTemplate(value: /* item */ item => Node): this.type = set("tooltipTemplate", js.Any.fromFunction1(value))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def yAxisTickFormat(value: (/* rawValue */ String, /* parsedValue */ String) => String): this.type = set("yAxisTickFormat", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: StackedBarChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StackedBarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
