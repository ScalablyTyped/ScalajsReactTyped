package typingsJapgolly.reactabularSticky.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactabularSticky.anon.PartialUIEvent
import typingsJapgolly.reactabularSticky.mod.StickyHeaderProps
import typingsJapgolly.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.Column
import typingsJapgolly.reactabularTable.mod.HeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("reactabular-sticky", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactabularSticky.mod.Header] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def headerRows(value: js.Array[Column]): this.type = set("headerRows", value.asInstanceOf[js.Any])
    
    inline def headerRowsVarargs(value: Column*): this.type = set("headerRows", js.Array(value*))
    
    inline def onScroll(value: /* e */ PartialUIEvent => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* e */ PartialUIEvent) => value(t0).runNow()))
    
    inline def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tableBody(value: HTMLElement): this.type = set("tableBody", value.asInstanceOf[js.Any])
    
    inline def tableBodyNull: this.type = set("tableBody", null)
  }
  
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StickyHeaderProps & HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
