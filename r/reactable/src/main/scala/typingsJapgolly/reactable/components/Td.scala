package typingsJapgolly.reactable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactable.mod.TdProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Td {
  
  inline def apply(column: String): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TdProperties]))
  }
  
  @JSImport("reactable", "Td")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactable.mod.Td] {
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TdProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
