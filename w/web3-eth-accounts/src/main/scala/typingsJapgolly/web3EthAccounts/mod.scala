package typingsJapgolly.web3EthAccounts

import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.web3Core.mod.AccountsBase
import typingsJapgolly.web3Core.mod.SignedTransaction
import typingsJapgolly.web3Core.mod.WalletBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-accounts", "Accounts")
  @js.native
  open class Accounts () extends AccountsBase {
    def this(provider: typingsJapgolly.web3Core.mod.provider) = this()
    def this(provider: typingsJapgolly.web3Core.mod.provider, net: Socket) = this()
  }
  
  @JSImport("web3-eth-accounts", "Wallet")
  @js.native
  open class Wallet protected () extends WalletBase {
    def this(accounts: AccountsBase) = this()
  }
  
  trait Sign
    extends StObject
       with SignedTransaction {
    
    var message: String
    
    var signature: String
  }
  object Sign {
    
    inline def apply(message: String, r: String, s: String, signature: String, v: String): Sign = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sign]
    }
    
    extension [Self <: Sign](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignatureObject extends StObject {
    
    var messageHash: String
    
    var r: String
    
    var s: String
    
    var v: String
  }
  object SignatureObject {
    
    inline def apply(messageHash: String, r: String, s: String, v: String): SignatureObject = {
      val __obj = js.Dynamic.literal(messageHash = messageHash.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureObject]
    }
    
    extension [Self <: SignatureObject](x: Self) {
      
      inline def setMessageHash(value: String): Self = StObject.set(x, "messageHash", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
