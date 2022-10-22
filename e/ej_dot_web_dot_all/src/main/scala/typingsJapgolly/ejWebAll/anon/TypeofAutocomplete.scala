package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Autocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAutocomplete extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Autocomplete
}
object TypeofAutocomplete {
  
  inline def apply(Locale: Any, fn: Autocomplete): TypeofAutocomplete = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAutocomplete]
  }
  
  extension [Self <: TypeofAutocomplete](x: Self) {
    
    inline def setFn(value: Autocomplete): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
