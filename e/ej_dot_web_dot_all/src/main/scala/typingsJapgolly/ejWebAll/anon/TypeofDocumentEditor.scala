package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.DocumentEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDocumentEditor extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DocumentEditor
}
object TypeofDocumentEditor {
  
  inline def apply(Locale: Any, fn: DocumentEditor): TypeofDocumentEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDocumentEditor]
  }
  
  extension [Self <: TypeofDocumentEditor](x: Self) {
    
    inline def setFn(value: DocumentEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
