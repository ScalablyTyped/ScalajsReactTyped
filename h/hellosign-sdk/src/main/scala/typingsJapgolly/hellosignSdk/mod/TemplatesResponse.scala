package typingsJapgolly.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hellosignSdk.anon.Numpages
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesResponse
  extends StObject
     with BaseResponse
     with ListInfo {
  
  var templates: js.Array[Template[StringDictionary[Any]]]
}
object TemplatesResponse {
  
  inline def apply(
    list_info: Numpages,
    resHeaders: IncomingHttpHeaders,
    templates: js.Array[Template[StringDictionary[Any]]]
  ): TemplatesResponse = {
    val __obj = js.Dynamic.literal(list_info = list_info.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesResponse]
  }
  
  extension [Self <: TemplatesResponse](x: Self) {
    
    inline def setTemplates(value: js.Array[Template[StringDictionary[Any]]]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesVarargs(value: Template[StringDictionary[Any]]*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
