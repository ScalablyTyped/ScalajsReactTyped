package typingsJapgolly.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var lang: String
}
object GetScriptParams {
  
  inline def apply(id: String, lang: String): GetScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptParams]
  }
  
  extension [Self <: GetScriptParams](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
