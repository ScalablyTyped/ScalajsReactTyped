package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactMdForm.anon.AnimationDuration
import typingsJapgolly.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderEventHandlers
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderPresentation
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderThumbIndex
import typingsJapgolly.reactMdForm.typesSliderUtilsMod.CombinedSliderControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseSliderControlsMod {
  
  @JSImport("@react-md/form/types/slider/useSliderControls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSliderControls(
    hasRefPropThumb1RefPropThumb2RefMinMaxStepDisabledVerticalOnBlurOnKeyDownOnMouseDownOnTouchStartAnimationDurationControls: SliderControlsOptions
  ): SliderAndRangeSliderControls = ^.asInstanceOf[js.Dynamic].applyDynamic("useSliderControls")(hasRefPropThumb1RefPropThumb2RefMinMaxStepDisabledVerticalOnBlurOnKeyDownOnMouseDownOnTouchStartAnimationDurationControls.asInstanceOf[js.Any]).asInstanceOf[SliderAndRangeSliderControls]
  
  trait SliderAndRangeSliderControls extends StObject {
    
    var dragging: Boolean
    
    var draggingIndex: SliderThumbIndex
    
    var onBlur: FocusEventHandler[HTMLSpanElement]
    
    var onKeyDown: KeyboardEventHandler[HTMLSpanElement]
    
    var onMouseDown: MouseEventHandler[HTMLSpanElement]
    
    var onTouchStart: TouchEventHandler[HTMLSpanElement]
    
    var ref: RefFn[HTMLSpanElement | Null]
    
    var thumb1Percentage: String
    
    var thumb1Ref: RefFn[HTMLSpanElement | Null]
    
    var thumb1Value: Double
    
    var thumb2Percentage: js.UndefOr[String] = js.undefined
    
    var thumb2Ref: RefFn[HTMLSpanElement | Null]
    
    var thumb2Value: js.UndefOr[Double] = js.undefined
  }
  object SliderAndRangeSliderControls {
    
    inline def apply(
      dragging: Boolean,
      onBlur: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[HTMLSpanElement & Element] => Callback,
      onMouseDown: ReactMouseEventFrom[HTMLSpanElement & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[HTMLSpanElement & Element] => Callback,
      ref: (HTMLSpanElement | Null) | Null => Callback,
      thumb1Percentage: String,
      thumb1Ref: (HTMLSpanElement | Null) | Null => Callback,
      thumb1Value: Double,
      thumb2Ref: (HTMLSpanElement | Null) | Null => Callback
    ): SliderAndRangeSliderControls = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => onBlur(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLSpanElement & Element]) => onKeyDown(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & Element]) => onMouseDown(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLSpanElement & Element]) => onTouchStart(t0).runNow()), ref = js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => ref(t0).runNow()), thumb1Percentage = thumb1Percentage.asInstanceOf[js.Any], thumb1Ref = js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => thumb1Ref(t0).runNow()), thumb1Value = thumb1Value.asInstanceOf[js.Any], thumb2Ref = js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => thumb2Ref(t0).runNow()), draggingIndex = null)
      __obj.asInstanceOf[SliderAndRangeSliderControls]
    }
    
    extension [Self <: SliderAndRangeSliderControls](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndex(value: SliderThumbIndex): Self = StObject.set(x, "draggingIndex", value.asInstanceOf[js.Any])
      
      inline def setDraggingIndexNull: Self = StObject.set(x, "draggingIndex", null)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setRef(value: (HTMLSpanElement | Null) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => value(t0).runNow()))
      
      inline def setThumb1Percentage(value: String): Self = StObject.set(x, "thumb1Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb1Ref(value: (HTMLSpanElement | Null) | Null => Callback): Self = StObject.set(x, "thumb1Ref", js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => value(t0).runNow()))
      
      inline def setThumb1Value(value: Double): Self = StObject.set(x, "thumb1Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2Percentage(value: String): Self = StObject.set(x, "thumb2Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2PercentageUndefined: Self = StObject.set(x, "thumb2Percentage", js.undefined)
      
      inline def setThumb2Ref(value: (HTMLSpanElement | Null) | Null => Callback): Self = StObject.set(x, "thumb2Ref", js.Any.fromFunction1((t0: (HTMLSpanElement | Null) | Null) => value(t0).runNow()))
      
      inline def setThumb2Value(value: Double): Self = StObject.set(x, "thumb2Value", value.asInstanceOf[js.Any])
      
      inline def setThumb2ValueUndefined: Self = StObject.set(x, "thumb2Value", js.undefined)
    }
  }
  
  type SliderControlsOptions = CombinedSliderControls & SliderPresentation & SliderEventHandlers & DefinedSliderValueOptions & AnimationDuration
}
