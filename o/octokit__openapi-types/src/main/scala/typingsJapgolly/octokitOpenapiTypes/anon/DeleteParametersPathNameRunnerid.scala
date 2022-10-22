package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameRunnerid extends StObject {
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an enterprise. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathNameRunnerid
}
object DeleteParametersPathNameRunnerid {
  
  inline def apply(delete: ParametersPathNameRunnerid): DeleteParametersPathNameRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameRunnerid]
  }
  
  extension [Self <: DeleteParametersPathNameRunnerid](x: Self) {
    
    inline def setDelete(value: ParametersPathNameRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
