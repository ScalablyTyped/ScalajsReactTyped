package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertTemplateResponse extends StObject {
  
  /**
    * Template as it appears in the latest container version since the last workspace synchronization operation. If no template is present, that means the template was deleted in the
    * latest container version.
    */
  var template: js.UndefOr[CustomTemplate] = js.undefined
}
object RevertTemplateResponse {
  
  inline def apply(): RevertTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertTemplateResponse]
  }
  
  extension [Self <: RevertTemplateResponse](x: Self) {
    
    inline def setTemplate(value: CustomTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
