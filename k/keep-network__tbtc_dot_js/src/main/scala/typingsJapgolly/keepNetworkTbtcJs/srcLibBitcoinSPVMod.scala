package typingsJapgolly.keepNetworkTbtcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibBitcoinSPVMod {
  
  @JSImport("@keep-network/tbtc.js/src/lib/BitcoinSPV", "BitcoinSPV")
  @js.native
  open class BitcoinSPV protected () extends StObject {
    def this(electrumClient: Any) = this()
    
    var client: Any = js.native
    
    def getTransactionProof(txHash: String, confirmations: Double): Proof = js.native
    
    def verifyMerkleProof(proofHex: String, txHash: String, index: Double, blockHeight: Double): Boolean = js.native
  }
  
  trait Proof extends StObject {
    
    var chainHeaders: String
    
    var merkleProof: String
    
    var tx: String
    
    var txInBlockIndex: String
  }
  object Proof {
    
    inline def apply(chainHeaders: String, merkleProof: String, tx: String, txInBlockIndex: String): Proof = {
      val __obj = js.Dynamic.literal(chainHeaders = chainHeaders.asInstanceOf[js.Any], merkleProof = merkleProof.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], txInBlockIndex = txInBlockIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proof]
    }
    
    extension [Self <: Proof](x: Self) {
      
      inline def setChainHeaders(value: String): Self = StObject.set(x, "chainHeaders", value.asInstanceOf[js.Any])
      
      inline def setMerkleProof(value: String): Self = StObject.set(x, "merkleProof", value.asInstanceOf[js.Any])
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTxInBlockIndex(value: String): Self = StObject.set(x, "txInBlockIndex", value.asInstanceOf[js.Any])
    }
  }
}
