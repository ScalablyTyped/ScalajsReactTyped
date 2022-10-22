package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.PivotSchemaDesigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotSchemaDesigner extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PivotSchemaDesigner
}
object TypeofPivotSchemaDesigner {
  
  inline def apply(Locale: Any, fn: PivotSchemaDesigner): TypeofPivotSchemaDesigner = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotSchemaDesigner]
  }
  
  extension [Self <: TypeofPivotSchemaDesigner](x: Self) {
    
    inline def setFn(value: PivotSchemaDesigner): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
