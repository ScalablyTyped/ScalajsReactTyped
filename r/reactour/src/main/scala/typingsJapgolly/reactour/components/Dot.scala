package typingsJapgolly.reactour.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactour.mod.DotProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dot {
  
  @JSImport("reactour", "Dot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    
    inline def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def showNumber(value: Boolean): this.type = set("showNumber", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
