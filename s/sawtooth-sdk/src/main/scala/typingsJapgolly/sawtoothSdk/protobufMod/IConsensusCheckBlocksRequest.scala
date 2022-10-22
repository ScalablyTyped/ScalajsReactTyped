package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusCheckBlocksRequest extends StObject {
  
  /** ConsensusCheckBlocksRequest blockIds */
  var blockIds: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
}
object IConsensusCheckBlocksRequest {
  
  inline def apply(): IConsensusCheckBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksRequest]
  }
  
  extension [Self <: IConsensusCheckBlocksRequest](x: Self) {
    
    inline def setBlockIds(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    inline def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    inline def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    inline def setBlockIdsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "blockIds", js.Array(value*))
  }
}
