package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdForm.typesSliderTypesMod.BaseSliderProps
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderValue
import typingsJapgolly.reactMdForm.typesSliderUseSliderMod.SliderRequiredProps
import typingsJapgolly.reactMdUtils.typesTypesMod.PropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderSliderMod {
  
  @JSImport("@react-md/form/types/slider/Slider", "Slider")
  @js.native
  val Slider: ForwardRefExoticComponent[SliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait SliderProps
    extends StObject
       with SliderRequiredProps
       with BaseSliderProps {
    
    /**
      * An optional label to apply to the slider's thumb. This should normally be a
      * short (1-4 word) description for this slider.
      *
      * @see {@link SliderLabelProps.label}
      * @see {@link thumbLabelledBy}
      */
    var thumbLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An optional id point to a label describing the slider's thumb. This should
      * normally be a short (1-4 word) description for this slider.
      *
      * @see {@link SliderLabelProps.label}
      * @see {@link thumbLabel}
      */
    var thumbLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the thumb element as well as an
      * optional `ref` if you need access to the track element for some reason.
      */
    var thumbProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the track element as well as an
      * optional `ref` if you need access to the track element for some reason.
      */
    var trackProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
  }
  object SliderProps {
    
    inline def apply(
      baseId: String,
      decrement: Callback,
      decrementJump: Callback,
      increment: Callback,
      incrementJump: Callback,
      max: Double,
      maximum: Callback,
      min: Double,
      minimum: Callback,
      persist: Callback,
      setValue: SetStateAction[SliderValue] => Callback,
      step: Double,
      value: SliderValue
    ): SliderProps = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], decrement = decrement.toJsFn, decrementJump = decrementJump.toJsFn, increment = increment.toJsFn, incrementJump = incrementJump.toJsFn, max = max.asInstanceOf[js.Any], maximum = maximum.toJsFn, min = min.asInstanceOf[js.Any], minimum = minimum.toJsFn, persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => setValue(t0).runNow()), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setThumbLabel(value: String): Self = StObject.set(x, "thumbLabel", value.asInstanceOf[js.Any])
      
      inline def setThumbLabelUndefined: Self = StObject.set(x, "thumbLabel", js.undefined)
      
      inline def setThumbLabelledBy(value: String): Self = StObject.set(x, "thumbLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setThumbLabelledByUndefined: Self = StObject.set(x, "thumbLabelledBy", js.undefined)
      
      inline def setThumbProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
      
      inline def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
      
      inline def setTrackProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "trackProps", value.asInstanceOf[js.Any])
      
      inline def setTrackPropsUndefined: Self = StObject.set(x, "trackProps", js.undefined)
    }
  }
}
