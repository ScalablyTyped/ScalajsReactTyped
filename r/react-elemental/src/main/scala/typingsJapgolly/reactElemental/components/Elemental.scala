package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactElemental.anon.Primary
import typingsJapgolly.reactElemental.anon.PrimaryDark
import typingsJapgolly.reactElemental.mod.ElementalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elemental {
  
  @JSImport("react-elemental", "Elemental")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.Elemental] {
    
    inline def colorOpts(value: PrimaryDark): this.type = set("colorOpts", value.asInstanceOf[js.Any])
    
    inline def fontOpts(value: Primary): this.type = set("fontOpts", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Elemental.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ElementalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
