package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactElemental.mod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @JSImport("react-elemental", "Label")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def sublabel(value: String): this.type = set("sublabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
