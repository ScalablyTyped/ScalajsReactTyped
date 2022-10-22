package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable.mod.BootstrapVersion
import typingsJapgolly.reactBootstrapTable.mod.InsertModalHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertModalHeader {
  
  @JSImport("react-bootstrap-table", "InsertModalHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.InsertModalHeader] {
    
    inline def beforeClose(value: /* e */ ReactEventFrom[Any & Element] => Callback): this.type = set("beforeClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def hideClose(value: Boolean): this.type = set("hideClose", value.asInstanceOf[js.Any])
    
    inline def onModalClose(value: /* closeModal */ js.Function0[Unit] => Callback): this.type = set("onModalClose", js.Any.fromFunction1((t0: /* closeModal */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def version(value: BootstrapVersion): this.type = set("version", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InsertModalHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InsertModalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
