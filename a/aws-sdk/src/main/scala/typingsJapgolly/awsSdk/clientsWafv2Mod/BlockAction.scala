package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockAction extends StObject {
  
  /**
    * Defines a custom response for the web request. For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide. 
    */
  var CustomResponse: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.CustomResponse] = js.undefined
}
object BlockAction {
  
  inline def apply(): BlockAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockAction]
  }
  
  extension [Self <: BlockAction](x: Self) {
    
    inline def setCustomResponse(value: CustomResponse): Self = StObject.set(x, "CustomResponse", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseUndefined: Self = StObject.set(x, "CustomResponse", js.undefined)
  }
}
