package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.components.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("griddle-react", "components.Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.components.Table] {
    
    inline def NoResults(value: Any): this.type = set("NoResults", value.asInstanceOf[js.Any])
    
    inline def TableBody(value: Any): this.type = set("TableBody", value.asInstanceOf[js.Any])
    
    inline def TableHeading(value: Any): this.type = set("TableHeading", value.asInstanceOf[js.Any])
    
    inline def visibleRows(value: Double): this.type = set("visibleRows", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
