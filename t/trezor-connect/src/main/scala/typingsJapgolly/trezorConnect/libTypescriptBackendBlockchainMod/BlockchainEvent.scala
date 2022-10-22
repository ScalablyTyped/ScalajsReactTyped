package typingsJapgolly.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.Payload
  - typingsJapgolly.trezorConnect.anon.PayloadType
  - typingsJapgolly.trezorConnect.anon.PayloadBlockchainBlock
  - typingsJapgolly.trezorConnect.anon.PayloadBlockchainNotification
  - typingsJapgolly.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate
*/
trait BlockchainEvent extends StObject
object BlockchainEvent {
  
  inline def Payload(payload: BlockchainInfo, `type`: /* "blockchain-connect" */ String): typingsJapgolly.trezorConnect.anon.Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Payload]
  }
  
  inline def PayloadBlockchainBlock(payload: BlockchainBlock, `type`: /* "blockchain-block" */ String): typingsJapgolly.trezorConnect.anon.PayloadBlockchainBlock = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadBlockchainBlock]
  }
  
  inline def PayloadBlockchainFiatRatesUpdate(payload: BlockchainFiatRatesUpdate, `type`: /* "fiat-rates-update" */ String): typingsJapgolly.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadBlockchainFiatRatesUpdate]
  }
  
  inline def PayloadBlockchainNotification(payload: BlockchainNotification, `type`: /* "blockchain-notification" */ String): typingsJapgolly.trezorConnect.anon.PayloadBlockchainNotification = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadBlockchainNotification]
  }
  
  inline def PayloadType(payload: BlockchainError, `type`: /* "blockchain-error" */ String): typingsJapgolly.trezorConnect.anon.PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadType]
  }
}
