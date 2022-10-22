package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.DialogProps
import typingsJapgolly.reactNativePopupDialog.mod.FadeAnimation
import typingsJapgolly.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typingsJapgolly.reactNativePopupDialog.mod.ScaleAnimation
import typingsJapgolly.reactNativePopupDialog.mod.SlideAnimation
import typingsJapgolly.reactNativePopupDialog.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePopupDialog {
  
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def dialogAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): this.type = set("dialogAnimation", value.asInstanceOf[js.Any])
    
    inline def dialogStyle(value: StyleProp[ViewStyle]): this.type = set("dialogStyle", value.asInstanceOf[js.Any])
    
    inline def dialogStyleNull: this.type = set("dialogStyle", null)
    
    inline def dialogTitle(value: Any): this.type = set("dialogTitle", value.asInstanceOf[js.Any])
    
    inline def footer(value: Any): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def hasOverlay(value: Boolean): this.type = set("hasOverlay", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onHardwareBackPress(value: CallbackTo[Boolean]): this.type = set("onHardwareBackPress", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def onTouchOutside(value: Callback): this.type = set("onTouchOutside", value.toJsFn)
    
    inline def overlayBackgroundColor(value: String): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    
    inline def overlayPointerEvents(value: OverlayPointerEventTypes): this.type = set("overlayPointerEvents", value.asInstanceOf[js.Any])
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativePopupDialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
