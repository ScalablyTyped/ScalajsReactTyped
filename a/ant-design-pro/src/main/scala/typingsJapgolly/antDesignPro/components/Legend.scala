package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.ContinueLegendHandlerCfg
import typingsJapgolly.antvComponent.libTypesMod.ContinueLegendLabelCfg
import typingsJapgolly.antvComponent.libTypesMod.ContinueLegendRailCfg
import typingsJapgolly.antvComponent.libTypesMod.ContinueLegendTrackCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendBackgroundCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendItemNameCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendItemValueCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendPageNavigatorCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendRadio
import typingsJapgolly.antvG2.anon.namestringvaluestringMark
import typingsJapgolly.antvG2.antvG2Strings.`bottom-left`
import typingsJapgolly.antvG2.antvG2Strings.`bottom-right`
import typingsJapgolly.antvG2.antvG2Strings.`left-bottom`
import typingsJapgolly.antvG2.antvG2Strings.`left-top`
import typingsJapgolly.antvG2.antvG2Strings.`right-bottom`
import typingsJapgolly.antvG2.antvG2Strings.`right-top`
import typingsJapgolly.antvG2.antvG2Strings.`top-left`
import typingsJapgolly.antvG2.antvG2Strings.`top-right`
import typingsJapgolly.antvG2.antvG2Strings.bottom
import typingsJapgolly.antvG2.antvG2Strings.horizontal
import typingsJapgolly.antvG2.antvG2Strings.left
import typingsJapgolly.antvG2.antvG2Strings.right
import typingsJapgolly.antvG2.antvG2Strings.top
import typingsJapgolly.antvG2.antvG2Strings.vertical
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.antvG2.libInterfaceMod.G2LegendTitleCfg
import typingsJapgolly.antvG2.libInterfaceMod.LegendItem
import typingsJapgolly.antvG2.libInterfaceMod.MarkerCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.bizcharts.libComponentsLegendMod.ILegend
import typingsJapgolly.bizcharts.libInterfaceMod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  inline def apply(container: IGroup): Builder = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ILegend]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Legend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def LocationType(value: String): this.type = set("LocationType", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
    
    inline def background(value: LegendBackgroundCfg): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def custom(value: Boolean): this.type = set("custom", value.asInstanceOf[js.Any])
    
    inline def defaultCfg(value: js.Object): this.type = set("defaultCfg", value.asInstanceOf[js.Any])
    
    inline def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def filter(value: (/* value */ Any, /* datum */ Datum, /* idx */ js.UndefOr[Double]) => Boolean): this.type = set("filter", js.Any.fromFunction3(value))
    
    inline def flipNavigation(value: LegendPageNavigatorCfg): this.type = set("flipNavigation", value.asInstanceOf[js.Any])
    
    inline def flipPage(value: Boolean): this.type = set("flipPage", value.asInstanceOf[js.Any])
    
    inline def group(value: IGroup): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def handler(value: ContinueLegendHandlerCfg): this.type = set("handler", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    inline def itemMarginBottom(value: Double): this.type = set("itemMarginBottom", value.asInstanceOf[js.Any])
    
    inline def itemName(value: LegendItemNameCfg): this.type = set("itemName", value.asInstanceOf[js.Any])
    
    inline def itemSpacing(value: Double): this.type = set("itemSpacing", value.asInstanceOf[js.Any])
    
    inline def itemValue(value: LegendItemValueCfg): this.type = set("itemValue", value.asInstanceOf[js.Any])
    
    inline def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[LegendItem]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: LegendItem*): this.type = set("items", js.Array(value*))
    
    inline def label(value: ContinueLegendLabelCfg): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def marker(
      value: MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
    ): this.type = set("marker", value.asInstanceOf[js.Any])
    
    inline def markerFunction3(value: (/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark) => MarkerCfg): this.type = set("marker", js.Any.fromFunction3(value))
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxHeightRatio(value: Double): this.type = set("maxHeightRatio", value.asInstanceOf[js.Any])
    
    inline def maxItemWidth(value: Double): this.type = set("maxItemWidth", value.asInstanceOf[js.Any])
    
    inline def maxRow(value: Double): this.type = set("maxRow", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def maxWidthRatio(value: Double): this.type = set("maxWidthRatio", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* e */ js.UndefOr[IEvent], /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ js.UndefOr[IEvent], t1: /* chart */ js.UndefOr[typingsJapgolly.antvG2.libChartMod.Chart]) => (value(t0, t1)).runNow()))
    
    inline def padding(value: js.Array[Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value*))
    
    inline def pageNavigator(value: LegendPageNavigatorCfg): this.type = set("pageNavigator", value.asInstanceOf[js.Any])
    
    inline def position(
      value: top | `top-left` | `top-right` | right | `right-top` | `right-bottom` | left | `left-top` | `left-bottom` | bottom | `bottom-left` | `bottom-right`
    ): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def radio(value: LegendRadio): this.type = set("radio", value.asInstanceOf[js.Any])
    
    inline def rail(value: ContinueLegendRailCfg): this.type = set("rail", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def slidable(value: Boolean): this.type = set("slidable", value.asInstanceOf[js.Any])
    
    inline def title(value: G2LegendTitleCfg): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def track(value: ContinueLegendTrackCfg): this.type = set("track", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def updateAutoRender(value: Boolean): this.type = set("updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Double*): this.type = set("value", js.Array(value*))
    
    inline def view(value: Any): this.type = set("view", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ILegend): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
