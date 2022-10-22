package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLensInput extends StObject {
  
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var LensAlias: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The status of the lens to be deleted.
    */
  var LensStatus: LensStatusType
}
object DeleteLensInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, LensAlias: LensAlias, LensStatus: LensStatusType): DeleteLensInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], LensAlias = LensAlias.asInstanceOf[js.Any], LensStatus = LensStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLensInput]
  }
  
  extension [Self <: DeleteLensInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensStatus(value: LensStatusType): Self = StObject.set(x, "LensStatus", value.asInstanceOf[js.Any])
  }
}
