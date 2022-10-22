package typingsJapgolly.reactBootstrapTable2Toolkit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.ClearSearchButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearSearchButton {
  
  @JSImport("react-bootstrap-table2-toolkit", "Search.ClearSearchButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ClearSearchButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClearSearchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
