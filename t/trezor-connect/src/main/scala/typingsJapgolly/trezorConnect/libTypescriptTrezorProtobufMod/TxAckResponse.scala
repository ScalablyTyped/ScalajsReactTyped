package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.InputsArray
  - typingsJapgolly.trezorConnect.anon.BinoutputsArray
  - typingsJapgolly.trezorConnect.anon.Outputs
  - typingsJapgolly.trezorConnect.anon.Extradata
  - typingsJapgolly.trezorConnect.anon.Expiry
*/
trait TxAckResponse extends StObject
object TxAckResponse {
  
  inline def BinoutputsArray(bin_outputs: js.Array[TxOutputBinType]): typingsJapgolly.trezorConnect.anon.BinoutputsArray = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.BinoutputsArray]
  }
  
  inline def Expiry(inputs_cnt: Double, outputs_cnt: Double): typingsJapgolly.trezorConnect.anon.Expiry = {
    val __obj = js.Dynamic.literal(inputs_cnt = inputs_cnt.asInstanceOf[js.Any], outputs_cnt = outputs_cnt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Expiry]
  }
  
  inline def Extradata(extra_data: String): typingsJapgolly.trezorConnect.anon.Extradata = {
    val __obj = js.Dynamic.literal(extra_data = extra_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Extradata]
  }
  
  inline def InputsArray(inputs: js.Array[TxInputType | PrevInput]): typingsJapgolly.trezorConnect.anon.InputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.InputsArray]
  }
  
  inline def Outputs(outputs: js.Array[TxOutputType]): typingsJapgolly.trezorConnect.anon.Outputs = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Outputs]
  }
}
