package typingsJapgolly.nivoCirclePacking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleComponent
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingLayer
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelComponent
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.MouseHandler
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

object distTypesResponsiveCirclePackingHtmlMod {
  
  @JSImport("@nivo/circle-packing/dist/types/ResponsiveCirclePackingHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveCirclePackingHtml[RawDatum](props: ResponsiveCirclePackingHtmlProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCirclePackingHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Partial<std.Omit<@nivo/circle-packing.@nivo/circle-packing/dist/types/types.CirclePackingHtmlProps<RawDatum>, 'data' | 'width' | 'height'>> & std.Pick<@nivo/circle-packing.@nivo/circle-packing/dist/types/types.CirclePackingHtmlProps<RawDatum>, 'data'> */
  trait ResponsiveCirclePackingHtmlProps[RawDatum] extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var borderColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var childColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
    
    var circleComponent: js.UndefOr[CircleComponent[RawDatum]] = js.undefined
    
    var colorBy: js.UndefOr[id | depth] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]] = js.undefined
    
    var data: RawDatum
    
    var enableLabels: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[PropertyAccessor[RawDatum, String]] = js.undefined
    
    var inheritColorFromParent: js.UndefOr[Boolean] = js.undefined
    
    var isInteractive: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
    
    var labelComponent: js.UndefOr[LabelComponent[RawDatum]] = js.undefined
    
    var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
    
    var labelsFilter: js.UndefOr[js.Function1[/* label */ ComputedLabel[RawDatum], Boolean]] = js.undefined
    
    var labelsSkipRadius: js.UndefOr[Double] = js.undefined
    
    var layers: js.UndefOr[js.Array[CirclePackingLayer[RawDatum]]] = js.undefined
    
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var motionConfig: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseHandler[RawDatum]] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var renderWrapper: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var tooltip: js.UndefOr[js.Function1[/* props */ ComputedDatum[RawDatum], Element]] = js.undefined
    
    var value: js.UndefOr[PropertyAccessor[RawDatum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
    
    var zoomedId: js.UndefOr[String | Null] = js.undefined
  }
  object ResponsiveCirclePackingHtmlProps {
    
    inline def apply[RawDatum](data: RawDatum): ResponsiveCirclePackingHtmlProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveCirclePackingHtmlProps[RawDatum]]
    }
    
    extension [Self <: ResponsiveCirclePackingHtmlProps[?], RawDatum](x: Self & ResponsiveCirclePackingHtmlProps[RawDatum]) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setChildColorUndefined: Self = StObject.set(x, "childColor", js.undefined)
      
      inline def setCircleComponent(value: /* props */ CircleProps[RawDatum] => Element): Self = StObject.set(x, "circleComponent", js.Any.fromFunction1(value))
      
      inline def setCircleComponentUndefined: Self = StObject.set(x, "circleComponent", js.undefined)
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnableLabels(value: Boolean): Self = StObject.set(x, "enableLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableLabelsUndefined: Self = StObject.set(x, "enableLabels", js.undefined)
      
      inline def setId(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => String): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setInheritColorFromParentUndefined: Self = StObject.set(x, "inheritColorFromParent", js.undefined)
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelComponent(value: /* props */ LabelProps[RawDatum] => Element): Self = StObject.set(x, "labelComponent", js.Any.fromFunction1(value))
      
      inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
      
      inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
      
      inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelsFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): Self = StObject.set(x, "labelsFilter", js.Any.fromFunction1(value))
      
      inline def setLabelsFilterUndefined: Self = StObject.set(x, "labelsFilter", js.undefined)
      
      inline def setLabelsSkipRadius(value: Double): Self = StObject.set(x, "labelsSkipRadius", value.asInstanceOf[js.Any])
      
      inline def setLabelsSkipRadiusUndefined: Self = StObject.set(x, "labelsSkipRadius", js.undefined)
      
      inline def setLayers(value: js.Array[CirclePackingLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: CirclePackingLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMotionConfig(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
      ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
      
      inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
      
      inline def setOnClick(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: /* props */ ComputedDatum[RawDatum] => Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setZoomedId(value: String): Self = StObject.set(x, "zoomedId", value.asInstanceOf[js.Any])
      
      inline def setZoomedIdNull: Self = StObject.set(x, "zoomedId", null)
      
      inline def setZoomedIdUndefined: Self = StObject.set(x, "zoomedId", js.undefined)
    }
  }
}
