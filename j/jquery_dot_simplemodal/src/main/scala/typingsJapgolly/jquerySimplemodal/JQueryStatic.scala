package typingsJapgolly.jquerySimplemodal

import typingsJapgolly.jquerySimplemodal.SimpleModal.SimpleModalOptions
import typingsJapgolly.jquerySimplemodal.SimpleModal.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def modal(element: JQuery): JQuery
  def modal(element: JQuery, options: SimpleModalOptions): JQuery
  def modal(html: String): JQuery
  def modal(html: String, options: SimpleModalOptions): JQuery
  @JSName("modal")
  var modal_Original: Static
}
object JQueryStatic {
  
  inline def apply(modal: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setModal(value: Static): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
  }
}
