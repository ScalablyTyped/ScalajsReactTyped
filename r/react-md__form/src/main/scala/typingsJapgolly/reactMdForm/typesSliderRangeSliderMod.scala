package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdForm.typesSliderTypesMod.BaseSliderProps
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.ThumbIndex
import typingsJapgolly.reactMdForm.typesSliderUseRangeSliderMod.RangeSliderRequiredProps
import typingsJapgolly.reactMdUtils.typesTypesMod.PropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderRangeSliderMod {
  
  @JSImport("@react-md/form/types/slider/RangeSlider", "RangeSlider")
  @js.native
  val RangeSlider: ForwardRefExoticComponent[RangeSliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait RangeSliderProps
    extends StObject
       with RangeSliderRequiredProps
       with BaseSliderProps {
    
    /**
      * A convenience prop for adding an `aria-label` to the first thumb element. An
      * accessible label **must** be provided by this prop, the `thumb1LabelledBy`
      * prop, or adding an `aria-label`/`aria-labelledby` to the `thumb1Props` for
      * a11y.
      */
    var thumb1Label: js.UndefOr[String] = js.undefined
    
    /**
      * A convenience prop for adding an `aria-labelledby` to the first thumb
      * element. An accessible label **must** be provided by this prop, the
      * `thumb1Label` prop, or adding an `aria-label`/`aria-labelledby` to the
      * `thumb1Props` for a11y.
      */
    var thumb1LabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the first thumb element as well
      * as an optional `ref` if you need access to the track element for some
      * reason.
      */
    var thumb1Props: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
    
    /**
      * A convenience prop for adding an `aria-label` to the second thumb element.
      * An accessible label **must** be provided by this prop, the
      * `thumb2LabelledBy` prop, or adding an `aria-label`/`aria-labelledby` to the
      * `thumb2Props` for a11y.
      */
    var thumb2Label: js.UndefOr[String] = js.undefined
    
    /**
      * A convenience prop for adding an `aria-labelledby` to the second thumb
      * element. An accessible label **must** be provided by this prop, the
      * `thumb2Label` prop, or adding an `aria-label`/`aria-labelledby` to the
      * `thumb2Props` for a11y.
      */
    var thumb2LabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the second thumb element as well
      * as an optional `ref` if you need access to the track element for some
      * reason.
      */
    var thumb2Props: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the track element as well as an
      * optional `ref` if you need access to the track element for some reason.
      */
    var trackProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
  }
  object RangeSliderProps {
    
    inline def apply(
      baseId: String,
      decrement: ThumbIndex => Callback,
      decrementJump: ThumbIndex => Callback,
      increment: ThumbIndex => Callback,
      incrementJump: ThumbIndex => Callback,
      max: Double,
      maximum: ThumbIndex => Callback,
      min: Double,
      minimum: ThumbIndex => Callback,
      persist: Callback,
      setValue: SetStateAction[RangeSliderValue] => Callback,
      step: Double,
      value: RangeSliderValue
    ): RangeSliderProps = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], decrement = js.Any.fromFunction1((t0: ThumbIndex) => decrement(t0).runNow()), decrementJump = js.Any.fromFunction1((t0: ThumbIndex) => decrementJump(t0).runNow()), increment = js.Any.fromFunction1((t0: ThumbIndex) => increment(t0).runNow()), incrementJump = js.Any.fromFunction1((t0: ThumbIndex) => incrementJump(t0).runNow()), max = max.asInstanceOf[js.Any], maximum = js.Any.fromFunction1((t0: ThumbIndex) => maximum(t0).runNow()), min = min.asInstanceOf[js.Any], minimum = js.Any.fromFunction1((t0: ThumbIndex) => minimum(t0).runNow()), persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => setValue(t0).runNow()), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    extension [Self <: RangeSliderProps](x: Self) {
      
      inline def setThumb1Label(value: String): Self = StObject.set(x, "thumb1Label", value.asInstanceOf[js.Any])
      
      inline def setThumb1LabelUndefined: Self = StObject.set(x, "thumb1Label", js.undefined)
      
      inline def setThumb1LabelledBy(value: String): Self = StObject.set(x, "thumb1LabelledBy", value.asInstanceOf[js.Any])
      
      inline def setThumb1LabelledByUndefined: Self = StObject.set(x, "thumb1LabelledBy", js.undefined)
      
      inline def setThumb1Props(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "thumb1Props", value.asInstanceOf[js.Any])
      
      inline def setThumb1PropsUndefined: Self = StObject.set(x, "thumb1Props", js.undefined)
      
      inline def setThumb2Label(value: String): Self = StObject.set(x, "thumb2Label", value.asInstanceOf[js.Any])
      
      inline def setThumb2LabelUndefined: Self = StObject.set(x, "thumb2Label", js.undefined)
      
      inline def setThumb2LabelledBy(value: String): Self = StObject.set(x, "thumb2LabelledBy", value.asInstanceOf[js.Any])
      
      inline def setThumb2LabelledByUndefined: Self = StObject.set(x, "thumb2LabelledBy", js.undefined)
      
      inline def setThumb2Props(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "thumb2Props", value.asInstanceOf[js.Any])
      
      inline def setThumb2PropsUndefined: Self = StObject.set(x, "thumb2Props", js.undefined)
      
      inline def setTrackProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "trackProps", value.asInstanceOf[js.Any])
      
      inline def setTrackPropsUndefined: Self = StObject.set(x, "trackProps", js.undefined)
    }
  }
}
