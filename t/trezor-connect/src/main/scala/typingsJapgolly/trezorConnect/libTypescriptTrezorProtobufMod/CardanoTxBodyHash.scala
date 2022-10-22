package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxBodyHash extends StObject {
  
  var tx_hash: String
}
object CardanoTxBodyHash {
  
  inline def apply(tx_hash: String): CardanoTxBodyHash = {
    val __obj = js.Dynamic.literal(tx_hash = tx_hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxBodyHash]
  }
  
  extension [Self <: CardanoTxBodyHash](x: Self) {
    
    inline def setTx_hash(value: String): Self = StObject.set(x, "tx_hash", value.asInstanceOf[js.Any])
  }
}
