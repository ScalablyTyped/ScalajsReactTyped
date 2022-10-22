package typingsJapgolly.reactBootstrapRangeSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.auto
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.bottom
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.danger
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.dark
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.info
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.lg
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.light
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.off
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.on
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.primary
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.secondary
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.sm
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.success
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.top
import typingsJapgolly.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-bootstrap-range-slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("react-bootstrap-range-slider", "RangeSlider")
  @js.native
  val RangeSlider: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] & RefAttributes[HTMLInputElement]] = js.native
  
  trait RangeSliderProps extends StObject {
    
    var bsPrefix: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLInputElement], HTMLInputElement]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onAfterChange: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* value */ Double, Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* value */ Double, Unit]
      ] = js.undefined
    
    var ref: js.UndefOr[
        (js.Function1[/* instance */ HTMLInputElement | Null, Unit]) | RefHandle[HTMLInputElement] | Null
      ] = js.undefined
    
    var size: js.UndefOr[sm | lg] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[auto | on | off] = js.undefined
    
    var tooltipLabel: js.UndefOr[js.Function1[/* value */ Double, Node]] = js.undefined
    
    var tooltipPlacement: js.UndefOr[top | bottom] = js.undefined
    
    var tooltipProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
    
    var tooltipStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
    
    var variant: js.UndefOr[primary | secondary | success | danger | warning | info | dark | light] = js.undefined
  }
  object RangeSliderProps {
    
    inline def apply(): RangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    extension [Self <: RangeSliderProps](x: Self) {
      
      inline def setBsPrefix(value: String): Self = StObject.set(x, "bsPrefix", value.asInstanceOf[js.Any])
      
      inline def setBsPrefixUndefined: Self = StObject.set(x, "bsPrefix", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInputProps(value: DetailedHTMLProps[HTMLAttributes[HTMLInputElement], HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnAfterChange(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* value */ Double) => Callback): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* value */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* value */ Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* value */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRef(value: (js.Function1[/* instance */ HTMLInputElement | Null, Unit]) | RefHandle[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: sm | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTooltip(value: auto | on | off): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipLabel(value: /* value */ Double => Node): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
      
      inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
      
      inline def setTooltipPlacement(value: top | bottom): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      inline def setTooltipProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      inline def setTooltipStyle(value: CSSProperties): Self = StObject.set(x, "tooltipStyle", value.asInstanceOf[js.Any])
      
      inline def setTooltipStyleUndefined: Self = StObject.set(x, "tooltipStyle", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: primary | secondary | success | danger | warning | info | dark | light): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] & RefAttributes[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] & RefAttributes[HTMLInputElement]] = default
}
