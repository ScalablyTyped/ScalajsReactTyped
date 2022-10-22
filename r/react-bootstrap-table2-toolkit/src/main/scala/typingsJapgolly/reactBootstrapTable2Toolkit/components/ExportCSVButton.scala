package typingsJapgolly.reactBootstrapTable2Toolkit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable2Toolkit.mod.ExportCSVButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExportCSVButton {
  
  inline def apply(onExport: Callback): Builder = {
    val __props = js.Dynamic.literal(onExport = onExport.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ExportCSVButtonProps]))
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "CSVExport.ExportCSVButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ExportCSVButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
