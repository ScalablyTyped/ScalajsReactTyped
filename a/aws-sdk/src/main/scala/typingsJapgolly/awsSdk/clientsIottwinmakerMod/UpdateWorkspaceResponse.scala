package typingsJapgolly.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceResponse extends StObject {
  
  /**
    * The date and time of the current update.
    */
  var updateDateTime: js.Date
}
object UpdateWorkspaceResponse {
  
  inline def apply(updateDateTime: js.Date): UpdateWorkspaceResponse = {
    val __obj = js.Dynamic.literal(updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceResponse]
  }
  
  extension [Self <: UpdateWorkspaceResponse](x: Self) {
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
