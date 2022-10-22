package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.PivotClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotClient extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotClient
}
object TypeofPivotClient {
  
  inline def apply(Locale: Any, fn: PivotClient): TypeofPivotClient = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotClient]
  }
  
  extension [Self <: TypeofPivotClient](x: Self) {
    
    inline def setFn(value: PivotClient): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
