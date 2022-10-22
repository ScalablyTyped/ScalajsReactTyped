package typingsJapgolly.nivoBar.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.nivoBar.anon.Color
import typingsJapgolly.nivoBar.anon.Data
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@nivo/bar.@nivo/bar/dist/types/types.BarCommonProps<RawDatum>, 'borderRadius' | 'borderWidth' | 'isInteractive' | 'tooltip'> */
/* Inlined parent @nivo/bar.@nivo/bar/dist/types/types.BarHandlers<RawDatum, std.SVGRectElement> */
trait BarItemProps[RawDatum /* <: BarDatum */] extends StObject {
  
  var ariaDescribedBy: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var ariaLabel: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var ariaLabelledBy: js.UndefOr[js.Function1[/* data */ ComputedDatum[RawDatum], js.UndefOr[String]]] = js.undefined
  
  var bar: ComputedBarDatum[RawDatum] & Data
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var isFocusable: Boolean
  
  var isInteractive: Boolean
  
  var label: String
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & Color, 
      /* event */ ReactMouseEventFrom[SVGRectElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[SVGRectElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[SVGRectElement], 
      Unit
    ]
  ] = js.undefined
  
  var shouldRenderLabel: Boolean
  
  var style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  borderColor :string,   color :string,   height :number,   labelColor :string,   labelOpacity :number,   labelX :number,   labelY :number,   opacity :number,   transform :string,   width :number}> */ Any
  
  var tooltip: FC[BarTooltipProps[RawDatum]]
}
object BarItemProps {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bar: ComputedBarDatum[RawDatum] & Data,
    borderRadius: Double,
    borderWidth: Double,
    isFocusable: Boolean,
    isInteractive: Boolean,
    label: String,
    shouldRenderLabel: Boolean,
    style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  borderColor :string,   color :string,   height :number,   labelColor :string,   labelOpacity :number,   labelX :number,   labelY :number,   opacity :number,   transform :string,   width :number}> */ Any,
    tooltip: FC[BarTooltipProps[RawDatum]]
  ): BarItemProps[RawDatum] = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], isFocusable = isFocusable.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarItemProps[RawDatum]]
  }
  
  extension [Self <: BarItemProps[?], RawDatum /* <: BarDatum */](x: Self & BarItemProps[RawDatum]) {
    
    inline def setAriaDescribedBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "ariaDescribedBy", js.Any.fromFunction1(value))
    
    inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    inline def setAriaLabel(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "ariaLabel", js.Any.fromFunction1(value))
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaLabelledBy(value: /* data */ ComputedDatum[RawDatum] => js.UndefOr[String]): Self = StObject.set(x, "ariaLabelledBy", js.Any.fromFunction1(value))
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setBar(value: ComputedBarDatum[RawDatum] & Data): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setIsFocusable(value: Boolean): Self = StObject.set(x, "isFocusable", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum] & Color, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setShouldRenderLabel(value: Boolean): Self = StObject.set(x, "shouldRenderLabel", value.asInstanceOf[js.Any])
    
    inline def setStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  borderColor :string,   color :string,   height :number,   labelColor :string,   labelOpacity :number,   labelX :number,   labelY :number,   opacity :number,   transform :string,   width :number}> */ Any
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[BarTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
