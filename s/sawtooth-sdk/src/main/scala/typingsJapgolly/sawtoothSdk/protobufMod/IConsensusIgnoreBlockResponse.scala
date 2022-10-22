package typingsJapgolly.sawtoothSdk.protobufMod

import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusIgnoreBlockResponse extends StObject {
  
  /** ConsensusIgnoreBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusIgnoreBlockResponse {
  
  inline def apply(): IConsensusIgnoreBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusIgnoreBlockResponse]
  }
  
  extension [Self <: IConsensusIgnoreBlockResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
