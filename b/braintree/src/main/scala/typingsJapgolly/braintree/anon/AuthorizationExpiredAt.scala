package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.mod.EqualitySearchFn
import typingsJapgolly.braintree.mod.KeyValueSearchFn
import typingsJapgolly.braintree.mod.MultiValueSearchFn
import typingsJapgolly.braintree.mod.PartialMatchSearchFn
import typingsJapgolly.braintree.mod.RangeFieldSearchFn
import typingsJapgolly.braintree.mod.TextFieldSearchFn
import typingsJapgolly.braintree.mod.TransactionSource
import typingsJapgolly.braintree.mod.TransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationExpiredAt extends StObject {
  
  // range fields
  def amount(): Between[String]
  // range fields
  @JSName("amount")
  var amount_Original: RangeFieldSearchFn[String]
  
  def authorizationExpiredAt(): Between[js.Date]
  @JSName("authorizationExpiredAt")
  var authorizationExpiredAt_Original: RangeFieldSearchFn[js.Date]
  
  def authorizedAt(): Between[js.Date]
  @JSName("authorizedAt")
  var authorizedAt_Original: RangeFieldSearchFn[js.Date]
  
  // text fields https://github.com/braintree/braintree_node/blob/master/lib/braintree/transaction_search.js#L9
  def billingCompany(): Contains
  // text fields https://github.com/braintree/braintree_node/blob/master/lib/braintree/transaction_search.js#L9
  @JSName("billingCompany")
  var billingCompany_Original: TextFieldSearchFn
  
  def billingCountryName(): Contains
  @JSName("billingCountryName")
  var billingCountryName_Original: TextFieldSearchFn
  
  def billingExtendedAddress(): Contains
  @JSName("billingExtendedAddress")
  var billingExtendedAddress_Original: TextFieldSearchFn
  
  def billingFirstName(): Contains
  @JSName("billingFirstName")
  var billingFirstName_Original: TextFieldSearchFn
  
  def billingLastName(): Contains
  @JSName("billingLastName")
  var billingLastName_Original: TextFieldSearchFn
  
  def billingLocality(): Contains
  @JSName("billingLocality")
  var billingLocality_Original: TextFieldSearchFn
  
  def billingPostalCode(): Contains
  @JSName("billingPostalCode")
  var billingPostalCode_Original: TextFieldSearchFn
  
  def billingRegion(): Contains
  @JSName("billingRegion")
  var billingRegion_Original: TextFieldSearchFn
  
  def billingStreetAddress(): Contains
  @JSName("billingStreetAddress")
  var billingStreetAddress_Original: TextFieldSearchFn
  
  def createdAt(): Between[js.Date]
  @JSName("createdAt")
  var createdAt_Original: RangeFieldSearchFn[js.Date]
  
  def createdUsing(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
  ]
  @JSName("createdUsing")
  var createdUsing_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
  ]
  
  def creditCardCardholderName(): Contains
  @JSName("creditCardCardholderName")
  var creditCardCardholderName_Original: TextFieldSearchFn
  
  def creditCardCustomerLocation(): In[typingsJapgolly.braintree.mod.CustomerLocation]
  @JSName("creditCardCustomerLocation")
  var creditCardCustomerLocation_Original: MultiValueSearchFn[typingsJapgolly.braintree.mod.CustomerLocation]
  
  def creditCardExpirationDate(): Is[String]
  @JSName("creditCardExpirationDate")
  var creditCardExpirationDate_Original: EqualitySearchFn[String]
  
  def creditCardNumber(): EndsWith[String]
  @JSName("creditCardNumber")
  var creditCardNumber_Original: PartialMatchSearchFn[String]
  
  def creditCardUniqueIdentifier(): Contains
  @JSName("creditCardUniqueIdentifier")
  var creditCardUniqueIdentifier_Original: TextFieldSearchFn
  
  def creditcardCardType(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  @JSName("creditcardCardType")
  var creditcardCardType_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  
  def currency(): Contains
  @JSName("currency")
  var currency_Original: TextFieldSearchFn
  
  def customerCompany(): Contains
  @JSName("customerCompany")
  var customerCompany_Original: TextFieldSearchFn
  
  def customerEmail(): Contains
  @JSName("customerEmail")
  var customerEmail_Original: TextFieldSearchFn
  
  def customerFax(): Contains
  @JSName("customerFax")
  var customerFax_Original: TextFieldSearchFn
  
  def customerFirstName(): Contains
  @JSName("customerFirstName")
  var customerFirstName_Original: TextFieldSearchFn
  
  def customerId(): Contains
  @JSName("customerId")
  var customerId_Original: TextFieldSearchFn
  
  def customerLastName(): Contains
  @JSName("customerLastName")
  var customerLastName_Original: TextFieldSearchFn
  
  def customerPhone(): Contains
  @JSName("customerPhone")
  var customerPhone_Original: TextFieldSearchFn
  
  def customerWebsite(): Contains
  @JSName("customerWebsite")
  var customerWebsite_Original: TextFieldSearchFn
  
  def disbursementDate(): Between[js.Date]
  @JSName("disbursementDate")
  var disbursementDate_Original: RangeFieldSearchFn[js.Date]
  
  def disputeDate(): Between[js.Date]
  @JSName("disputeDate")
  var disputeDate_Original: RangeFieldSearchFn[js.Date]
  
  def failedAt(): Between[js.Date]
  @JSName("failedAt")
  var failedAt_Original: RangeFieldSearchFn[js.Date]
  
  def gatewayRejectedAt(): Between[js.Date]
  @JSName("gatewayRejectedAt")
  var gatewayRejectedAt_Original: RangeFieldSearchFn[js.Date]
  
  def id(): Contains
  @JSName("id")
  var id_Original: TextFieldSearchFn
  
  def ids(): In[String]
  @JSName("ids")
  var ids_Original: MultiValueSearchFn[String]
  
  def merchantAccountId(): In[String]
  @JSName("merchantAccountId")
  var merchantAccountId_Original: MultiValueSearchFn[String]
  
  def orderId(): Contains
  @JSName("orderId")
  var orderId_Original: TextFieldSearchFn
  
  def paymentInstrumentType(): In[String]
  @JSName("paymentInstrumentType")
  var paymentInstrumentType_Original: MultiValueSearchFn[String]
  
  def paymentMethodToken(): Contains
  @JSName("paymentMethodToken")
  var paymentMethodToken_Original: TextFieldSearchFn
  
  def paypalAuthorizationId(): Contains
  @JSName("paypalAuthorizationId")
  var paypalAuthorizationId_Original: TextFieldSearchFn
  
  def paypalPayerEmail(): Contains
  @JSName("paypalPayerEmail")
  var paypalPayerEmail_Original: TextFieldSearchFn
  
  def paypalPaymentId(): Contains
  @JSName("paypalPaymentId")
  var paypalPaymentId_Original: TextFieldSearchFn
  
  def processorAuthorizationCode(): Contains
  @JSName("processorAuthorizationCode")
  var processorAuthorizationCode_Original: TextFieldSearchFn
  
  def processorDeclinedAt(): Between[js.Date]
  @JSName("processorDeclinedAt")
  var processorDeclinedAt_Original: RangeFieldSearchFn[js.Date]
  
  def refund(): `0`[Boolean]
  @JSName("refund")
  var refund_Original: KeyValueSearchFn[Boolean]
  
  def settledAt(): Between[js.Date]
  @JSName("settledAt")
  var settledAt_Original: RangeFieldSearchFn[js.Date]
  
  def settlementBatchId(): Contains
  @JSName("settlementBatchId")
  var settlementBatchId_Original: TextFieldSearchFn
  
  def shippingCompany(): Contains
  @JSName("shippingCompany")
  var shippingCompany_Original: TextFieldSearchFn
  
  def shippingCountryName(): Contains
  @JSName("shippingCountryName")
  var shippingCountryName_Original: TextFieldSearchFn
  
  def shippingExtendedAddress(): Contains
  @JSName("shippingExtendedAddress")
  var shippingExtendedAddress_Original: TextFieldSearchFn
  
  def shippingFirstName(): Contains
  @JSName("shippingFirstName")
  var shippingFirstName_Original: TextFieldSearchFn
  
  def shippingLastName(): Contains
  @JSName("shippingLastName")
  var shippingLastName_Original: TextFieldSearchFn
  
  def shippingLocality(): Contains
  @JSName("shippingLocality")
  var shippingLocality_Original: TextFieldSearchFn
  
  def shippingPostalCode(): Contains
  @JSName("shippingPostalCode")
  var shippingPostalCode_Original: TextFieldSearchFn
  
  def shippingRegion(): Contains
  @JSName("shippingRegion")
  var shippingRegion_Original: TextFieldSearchFn
  
  def shippingStreetAddress(): Contains
  @JSName("shippingStreetAddress")
  var shippingStreetAddress_Original: TextFieldSearchFn
  
  def source(): In[TransactionSource | String]
  @JSName("source")
  var source_Original: MultiValueSearchFn[TransactionSource | String]
  
  def status(): In[TransactionStatus]
  @JSName("status")
  var status_Original: MultiValueSearchFn[TransactionStatus]
  
  def storeId(): Contains
  @JSName("storeId")
  var storeId_Original: TextFieldSearchFn
  
  def storeIds(): In[String]
  @JSName("storeIds")
  var storeIds_Original: MultiValueSearchFn[String]
  
  def submittedForSettlementAt(): Between[js.Date]
  @JSName("submittedForSettlementAt")
  var submittedForSettlementAt_Original: RangeFieldSearchFn[js.Date]
  
  def `type`(): In[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
  ]
  @JSName("type")
  var type_Original: MultiValueSearchFn[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
  ]
  
  def user(): In[String]
  @JSName("user")
  var user_Original: MultiValueSearchFn[String]
  
  def voidedAt(): Between[js.Date]
  @JSName("voidedAt")
  var voidedAt_Original: RangeFieldSearchFn[js.Date]
}
object AuthorizationExpiredAt {
  
