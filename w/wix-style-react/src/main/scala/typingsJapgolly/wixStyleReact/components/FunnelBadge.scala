package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFunnelChartFunnelBadgeMod.FunnelBadgeProps
import typingsJapgolly.wixStyleReact.distTypesFunnelChartFunnelBadgeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FunnelBadge {
  
  inline def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FunnelBadgeProps]))
  }
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onTooltipShow(value: Callback): this.type = set("onTooltipShow", value.toJsFn)
    
    inline def tooltipContent(value: VdomNode): this.type = set("tooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipContentNull: this.type = set("tooltipContent", null)
    
    inline def tooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tooltipContent", js.Array(value*))
    
    inline def tooltipContentVdomElement(value: VdomElement): this.type = set("tooltipContent", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: FunnelBadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
