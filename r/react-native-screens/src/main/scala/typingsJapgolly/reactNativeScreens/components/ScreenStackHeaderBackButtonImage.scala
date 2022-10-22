package typingsJapgolly.reactNativeScreens.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ImageProps
import typingsJapgolly.reactNative.mod.ImageResizeMode
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.resize
import typingsJapgolly.reactNative.reactNativeStrings.scale
import typingsJapgolly.reactNative.reactNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScreenStackHeaderBackButtonImage {
  
  @JSImport("react-native-screens", "ScreenStackHeaderBackButtonImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def blurRadius(value: Double): this.type = set("blurRadius", value.asInstanceOf[js.Any])
    
    inline def borderBottomLeftRadius(value: Double): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def borderBottomRightRadius(value: Double): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderTopLeftRadius(value: Double): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def borderTopRightRadius(value: Double): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def capInsets(value: Insets): this.type = set("capInsets", value.asInstanceOf[js.Any])
    
    inline def defaultSource(value: ImageURISource | Double): this.type = set("defaultSource", value.asInstanceOf[js.Any])
    
    inline def fadeDuration(value: Double): this.type = set("fadeDuration", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def loadingIndicatorSource(value: ImageURISource): this.type = set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onError(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLoadEnd(value: Callback): this.type = set("onLoadEnd", value.toJsFn)
    
    inline def onLoadStart(value: Callback): this.type = set("onLoadStart", value.toJsFn)
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onPartialLoad(value: Callback): this.type = set("onPartialLoad", value.toJsFn)
    
    inline def onProgress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def progressiveRenderingEnabled(value: Boolean): this.type = set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    inline def resizeMethod(value: auto | resize | scale): this.type = set("resizeMethod", value.asInstanceOf[js.Any])
    
    inline def resizeMode(value: ImageResizeMode): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    inline def source(value: ImageSourcePropType): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def sourceVarargs(value: ImageURISource*): this.type = set("source", js.Array(value*))
    
    inline def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScreenStackHeaderBackButtonImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
