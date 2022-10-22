package typingsJapgolly.reactable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactable.anon.Column
import typingsJapgolly.reactable.mod.ColumnsType
import typingsJapgolly.reactable.mod.TableComponentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TableComponentProperties[T]]))
  }
  
  @JSImport("reactable", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactable.mod.Table[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[ColumnsType]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: ColumnsType*): this.type = set("columns", js.Array(value*))
    
    inline def currentPage(value: Double): this.type = set("currentPage", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[T]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: T*): this.type = set("data", js.Array(value*))
    
    inline def defaultSort(value: Column): this.type = set("defaultSort", value.asInstanceOf[js.Any])
    
    inline def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    inline def filterable(value: js.Array[String]): this.type = set("filterable", value.asInstanceOf[js.Any])
    
    inline def filterableVarargs(value: String*): this.type = set("filterable", js.Array(value*))
    
    inline def hideFilterInput(value: Boolean): this.type = set("hideFilterInput", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def noDataText(value: String): this.type = set("noDataText", value.asInstanceOf[js.Any])
    
    inline def onFilter(value: /* text */ String => Callback): this.type = set("onFilter", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def pageButtonLimit(value: Double): this.type = set("pageButtonLimit", value.asInstanceOf[js.Any])
    
    inline def sortBy(value: Boolean): this.type = set("sortBy", value.asInstanceOf[js.Any])
    
    inline def sortable(value: js.Array[String] | Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    
    inline def sortableVarargs(value: String*): this.type = set("sortable", js.Array(value*))
  }
  
  implicit def make[T](companion: Table.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: TableComponentProperties[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
