package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ImageErrorEventData
import typingsJapgolly.reactNative.mod.ImageLoadEventData
import typingsJapgolly.reactNative.mod.ImageProgressEventDataIOS
import typingsJapgolly.reactNative.mod.ImageResizeMode
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.resize
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.scale
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native.react-native.ImageProps> */
trait PartialImagePropsAccessibilityActions extends StObject {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var blurRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  
  var capInsets: js.UndefOr[Insets] = js.undefined
  
  var defaultSource: js.UndefOr[ImageURISource | Double] = js.undefined
  
  var fadeDuration: js.UndefOr[Double] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.undefined
  
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.undefined
  
  var progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var resizeMethod: js.UndefOr[auto | resize | scale] = js.undefined
  
  var resizeMode: js.UndefOr[ImageResizeMode] = js.undefined
  
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
  
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
}
object PartialImagePropsAccessibilityActions {
  
  inline def apply(): PartialImagePropsAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImagePropsAccessibilityActions]
  }
  
  extension [Self <: PartialImagePropsAccessibilityActions](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    inline def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    inline def setCapInsets(value: Insets): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    inline def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    inline def setDefaultSource(value: ImageURISource | Double): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    inline def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setLoadingIndicatorSource(value: ImageURISource): Self = StObject.set(x, "loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorSourceUndefined: Self = StObject.set(x, "loadingIndicatorSource", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ NativeSyntheticEvent[ImageErrorEventData]) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageLoadEventData]) => value(t0).runNow()))
    
    inline def setOnLoadEnd(value: Callback): Self = StObject.set(x, "onLoadEnd", value.toJsFn)
    
    inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    inline def setOnLoadStart(value: Callback): Self = StObject.set(x, "onLoadStart", value.toJsFn)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnPartialLoad(value: Callback): Self = StObject.set(x, "onPartialLoad", value.toJsFn)
    
    inline def setOnPartialLoadUndefined: Self = StObject.set(x, "onPartialLoad", js.undefined)
    
    inline def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setProgressiveRenderingEnabled(value: Boolean): Self = StObject.set(x, "progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    inline def setProgressiveRenderingEnabledUndefined: Self = StObject.set(x, "progressiveRenderingEnabled", js.undefined)
    
    inline def setResizeMethod(value: auto | resize | scale): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
    
    inline def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
    
    inline def setResizeMode(value: ImageResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
