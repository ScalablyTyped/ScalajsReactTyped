package typingsJapgolly.reactNativeWindows.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.assertive
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.no
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.polite
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.resize
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.scale
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.yes
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityRole
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityState
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityValue
import typingsJapgolly.reactNativeWindows.rntypesMod.ImageBackgroundProps
import typingsJapgolly.reactNativeWindows.rntypesMod.ImageResizeMode
import typingsJapgolly.reactNativeWindows.rntypesMod.ImageSourcePropType
import typingsJapgolly.reactNativeWindows.rntypesMod.ImageStyle
import typingsJapgolly.reactNativeWindows.rntypesMod.ImageURISource
import typingsJapgolly.reactNativeWindows.rntypesMod.Insets
import typingsJapgolly.reactNativeWindows.rntypesMod.NodeHandle
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageBackground {
  
  inline def apply(source: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageBackgroundProps]))
  }
  
  @JSImport("react-native-windows", "ImageBackground")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWindows.mod.ImageBackground] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
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
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def imageRef(value: /* image */ typingsJapgolly.reactNativeWindows.rntypesMod.Image => Callback): this.type = set("imageRef", js.Any.fromFunction1((t0: /* image */ typingsJapgolly.reactNativeWindows.rntypesMod.Image) => value(t0).runNow()))
    
    inline def imageStyle(value: StyleProp[ImageStyle]): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    inline def imageStyleNull: this.type = set("imageStyle", null)
    
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
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageBackgroundProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
