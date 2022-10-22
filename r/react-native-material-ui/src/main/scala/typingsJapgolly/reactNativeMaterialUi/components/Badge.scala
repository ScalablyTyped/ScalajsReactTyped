package typingsJapgolly.reactNativeMaterialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.Color
import typingsJapgolly.reactNativeMaterialUi.anon.StrokeContainer
import typingsJapgolly.reactNativeMaterialUi.mod.BadgeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("react-native-material-ui", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Badge] {
    
    inline def accent(value: Boolean): this.type = set("accent", value.asInstanceOf[js.Any])
    
    inline def icon(value: String | Color): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stroke(value: Double): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def style(value: StrokeContainer): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
