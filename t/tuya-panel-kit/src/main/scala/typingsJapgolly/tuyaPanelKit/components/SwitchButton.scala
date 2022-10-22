package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.ActiveSize
import typingsJapgolly.tuyaPanelKit.anon.Margin
import typingsJapgolly.tuyaPanelKit.mod.SwitchButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchButton {
  
  inline def apply(onValueChange: Boolean => Callback): Builder = {
    val __props = js.Dynamic.literal(onValueChange = js.Any.fromFunction1((t0: Boolean) => onValueChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[SwitchButtonProps]))
  }
  
  @JSImport("tuya-panel-kit", "SwitchButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.SwitchButton] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Boolean): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def offText(value: String): this.type = set("offText", value.asInstanceOf[js.Any])
    
    inline def offTextStyle(value: StyleProp[TextStyle]): this.type = set("offTextStyle", value.asInstanceOf[js.Any])
    
    inline def offTextStyleNull: this.type = set("offTextStyle", null)
    
    inline def onText(value: String): this.type = set("onText", value.asInstanceOf[js.Any])
    
    inline def onTextStyle(value: StyleProp[TextStyle]): this.type = set("onTextStyle", value.asInstanceOf[js.Any])
    
    inline def onTextStyleNull: this.type = set("onTextStyle", null)
    
    inline def onThumbTintColor(value: String): this.type = set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    inline def onTintColor(value: String | StringDictionary[String]): this.type = set("onTintColor", value.asInstanceOf[js.Any])
    
    inline def size(value: ActiveSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def theme(value: Margin): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    inline def thumbStyleNull: this.type = set("thumbStyle", null)
    
    inline def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String | StringDictionary[String]): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def value(value: Boolean): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
