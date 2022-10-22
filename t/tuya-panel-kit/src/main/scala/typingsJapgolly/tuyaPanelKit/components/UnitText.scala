package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.UnitTextProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.icon
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnitText {
  
  inline def apply(value: String | Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UnitTextProps]))
  }
  
  @JSImport("tuya-panel-kit", "UnitText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.UnitText] {
    
    inline def letterWidth(value: Double): this.type = set("letterWidth", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def svgMap(value: js.Object): this.type = set("svgMap", value.asInstanceOf[js.Any])
    
    inline def symbolWidth(value: Double): this.type = set("symbolWidth", value.asInstanceOf[js.Any])
    
    inline def symbols(value: js.Array[String]): this.type = set("symbols", value.asInstanceOf[js.Any])
    
    inline def symbolsVarargs(value: String*): this.type = set("symbols", js.Array(value*))
    
    inline def unit(value: String): this.type = set("unit", value.asInstanceOf[js.Any])
    
    inline def unitColor(value: String): this.type = set("unitColor", value.asInstanceOf[js.Any])
    
    inline def unitPaddingLeft(value: Double): this.type = set("unitPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def unitPaddingTop(value: Double): this.type = set("unitPaddingTop", value.asInstanceOf[js.Any])
    
    inline def unitSize(value: Double): this.type = set("unitSize", value.asInstanceOf[js.Any])
    
    inline def unitType(value: icon | text): this.type = set("unitType", value.asInstanceOf[js.Any])
    
    inline def useART(value: Boolean): this.type = set("useART", value.asInstanceOf[js.Any])
    
    inline def valueColor(value: String): this.type = set("valueColor", value.asInstanceOf[js.Any])
    
    inline def valueColors(value: js.Array[String]): this.type = set("valueColors", value.asInstanceOf[js.Any])
    
    inline def valueColorsVarargs(value: String*): this.type = set("valueColors", js.Array(value*))
    
    inline def valueSize(value: Double): this.type = set("valueSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UnitTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
