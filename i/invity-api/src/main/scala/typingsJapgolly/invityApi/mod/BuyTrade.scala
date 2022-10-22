package typingsJapgolly.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTrade extends StObject {
  
  // timestamp in ISO format of offer validity
  var cid: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.undefined
  
  // hash of tx from exchange to user
  var exchange: js.UndefOr[String] = js.undefined
  
  var fiatAmount: js.UndefOr[Double] = js.undefined
  
  // 1000 - will pay fiat amount
  var fiatCurrency: js.UndefOr[String] = js.undefined
  
  // 1000 - DEPRECATED, used only for TREZOR
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  // arbitrary data specific for the partner
  var id: js.UndefOr[String] = js.undefined
  
  var infoNote: js.UndefOr[String] = js.undefined
  
  var maxCrypto: js.UndefOr[Double] = js.undefined
  
  var maxFiat: js.UndefOr[Double] = js.undefined
  
  var minCrypto: js.UndefOr[Double] = js.undefined
  
  // google clientID
  var minFiat: js.UndefOr[Double] = js.undefined
  
  // ID of the quote assigned by exchange
  var orderId: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by us or by partner
  var originalPaymentId: js.UndefOr[String] = js.undefined
  
  var partnerData: js.UndefOr[String] = js.undefined
  
  // arbitrary data specific for the partner
  var partnerData2: js.UndefOr[String] = js.undefined
  
  // ID of the order assigned by us
  var paymentId: js.UndefOr[String] = js.undefined
  
  var paymentMethod: js.UndefOr[BuyCryptoPaymentMethod] = js.undefined
  
  // 100
  var quoteId: js.UndefOr[String] = js.undefined
  
  // Extra ID for receive tx to exchange for networks that require it (destinationTag)
  var rate: js.UndefOr[Double] = js.undefined
  
  // 0.12345
  var receiveAddress: js.UndefOr[String] = js.undefined
  
  // users address for receive tx
  var receiveAddressExtraId: js.UndefOr[String] = js.undefined
  
  // BTC
  var receiveAmount: js.UndefOr[Double] = js.undefined
  
  // EUR
  var receiveCurrency: js.UndefOr[String] = js.undefined
  
  // 0.12345 - DEPRECATED, used only for TREZOR
  var receiveStringAmount: js.UndefOr[String] = js.undefined
  
  // something went wrong after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by us and later changed by the partner
  var status: js.UndefOr[BuyTradeStatus] = js.undefined
  
  var tags: js.UndefOr[js.Array[BuyTradeTag]] = js.undefined
  
  // internal DB id
  // locally used data types
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.undefined
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var validUntil: js.UndefOr[String] = js.undefined
  
  // CZ
  var wantCrypto: js.UndefOr[Boolean] = js.undefined
}
object BuyTrade {
  
  inline def apply(): BuyTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyTrade]
  }
  
  extension [Self <: BuyTrade](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setFiatAmount(value: Double): Self = StObject.set(x, "fiatAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatAmountUndefined: Self = StObject.set(x, "fiatAmount", js.undefined)
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrencyUndefined: Self = StObject.set(x, "fiatCurrency", js.undefined)
    
    inline def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInfoNote(value: String): Self = StObject.set(x, "infoNote", value.asInstanceOf[js.Any])
    
    inline def setInfoNoteUndefined: Self = StObject.set(x, "infoNote", js.undefined)
    
    inline def setMaxCrypto(value: Double): Self = StObject.set(x, "maxCrypto", value.asInstanceOf[js.Any])
    
    inline def setMaxCryptoUndefined: Self = StObject.set(x, "maxCrypto", js.undefined)
    
    inline def setMaxFiat(value: Double): Self = StObject.set(x, "maxFiat", value.asInstanceOf[js.Any])
    
    inline def setMaxFiatUndefined: Self = StObject.set(x, "maxFiat", js.undefined)
    
    inline def setMinCrypto(value: Double): Self = StObject.set(x, "minCrypto", value.asInstanceOf[js.Any])
    
    inline def setMinCryptoUndefined: Self = StObject.set(x, "minCrypto", js.undefined)
    
    inline def setMinFiat(value: Double): Self = StObject.set(x, "minFiat", value.asInstanceOf[js.Any])
    
    inline def setMinFiatUndefined: Self = StObject.set(x, "minFiat", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setOriginalPaymentId(value: String): Self = StObject.set(x, "originalPaymentId", value.asInstanceOf[js.Any])
    
    inline def setOriginalPaymentIdUndefined: Self = StObject.set(x, "originalPaymentId", js.undefined)
    
    inline def setPartnerData(value: String): Self = StObject.set(x, "partnerData", value.asInstanceOf[js.Any])
    
    inline def setPartnerData2(value: String): Self = StObject.set(x, "partnerData2", value.asInstanceOf[js.Any])
    
    inline def setPartnerData2Undefined: Self = StObject.set(x, "partnerData2", js.undefined)
    
    inline def setPartnerDataUndefined: Self = StObject.set(x, "partnerData", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setPaymentMethod(value: BuyCryptoPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setQuoteId(value: String): Self = StObject.set(x, "quoteId", value.asInstanceOf[js.Any])
    
    inline def setQuoteIdUndefined: Self = StObject.set(x, "quoteId", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiveAddressExtraId(value: String): Self = StObject.set(x, "receiveAddressExtraId", value.asInstanceOf[js.Any])
    
    inline def setReceiveAddressExtraIdUndefined: Self = StObject.set(x, "receiveAddressExtraId", js.undefined)
    
    inline def setReceiveAddressUndefined: Self = StObject.set(x, "receiveAddress", js.undefined)
    
    inline def setReceiveAmount(value: Double): Self = StObject.set(x, "receiveAmount", value.asInstanceOf[js.Any])
    
    inline def setReceiveAmountUndefined: Self = StObject.set(x, "receiveAmount", js.undefined)
    
    inline def setReceiveCurrency(value: String): Self = StObject.set(x, "receiveCurrency", value.asInstanceOf[js.Any])
    
    inline def setReceiveCurrencyUndefined: Self = StObject.set(x, "receiveCurrency", js.undefined)
    
    inline def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    inline def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    inline def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    inline def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    inline def setStatus(value: BuyTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: js.Array[BuyTradeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: BuyTradeTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTradeForm(value: BuyTradeFormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
    
    inline def setTradeFormUndefined: Self = StObject.set(x, "tradeForm", js.undefined)
    
    inline def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
    
    inline def setWantCrypto(value: Boolean): Self = StObject.set(x, "wantCrypto", value.asInstanceOf[js.Any])
    
    inline def setWantCryptoUndefined: Self = StObject.set(x, "wantCrypto", js.undefined)
  }
}
