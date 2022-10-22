package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderControls
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderControls
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.ThumbIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUtilsMod {
  
  @JSImport("@react-md/form/types/slider/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDragPercentage(hasMinMaxDraggingDragValueDraggingIndexThumb1ValueThumb2Value: DragPercentageOptions): DragPercentage = ^.asInstanceOf[js.Dynamic].applyDynamic("getDragPercentage")(hasMinMaxDraggingDragValueDraggingIndexThumb1ValueThumb2Value.asInstanceOf[js.Any]).asInstanceOf[DragPercentage]
  
  inline def getDragValue(hasMinMaxStepVerticalClientXClientYLeftTopHeightWidthIsRtlMinValueMaxValue: SliderDragValues): SliderDragValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getDragValue")(hasMinMaxStepVerticalClientXClientYLeftTopHeightWidthIsRtlMinValueMaxValue.asInstanceOf[js.Any]).asInstanceOf[SliderDragValue]
  
  inline def getJumpValue(min: Double, max: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getJumpValue")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getJumpValue(min: Double, max: Double, step: Double, jump: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getJumpValue")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], jump.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSteps(min: Double, max: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSteps")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isMouseEvent(event: SliderDragEvent): /* is @react-md/form.anon.MouseEventtypemousedownmo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMouseEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.anon.MouseEventtypemousedownmo */ Boolean]
  
  inline def isRangeSlider(controls: CombinedSliderControls): /* is @react-md/form.@react-md/form/types/slider/utils.ComplexSliderControls */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeSlider")(controls.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/slider/utils.ComplexSliderControls */ Boolean]
  
  inline def isTouchEvent(event: SliderDragEvent): /* is @react-md/form.anon.TouchEventtypetouchstartt */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.anon.TouchEventtypetouchstartt */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdForm.typesSliderUtilsMod.SimpleSliderControls
    - typingsJapgolly.reactMdForm.typesSliderUtilsMod.ComplexSliderControls
  */
  trait CombinedSliderControls extends StObject
  object CombinedSliderControls {
    
    inline def ComplexSliderControls(
      decrement: ThumbIndex => Callback,
      decrementJump: ThumbIndex => Callback,
      increment: ThumbIndex => Callback,
      incrementJump: ThumbIndex => Callback,
      maximum: ThumbIndex => Callback,
      minimum: ThumbIndex => Callback,
      persist: Callback,
      setValue: SetStateAction[RangeSliderValue] => Callback,
      value: RangeSliderValue
    ): typingsJapgolly.reactMdForm.typesSliderUtilsMod.ComplexSliderControls = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1((t0: ThumbIndex) => decrement(t0).runNow()), decrementJump = js.Any.fromFunction1((t0: ThumbIndex) => decrementJump(t0).runNow()), increment = js.Any.fromFunction1((t0: ThumbIndex) => increment(t0).runNow()), incrementJump = js.Any.fromFunction1((t0: ThumbIndex) => incrementJump(t0).runNow()), maximum = js.Any.fromFunction1((t0: ThumbIndex) => maximum(t0).runNow()), minimum = js.Any.fromFunction1((t0: ThumbIndex) => minimum(t0).runNow()), persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => setValue(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdForm.typesSliderUtilsMod.ComplexSliderControls]
    }
    
    inline def SimpleSliderControls(
      decrement: Callback,
      decrementJump: Callback,
      increment: Callback,
      incrementJump: Callback,
      maximum: Callback,
      minimum: Callback,
      persist: Callback,
      setValue: SetStateAction[SliderValue] => Callback,
      value: SliderValue
    ): typingsJapgolly.reactMdForm.typesSliderUtilsMod.SimpleSliderControls = {
      val __obj = js.Dynamic.literal(decrement = decrement.toJsFn, decrementJump = decrementJump.toJsFn, increment = increment.toJsFn, incrementJump = incrementJump.toJsFn, maximum = maximum.toJsFn, minimum = minimum.toJsFn, persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => setValue(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdForm.typesSliderUtilsMod.SimpleSliderControls]
    }
  }
  
  trait ComplexSliderControls
    extends StObject
       with RangeSliderControls
       with CombinedSliderControls {
    
    var value: RangeSliderValue
  }
  object ComplexSliderControls {
    
    inline def apply(
      decrement: ThumbIndex => Callback,
      decrementJump: ThumbIndex => Callback,
      increment: ThumbIndex => Callback,
      incrementJump: ThumbIndex => Callback,
      maximum: ThumbIndex => Callback,
      minimum: ThumbIndex => Callback,
      persist: Callback,
      setValue: SetStateAction[RangeSliderValue] => Callback,
      value: RangeSliderValue
    ): ComplexSliderControls = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1((t0: ThumbIndex) => decrement(t0).runNow()), decrementJump = js.Any.fromFunction1((t0: ThumbIndex) => decrementJump(t0).runNow()), increment = js.Any.fromFunction1((t0: ThumbIndex) => increment(t0).runNow()), incrementJump = js.Any.fromFunction1((t0: ThumbIndex) => incrementJump(t0).runNow()), maximum = js.Any.fromFunction1((t0: ThumbIndex) => maximum(t0).runNow()), minimum = js.Any.fromFunction1((t0: ThumbIndex) => minimum(t0).runNow()), persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => setValue(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComplexSliderControls]
    }
    
    extension [Self <: ComplexSliderControls](x: Self) {
      
      inline def setValue(value: RangeSliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragPercentage extends StObject {
    
    var thumb1Percentage: String
    
    var thumb2Percentage: js.UndefOr[String] = js.undefined
  }
  object DragPercentage {
    
    inline def apply(thumb1Percentage: String): DragPercentage = {
      val __obj = js.Dynamic.literal(thumb1Percentage = thumb1Percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragPercentage]
    }
    
    extension [Self <: DragPercentage](x: Self) {
      
      inline def setThumb1Percentage(value: String): Self = StObject.set(x, "thumb1Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2Percentage(value: String): Self = StObject.set(x, "thumb2Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2PercentageUndefined: Self = StObject.set(x, "thumb2Percentage", js.undefined)
    }
  }
  
  /**
    * @remarks \@since 2.5.0
    * @internal
    */
  trait DragPercentageOptions extends StObject {
    
    var dragValue: Double
    
    var dragging: Boolean
    
    var draggingIndex: ThumbIndex | Null
    
    var max: Double
    
    var min: Double
    
    var thumb1Value: Double
    
    var thumb2Value: js.UndefOr[Double] = js.undefined
  }
  object DragPercentageOptions {
    
    inline def apply(dragValue: Double, dragging: Boolean, max: Double, min: Double, thumb1Value: Double): DragPercentageOptions = {
      val __obj = js.Dynamic.literal(dragValue = dragValue.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], thumb1Value = thumb1Value.asInstanceOf[js.Any], draggingIndex = null)
      __obj.asInstanceOf[DragPercentageOptions]
    }
    
    extension [Self <: DragPercentageOptions](x: Self) {
      
      inline def setDragValue(value: Double): Self = StObject.set(x, "dragValue", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndex(value: ThumbIndex): Self = StObject.set(x, "draggingIndex", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndexNull: Self = StObject.set(x, "draggingIndex", null)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setThumb1Value(value: Double): Self = StObject.set(x, "thumb1Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2Value(value: Double): Self = StObject.set(x, "thumb2Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2ValueUndefined: Self = StObject.set(x, "thumb2Value", js.undefined)
    }
  }
  
  trait SimpleSliderControls
    extends StObject
       with SliderControls
       with CombinedSliderControls {
    
    var value: SliderValue
  }
  object SimpleSliderControls {
    
    inline def apply(
      decrement: Callback,
      decrementJump: Callback,
      increment: Callback,
      incrementJump: Callback,
      maximum: Callback,
      minimum: Callback,
      persist: Callback,
      setValue: SetStateAction[SliderValue] => Callback,
      value: SliderValue
    ): SimpleSliderControls = {
      val __obj = js.Dynamic.literal(decrement = decrement.toJsFn, decrementJump = decrementJump.toJsFn, increment = increment.toJsFn, incrementJump = incrementJump.toJsFn, maximum = maximum.toJsFn, minimum = minimum.toJsFn, persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => setValue(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSliderControls]
    }
    
    extension [Self <: SimpleSliderControls](x: Self) {
      
      inline def setValue(value: SliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderDragEvent = MouseEvent | TouchEvent | ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element]
  
  trait SliderDragValue extends StObject {
    
    /**
      * The current percentage dragged number (`> 0` and `< 1`). This is used only
      * while dragging with the mouse or touch since it makes the drag experience
      * smoother. If this is omitted and there is a small number of "steps" in the
      * range, the mouse/touch won't align with the thumb since it will only move
      * when the value is updated as well.
      *
      * Example:
      * - slider has width of 1000px, min value is 0, max value is 100, step is 20
      * - formula:
      *   - range = max - min
      *   - steps = range / step
      *   - new-value-at = slider-width / steps
      *   - new-value-at = slider-width / ((max - min) / step)
      * - so:
      *   - new-value-at = 1000px / ((100 - 0) / 20)
      *   - new-value-at = 1000px / (100 / 20)
      *   - new-value-at = 1000px / 5
      *   - new-value-at = 200px
      * - user drags from `0px -> 10px`
      *   - no visual change
      * - user drags from `10px -> 190px`
      *   - no visual change
      * - user drags from `190px -> 200px`
      *   - visual change to first step
      *
      * The current value allows for a visual change while the user drags, but the
      * thumb will move to the correct value once the user stops dragging.
      */
    var current: Double
    
    /**
      * This is the current value for the slider that is completely "valid" and
      * within the provided range.
      */
    var value: Double
  }
  object SliderDragValue {
    
    inline def apply(current: Double, value: Double): SliderDragValue = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderDragValue]
    }
    
    extension [Self <: SliderDragValue](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliderDragValues
    extends StObject
       with DefinedSliderValueOptions {
    
    var clientX: Double
    
    var clientY: Double
    
    var height: Double
    
    var isRtl: Boolean
    
    var left: Double
    
    var maxValue: Double
    
    var minValue: Double
    
    var top: Double
    
    var vertical: Boolean
    
    var width: Double
  }
  object SliderDragValues {
    
    inline def apply(
      clientX: Double,
      clientY: Double,
      height: Double,
      isRtl: Boolean,
      left: Double,
      max: Double,
      maxValue: Double,
      min: Double,
      minValue: Double,
      step: Double,
      top: Double,
      vertical: Boolean,
      width: Double
    ): SliderDragValues = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderDragValues]
    }
    
    extension [Self <: SliderDragValues](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
