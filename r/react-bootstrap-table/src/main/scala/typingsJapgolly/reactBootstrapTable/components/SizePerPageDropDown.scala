package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable.anon.Value
import typingsJapgolly.reactBootstrapTable.mod.DropDirection
import typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizePerPageDropDown {
  
  @JSImport("react-bootstrap-table", "SizePerPageDropDown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDown] {
    
    inline def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def currSizePerPage(value: String): this.type = set("currSizePerPage", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* toggleDropDown */ js.Function0[Unit] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* toggleDropDown */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def options(value: js.Array[Double | Value]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: (Double | Value)*): this.type = set("options", js.Array(value*))
    
    inline def variation(value: DropDirection): this.type = set("variation", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SizePerPageDropDown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizePerPageDropDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
