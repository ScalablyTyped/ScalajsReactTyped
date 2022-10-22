package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  var blockHash: String | Null
  
  var blockNumber: Double | Null
  
  var from: String
  
  var gas: Double
  
  var gasPrice: default
  
  var hash: String
  
  var input: String
  
  var nonce: Double
  
  var to: String | Null
  
  var transactionIndex: Double | Null
  
  var value: default
}
object Transaction {
  
  inline def apply(
    from: String,
    gas: Double,
    gasPrice: default,
    hash: String,
    input: String,
    nonce: Double,
    value: default
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], blockHash = null, blockNumber = null, to = null, transactionIndex = null)
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
    
    inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    inline def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: default): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    
    inline def setTransactionIndexNull: Self = StObject.set(x, "transactionIndex", null)
    
    inline def setValue(value: default): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
