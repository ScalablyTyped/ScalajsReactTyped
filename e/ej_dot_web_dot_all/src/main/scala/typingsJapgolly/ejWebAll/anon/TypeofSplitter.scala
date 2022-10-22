package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Splitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitter extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Splitter
}
object TypeofSplitter {
  
  inline def apply(Locale: Any, fn: Splitter): TypeofSplitter = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitter]
  }
  
  extension [Self <: TypeofSplitter](x: Self) {
    
    inline def setFn(value: Splitter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
