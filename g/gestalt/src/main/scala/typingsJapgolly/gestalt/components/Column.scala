package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.mod.ColumnProps
import typingsJapgolly.gestalt.mod.UnsignedUpTo12
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  inline def apply(span: UnsignedUpTo12): Builder = {
    val __props = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
  
  @JSImport("gestalt", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def lgSpan(value: UnsignedUpTo12): this.type = set("lgSpan", value.asInstanceOf[js.Any])
    
    inline def mdSpan(value: UnsignedUpTo12): this.type = set("mdSpan", value.asInstanceOf[js.Any])
    
    inline def smSpan(value: UnsignedUpTo12): this.type = set("smSpan", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
