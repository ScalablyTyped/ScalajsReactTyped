package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Resizable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofResizable extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Resizable
}
object TypeofResizable {
  
  inline def apply(Locale: Any, fn: Resizable): TypeofResizable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofResizable]
  }
  
  extension [Self <: TypeofResizable](x: Self) {
    
    inline def setFn(value: Resizable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
