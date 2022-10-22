package typingsJapgolly.reactNativeDraggableFlatlist.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ScaleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleDecorator {
  
  @JSImport("react-native-draggable-flatlist", "ScaleDecorator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeScale(value: Double): this.type = set("activeScale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScaleDecorator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScaleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
