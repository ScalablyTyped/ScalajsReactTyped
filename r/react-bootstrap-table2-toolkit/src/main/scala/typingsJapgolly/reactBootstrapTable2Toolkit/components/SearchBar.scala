package typingsJapgolly.reactBootstrapTable2Toolkit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.SearchBarProps
import typingsJapgolly.reactBootstrapTableNext.anon.Column
import typingsJapgolly.reactBootstrapTableNext.mod.SearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBar {
  
  @JSImport("react-bootstrap-table2-toolkit", "Search.SearchBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[Component[SearchProps[Any] & js.Object, js.Object]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSearch(value: String): this.type = set("defaultSearch", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onColumnMatch(value: /* searchProps */ Column[Any] => Boolean): this.type = set("onColumnMatch", js.Any.fromFunction1(value))
    
    inline def onSearch(value: /* searchText */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* searchText */ String) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tableId(value: String): this.type = set("tableId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchBarProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
