package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkflowResponse extends StObject {
  
  /**
    * Name of the workflow specified in input.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object DeleteWorkflowResponse {
  
  inline def apply(): DeleteWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkflowResponse]
  }
  
  extension [Self <: DeleteWorkflowResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
