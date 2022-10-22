package typingsJapgolly.keepNetworkTbtcJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.keepNetworkTbtcJs.anon.AddWitnessSignature
import typingsJapgolly.keepNetworkTbtcJs.anon.MAINNET
import typingsJapgolly.keepNetworkTbtcJs.anon.PubKeyHashFrom
import typingsJapgolly.keepNetworkTbtcJs.srcLibBitcoinSPVMod.Proof
import typingsJapgolly.keepNetworkTbtcJs.srcLibElectrumClientMod.Config
import typingsJapgolly.keepNetworkTbtcJs.srcLibElectrumClientMod.default
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBitcoinHelpersMod {
  
  trait BitcoinHelpers extends StObject {
    
    var Address: PubKeyHashFrom
    
    var Network: MAINNET
    
    var Transaction: AddWitnessSignature
    
    var electrumConfig: Config | Null
    
    def publicKeyPointToPublicKeyString(publicKeyX: String, publicKeyY: String): String
    
    var satoshisPerBtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    
    def setElectrumConfig(newConfig: Config): Unit
    
    def signatureDER(r: String, s: String): Buffer
    
    def withElectrumClient[T](block: js.Function1[/* client */ default, js.Promise[T]]): js.Promise[T]
  }
  object BitcoinHelpers {
    
    inline def apply(
      Address: PubKeyHashFrom,
      Network: MAINNET,
      Transaction: AddWitnessSignature,
      publicKeyPointToPublicKeyString: (String, String) => String,
      satoshisPerBtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
      setElectrumConfig: Config => Callback,
      signatureDER: (String, String) => Buffer,
      withElectrumClient: js.Function1[/* client */ default, js.Promise[Any]] => js.Promise[Any]
    ): BitcoinHelpers = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any], publicKeyPointToPublicKeyString = js.Any.fromFunction2(publicKeyPointToPublicKeyString), satoshisPerBtc = satoshisPerBtc.asInstanceOf[js.Any], setElectrumConfig = js.Any.fromFunction1((t0: Config) => setElectrumConfig(t0).runNow()), signatureDER = js.Any.fromFunction2(signatureDER), withElectrumClient = js.Any.fromFunction1(withElectrumClient), electrumConfig = null)
      __obj.asInstanceOf[BitcoinHelpers]
    }
    
    extension [Self <: BitcoinHelpers](x: Self) {
      
      inline def setAddress(value: PubKeyHashFrom): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setElectrumConfig(value: Config): Self = StObject.set(x, "electrumConfig", value.asInstanceOf[js.Any])
      
      inline def setElectrumConfigNull: Self = StObject.set(x, "electrumConfig", null)
      
      inline def setNetwork(value: MAINNET): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyPointToPublicKeyString(value: (String, String) => String): Self = StObject.set(x, "publicKeyPointToPublicKeyString", js.Any.fromFunction2(value))
      
      inline def setSatoshisPerBtc(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Self = StObject.set(x, "satoshisPerBtc", value.asInstanceOf[js.Any])
      
      inline def setSetElectrumConfig(value: Config => Callback): Self = StObject.set(x, "setElectrumConfig", js.Any.fromFunction1((t0: Config) => value(t0).runNow()))
      
      inline def setSignatureDER(value: (String, String) => Buffer): Self = StObject.set(x, "signatureDER", js.Any.fromFunction2(value))
      
      inline def setTransaction(value: AddWitnessSignature): Self = StObject.set(x, "Transaction", value.asInstanceOf[js.Any])
      
      inline def setWithElectrumClient(value: js.Function1[/* client */ default, js.Promise[Any]] => js.Promise[Any]): Self = StObject.set(x, "withElectrumClient", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet
    - typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main
    - typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet
  */
  trait BitcoinNetworkType extends StObject
  object BitcoinNetworkType {
    
    inline def main: typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main = "main".asInstanceOf[typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main]
    
    inline def simnet: typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet = "simnet".asInstanceOf[typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet]
    
    inline def testnet: typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet = "testnet".asInstanceOf[typingsJapgolly.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet]
  }
  
  trait FoundTransaction extends StObject {
    
    var outputPosition: Double
    
    var transactionID: String
    
    var value: Double
  }
  object FoundTransaction {
    
    inline def apply(outputPosition: Double, transactionID: String, value: Double): FoundTransaction = {
      val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoundTransaction]
    }
    
    extension [Self <: FoundTransaction](x: Self) {
      
      inline def setOutputPosition(value: Double): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
      
      inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedTransaction extends StObject {
    
    var locktime: String
    
    var txInVector: String
    
    var txOutVector: String
    
    var version: String
  }
  object ParsedTransaction {
    
    inline def apply(locktime: String, txInVector: String, txOutVector: String, version: String): ParsedTransaction = {
      val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTransaction]
    }
    
    extension [Self <: ParsedTransaction](x: Self) {
      
      inline def setLocktime(value: String): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      inline def setTxInVector(value: String): Self = StObject.set(x, "txInVector", value.asInstanceOf[js.Any])
      
      inline def setTxOutVector(value: String): Self = StObject.set(x, "txOutVector", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SPVProof
    extends StObject
       with Proof {
    
    var parsedTransaction: ParsedTransaction
  }
  object SPVProof {
    
    inline def apply(
      chainHeaders: String,
      merkleProof: String,
      parsedTransaction: ParsedTransaction,
      tx: String,
      txInBlockIndex: String
    ): SPVProof = {
      val __obj = js.Dynamic.literal(chainHeaders = chainHeaders.asInstanceOf[js.Any], merkleProof = merkleProof.asInstanceOf[js.Any], parsedTransaction = parsedTransaction.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], txInBlockIndex = txInBlockIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SPVProof]
    }
    
    extension [Self <: SPVProof](x: Self) {
      
      inline def setParsedTransaction(value: ParsedTransaction): Self = StObject.set(x, "parsedTransaction", value.asInstanceOf[js.Any])
    }
  }
}
