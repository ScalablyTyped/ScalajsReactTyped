package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBarChartMod.BarChartItem
import typingsJapgolly.wixStyleReact.distTypesBarChartMod.BarChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarChart {
  
  inline def apply(items: js.Array[BarChartItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BarChartProps]))
  }
  
  @JSImport("wix-style-react", "BarChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.BarChart] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onDescriptionInfoShown(value: Callback): this.type = set("onDescriptionInfoShown", value.toJsFn)
    
    inline def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BarChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
