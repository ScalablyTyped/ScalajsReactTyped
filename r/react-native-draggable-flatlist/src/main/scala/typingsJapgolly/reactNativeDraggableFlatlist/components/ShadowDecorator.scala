package typingsJapgolly.reactNativeDraggableFlatlist.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ShadowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShadowDecorator {
  
  @JSImport("react-native-draggable-flatlist", "ShadowDecorator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def elevation(value: Double): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ShadowDecorator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ShadowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
