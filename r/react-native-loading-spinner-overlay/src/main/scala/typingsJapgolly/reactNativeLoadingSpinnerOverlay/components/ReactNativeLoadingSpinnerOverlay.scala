package typingsJapgolly.reactNativeLoadingSpinnerOverlay.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.mod.default
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typingsJapgolly.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeLoadingSpinnerOverlay {
  
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animation(value: none | slide | fade): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def cancelable(value: Boolean): this.type = set("cancelable", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def customIndicator(value: VdomElement): this.type = set("customIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    
    inline def size(value: normal | small | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def textContent(value: String): this.type = set("textContent", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeLoadingSpinnerOverlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
