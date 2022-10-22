package typingsJapgolly.reactNativeCommunitySlider

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/slider", JSImport.Default)
  @js.native
  open class default () extends Slider
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @js.native
  trait Slider
    extends Component[SliderProps, js.Object, Any]
  
  /**
    * A component used to select a single value from a range of values.
    */
  type SliderComponent = japgolly.scalajs.react.facade.React.Component[SliderProps & js.Object, js.Object]
  
  type SliderIOS = Slider
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - typingsJapgolly.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typingsJapgolly.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typingsJapgolly.reactNative.mod.TVViewPropsIOS because Already inherited
  - js.Any because Already inherited
  - typingsJapgolly.reactNative.mod.AccessibilityProps because Already inherited
  - typingsJapgolly.reactNative.mod.PointerEvents because Already inherited
  - typingsJapgolly.reactNative.mod.Touchable because Already inherited
  - typingsJapgolly.reactNative.mod.GestureResponderHandlers because Already inherited
  - typingsJapgolly.reactNative.mod.ViewPropsIOS because Already inherited
  - typingsJapgolly.reactNative.mod.ViewPropsAndroid because Already inherited
  - js.Object because Already inherited
  - typingsJapgolly.reactNative.mod.ViewProps because Already inherited
  - typingsJapgolly.reactNativeCommunitySlider.mod.SliderPropsWindows because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onPointerCancel, onPointerCancelCapture, onPointerDown, onPointerDownCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerMove, onPointerMoveCapture, onPointerUp, onPointerUpCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined vertical
  - typingsJapgolly.reactNativeCommunitySlider.mod.SliderPropsAndroid because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onPointerCancel, onPointerCancelCapture, onPointerDown, onPointerDownCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerMove, onPointerMoveCapture, onPointerUp, onPointerUpCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined thumbTintColor */ trait SliderProps
    extends StObject
       with SliderPropsIOS {
    
    /**
      * A string of one or more words to be announced by the screen reader.
      * Otherwise, it will announce the value as a percentage.
      * Requires passing a value to `accessibilityIncrements` to work correctly.
      * Should be a plural word, as singular units will be handled.
      */
    var accessibilityIncrements: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A string of one or more words to be announced by the screen reader.
      * Otherwise, it will announce the value as a percentage.
      * Requires passing a value to `accessibilityIncrements` to work correctly.
      * Should be a plural word, as singular units will be handled.
      */
    var accessibilityUnits: js.UndefOr[String] = js.undefined
    
    /**
      * If true the user won't be able to move the slider.
      * Default value is false.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reverses the direction of the slider.
      */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The color used for the track to the right of the button.
      * Overrides the default blue gradient image.
      */
    var maximumTrackTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * Initial maximum value of the slider. Default value is 1.
      */
    var maximumValue: js.UndefOr[Double] = js.undefined
    
    /**
      * The color used for the track to the left of the button.
      * Overrides the default blue gradient image.
      */
    var minimumTrackTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * Initial minimum value of the slider. Default value is 0.
      */
    var minimumValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback called when the user finishes changing the value (e.g. when the slider is released).
      */
    var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Callback that is called when the user picks up the slider.
      * The initial value is passed as an argument to the callback handler.
      */
    var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Callback continuously called while the user is dragging the slider.
      */
    var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Reference object.
      */
    var ref: js.UndefOr[SliderReferenceType] = js.undefined
    
    /**
      * Step value of the slider. The value should be between 0 and (maximumValue - minimumValue). Default value is 0.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Color of the foreground switch grip.
      */
    var thumbTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * Write-only property representing the value of the slider.
      * Can be used to programmatically control the position of the thumb.
      * Entered once at the beginning still acts as an initial value.
      * The value should be between minimumValue and maximumValue,
      * which default to 0 and 1 respectively.
      * Default value is 0.
      *
      * This is not a controlled component, you don't need to update the
      * value during dragging.
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the orientation of the slider, default value is 'false' (horizontal).
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setAccessibilityIncrements(value: js.Array[String]): Self = StObject.set(x, "accessibilityIncrements", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIncrementsUndefined: Self = StObject.set(x, "accessibilityIncrements", js.undefined)
      
      inline def setAccessibilityIncrementsVarargs(value: String*): Self = StObject.set(x, "accessibilityIncrements", js.Array(value*))
      
      inline def setAccessibilityUnits(value: String): Self = StObject.set(x, "accessibilityUnits", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityUnitsUndefined: Self = StObject.set(x, "accessibilityUnits", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
      
      inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
      
      inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
      
      inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
      
      inline def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
      
      inline def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
      
      inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
      
      inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
      
      inline def setOnSlidingComplete(value: /* value */ Double => Callback): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
      
      inline def setOnSlidingStart(value: /* value */ Double => Callback): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setRef(value: SliderReferenceType): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait SliderPropsAndroid
    extends StObject
       with ViewProps {
    
    /**
      * Color of the foreground switch grip.
      */
    var thumbTintColor: js.UndefOr[String] = js.undefined
  }
  object SliderPropsAndroid {
    
    inline def apply(): SliderPropsAndroid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsAndroid]
    }
    
    extension [Self <: SliderPropsAndroid](x: Self) {
      
      inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    }
  }
  
  trait SliderPropsIOS
    extends StObject
       with ViewProps {
    
    /**
      * Assigns a maximum track image. Only static images are supported.
      * The leftmost pixel of the image will be stretched to fill the track.
      */
    var maximumTrackImage: js.UndefOr[ImageURISource] = js.undefined
    
    /**
      * Assigns a minimum track image. Only static images are supported.
      * The rightmost pixel of the image will be stretched to fill the track.
      */
    var minimumTrackImage: js.UndefOr[ImageURISource] = js.undefined
    
    /**
      * Permits tapping on the slider track to set the thumb position.
      * Defaults to false on iOS. No effect on Android or Windows.
      */
    var tapToSeek: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets an image for the thumb. Only static images are supported.
      */
    var thumbImage: js.UndefOr[ImageURISource] = js.undefined
    
    /**
      * Assigns a single image for the track. Only static images
      * are supported. The center pixel of the image will be stretched
      * to fill the track.
      */
    var trackImage: js.UndefOr[ImageURISource] = js.undefined
  }
  object SliderPropsIOS {
    
    inline def apply(): SliderPropsIOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsIOS]
    }
    
    extension [Self <: SliderPropsIOS](x: Self) {
      
      inline def setMaximumTrackImage(value: ImageURISource): Self = StObject.set(x, "maximumTrackImage", value.asInstanceOf[js.Any])
      
      inline def setMaximumTrackImageUndefined: Self = StObject.set(x, "maximumTrackImage", js.undefined)
      
      inline def setMinimumTrackImage(value: ImageURISource): Self = StObject.set(x, "minimumTrackImage", value.asInstanceOf[js.Any])
      
      inline def setMinimumTrackImageUndefined: Self = StObject.set(x, "minimumTrackImage", js.undefined)
      
      inline def setTapToSeek(value: Boolean): Self = StObject.set(x, "tapToSeek", value.asInstanceOf[js.Any])
      
      inline def setTapToSeekUndefined: Self = StObject.set(x, "tapToSeek", js.undefined)
      
      inline def setThumbImage(value: ImageURISource): Self = StObject.set(x, "thumbImage", value.asInstanceOf[js.Any])
      
      inline def setThumbImageUndefined: Self = StObject.set(x, "thumbImage", js.undefined)
      
      inline def setTrackImage(value: ImageURISource): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
      
      inline def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
    }
  }
  
  trait SliderPropsWindows
    extends StObject
       with ViewProps {
    
    /**
      * Controls the orientation of the slider, default value is 'false' (horizontal).
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderPropsWindows {
    
    inline def apply(): SliderPropsWindows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsWindows]
    }
    
    extension [Self <: SliderPropsWindows](x: Self) {
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait SliderRef extends StObject {
    
    def updateValue(value: Double): Unit
  }
  object SliderRef {
    
    inline def apply(updateValue: Double => Callback): SliderRef = {
      val __obj = js.Dynamic.literal(updateValue = js.Any.fromFunction1((t0: Double) => updateValue(t0).runNow()))
      __obj.asInstanceOf[SliderRef]
    }
    
    extension [Self <: SliderRef](x: Self) {
      
      inline def setUpdateValue(value: Double => Callback): Self = StObject.set(x, "updateValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  type SliderReferenceType = js.UndefOr[MutableRefObject[SliderRef] & LegacyRef[Slider]]
}
