package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.DropDownList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropDownList extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DropDownList
}
object TypeofDropDownList {
  
  inline def apply(Locale: Any, fn: DropDownList): TypeofDropDownList = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownList]
  }
  
  extension [Self <: TypeofDropDownList](x: Self) {
    
    inline def setFn(value: DropDownList): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
