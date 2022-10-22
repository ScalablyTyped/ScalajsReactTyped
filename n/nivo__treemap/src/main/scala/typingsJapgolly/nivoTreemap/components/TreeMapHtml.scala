package typingsJapgolly.nivoTreemap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.DatumIdentityAccessor
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoTreemap.anon.Color
import typingsJapgolly.nivoTreemap.distTypesTilingMod.TileType
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNodeWithoutStyles
import typingsJapgolly.nivoTreemap.distTypesTypesMod.CustomHtmlLayer
import typingsJapgolly.nivoTreemap.distTypesTypesMod.LayerId
import typingsJapgolly.nivoTreemap.distTypesTypesMod.NodeComponent
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TooltipComponent
import typingsJapgolly.nivoTreemap.distTypesTypesMod.TreeMapHtmlProps
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.bottom
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.label
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.left
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.parentLabel
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.right
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.top
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeMapHtml {
  
  inline def apply[Datum /* <: js.Object */](data: Datum, height: Double, width: Double): Builder[Datum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[TreeMapHtmlProps[Datum]]))
  }
  
  @JSImport("@nivo/treemap", "TreeMapHtml")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colorBy(value: String | DatumIdentityAccessor[ComputedNodeWithoutStyles[Datum]]): this.type = set("colorBy", value.asInstanceOf[js.Any])
    
    inline def colorByFunction1(value: ComputedNodeWithoutStyles[Datum] => String | Double): this.type = set("colorBy", js.Any.fromFunction1(value))
    
    inline def colors(value: OrdinalColorScaleConfig[ComputedNodeWithoutStyles[Datum]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: ComputedNodeWithoutStyles[Datum] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    inline def enableParentLabel(value: Boolean): this.type = set("enableParentLabel", value.asInstanceOf[js.Any])
    
    inline def identity(value: PropertyAccessor[Datum, String]): this.type = set("identity", value.asInstanceOf[js.Any])
    
    inline def identityFunction1(value: Datum => String): this.type = set("identity", js.Any.fromFunction1(value))
    
    inline def innerPadding(value: Double): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(
      value: PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typingsJapgolly.nivoTreemap.nivoTreemapStrings.label | parentLabel
          ], 
          String
        ]
    ): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFormat(value: ValueFormat[Double, Unit]): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], label | parentLabel] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelSkipSize(value: Double): this.type = set("labelSkipSize", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[LayerId | CustomHtmlLayer[Datum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: (LayerId | CustomHtmlLayer[Datum])*): this.type = set("layers", js.Array(value*))
    
    inline def leavesOnly(value: Boolean): this.type = set("leavesOnly", value.asInstanceOf[js.Any])
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def nodeComponent(value: NodeComponent[Datum]): this.type = set("nodeComponent", value.asInstanceOf[js.Any])
    
    inline def nodeOpacity(value: Double): this.type = set("nodeOpacity", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* node */ ComputedNode[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* node */ ComputedNode[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def orientLabel(value: Boolean): this.type = set("orientLabel", value.asInstanceOf[js.Any])
    
    inline def outerPadding(value: Double): this.type = set("outerPadding", value.asInstanceOf[js.Any])
    
    inline def parentLabel(
      value: PropertyAccessor[
          Omit[
            ComputedNodeWithoutStyles[Datum], 
            typingsJapgolly.nivoTreemap.nivoTreemapStrings.parentLabel
          ], 
          String
        ]
    ): this.type = set("parentLabel", value.asInstanceOf[js.Any])
    
    inline def parentLabelFunction1(value: Omit[ComputedNodeWithoutStyles[Datum], parentLabel] => String): this.type = set("parentLabel", js.Any.fromFunction1(value))
    
    inline def parentLabelPadding(value: Double): this.type = set("parentLabelPadding", value.asInstanceOf[js.Any])
    
    inline def parentLabelPosition(value: top | right | bottom | left): this.type = set("parentLabelPosition", value.asInstanceOf[js.Any])
    
    inline def parentLabelSize(value: Double): this.type = set("parentLabelSize", value.asInstanceOf[js.Any])
    
    inline def parentLabelTextColor(value: InheritedColorConfig[ComputedNodeWithoutStyles[Datum] & Color]): this.type = set("parentLabelTextColor", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tile(value: TileType): this.type = set("tile", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: TooltipComponent[Datum]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def value(value: PropertyAccessor[Datum, Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFunction1(value: Datum => Double): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  def withProps[Datum /* <: js.Object */](p: TreeMapHtmlProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
