package typingsJapgolly.nivoCirclePacking.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingCanvasProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingLayer
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelProps
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.color
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.depth
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.fill
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.id
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CirclePackingCanvas {
  
  inline def apply[RawDatum](
    animate: Boolean,
    borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderWidth: Double,
    childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    circleComponent: /* props */ CircleProps[RawDatum] => Element,
    colorBy: id | depth,
    colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
    data: RawDatum,
    enableLabels: Boolean,
    height: Double,
    id: PropertyAccessor[RawDatum, String],
    inheritColorFromParent: Boolean,
    isInteractive: Boolean,
    label: PropertyAccessor[ComputedDatum[RawDatum], String],
    labelComponent: /* props */ LabelProps[RawDatum] => Element,
    labelTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    labelsSkipRadius: Double,
    layers: js.Array[CirclePackingLayer[RawDatum]],
    leavesOnly: Boolean,
    padding: Double,
    pixelRatio: Double,
    role: String,
    tooltip: ComputedDatum[RawDatum] => Element,
    value: PropertyAccessor[RawDatum, Double],
    width: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], circleComponent = js.Any.fromFunction1(circleComponent), colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = js.Any.fromFunction1(labelComponent), labelTextColor = labelTextColor.asInstanceOf[js.Any], labelsSkipRadius = labelsSkipRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], leavesOnly = leavesOnly.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[CirclePackingCanvasProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing", "CirclePackingCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def labelsFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): this.type = set("labelsFilter", js.Any.fromFunction1(value))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def zoomedId(value: String): this.type = set("zoomedId", value.asInstanceOf[js.Any])
    
    inline def zoomedIdNull: this.type = set("zoomedId", null)
  }
  
  def withProps[RawDatum](p: CirclePackingCanvasProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