  inline def apply(
    amount: CallbackTo[Between[String]],
    authorizationExpiredAt: CallbackTo[Between[js.Date]],
    authorizedAt: CallbackTo[Between[js.Date]],
    billingCompany: CallbackTo[Contains],
    billingCountryName: CallbackTo[Contains],
    billingExtendedAddress: CallbackTo[Contains],
    billingFirstName: CallbackTo[Contains],
    billingLastName: CallbackTo[Contains],
    billingLocality: CallbackTo[Contains],
    billingPostalCode: CallbackTo[Contains],
    billingRegion: CallbackTo[Contains],
    billingStreetAddress: CallbackTo[Contains],
    createdAt: CallbackTo[Between[js.Date]],
    createdUsing: CallbackTo[
      In[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
      ]
    ],
    creditCardCardholderName: CallbackTo[Contains],
    creditCardCustomerLocation: CallbackTo[In[typingsJapgolly.braintree.mod.CustomerLocation]],
    creditCardExpirationDate: CallbackTo[Is[String]],
    creditCardNumber: CallbackTo[EndsWith[String]],
    creditCardUniqueIdentifier: CallbackTo[Contains],
    creditcardCardType: CallbackTo[
      In[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
      ]
    ],
    currency: CallbackTo[Contains],
    customerCompany: CallbackTo[Contains],
    customerEmail: CallbackTo[Contains],
    customerFax: CallbackTo[Contains],
    customerFirstName: CallbackTo[Contains],
    customerId: CallbackTo[Contains],
    customerLastName: CallbackTo[Contains],
    customerPhone: CallbackTo[Contains],
    customerWebsite: CallbackTo[Contains],
    disbursementDate: CallbackTo[Between[js.Date]],
    disputeDate: CallbackTo[Between[js.Date]],
    failedAt: CallbackTo[Between[js.Date]],
    gatewayRejectedAt: CallbackTo[Between[js.Date]],
    id: CallbackTo[Contains],
    ids: CallbackTo[In[String]],
    merchantAccountId: CallbackTo[In[String]],
    orderId: CallbackTo[Contains],
    paymentInstrumentType: CallbackTo[In[String]],
    paymentMethodToken: CallbackTo[Contains],
    paypalAuthorizationId: CallbackTo[Contains],
    paypalPayerEmail: CallbackTo[Contains],
    paypalPaymentId: CallbackTo[Contains],
    processorAuthorizationCode: CallbackTo[Contains],
    processorDeclinedAt: CallbackTo[Between[js.Date]],
    refund: CallbackTo[`0`[Boolean]],
    settledAt: CallbackTo[Between[js.Date]],
    settlementBatchId: CallbackTo[Contains],
    shippingCompany: CallbackTo[Contains],
    shippingCountryName: CallbackTo[Contains],
    shippingExtendedAddress: CallbackTo[Contains],
    shippingFirstName: CallbackTo[Contains],
    shippingLastName: CallbackTo[Contains],
    shippingLocality: CallbackTo[Contains],
    shippingPostalCode: CallbackTo[Contains],
    shippingRegion: CallbackTo[Contains],
    shippingStreetAddress: CallbackTo[Contains],
    source: CallbackTo[In[TransactionSource | String]],
    status: CallbackTo[In[TransactionStatus]],
    storeId: CallbackTo[Contains],
    storeIds: CallbackTo[In[String]],
    submittedForSettlementAt: CallbackTo[Between[js.Date]],
    `type`: CallbackTo[
      In[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
      ]
    ],
    user: CallbackTo[In[String]],
    voidedAt: CallbackTo[Between[js.Date]]
  ): AuthorizationExpiredAt = {
    val __obj = js.Dynamic.literal(amount = amount.toJsFn, authorizationExpiredAt = authorizationExpiredAt.toJsFn, authorizedAt = authorizedAt.toJsFn, billingCompany = billingCompany.toJsFn, billingCountryName = billingCountryName.toJsFn, billingExtendedAddress = billingExtendedAddress.toJsFn, billingFirstName = billingFirstName.toJsFn, billingLastName = billingLastName.toJsFn, billingLocality = billingLocality.toJsFn, billingPostalCode = billingPostalCode.toJsFn, billingRegion = billingRegion.toJsFn, billingStreetAddress = billingStreetAddress.toJsFn, createdAt = createdAt.toJsFn, createdUsing = createdUsing.toJsFn, creditCardCardholderName = creditCardCardholderName.toJsFn, creditCardCustomerLocation = creditCardCustomerLocation.toJsFn, creditCardExpirationDate = creditCardExpirationDate.toJsFn, creditCardNumber = creditCardNumber.toJsFn, creditCardUniqueIdentifier = creditCardUniqueIdentifier.toJsFn, creditcardCardType = creditcardCardType.toJsFn, currency = currency.toJsFn, customerCompany = customerCompany.toJsFn, customerEmail = customerEmail.toJsFn, customerFax = customerFax.toJsFn, customerFirstName = customerFirstName.toJsFn, customerId = customerId.toJsFn, customerLastName = customerLastName.toJsFn, customerPhone = customerPhone.toJsFn, customerWebsite = customerWebsite.toJsFn, disbursementDate = disbursementDate.toJsFn, disputeDate = disputeDate.toJsFn, failedAt = failedAt.toJsFn, gatewayRejectedAt = gatewayRejectedAt.toJsFn, id = id.toJsFn, ids = ids.toJsFn, merchantAccountId = merchantAccountId.toJsFn, orderId = orderId.toJsFn, paymentInstrumentType = paymentInstrumentType.toJsFn, paymentMethodToken = paymentMethodToken.toJsFn, paypalAuthorizationId = paypalAuthorizationId.toJsFn, paypalPayerEmail = paypalPayerEmail.toJsFn, paypalPaymentId = paypalPaymentId.toJsFn, processorAuthorizationCode = processorAuthorizationCode.toJsFn, processorDeclinedAt = processorDeclinedAt.toJsFn, refund = refund.toJsFn, settledAt = settledAt.toJsFn, settlementBatchId = settlementBatchId.toJsFn, shippingCompany = shippingCompany.toJsFn, shippingCountryName = shippingCountryName.toJsFn, shippingExtendedAddress = shippingExtendedAddress.toJsFn, shippingFirstName = shippingFirstName.toJsFn, shippingLastName = shippingLastName.toJsFn, shippingLocality = shippingLocality.toJsFn, shippingPostalCode = shippingPostalCode.toJsFn, shippingRegion = shippingRegion.toJsFn, shippingStreetAddress = shippingStreetAddress.toJsFn, source = source.toJsFn, status = status.toJsFn, storeId = storeId.toJsFn, storeIds = storeIds.toJsFn, submittedForSettlementAt = submittedForSettlementAt.toJsFn, user = user.toJsFn, voidedAt = voidedAt.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[AuthorizationExpiredAt]
  }
  
  extension [Self <: AuthorizationExpiredAt](x: Self) {
    
    inline def setAmount(value: CallbackTo[Between[String]]): Self = StObject.set(x, "amount", value.toJsFn)
    
    inline def setAuthorizationExpiredAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "authorizationExpiredAt", value.toJsFn)
    
    inline def setAuthorizedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "authorizedAt", value.toJsFn)
    
