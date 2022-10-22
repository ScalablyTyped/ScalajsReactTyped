package typingsJapgolly.reactabularTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.anon.RowIndex
import typingsJapgolly.reactabularTable.mod.BodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  inline def apply(rowKey: String, rows: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BodyProps]))
  }
  
  @JSImport("reactabular-table", "Body")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactabularTable.mod.Body] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onRow(value: (/* row */ Any, /* props */ RowIndex) => Any): this.type = set("onRow", js.Any.fromFunction2(value))
    
    inline def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
