package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateResponse extends StObject {
  
  var Template: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.Template] = js.undefined
}
object GetTemplateResponse {
  
  inline def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  
  extension [Self <: GetTemplateResponse](x: Self) {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
