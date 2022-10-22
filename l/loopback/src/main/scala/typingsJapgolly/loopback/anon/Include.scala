package typingsJapgolly.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Include extends StObject {
  
  var fields: js.UndefOr[String | Any | js.Array[Any]] = js.undefined
  
  var include: js.UndefOr[String | Any | js.Array[Any]] = js.undefined
}
object Include {
  
  inline def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  extension [Self <: Include](x: Self) {
    
    inline def setFields(value: String | Any | js.Array[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Any*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setInclude(value: String | Any | js.Array[Any]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: Any*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
