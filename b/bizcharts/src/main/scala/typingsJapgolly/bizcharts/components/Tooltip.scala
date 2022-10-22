package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.antvG2Strings.bottom
import typingsJapgolly.antvG2.antvG2Strings.left
import typingsJapgolly.antvG2.antvG2Strings.right
import typingsJapgolly.antvG2.antvG2Strings.top
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.antvG2.libInterfaceMod.TooltipCrosshairs
import typingsJapgolly.antvG2.libInterfaceMod.TooltipDomStyles
import typingsJapgolly.antvG2.libInterfaceMod.TooltipItem
import typingsJapgolly.antvG2.libInterfaceMod.TooltipTitle
import typingsJapgolly.bizcharts.bizchartsStrings.click
import typingsJapgolly.bizcharts.bizchartsStrings.hover
import typingsJapgolly.bizcharts.libComponentsTooltipMod.ITooltip
import typingsJapgolly.bizcharts.libComponentsTooltipMod.ITooltipEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("bizcharts", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(
      value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[Any]], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => js.Object
    ): this.type = set("children", js.Any.fromFunction4(value))
    
    inline def container(value: String | HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerTpl(value: String): this.type = set("containerTpl", value.asInstanceOf[js.Any])
    
    inline def crosshairs(value: TooltipCrosshairs): this.type = set("crosshairs", value.asInstanceOf[js.Any])
    
    inline def customContent(value: (/* title */ String, /* data */ js.Array[Any]) => String | HTMLElement): this.type = set("customContent", js.Any.fromFunction2(value))
    
    inline def customItems(value: /* originalItems */ js.Array[TooltipItem] => js.Array[TooltipItem]): this.type = set("customItems", js.Any.fromFunction1(value))
    
    inline def domStyles(value: TooltipDomStyles): this.type = set("domStyles", value.asInstanceOf[js.Any])
    
    inline def enterable(value: Boolean): this.type = set("enterable", value.asInstanceOf[js.Any])
    
    inline def follow(value: Boolean): this.type = set("follow", value.asInstanceOf[js.Any])
    
    inline def itemTpl(value: String): this.type = set("itemTpl", value.asInstanceOf[js.Any])
    
    inline def marker(value: js.Object): this.type = set("marker", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ js.UndefOr[ITooltipEvent], t1: /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => (value(t0, t1)).runNow()))
    
    inline def onHide(
      value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => Callback
    ): this.type = set("onHide", js.Any.fromFunction2((t0: /* e */ js.UndefOr[ITooltipEvent], t1: /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => (value(t0, t1)).runNow()))
    
    inline def onShow(
      value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => Callback
    ): this.type = set("onShow", js.Any.fromFunction2((t0: /* e */ js.UndefOr[ITooltipEvent], t1: /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => (value(t0, t1)).runNow()))
    
    inline def position(value: top | bottom | left | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def shared(value: Boolean): this.type = set("shared", value.asInstanceOf[js.Any])
    
    inline def showContent(value: Boolean | (js.Function1[/* datum */ Datum, Boolean])): this.type = set("showContent", value.asInstanceOf[js.Any])
    
    inline def showContentFunction1(value: /* datum */ Datum => Boolean): this.type = set("showContent", js.Any.fromFunction1(value))
    
    inline def showCrosshairs(value: Boolean): this.type = set("showCrosshairs", value.asInstanceOf[js.Any])
    
    inline def showDelay(value: Double): this.type = set("showDelay", value.asInstanceOf[js.Any])
    
    inline def showMarkers(value: Boolean): this.type = set("showMarkers", value.asInstanceOf[js.Any])
    
    inline def showNil(value: Boolean): this.type = set("showNil", value.asInstanceOf[js.Any])
    
    inline def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    inline def title(value: TooltipTitle): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleFunction2(value: (/* title */ String, /* datum */ Datum) => String): this.type = set("title", js.Any.fromFunction2(value))
    
    inline def triggerOn(value: hover | click): this.type = set("triggerOn", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITooltip): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
