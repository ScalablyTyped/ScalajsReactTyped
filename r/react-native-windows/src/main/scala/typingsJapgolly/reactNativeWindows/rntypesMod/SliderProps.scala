package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityPropsIOS because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityPropsAndroid because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.TVViewPropsIOS because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityProps because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.Touchable because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.GestureResponderHandlers because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.ViewPropsIOS because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.ViewPropsAndroid because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.ViewProps because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.SliderPropsAndroid because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined thumbTintColor */ trait SliderProps
  extends StObject
     with SliderPropsIOS {
  
  /**
    * If true the user won't be able to move the slider.
    * Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color used for the track to the right of the button.
    * Overrides the default blue gradient image.
    */
  var maximumTrackTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Initial maximum value of the slider. Default value is 1.
    */
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The color used for the track to the left of the button.
    * Overrides the default blue gradient image.
    */
  var minimumTrackTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Initial minimum value of the slider. Default value is 0.
    */
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released).
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * Callback continuously called while the user is dragging the slider.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * Step value of the slider. The value should be between 0 and (maximumValue - minimumValue). Default value is 0.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Color of the foreground switch grip.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Initial value of the slider. The value should be between minimumValue
    * and maximumValue, which default to 0 and 1 respectively.
    * Default value is 0.
    * This is not a controlled component, you don't need to update
    * the value during dragging.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SliderProps {
  
  inline def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  
  extension [Self <: SliderProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMaximumTrackTintColor(value: ColorValue): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumTrackTintColor(value: ColorValue): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setOnSlidingComplete(value: /* value */ Double => Callback): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
