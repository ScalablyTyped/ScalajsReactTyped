package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.PulsatorProps
import typingsJapgolly.reactElemental.mod.PulsatorSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pulsator {
  
  @JSImport("react-elemental", "Pulsator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.Pulsator] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def inactive(value: Boolean): this.type = set("inactive", value.asInstanceOf[js.Any])
    
    inline def size(value: PulsatorSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pulsator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PulsatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
