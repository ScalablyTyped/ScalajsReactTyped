package typingsJapgolly.reactBootstrapTable2Toolkit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.ToggleListProps
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleList {
  
  inline def apply(
    columns: js.Array[ColumnDescription[Any, Any]],
    onColumnToggle: String => Callback,
    toggles: js.Array[Boolean]
  ): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1((t0: String) => onColumnToggle(t0).runNow()), toggles = toggles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleListProps]))
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "ColumnToggle.ToggleList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def btnClassName(value: String): this.type = set("btnClassName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contextual(value: String): this.type = set("contextual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
