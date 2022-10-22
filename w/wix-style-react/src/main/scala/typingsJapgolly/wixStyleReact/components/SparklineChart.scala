package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSparklineChartMod.SparklineChartProps
import typingsJapgolly.wixStyleReact.distTypesSparklineChartMod.chartData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklineChart {
  
  inline def apply(data: js.Array[chartData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SparklineChartProps]))
  }
  
  @JSImport("wix-style-react", "SparklineChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SparklineChart] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def getTooltipContent(value: /* index */ Double => Node): this.type = set("getTooltipContent", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def highlightedEndingIndex(value: Double): this.type = set("highlightedEndingIndex", value.asInstanceOf[js.Any])
    
    inline def highlightedStartingIndex(value: Double): this.type = set("highlightedStartingIndex", value.asInstanceOf[js.Any])
    
    inline def onHover(value: /* index */ Double => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SparklineChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
