package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputBinType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinoutputsArray
  extends StObject
     with TxAckResponse {
  
  var bin_outputs: js.Array[TxOutputBinType]
}
object BinoutputsArray {
  
  inline def apply(bin_outputs: js.Array[TxOutputBinType]): BinoutputsArray = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinoutputsArray]
  }
  
  extension [Self <: BinoutputsArray](x: Self) {
    
    inline def setBin_outputs(value: js.Array[TxOutputBinType]): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    inline def setBin_outputsVarargs(value: TxOutputBinType*): Self = StObject.set(x, "bin_outputs", js.Array(value*))
  }
}
