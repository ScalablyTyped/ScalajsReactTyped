package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(accessibilityLabel: String): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("gestalt", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def borderStyle(value: sm | none): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def stickyColumns(value: Double): this.type = set("stickyColumns", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
