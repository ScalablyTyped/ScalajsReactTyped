package typingsJapgolly.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var operationId: js.UndefOr[String] = js.undefined
  
  var operationRef: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var requestBody: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var server: js.UndefOr[Server] = js.undefined
}
object Link {
  
  inline def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOperationRef(value: String): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
    
    inline def setOperationRefUndefined: Self = StObject.set(x, "operationRef", js.undefined)
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRequestBody(value: StringDictionary[Any]): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
