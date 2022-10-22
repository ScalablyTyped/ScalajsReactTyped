package typingsJapgolly.reactTypical.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTypical.mod.ReactTypicalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypical {
  
  inline def apply(steps: js.Array[String | Double]): Builder = {
    val __props = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTypicalProps]))
  }
  
  @JSImport("react-typical", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def loop(value: Double): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def wrapper(value: String): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactTypicalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
