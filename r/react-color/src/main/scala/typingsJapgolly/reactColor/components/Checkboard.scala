package typingsJapgolly.reactColor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.libComponentsCommonCheckboardMod.CheckboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkboard {
  
  @JSImport("react-color", "Checkboard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactColor.mod.Checkboard] {
    
    inline def grey(value: String): this.type = set("grey", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def white(value: String): this.type = set("white", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
