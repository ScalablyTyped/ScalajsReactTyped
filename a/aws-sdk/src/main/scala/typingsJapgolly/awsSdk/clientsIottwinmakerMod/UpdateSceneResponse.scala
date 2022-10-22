package typingsJapgolly.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSceneResponse extends StObject {
  
  /**
    * The date and time when the scene was last updated.
    */
  var updateDateTime: js.Date
}
object UpdateSceneResponse {
  
  inline def apply(updateDateTime: js.Date): UpdateSceneResponse = {
    val __obj = js.Dynamic.literal(updateDateTime = updateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSceneResponse]
  }
  
  extension [Self <: UpdateSceneResponse](x: Self) {
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
  }
}
