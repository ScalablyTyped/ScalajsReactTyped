package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAnalyticsSummaryCardMod.AnalyticsSummaryCardProps
import typingsJapgolly.wixStyleReact.distTypesSparklineChartMod.chartData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsSummaryCard {
  
  inline def apply(chartData: js.Array[chartData], value: String): Builder = {
    val __props = js.Dynamic.literal(chartData = chartData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnalyticsSummaryCardProps]))
  }
  
  @JSImport("wix-style-react", "AnalyticsSummaryCard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AnalyticsSummaryCard] {
    
    inline def chartAnimationDuration(value: Double): this.type = set("chartAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def chartColorHex(value: String): this.type = set("chartColorHex", value.asInstanceOf[js.Any])
    
    inline def chartHighlightedStartingIndex(value: Double): this.type = set("chartHighlightedStartingIndex", value.asInstanceOf[js.Any])
    
    inline def chartWidth(value: Double): this.type = set("chartWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def ctaButton(value: VdomNode): this.type = set("ctaButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def ctaButtonNull: this.type = set("ctaButton", null)
    
    inline def ctaButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("ctaButton", js.Array(value*))
    
    inline def ctaButtonVdomElement(value: VdomElement): this.type = set("ctaButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def getChartTooltipContent(value: /* index */ Double => Node): this.type = set("getChartTooltipContent", js.Any.fromFunction1(value))
    
    inline def invertedTrend(value: Boolean): this.type = set("invertedTrend", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isTrendVisible(value: Boolean): this.type = set("isTrendVisible", value.asInstanceOf[js.Any])
    
    inline def onCTAClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCTAClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChartHover(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onChartHover", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleTooltip(value: String): this.type = set("titleTooltip", value.asInstanceOf[js.Any])
    
    inline def trend(value: Double): this.type = set("trend", value.asInstanceOf[js.Any])
    
    inline def valueTooltip(value: String): this.type = set("valueTooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnalyticsSummaryCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
