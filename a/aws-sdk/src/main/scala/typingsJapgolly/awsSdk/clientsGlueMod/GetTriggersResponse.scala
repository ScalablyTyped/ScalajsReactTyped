package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggersResponse extends StObject {
  
  /**
    * A continuation token, if not all the requested triggers have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of triggers for the specified job.
    */
  var Triggers: js.UndefOr[TriggerList] = js.undefined
}
object GetTriggersResponse {
  
  inline def apply(): GetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersResponse]
  }
  
  extension [Self <: GetTriggersResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTriggers(value: TriggerList): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "Triggers", js.undefined)
    
    inline def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "Triggers", js.Array(value*))
  }
}
