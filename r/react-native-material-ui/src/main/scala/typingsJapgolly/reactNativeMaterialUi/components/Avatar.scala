package typingsJapgolly.reactNativeMaterialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNativeMaterialUi.anon.Content
import typingsJapgolly.reactNativeMaterialUi.mod.AvatarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("react-native-material-ui", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Avatar] {
    
    inline def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def image(value: Image): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: Content): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
