package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.BgBorder
import typingsJapgolly.tuyaPanelKit.mod.BrickButtonProps
import typingsJapgolly.tuyaPanelKit.themeMod.BackgroundProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.large
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.primary
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.primaryBorder
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.primaryGradient
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrickButton {
  
  @JSImport("tuya-panel-kit", "BrickButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.BrickButton] {
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def background(value: BackgroundProps): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def backgroundColorTouched(value: String): this.type = set("backgroundColorTouched", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingBackground(value: String): this.type = set("loadingBackground", value.asInstanceOf[js.Any])
    
    inline def loadingColor(value: String): this.type = set("loadingColor", value.asInstanceOf[js.Any])
    
    inline def loadingSize(value: small | large | Double): this.type = set("loadingSize", value.asInstanceOf[js.Any])
    
    inline def loadingStrokeWidth(value: Double): this.type = set("loadingStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def loadingStyle(value: StyleProp[ViewStyle]): this.type = set("loadingStyle", value.asInstanceOf[js.Any])
    
    inline def loadingStyleNull: this.type = set("loadingStyle", null)
    
    inline def onChange(value: (/* eventName */ String, /* args */ Any) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* eventName */ String, t1: /* args */ Any) => (value(t0, t1)).runNow()))
    
    inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def showUnderlay(value: Boolean): this.type = set("showUnderlay", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def theme(value: BgBorder): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: primary | primaryGradient | primaryBorder | normal | small): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  implicit def make(companion: BrickButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrickButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
