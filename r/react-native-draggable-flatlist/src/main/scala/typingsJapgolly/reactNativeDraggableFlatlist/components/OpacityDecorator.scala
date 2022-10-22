package typingsJapgolly.reactNativeDraggableFlatlist.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.OpacityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpacityDecorator {
  
  @JSImport("react-native-draggable-flatlist", "OpacityDecorator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: OpacityDecorator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OpacityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
