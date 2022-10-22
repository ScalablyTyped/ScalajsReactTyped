package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntentRequest extends StObject {
  
  /**
    * The name of the intent. The name is case sensitive. 
    */
  var name: IntentName
}
object DeleteIntentRequest {
  
  inline def apply(name: IntentName): DeleteIntentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntentRequest]
  }
  
  extension [Self <: DeleteIntentRequest](x: Self) {
    
    inline def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
