package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderControls
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderDefaultValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderStepOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseSliderMod {
  
  @JSImport("@react-md/form/types/slider/useSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSlider(): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")().asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  
  trait SliderRequiredProps
    extends StObject
       with SliderControls
       with DefinedSliderValueOptions {
    
    /**
      * The current value of the slider.
      */
    var value: SliderValue
  }
  object SliderRequiredProps {
    
    inline def apply(
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
    ): SliderRequiredProps = {
      val __obj = js.Dynamic.literal(decrement = decrement.toJsFn, decrementJump = decrementJump.toJsFn, increment = increment.toJsFn, incrementJump = incrementJump.toJsFn, max = max.asInstanceOf[js.Any], maximum = maximum.toJsFn, min = min.asInstanceOf[js.Any], minimum = minimum.toJsFn, persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => setValue(t0).runNow()), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderRequiredProps]
    }
    
    extension [Self <: SliderRequiredProps](x: Self) {
      
      inline def setValue(value: SliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderValueReturnType = js.Tuple2[SliderValue, SliderRequiredProps]
  
  trait UseSliderOptions
    extends StObject
       with SliderStepOptions {
    
    /**
      * An optional callback that will be triggered when the value has changed when
      * the `updateOn` behavior is set to `"blur"`. When the `updateOn` behavior is
      * set to `"change"` (default), this will do nothing since the return value
      * from the hook will always be the latest value.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  }
  object UseSliderOptions {
    
    inline def apply(): UseSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseSliderOptions]
    }
    
    extension [Self <: UseSliderOptions](x: Self) {
      
      inline def setOnChange(value: /* value */ SliderValue => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ SliderValue) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
