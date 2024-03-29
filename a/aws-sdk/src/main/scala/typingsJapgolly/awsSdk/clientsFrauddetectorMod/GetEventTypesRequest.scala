package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventTypesRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[eventTypesMaxResults] = js.undefined
  
  /**
    * The name.
    */
  var name: js.UndefOr[identifier] = js.undefined
  
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetEventTypesRequest {
  
  inline def apply(): GetEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventTypesRequest]
  }
  
  extension [Self <: GetEventTypesRequest](x: Self) {
    
    inline def setMaxResults(value: eventTypesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
