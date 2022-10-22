package typingsJapgolly.jquerySoap

import typingsJapgolly.jquery.JQueryXHR
import typingsJapgolly.jquerySoap.JQuerySOAP.Options
import typingsJapgolly.jquerySoap.JQuerySOAP.SOAP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def soap(): JQueryXHR
  def soap(options: Options): JQueryXHR
  @JSName("soap")
  var soap_Original: SOAP
}
object JQueryStatic {
  
  inline def apply(soap: /* options */ js.UndefOr[Options] => JQueryXHR): JQueryStatic = {
    val __obj = js.Dynamic.literal(soap = js.Any.fromFunction1(soap))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setSoap(value: /* options */ js.UndefOr[Options] => JQueryXHR): Self = StObject.set(x, "soap", js.Any.fromFunction1(value))
  }
}
