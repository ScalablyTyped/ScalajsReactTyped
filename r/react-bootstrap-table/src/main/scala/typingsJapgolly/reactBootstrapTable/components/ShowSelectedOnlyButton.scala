package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable.mod.ShowSelectedButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowSelectedOnlyButton {
  
  @JSImport("react-bootstrap-table", "ShowSelectedOnlyButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.ShowSelectedOnlyButton] {
    
    inline def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
    
    inline def btnGlyphicon(value: String): this.type = set("btnGlyphicon", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def showAllText(value: String): this.type = set("showAllText", value.asInstanceOf[js.Any])
    
    inline def showOnlySelectText(value: String): this.type = set("showOnlySelectText", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ShowSelectedOnlyButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ShowSelectedButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
