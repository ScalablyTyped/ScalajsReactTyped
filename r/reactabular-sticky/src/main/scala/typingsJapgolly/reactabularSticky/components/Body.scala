package typingsJapgolly.reactabularSticky.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactabularSticky.anon.PartialUIEvent
import typingsJapgolly.reactabularSticky.mod.StickyBodyProps
import typingsJapgolly.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.anon.RowIndex
import typingsJapgolly.reactabularTable.mod.BodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  inline def apply(rowKey: String, rows: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StickyBodyProps & BodyProps]))
  }
  
  @JSImport("reactabular-sticky", "Body")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactabularSticky.mod.Body] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onRow(value: (/* row */ Any, /* props */ RowIndex) => Any): this.type = set("onRow", js.Any.fromFunction2(value))
    
    inline def onScroll(value: /* e */ PartialUIEvent => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* e */ PartialUIEvent) => value(t0).runNow()))
    
    inline def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tableHeader(value: HTMLElement): this.type = set("tableHeader", value.asInstanceOf[js.Any])
    
    inline def tableHeaderNull: this.type = set("tableHeader", null)
  }
  
  def withProps(p: StickyBodyProps & BodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
