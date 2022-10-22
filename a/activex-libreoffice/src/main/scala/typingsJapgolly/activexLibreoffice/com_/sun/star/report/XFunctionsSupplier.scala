package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the functions supplier which are located in a report definition or a group. */
trait XFunctionsSupplier extends StObject {
  
  /** access to the functions */
  var Functions: XFunctions
}
object XFunctionsSupplier {
  
  inline def apply(Functions: XFunctions): XFunctionsSupplier = {
    val __obj = js.Dynamic.literal(Functions = Functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[XFunctionsSupplier]
  }
  
  extension [Self <: XFunctionsSupplier](x: Self) {
    
    inline def setFunctions(value: XFunctions): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
  }
}
