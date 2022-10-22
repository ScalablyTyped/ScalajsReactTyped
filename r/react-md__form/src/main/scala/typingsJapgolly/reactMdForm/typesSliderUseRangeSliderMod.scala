package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderControls
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderDefaultValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderStepOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.ThumbIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseRangeSliderMod {
  
  @JSImport("@react-md/form/types/slider/useRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRangeSlider(): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")().asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(
    defaultValue: RangeSliderDefaultValue,
    hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions
  ): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  
  trait RangeSliderRequiredProps
    extends StObject
       with RangeSliderControls
       with DefinedSliderValueOptions {
    
    /**
      * The current value of the slider.
      */
    var value: RangeSliderValue
  }
  object RangeSliderRequiredProps {
    
    inline def apply(
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
    ): RangeSliderRequiredProps = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1((t0: ThumbIndex) => decrement(t0).runNow()), decrementJump = js.Any.fromFunction1((t0: ThumbIndex) => decrementJump(t0).runNow()), increment = js.Any.fromFunction1((t0: ThumbIndex) => increment(t0).runNow()), incrementJump = js.Any.fromFunction1((t0: ThumbIndex) => incrementJump(t0).runNow()), max = max.asInstanceOf[js.Any], maximum = js.Any.fromFunction1((t0: ThumbIndex) => maximum(t0).runNow()), min = min.asInstanceOf[js.Any], minimum = js.Any.fromFunction1((t0: ThumbIndex) => minimum(t0).runNow()), persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => setValue(t0).runNow()), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSliderRequiredProps]
    }
    
    extension [Self <: RangeSliderRequiredProps](x: Self) {
      
      inline def setValue(value: RangeSliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeSliderValueReturnType = js.Tuple2[RangeSliderValue, RangeSliderRequiredProps]
  
  trait UseRangeSliderOptions
    extends StObject
       with SliderStepOptions {
    
    /**
      * An optional callback that will be triggered when the value has changed when
      * the `updateOn` behavior is set to `"blur"`. When the `updateOn` behavior is
      * set to `"change"` (default), this will do nothing since the return value
      * from the hook will always be the latest value.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ RangeSliderValue, Unit]] = js.undefined
  }
  object UseRangeSliderOptions {
    
    inline def apply(): UseRangeSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseRangeSliderOptions]
    }
    
    extension [Self <: UseRangeSliderOptions](x: Self) {
      
      inline def setOnChange(value: /* value */ RangeSliderValue => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ RangeSliderValue) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
