package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable.mod.InsertModalFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertModalFooter {
  
  @JSImport("react-bootstrap-table", "InsertModalFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.InsertModalFooter] {
    
    inline def beforeClose(value: /* e */ ReactEventFrom[Any & Element] => Callback): this.type = set("beforeClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def beforeSave(value: /* e */ ReactEventFrom[Any & Element] => Callback): this.type = set("beforeSave", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeBtnClass(value: String): this.type = set("closeBtnClass", value.asInstanceOf[js.Any])
    
    inline def closeBtnContextual(value: String): this.type = set("closeBtnContextual", value.asInstanceOf[js.Any])
    
    inline def closeBtnText(value: String): this.type = set("closeBtnText", value.asInstanceOf[js.Any])
    
    inline def onModalClose(value: /* closeModal */ js.Function0[Unit] => Callback): this.type = set("onModalClose", js.Any.fromFunction1((t0: /* closeModal */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def onSave(value: /* save */ js.Function0[Unit] => Callback): this.type = set("onSave", js.Any.fromFunction1((t0: /* save */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def saveBtnClass(value: String): this.type = set("saveBtnClass", value.asInstanceOf[js.Any])
    
    inline def saveBtnContextual(value: String): this.type = set("saveBtnContextual", value.asInstanceOf[js.Any])
    
    inline def saveBtnText(value: String): this.type = set("saveBtnText", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InsertModalFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InsertModalFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
