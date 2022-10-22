package typingsJapgolly.reactNativeMaterialKit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typingsJapgolly.reactNativeMaterialKit.anon.Checked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typingsJapgolly.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typingsJapgolly.reactNative.mod.AccessibilityProps because Already inherited
- typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID. Inlined onPress, onPressOut, onFocus, delayLongPress, onLongPress, onBlur, delayPressOut, disabled, pressRetentionOffset, delayPressIn, onPressIn */ trait MKRadioButtonProperties
  extends StObject
     with MKRippleProperties
     with TouchableWithoutFeedbackPropsIOS
     with TouchableWithoutFeedbackPropsAndroid {
  
  var borderOffColor: js.UndefOr[String] = js.undefined
  
  var borderOnColor: js.UndefOr[String] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delay in ms, from onPressIn, before onLongPress is called.
    */
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called.
    */
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay in ms, from the release of the touch, before onPressOut is called.
    */
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, disable all interactions for this component.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var extraRippleRadius: js.UndefOr[Double] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[MKRadioButtonGroup] = js.undefined
  
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "blur" occurs, meaning the element lost focus.
    * Some platforms may not have the concept of blur.
    */
  var onBlur: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onCheckedChange: js.UndefOr[js.Function1[/* opts */ Checked, Unit]] = js.undefined
  
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "focus" occurs. Some platforms may not have
    * the concept of focus.
    */
  var onFocus: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * Called when the touch is released,
    * but not if cancelled (e.g. by a scroll that steals the responder lock).
    */
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * When the scroll view is disabled, this defines how far your
    * touch may move off of the button, before deactivating the button.
    * Once deactivated, try moving it back and you'll see that the button
    * is once again reactivated! Move it back and forth several times
    * while the scroll view is disabled. Ensure you pass in a constant
    * to reduce memory allocations.
    */
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
}
object MKRadioButtonProperties {
  
  inline def apply(): MKRadioButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRadioButtonProperties]
  }
  
  extension [Self <: MKRadioButtonProperties](x: Self) {
    
    inline def setBorderOffColor(value: String): Self = StObject.set(x, "borderOffColor", value.asInstanceOf[js.Any])
    
    inline def setBorderOffColorUndefined: Self = StObject.set(x, "borderOffColor", js.undefined)
    
    inline def setBorderOnColor(value: String): Self = StObject.set(x, "borderOnColor", value.asInstanceOf[js.Any])
    
    inline def setBorderOnColorUndefined: Self = StObject.set(x, "borderOnColor", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtraRippleRadius(value: Double): Self = StObject.set(x, "extraRippleRadius", value.asInstanceOf[js.Any])
    
    inline def setExtraRippleRadiusUndefined: Self = StObject.set(x, "extraRippleRadius", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setGroup(value: MKRadioButtonGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setOnBlur(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCheckedChange(value: /* opts */ Checked => Callback): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction1((t0: /* opts */ Checked) => value(t0).runNow()))
    
    inline def setOnCheckedChangeUndefined: Self = StObject.set(x, "onCheckedChange", js.undefined)
    
    inline def setOnFocus(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
  }
}