    inline def setBillingCompany(value: CallbackTo[Contains]): Self = StObject.set(x, "billingCompany", value.toJsFn)
    
    inline def setBillingCountryName(value: CallbackTo[Contains]): Self = StObject.set(x, "billingCountryName", value.toJsFn)
    
    inline def setBillingExtendedAddress(value: CallbackTo[Contains]): Self = StObject.set(x, "billingExtendedAddress", value.toJsFn)
    
    inline def setBillingFirstName(value: CallbackTo[Contains]): Self = StObject.set(x, "billingFirstName", value.toJsFn)
    
    inline def setBillingLastName(value: CallbackTo[Contains]): Self = StObject.set(x, "billingLastName", value.toJsFn)
    
    inline def setBillingLocality(value: CallbackTo[Contains]): Self = StObject.set(x, "billingLocality", value.toJsFn)
    
    inline def setBillingPostalCode(value: CallbackTo[Contains]): Self = StObject.set(x, "billingPostalCode", value.toJsFn)
    
    inline def setBillingRegion(value: CallbackTo[Contains]): Self = StObject.set(x, "billingRegion", value.toJsFn)
    
    inline def setBillingStreetAddress(value: CallbackTo[Contains]): Self = StObject.set(x, "billingStreetAddress", value.toJsFn)
    
