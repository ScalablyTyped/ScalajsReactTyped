package typingsJapgolly.coinbaseCommerceNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.applicationSlashjson
import typingsJapgolly.coinbaseCommerceNode.mod.CryptoCurrency
import typingsJapgolly.coinbaseCommerceNode.mod.CryptoName
import typingsJapgolly.coinbaseCommerceNode.mod.FiatCurrency
import typingsJapgolly.coinbaseCommerceNode.mod.PaymentStatus
import typingsJapgolly.coinbaseCommerceNode.mod.Price
import typingsJapgolly.coinbaseCommerceNode.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Block extends StObject {
    
    var block: Confirmationsaccumulated
    
    var network: CryptoName
    
    var status: PaymentStatus
    
    var transaction_id: String
    
    var value: Crypto
  }
  object Block {
    
    inline def apply(
      block: Confirmationsaccumulated,
      network: CryptoName,
      status: PaymentStatus,
      transaction_id: String,
      value: Crypto
    ): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setBlock(value: Confirmationsaccumulated): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: CryptoName): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Crypto): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Confirmationsaccumulated extends StObject {
    
    var confirmations_accumulated: Double
    
    var confirmations_required: Double
    
    var hash: String
    
    var height: Double
  }
  object Confirmationsaccumulated {
    
    inline def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): Confirmationsaccumulated = {
      val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated.asInstanceOf[js.Any], confirmations_required = confirmations_required.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confirmationsaccumulated]
    }
    
    extension [Self <: Confirmationsaccumulated](x: Self) {
      
      inline def setConfirmations_accumulated(value: Double): Self = StObject.set(x, "confirmations_accumulated", value.asInstanceOf[js.Any])
      
      inline def setConfirmations_required(value: Double): Self = StObject.set(x, "confirmations_required", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    /**
      * Timeline entry context.
      */
    var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.undefined
    
    /**
      * Timeline entry status.
      */
    var status: PaymentStatus
    
    /**
      * Timeline entry timestamp.
      */
    var time: Timestamp
  }
  object Context {
    
    inline def apply(status: PaymentStatus, time: Timestamp): Context = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Crypto extends StObject {
    
    var crypto: Price[CryptoCurrency]
    
    var local: Price[FiatCurrency]
  }
  object Crypto {
    
    inline def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Crypto = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crypto]
    }
    
    extension [Self <: Crypto](x: Self) {
      
      inline def setCrypto(value: Price[CryptoCurrency]): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Price[FiatCurrency]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Accept: applicationSlashjson
    
    var `Content-Type`: applicationSlashjson
    
    var `User-Agent`: String
    
    var `X-CC-Api-Key`: String
    
    var `X-CC-Version`: String
  }
  object Dictkey {
    
    inline def apply(`User-Agent`: String, `X-CC-Api-Key`: String, `X-CC-Version`: String): Dictkey = {
      val __obj = js.Dynamic.literal(Accept = "application/json")
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
      __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`.asInstanceOf[js.Any])
      __obj.updateDynamic("X-CC-Version")(`X-CC-Version`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setAccept(value: applicationSlashjson): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      inline def `setContent-Type`(value: applicationSlashjson): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
      
      inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
      
      inline def `setX-CC-Api-Key`(value: String): Self = StObject.set(x, "X-CC-Api-Key", value.asInstanceOf[js.Any])
      
      inline def `setX-CC-Version`(value: String): Self = StObject.set(x, "X-CC-Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<coinbase-commerce-node.coinbase-commerce-node.CryptoName, string>> */
  trait PartialRecordCryptoNamest extends StObject {
    
    var bitcoin: js.UndefOr[String] = js.undefined
    
    var bitcoincash: js.UndefOr[String] = js.undefined
    
    var ethereum: js.UndefOr[String] = js.undefined
    
    var litecoin: js.UndefOr[String] = js.undefined
    
    var usdc: js.UndefOr[String] = js.undefined
  }
  object PartialRecordCryptoNamest {
    
    inline def apply(): PartialRecordCryptoNamest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCryptoNamest]
    }
    
    extension [Self <: PartialRecordCryptoNamest](x: Self) {
      
      inline def setBitcoin(value: String): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
      
      inline def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
      
      inline def setBitcoincash(value: String): Self = StObject.set(x, "bitcoincash", value.asInstanceOf[js.Any])
      
      inline def setBitcoincashUndefined: Self = StObject.set(x, "bitcoincash", js.undefined)
      
      inline def setEthereum(value: String): Self = StObject.set(x, "ethereum", value.asInstanceOf[js.Any])
      
      inline def setEthereumUndefined: Self = StObject.set(x, "ethereum", js.undefined)
      
      inline def setLitecoin(value: String): Self = StObject.set(x, "litecoin", value.asInstanceOf[js.Any])
      
      inline def setLitecoinUndefined: Self = StObject.set(x, "litecoin", js.undefined)
      
      inline def setUsdc(value: String): Self = StObject.set(x, "usdc", value.asInstanceOf[js.Any])
      
      inline def setUsdcUndefined: Self = StObject.set(x, "usdc", js.undefined)
    }
  }
}
