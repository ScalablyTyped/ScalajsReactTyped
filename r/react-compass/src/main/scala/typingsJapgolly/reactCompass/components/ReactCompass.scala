package typingsJapgolly.reactCompass.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCompass.mod.ReactCompassProps
import typingsJapgolly.reactCompass.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCompass {
  
  inline def apply(direction: Double): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactCompassProps]))
  }
  
  @JSImport("react-compass", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def directionNames(value: js.Array[String]): this.type = set("directionNames", value.asInstanceOf[js.Any])
    
    inline def directionNamesVarargs(value: String*): this.type = set("directionNames", js.Array(value*))
  }
  
  def withProps(p: ReactCompassProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
