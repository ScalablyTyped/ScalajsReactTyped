package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Uploadbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUploadbox extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Uploadbox
}
object TypeofUploadbox {
  
  inline def apply(Locale: Any, fn: Uploadbox): TypeofUploadbox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUploadbox]
  }
  
  extension [Self <: TypeofUploadbox](x: Self) {
    
    inline def setFn(value: Uploadbox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
