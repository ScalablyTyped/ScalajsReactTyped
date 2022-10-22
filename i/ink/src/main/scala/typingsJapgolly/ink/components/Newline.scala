package typingsJapgolly.ink.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ink.buildComponentsNewlineMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Newline {
  
  @JSImport("ink", "Newline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Newline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
