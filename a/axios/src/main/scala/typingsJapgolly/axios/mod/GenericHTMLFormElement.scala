package typingsJapgolly.axios.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericHTMLFormElement extends StObject {
  
  var method: String
  
  var name: String
  
  def submit(): Unit
}
object GenericHTMLFormElement {
  
  inline def apply(method: String, name: String, submit: Callback): GenericHTMLFormElement = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], submit = submit.toJsFn)
    __obj.asInstanceOf[GenericHTMLFormElement]
  }
  
  extension [Self <: GenericHTMLFormElement](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "submit", value.toJsFn)
  }
}
