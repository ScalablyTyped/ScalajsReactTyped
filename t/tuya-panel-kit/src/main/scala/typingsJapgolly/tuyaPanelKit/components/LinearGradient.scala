package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.mod.LinearGradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("tuya-panel-kit", "LinearGradient")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.LinearGradient] {
    
    inline def gradientId(value: String): this.type = set("gradientId", value.asInstanceOf[js.Any])
    
    inline def stops(value: Record[String, String]): this.type = set("stops", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def x1(value: String): this.type = set("x1", value.asInstanceOf[js.Any])
    
    inline def x2(value: String): this.type = set("x2", value.asInstanceOf[js.Any])
    
    inline def y1(value: String): this.type = set("y1", value.asInstanceOf[js.Any])
    
    inline def y2(value: String): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LinearGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinearGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
