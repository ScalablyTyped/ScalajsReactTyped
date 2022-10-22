package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.Event
import typingsJapgolly.wixStyleReact.distTypesPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("wix-style-react", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Pagination] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def currentPage(value: Double): this.type = set("currentPage", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ Event => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def pageUrl(value: /* pageNumber */ Double => String): this.type = set("pageUrl", js.Any.fromFunction1(value))
    
    inline def totalPages(value: Double): this.type = set("totalPages", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pagination.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
