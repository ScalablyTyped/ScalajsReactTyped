package typingsJapgolly.reactDataGrid.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from scala.Any because couldn't resolve ClassTree. */
object Row {
  
  def apply(p: Any): Default[typingsJapgolly.reactDataGrid.mod.Row] = new Default[typingsJapgolly.reactDataGrid.mod.Row](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-data-grid", "Row")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Row.type): Default[typingsJapgolly.reactDataGrid.mod.Row] = new Default[typingsJapgolly.reactDataGrid.mod.Row](js.Array(this.component, js.Dictionary.empty))()
}
