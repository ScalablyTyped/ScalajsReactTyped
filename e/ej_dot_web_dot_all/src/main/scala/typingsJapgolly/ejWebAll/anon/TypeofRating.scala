package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRating extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Rating
}
object TypeofRating {
  
  inline def apply(Locale: Any, fn: Rating): TypeofRating = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRating]
  }
  
  extension [Self <: TypeofRating](x: Self) {
    
    inline def setFn(value: Rating): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
