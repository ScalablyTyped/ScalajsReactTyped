package typingsJapgolly.materialUiPagination.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.materialUiPagination.mod.PaginationProps
import typingsJapgolly.materialUiPagination.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUiPagination {
  
  inline def apply(current: Double, display: Double, onChange: Double => Callback, total: Double): Default[default] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Double) => onChange(t0).runNow()), total = total.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PaginationProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
