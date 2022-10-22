package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.Next
import typingsJapgolly.fundamentalReact.libPaginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(itemsTotal: Double, onClick: /* repeated */ Any => Any): Builder = {
    val __props = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("fundamental-react", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.Pagination] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def displayTotal(value: Boolean): this.type = set("displayTotal", value.asInstanceOf[js.Any])
    
    inline def displayTotalProps(value: Any): this.type = set("displayTotalProps", value.asInstanceOf[js.Any])
    
    inline def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def linkProps(value: Any): this.type = set("linkProps", value.asInstanceOf[js.Any])
    
    inline def localizedText(value: Next): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    inline def nextProps(value: Any): this.type = set("nextProps", value.asInstanceOf[js.Any])
    
    inline def prevProps(value: Any): this.type = set("prevProps", value.asInstanceOf[js.Any])
    
    inline def totalText(value: String): this.type = set("totalText", value.asInstanceOf[js.Any])
    
    inline def visiblePageTotal(value: Double): this.type = set("visiblePageTotal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
