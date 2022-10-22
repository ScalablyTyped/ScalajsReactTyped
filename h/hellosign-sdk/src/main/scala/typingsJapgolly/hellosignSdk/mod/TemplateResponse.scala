package typingsJapgolly.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateResponse
  extends StObject
     with BaseResponse {
  
  var template: Template[StringDictionary[Any]]
}
object TemplateResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders, template: Template[StringDictionary[Any]]): TemplateResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateResponse]
  }
  
  extension [Self <: TemplateResponse](x: Self) {
    
    inline def setTemplate(value: Template[StringDictionary[Any]]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
