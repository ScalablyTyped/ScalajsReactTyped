package typingsJapgolly.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdFieldName extends StObject {
  
  var idFieldName: js.UndefOr[String] = js.undefined
  
  var ignoredFieldNames: js.UndefOr[js.Array[String]] = js.undefined
}
object IdFieldName {
  
  inline def apply(): IdFieldName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFieldName]
  }
  
  extension [Self <: IdFieldName](x: Self) {
    
    inline def setIdFieldName(value: String): Self = StObject.set(x, "idFieldName", value.asInstanceOf[js.Any])
    
    inline def setIdFieldNameUndefined: Self = StObject.set(x, "idFieldName", js.undefined)
    
    inline def setIgnoredFieldNames(value: js.Array[String]): Self = StObject.set(x, "ignoredFieldNames", value.asInstanceOf[js.Any])
    
    inline def setIgnoredFieldNamesUndefined: Self = StObject.set(x, "ignoredFieldNames", js.undefined)
    
    inline def setIgnoredFieldNamesVarargs(value: String*): Self = StObject.set(x, "ignoredFieldNames", js.Array(value*))
  }
}
