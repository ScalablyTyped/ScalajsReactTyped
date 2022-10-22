package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFunnelChartMod.FunnelChartItem
import typingsJapgolly.wixStyleReact.distTypesFunnelChartMod.FunnelChartProps
import typingsJapgolly.wixStyleReact.distTypesFunnelChartMod.percentageDifferenceCbData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FunnelChart {
  
  inline def apply(data: js.Array[FunnelChartItem]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FunnelChartProps]))
  }
  
  @JSImport("wix-style-react", "FunnelChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FunnelChart] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def differenceBadgeTooltipContent(value: /* hasCurrentIndexDifference */ percentageDifferenceCbData => String): this.type = set("differenceBadgeTooltipContent", js.Any.fromFunction1(value))
    
    inline def hideDifferenceBadge(value: Boolean): this.type = set("hideDifferenceBadge", value.asInstanceOf[js.Any])
    
    inline def onDifferenceBadgeTooltipShow(value: /* hasCurrentIndexDifference */ percentageDifferenceCbData => Callback): this.type = set("onDifferenceBadgeTooltipShow", js.Any.fromFunction1((t0: /* hasCurrentIndexDifference */ percentageDifferenceCbData) => value(t0).runNow()))
  }
  
  def withProps(p: FunnelChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
