package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseDiscreteValueVisibilityMod {
  
  @JSImport("@react-md/form/types/slider/useDiscreteValueVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDiscreteValueVisibility(hasActiveAnimateAnimationDurationDiscreteDisabledPropOnBlurPropOnFocus: Options): ReturnedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDiscreteValueVisibility")(hasActiveAnimateAnimationDurationDiscreteDisabledPropOnBlurPropOnFocus.asInstanceOf[js.Any]).asInstanceOf[ReturnedProps]
  
  /**
    * @internal
    * @remarks \@since 2.5.0
    */
  trait Options extends StObject {
    
    var active: Boolean
    
    var animate: Boolean
    
    var animationDuration: Double
    
    var disabled: Boolean
    
    var discrete: Boolean
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  }
  object Options {
    
    inline def apply(active: Boolean, animate: Boolean, animationDuration: Double, disabled: Boolean, discrete: Boolean): Options = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], discrete = discrete.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDiscrete(value: Boolean): Self = StObject.set(x, "discrete", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.5.0
    */
  trait ReturnedProps extends StObject {
    
    /**
      * Boolean if the value should animate the `left`, `right`, `top`, and
      * `bottom` values to match the speed of the thumb.
      */
    var animateValue: Boolean
    
    var onBlur: FocusEventHandler[HTMLSpanElement]
    
    var onFocus: FocusEventHandler[HTMLSpanElement]
    
    var visible: Boolean
  }
  object ReturnedProps {
    
    inline def apply(
      animateValue: Boolean,
      onBlur: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback,
      onFocus: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback,
      visible: Boolean
    ): ReturnedProps = {
      val __obj = js.Dynamic.literal(animateValue = animateValue.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => onFocus(t0).runNow()), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnedProps]
    }
    
    extension [Self <: ReturnedProps](x: Self) {
      
      inline def setAnimateValue(value: Boolean): Self = StObject.set(x, "animateValue", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
