package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAreaChartMod.AreaChartProps
import typingsJapgolly.wixStyleReact.distTypesAreaChartMod.IDatasetItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaChart {
  
  inline def apply(data: js.Array[IDatasetItem]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AreaChartProps]))
  }
  
  @JSImport("wix-style-react", "AreaChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AreaChart] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def maxYTicksLimit(value: Double): this.type = set("maxYTicksLimit", value.asInstanceOf[js.Any])
    
    inline def onTooltipShow(value: /* item */ IDatasetItem => Callback): this.type = set("onTooltipShow", js.Any.fromFunction1((t0: /* item */ IDatasetItem) => value(t0).runNow()))
    
    inline def tooltipContent(value: (/* item */ IDatasetItem, /* index */ Double) => String | js.Array[String]): this.type = set("tooltipContent", js.Any.fromFunction2(value))
  }
  
  def withProps(p: AreaChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
