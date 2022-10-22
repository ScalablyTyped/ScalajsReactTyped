package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Sankey.mod.SankeyNodeMinimal
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoSankey.anon.Link
import typingsJapgolly.nivoSankey.anon.Links
import typingsJapgolly.nivoSankey.anon.Node
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyAlignFunction
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyAlignType
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLayerId
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeySortFunction
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeySortType
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeySvgProps
import typingsJapgolly.nivoSankey.nivoSankeyStrings.color
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.inside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.label
import typingsJapgolly.nivoSankey.nivoSankeyStrings.outside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sankey {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](data: Links[N, L], height: Double, width: Double): Builder[N, L] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeySvgProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey", "Sankey")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: SankeyAlignType | SankeyAlignFunction): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignFunction2(value: (/* node */ SankeyNodeMinimal[Any, Any], /* n */ Double) => Double): this.type = set("align", js.Any.fromFunction2(value))
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[Omit[SankeyNodeDatum[N, L], color | label]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    
    inline def enableLinkGradient(value: Boolean): this.type = set("enableLinkGradient", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(
      value: PropertyAccessor[
          Omit[SankeyNodeDatum[N, L], color | typingsJapgolly.nivoSankey.nivoSankeyStrings.label], 
          String
        ]
    ): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: Omit[SankeyNodeDatum[N, L], color | label] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelOrientation(value: horizontal | vertical): this.type = set("labelOrientation", value.asInstanceOf[js.Any])
    
    inline def labelPadding(value: Double): this.type = set("labelPadding", value.asInstanceOf[js.Any])
    
    inline def labelPosition(value: inside | outside): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[SankeyLayerId]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: SankeyLayerId*): this.type = set("layers", js.Array(value*))
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def linkBlendMode(value: CssMixBlendMode): this.type = set("linkBlendMode", value.asInstanceOf[js.Any])
    
    inline def linkContract(value: Double): this.type = set("linkContract", value.asInstanceOf[js.Any])
    
    inline def linkHoverOpacity(value: Double): this.type = set("linkHoverOpacity", value.asInstanceOf[js.Any])
    
    inline def linkHoverOthersOpacity(value: Double): this.type = set("linkHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    inline def linkOpacity(value: Double): this.type = set("linkOpacity", value.asInstanceOf[js.Any])
    
    inline def linkTooltip(value: FunctionComponent[Link[N, L]]): this.type = set("linkTooltip", value.asInstanceOf[js.Any])
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def nodeBorderColor(value: InheritedColorConfig[SankeyNodeDatum[N, L]]): this.type = set("nodeBorderColor", value.asInstanceOf[js.Any])
    
    inline def nodeBorderRadius(value: Double): this.type = set("nodeBorderRadius", value.asInstanceOf[js.Any])
    
    inline def nodeBorderWidth(value: Double): this.type = set("nodeBorderWidth", value.asInstanceOf[js.Any])
    
    inline def nodeHoverOpacity(value: Double): this.type = set("nodeHoverOpacity", value.asInstanceOf[js.Any])
    
    inline def nodeHoverOthersOpacity(value: Double): this.type = set("nodeHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    inline def nodeInnerPadding(value: Double): this.type = set("nodeInnerPadding", value.asInstanceOf[js.Any])
    
    inline def nodeOpacity(value: Double): this.type = set("nodeOpacity", value.asInstanceOf[js.Any])
    
    inline def nodeSpacing(value: Double): this.type = set("nodeSpacing", value.asInstanceOf[js.Any])
    
    inline def nodeThickness(value: Double): this.type = set("nodeThickness", value.asInstanceOf[js.Any])
    
    inline def nodeTooltip(value: FunctionComponent[Node[N, L]]): this.type = set("nodeTooltip", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ ReactMouseEventFrom[Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def sort(value: SankeySortType | (SankeySortFunction[N, L])): this.type = set("sort", value.asInstanceOf[js.Any])
    
    inline def sortFunction2(value: (/* a */ SankeyNodeDatum[N, L], /* b */ SankeyNodeDatum[N, L]) => Double): this.type = set("sort", js.Any.fromFunction2(value))
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeySvgProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