    inline def setCreatedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "createdAt", value.toJsFn)
    
    inline def setCreatedUsing(
      value: CallbackTo[
          In[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.CreatedUsing * / any] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "createdUsing", value.toJsFn)
    
    inline def setCreditCardCardholderName(value: CallbackTo[Contains]): Self = StObject.set(x, "creditCardCardholderName", value.toJsFn)
    
    inline def setCreditCardCustomerLocation(value: CallbackTo[In[typingsJapgolly.braintree.mod.CustomerLocation]]): Self = StObject.set(x, "creditCardCustomerLocation", value.toJsFn)
    
    inline def setCreditCardExpirationDate(value: CallbackTo[Is[String]]): Self = StObject.set(x, "creditCardExpirationDate", value.toJsFn)
    
    inline def setCreditCardNumber(value: CallbackTo[EndsWith[String]]): Self = StObject.set(x, "creditCardNumber", value.toJsFn)
    
    inline def setCreditCardUniqueIdentifier(value: CallbackTo[Contains]): Self = StObject.set(x, "creditCardUniqueIdentifier", value.toJsFn)
    
    inline def setCreditcardCardType(
      value: CallbackTo[
          In[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "creditcardCardType", value.toJsFn)
    
    inline def setCurrency(value: CallbackTo[Contains]): Self = StObject.set(x, "currency", value.toJsFn)
    
    inline def setCustomerCompany(value: CallbackTo[Contains]): Self = StObject.set(x, "customerCompany", value.toJsFn)
    
    inline def setCustomerEmail(value: CallbackTo[Contains]): Self = StObject.set(x, "customerEmail", value.toJsFn)
    
    inline def setCustomerFax(value: CallbackTo[Contains]): Self = StObject.set(x, "customerFax", value.toJsFn)
    
    inline def setCustomerFirstName(value: CallbackTo[Contains]): Self = StObject.set(x, "customerFirstName", value.toJsFn)
    
    inline def setCustomerId(value: CallbackTo[Contains]): Self = StObject.set(x, "customerId", value.toJsFn)
    
    inline def setCustomerLastName(value: CallbackTo[Contains]): Self = StObject.set(x, "customerLastName", value.toJsFn)
    
    inline def setCustomerPhone(value: CallbackTo[Contains]): Self = StObject.set(x, "customerPhone", value.toJsFn)
    
    inline def setCustomerWebsite(value: CallbackTo[Contains]): Self = StObject.set(x, "customerWebsite", value.toJsFn)
    
    inline def setDisbursementDate(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "disbursementDate", value.toJsFn)
    
    inline def setDisputeDate(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "disputeDate", value.toJsFn)
    
    inline def setFailedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "failedAt", value.toJsFn)
    
    inline def setGatewayRejectedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "gatewayRejectedAt", value.toJsFn)
    
    inline def setId(value: CallbackTo[Contains]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setIds(value: CallbackTo[In[String]]): Self = StObject.set(x, "ids", value.toJsFn)
    
    inline def setMerchantAccountId(value: CallbackTo[In[String]]): Self = StObject.set(x, "merchantAccountId", value.toJsFn)
    
    inline def setOrderId(value: CallbackTo[Contains]): Self = StObject.set(x, "orderId", value.toJsFn)
    
    inline def setPaymentInstrumentType(value: CallbackTo[In[String]]): Self = StObject.set(x, "paymentInstrumentType", value.toJsFn)
    
    inline def setPaymentMethodToken(value: CallbackTo[Contains]): Self = StObject.set(x, "paymentMethodToken", value.toJsFn)
    
    inline def setPaypalAuthorizationId(value: CallbackTo[Contains]): Self = StObject.set(x, "paypalAuthorizationId", value.toJsFn)
    
    inline def setPaypalPayerEmail(value: CallbackTo[Contains]): Self = StObject.set(x, "paypalPayerEmail", value.toJsFn)
    
    inline def setPaypalPaymentId(value: CallbackTo[Contains]): Self = StObject.set(x, "paypalPaymentId", value.toJsFn)
    
    inline def setProcessorAuthorizationCode(value: CallbackTo[Contains]): Self = StObject.set(x, "processorAuthorizationCode", value.toJsFn)
    
    inline def setProcessorDeclinedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "processorDeclinedAt", value.toJsFn)
    
    inline def setRefund(value: CallbackTo[`0`[Boolean]]): Self = StObject.set(x, "refund", value.toJsFn)
    
    inline def setSettledAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "settledAt", value.toJsFn)
    
    inline def setSettlementBatchId(value: CallbackTo[Contains]): Self = StObject.set(x, "settlementBatchId", value.toJsFn)
    
    inline def setShippingCompany(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingCompany", value.toJsFn)
    
    inline def setShippingCountryName(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingCountryName", value.toJsFn)
    
    inline def setShippingExtendedAddress(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingExtendedAddress", value.toJsFn)
    
    inline def setShippingFirstName(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingFirstName", value.toJsFn)
    
    inline def setShippingLastName(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingLastName", value.toJsFn)
    
    inline def setShippingLocality(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingLocality", value.toJsFn)
    
    inline def setShippingPostalCode(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingPostalCode", value.toJsFn)
    
    inline def setShippingRegion(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingRegion", value.toJsFn)
    
    inline def setShippingStreetAddress(value: CallbackTo[Contains]): Self = StObject.set(x, "shippingStreetAddress", value.toJsFn)
    
    inline def setSource(value: CallbackTo[In[TransactionSource | String]]): Self = StObject.set(x, "source", value.toJsFn)
    
    inline def setStatus(value: CallbackTo[In[TransactionStatus]]): Self = StObject.set(x, "status", value.toJsFn)
    
    inline def setStoreId(value: CallbackTo[Contains]): Self = StObject.set(x, "storeId", value.toJsFn)
    
    inline def setStoreIds(value: CallbackTo[In[String]]): Self = StObject.set(x, "storeIds", value.toJsFn)
    
    inline def setSubmittedForSettlementAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "submittedForSettlementAt", value.toJsFn)
    
    inline def setType(
      value: CallbackTo[
          In[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transaction.Type * / any, 'All'>] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setUser(value: CallbackTo[In[String]]): Self = StObject.set(x, "user", value.toJsFn)
    
    inline def setVoidedAt(value: CallbackTo[Between[js.Date]]): Self = StObject.set(x, "voidedAt", value.toJsFn)
  }
}
