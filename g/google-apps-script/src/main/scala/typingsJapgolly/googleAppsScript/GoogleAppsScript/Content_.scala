package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.AccountsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.AccountstatusesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.AccounttaxCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.DatafeedsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.DatafeedstatusesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.InventoryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.LiasettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.OrderinvoicesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.OrderpaymentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.OrderreportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.OrderreturnsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.OrdersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.PosCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.ProductsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.ProductstatusesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection.ShippingsettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Account
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountAdwordsLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountBusinessInformation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountCustomerService
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountGoogleMyBusinessLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountTax
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountTaxTaxRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountUser
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountYouTubeChannelLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequestEntryLinkRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsLinkRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Amount
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.CarrierRate
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.CustomAttribute
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.CustomGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.CutoffTime
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Datafeed
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedFetchSchedule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedFormat
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedTarget
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.DeliveryTime
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Error
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Headers
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.HolidayCutoff
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Installment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Inventory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryPickup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventorySetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InvoiceSummary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InvoiceSummaryAdditionalChargeSummary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaAboutPageSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaCountrySettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaInventorySettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaOnDisplayToOrderSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaPosDataProvider
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiaSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LocationIdSet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.LoyaltyPoints
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLegacyPromotion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLegacyPromotionBenefit
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemProductVariantAttribute
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemReturnInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemShippingDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderLineItemShippingDetailsMethod
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderMerchantProvidedAnnotation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderShipmentLineItemShipment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersAcknowledgeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelLineItemRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCancelTestOrderByCustomerRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCreateTestOrderRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCreateTestReturnRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCancel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCancelLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryCreateTestReturnReturnItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryInStoreRefundLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryRefund
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryRejectReturnLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryReturnLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryReturnRefundLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntrySetLineItemMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryShipLineItems
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersCustomBatchRequestEntryUpdateShipment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersInStoreRefundLineItemRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersRefundRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersRejectReturnLineItemRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersReturnLineItemRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersReturnRefundLineItemRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersSetLineItemMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersShipLineItemsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateLineItemShippingDetailsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateMerchantOrderIdRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrdersUpdateShipmentRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosInventory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosInventoryRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosSale
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosSaleRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PosStore
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PostalCodeGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.PostalCodeRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Price
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Product
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductAspect
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductDestination
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShipping
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShippingDimension
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductShippingWeight
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductTax
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductUnitPricingBaseMeasure
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductUnitPricingMeasure
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductsCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Promotion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.RateGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Row
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Service
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ShipmentInvoice
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ShipmentInvoiceLineItemInvoice
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchRequestEntry
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Table
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderCustomer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderCustomerMarketingRightsInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderLineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderLineItemProduct
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TestOrderPaymentMethod
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTable
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTableTransitTimeRow
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.TransitTableTransitTimeRowTransitTimeValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoice
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoiceAdditionalCharge
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.UnitInvoiceTaxLine
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Value
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var Accountstatuses: js.UndefOr[AccountstatusesCollection] = js.undefined
  var Accounttax: js.UndefOr[AccounttaxCollection] = js.undefined
  var Datafeeds: js.UndefOr[DatafeedsCollection] = js.undefined
  var Datafeedstatuses: js.UndefOr[DatafeedstatusesCollection] = js.undefined
  var Inventory: js.UndefOr[InventoryCollection] = js.undefined
  var Liasettings: js.UndefOr[LiasettingsCollection] = js.undefined
  var Orderinvoices: js.UndefOr[OrderinvoicesCollection] = js.undefined
  var Orderpayments: js.UndefOr[OrderpaymentsCollection] = js.undefined
  var Orderreports: js.UndefOr[OrderreportsCollection] = js.undefined
  var Orderreturns: js.UndefOr[OrderreturnsCollection] = js.undefined
  var Orders: js.UndefOr[OrdersCollection] = js.undefined
  var Pos: js.UndefOr[PosCollection] = js.undefined
  var Products: js.UndefOr[ProductsCollection] = js.undefined
  var Productstatuses: js.UndefOr[ProductstatusesCollection] = js.undefined
  var Shippingsettings: js.UndefOr[ShippingsettingsCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of AccountAddress
  def newAccountAddress(): AccountAddress
  // Create a new instance of AccountAdwordsLink
  def newAccountAdwordsLink(): AccountAdwordsLink
  // Create a new instance of AccountBusinessInformation
  def newAccountBusinessInformation(): AccountBusinessInformation
  // Create a new instance of AccountCustomerService
  def newAccountCustomerService(): AccountCustomerService
  // Create a new instance of AccountGoogleMyBusinessLink
  def newAccountGoogleMyBusinessLink(): AccountGoogleMyBusinessLink
  // Create a new instance of AccountTax
  def newAccountTax(): AccountTax
  // Create a new instance of AccountTaxTaxRule
  def newAccountTaxTaxRule(): AccountTaxTaxRule
  // Create a new instance of AccountUser
  def newAccountUser(): AccountUser
  // Create a new instance of AccountYouTubeChannelLink
  def newAccountYouTubeChannelLink(): AccountYouTubeChannelLink
  // Create a new instance of AccountsCustomBatchRequest
  def newAccountsCustomBatchRequest(): AccountsCustomBatchRequest
  // Create a new instance of AccountsCustomBatchRequestEntry
  def newAccountsCustomBatchRequestEntry(): AccountsCustomBatchRequestEntry
  // Create a new instance of AccountsCustomBatchRequestEntryLinkRequest
  def newAccountsCustomBatchRequestEntryLinkRequest(): AccountsCustomBatchRequestEntryLinkRequest
  // Create a new instance of AccountsLinkRequest
  def newAccountsLinkRequest(): AccountsLinkRequest
  // Create a new instance of AccountstatusesCustomBatchRequest
  def newAccountstatusesCustomBatchRequest(): AccountstatusesCustomBatchRequest
  // Create a new instance of AccountstatusesCustomBatchRequestEntry
  def newAccountstatusesCustomBatchRequestEntry(): AccountstatusesCustomBatchRequestEntry
  // Create a new instance of AccounttaxCustomBatchRequest
  def newAccounttaxCustomBatchRequest(): AccounttaxCustomBatchRequest
  // Create a new instance of AccounttaxCustomBatchRequestEntry
  def newAccounttaxCustomBatchRequestEntry(): AccounttaxCustomBatchRequestEntry
  // Create a new instance of Amount
  def newAmount(): Amount
  // Create a new instance of CarrierRate
  def newCarrierRate(): CarrierRate
  // Create a new instance of CustomAttribute
  def newCustomAttribute(): CustomAttribute
  // Create a new instance of CustomGroup
  def newCustomGroup(): CustomGroup
  // Create a new instance of CutoffTime
  def newCutoffTime(): CutoffTime
  // Create a new instance of Datafeed
  def newDatafeed(): Datafeed
  // Create a new instance of DatafeedFetchSchedule
  def newDatafeedFetchSchedule(): DatafeedFetchSchedule
  // Create a new instance of DatafeedFormat
  def newDatafeedFormat(): DatafeedFormat
  // Create a new instance of DatafeedTarget
  def newDatafeedTarget(): DatafeedTarget
  // Create a new instance of DatafeedsCustomBatchRequest
  def newDatafeedsCustomBatchRequest(): DatafeedsCustomBatchRequest
  // Create a new instance of DatafeedsCustomBatchRequestEntry
  def newDatafeedsCustomBatchRequestEntry(): DatafeedsCustomBatchRequestEntry
  // Create a new instance of DatafeedstatusesCustomBatchRequest
  def newDatafeedstatusesCustomBatchRequest(): DatafeedstatusesCustomBatchRequest
  // Create a new instance of DatafeedstatusesCustomBatchRequestEntry
  def newDatafeedstatusesCustomBatchRequestEntry(): DatafeedstatusesCustomBatchRequestEntry
  // Create a new instance of DeliveryTime
  def newDeliveryTime(): DeliveryTime
  // Create a new instance of Error
  def newError(): Error
  // Create a new instance of Headers
  def newHeaders(): Headers
  // Create a new instance of HolidayCutoff
  def newHolidayCutoff(): HolidayCutoff
  // Create a new instance of Installment
  def newInstallment(): Installment
  // Create a new instance of Inventory
  def newInventory(): Inventory
  // Create a new instance of InventoryCustomBatchRequest
  def newInventoryCustomBatchRequest(): InventoryCustomBatchRequest
  // Create a new instance of InventoryCustomBatchRequestEntry
  def newInventoryCustomBatchRequestEntry(): InventoryCustomBatchRequestEntry
  // Create a new instance of InventoryPickup
  def newInventoryPickup(): InventoryPickup
  // Create a new instance of InventorySetRequest
  def newInventorySetRequest(): InventorySetRequest
  // Create a new instance of InvoiceSummary
  def newInvoiceSummary(): InvoiceSummary
  // Create a new instance of InvoiceSummaryAdditionalChargeSummary
  def newInvoiceSummaryAdditionalChargeSummary(): InvoiceSummaryAdditionalChargeSummary
  // Create a new instance of LiaAboutPageSettings
  def newLiaAboutPageSettings(): LiaAboutPageSettings
  // Create a new instance of LiaCountrySettings
  def newLiaCountrySettings(): LiaCountrySettings
  // Create a new instance of LiaInventorySettings
  def newLiaInventorySettings(): LiaInventorySettings
  // Create a new instance of LiaOnDisplayToOrderSettings
  def newLiaOnDisplayToOrderSettings(): LiaOnDisplayToOrderSettings
  // Create a new instance of LiaPosDataProvider
  def newLiaPosDataProvider(): LiaPosDataProvider
  // Create a new instance of LiaSettings
  def newLiaSettings(): LiaSettings
  // Create a new instance of LiasettingsCustomBatchRequest
  def newLiasettingsCustomBatchRequest(): LiasettingsCustomBatchRequest
  // Create a new instance of LiasettingsCustomBatchRequestEntry
  def newLiasettingsCustomBatchRequestEntry(): LiasettingsCustomBatchRequestEntry
  // Create a new instance of LocationIdSet
  def newLocationIdSet(): LocationIdSet
  // Create a new instance of LoyaltyPoints
  def newLoyaltyPoints(): LoyaltyPoints
  // Create a new instance of OrderLegacyPromotion
  def newOrderLegacyPromotion(): OrderLegacyPromotion
  // Create a new instance of OrderLegacyPromotionBenefit
  def newOrderLegacyPromotionBenefit(): OrderLegacyPromotionBenefit
  // Create a new instance of OrderLineItemProductVariantAttribute
  def newOrderLineItemProductVariantAttribute(): OrderLineItemProductVariantAttribute
  // Create a new instance of OrderLineItemReturnInfo
  def newOrderLineItemReturnInfo(): OrderLineItemReturnInfo
  // Create a new instance of OrderLineItemShippingDetails
  def newOrderLineItemShippingDetails(): OrderLineItemShippingDetails
  // Create a new instance of OrderLineItemShippingDetailsMethod
  def newOrderLineItemShippingDetailsMethod(): OrderLineItemShippingDetailsMethod
  // Create a new instance of OrderMerchantProvidedAnnotation
  def newOrderMerchantProvidedAnnotation(): OrderMerchantProvidedAnnotation
  // Create a new instance of OrderShipmentLineItemShipment
  def newOrderShipmentLineItemShipment(): OrderShipmentLineItemShipment
  // Create a new instance of OrderinvoicesCreateChargeInvoiceRequest
  def newOrderinvoicesCreateChargeInvoiceRequest(): OrderinvoicesCreateChargeInvoiceRequest
  // Create a new instance of OrderinvoicesCreateRefundInvoiceRequest
  def newOrderinvoicesCreateRefundInvoiceRequest(): OrderinvoicesCreateRefundInvoiceRequest
  // Create a new instance of OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption
  def newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption
  // Create a new instance of OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption
  def newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption
  // Create a new instance of OrderpaymentsNotifyAuthApprovedRequest
  def newOrderpaymentsNotifyAuthApprovedRequest(): OrderpaymentsNotifyAuthApprovedRequest
  // Create a new instance of OrderpaymentsNotifyAuthDeclinedRequest
  def newOrderpaymentsNotifyAuthDeclinedRequest(): OrderpaymentsNotifyAuthDeclinedRequest
  // Create a new instance of OrderpaymentsNotifyChargeRequest
  def newOrderpaymentsNotifyChargeRequest(): OrderpaymentsNotifyChargeRequest
  // Create a new instance of OrderpaymentsNotifyRefundRequest
  def newOrderpaymentsNotifyRefundRequest(): OrderpaymentsNotifyRefundRequest
  // Create a new instance of OrdersAcknowledgeRequest
  def newOrdersAcknowledgeRequest(): OrdersAcknowledgeRequest
  // Create a new instance of OrdersCancelLineItemRequest
  def newOrdersCancelLineItemRequest(): OrdersCancelLineItemRequest
  // Create a new instance of OrdersCancelRequest
  def newOrdersCancelRequest(): OrdersCancelRequest
  // Create a new instance of OrdersCancelTestOrderByCustomerRequest
  def newOrdersCancelTestOrderByCustomerRequest(): OrdersCancelTestOrderByCustomerRequest
  // Create a new instance of OrdersCreateTestOrderRequest
  def newOrdersCreateTestOrderRequest(): OrdersCreateTestOrderRequest
  // Create a new instance of OrdersCreateTestReturnRequest
  def newOrdersCreateTestReturnRequest(): OrdersCreateTestReturnRequest
  // Create a new instance of OrdersCustomBatchRequest
  def newOrdersCustomBatchRequest(): OrdersCustomBatchRequest
  // Create a new instance of OrdersCustomBatchRequestEntry
  def newOrdersCustomBatchRequestEntry(): OrdersCustomBatchRequestEntry
  // Create a new instance of OrdersCustomBatchRequestEntryCancel
  def newOrdersCustomBatchRequestEntryCancel(): OrdersCustomBatchRequestEntryCancel
  // Create a new instance of OrdersCustomBatchRequestEntryCancelLineItem
  def newOrdersCustomBatchRequestEntryCancelLineItem(): OrdersCustomBatchRequestEntryCancelLineItem
  // Create a new instance of OrdersCustomBatchRequestEntryCreateTestReturnReturnItem
  def newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem(): OrdersCustomBatchRequestEntryCreateTestReturnReturnItem
  // Create a new instance of OrdersCustomBatchRequestEntryInStoreRefundLineItem
  def newOrdersCustomBatchRequestEntryInStoreRefundLineItem(): OrdersCustomBatchRequestEntryInStoreRefundLineItem
  // Create a new instance of OrdersCustomBatchRequestEntryRefund
  def newOrdersCustomBatchRequestEntryRefund(): OrdersCustomBatchRequestEntryRefund
  // Create a new instance of OrdersCustomBatchRequestEntryRejectReturnLineItem
  def newOrdersCustomBatchRequestEntryRejectReturnLineItem(): OrdersCustomBatchRequestEntryRejectReturnLineItem
  // Create a new instance of OrdersCustomBatchRequestEntryReturnLineItem
  def newOrdersCustomBatchRequestEntryReturnLineItem(): OrdersCustomBatchRequestEntryReturnLineItem
  // Create a new instance of OrdersCustomBatchRequestEntryReturnRefundLineItem
  def newOrdersCustomBatchRequestEntryReturnRefundLineItem(): OrdersCustomBatchRequestEntryReturnRefundLineItem
  // Create a new instance of OrdersCustomBatchRequestEntrySetLineItemMetadata
  def newOrdersCustomBatchRequestEntrySetLineItemMetadata(): OrdersCustomBatchRequestEntrySetLineItemMetadata
  // Create a new instance of OrdersCustomBatchRequestEntryShipLineItems
  def newOrdersCustomBatchRequestEntryShipLineItems(): OrdersCustomBatchRequestEntryShipLineItems
  // Create a new instance of OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo
  def newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo(): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo
  // Create a new instance of OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails
  def newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails(): OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails
  // Create a new instance of OrdersCustomBatchRequestEntryUpdateShipment
  def newOrdersCustomBatchRequestEntryUpdateShipment(): OrdersCustomBatchRequestEntryUpdateShipment
  // Create a new instance of OrdersInStoreRefundLineItemRequest
  def newOrdersInStoreRefundLineItemRequest(): OrdersInStoreRefundLineItemRequest
  // Create a new instance of OrdersRefundRequest
  def newOrdersRefundRequest(): OrdersRefundRequest
  // Create a new instance of OrdersRejectReturnLineItemRequest
  def newOrdersRejectReturnLineItemRequest(): OrdersRejectReturnLineItemRequest
  // Create a new instance of OrdersReturnLineItemRequest
  def newOrdersReturnLineItemRequest(): OrdersReturnLineItemRequest
  // Create a new instance of OrdersReturnRefundLineItemRequest
  def newOrdersReturnRefundLineItemRequest(): OrdersReturnRefundLineItemRequest
  // Create a new instance of OrdersSetLineItemMetadataRequest
  def newOrdersSetLineItemMetadataRequest(): OrdersSetLineItemMetadataRequest
  // Create a new instance of OrdersShipLineItemsRequest
  def newOrdersShipLineItemsRequest(): OrdersShipLineItemsRequest
  // Create a new instance of OrdersUpdateLineItemShippingDetailsRequest
  def newOrdersUpdateLineItemShippingDetailsRequest(): OrdersUpdateLineItemShippingDetailsRequest
  // Create a new instance of OrdersUpdateMerchantOrderIdRequest
  def newOrdersUpdateMerchantOrderIdRequest(): OrdersUpdateMerchantOrderIdRequest
  // Create a new instance of OrdersUpdateShipmentRequest
  def newOrdersUpdateShipmentRequest(): OrdersUpdateShipmentRequest
  // Create a new instance of PosCustomBatchRequest
  def newPosCustomBatchRequest(): PosCustomBatchRequest
  // Create a new instance of PosCustomBatchRequestEntry
  def newPosCustomBatchRequestEntry(): PosCustomBatchRequestEntry
  // Create a new instance of PosInventory
  def newPosInventory(): PosInventory
  // Create a new instance of PosInventoryRequest
  def newPosInventoryRequest(): PosInventoryRequest
  // Create a new instance of PosSale
  def newPosSale(): PosSale
  // Create a new instance of PosSaleRequest
  def newPosSaleRequest(): PosSaleRequest
  // Create a new instance of PosStore
  def newPosStore(): PosStore
  // Create a new instance of PostalCodeGroup
  def newPostalCodeGroup(): PostalCodeGroup
  // Create a new instance of PostalCodeRange
  def newPostalCodeRange(): PostalCodeRange
  // Create a new instance of Price
  def newPrice(): Price
  // Create a new instance of Product
  def newProduct(): Product
  // Create a new instance of ProductAspect
  def newProductAspect(): ProductAspect
  // Create a new instance of ProductDestination
  def newProductDestination(): ProductDestination
  // Create a new instance of ProductShipping
  def newProductShipping(): ProductShipping
  // Create a new instance of ProductShippingDimension
  def newProductShippingDimension(): ProductShippingDimension
  // Create a new instance of ProductShippingWeight
  def newProductShippingWeight(): ProductShippingWeight
  // Create a new instance of ProductTax
  def newProductTax(): ProductTax
  // Create a new instance of ProductUnitPricingBaseMeasure
  def newProductUnitPricingBaseMeasure(): ProductUnitPricingBaseMeasure
  // Create a new instance of ProductUnitPricingMeasure
  def newProductUnitPricingMeasure(): ProductUnitPricingMeasure
  // Create a new instance of ProductsCustomBatchRequest
  def newProductsCustomBatchRequest(): ProductsCustomBatchRequest
  // Create a new instance of ProductsCustomBatchRequestEntry
  def newProductsCustomBatchRequestEntry(): ProductsCustomBatchRequestEntry
  // Create a new instance of ProductstatusesCustomBatchRequest
  def newProductstatusesCustomBatchRequest(): ProductstatusesCustomBatchRequest
  // Create a new instance of ProductstatusesCustomBatchRequestEntry
  def newProductstatusesCustomBatchRequestEntry(): ProductstatusesCustomBatchRequestEntry
  // Create a new instance of Promotion
  def newPromotion(): Promotion
  // Create a new instance of RateGroup
  def newRateGroup(): RateGroup
  // Create a new instance of Row
  def newRow(): Row
  // Create a new instance of Service
  def newService(): Service
  // Create a new instance of ShipmentInvoice
  def newShipmentInvoice(): ShipmentInvoice
  // Create a new instance of ShipmentInvoiceLineItemInvoice
  def newShipmentInvoiceLineItemInvoice(): ShipmentInvoiceLineItemInvoice
  // Create a new instance of ShippingSettings
  def newShippingSettings(): ShippingSettings
  // Create a new instance of ShippingsettingsCustomBatchRequest
  def newShippingsettingsCustomBatchRequest(): ShippingsettingsCustomBatchRequest
  // Create a new instance of ShippingsettingsCustomBatchRequestEntry
  def newShippingsettingsCustomBatchRequestEntry(): ShippingsettingsCustomBatchRequestEntry
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TestOrder
  def newTestOrder(): TestOrder
  // Create a new instance of TestOrderCustomer
  def newTestOrderCustomer(): TestOrderCustomer
  // Create a new instance of TestOrderCustomerMarketingRightsInfo
  def newTestOrderCustomerMarketingRightsInfo(): TestOrderCustomerMarketingRightsInfo
  // Create a new instance of TestOrderLineItem
  def newTestOrderLineItem(): TestOrderLineItem
  // Create a new instance of TestOrderLineItemProduct
  def newTestOrderLineItemProduct(): TestOrderLineItemProduct
  // Create a new instance of TestOrderPaymentMethod
  def newTestOrderPaymentMethod(): TestOrderPaymentMethod
  // Create a new instance of TransitTable
  def newTransitTable(): TransitTable
  // Create a new instance of TransitTableTransitTimeRow
  def newTransitTableTransitTimeRow(): TransitTableTransitTimeRow
  // Create a new instance of TransitTableTransitTimeRowTransitTimeValue
  def newTransitTableTransitTimeRowTransitTimeValue(): TransitTableTransitTimeRowTransitTimeValue
  // Create a new instance of UnitInvoice
  def newUnitInvoice(): UnitInvoice
  // Create a new instance of UnitInvoiceAdditionalCharge
  def newUnitInvoiceAdditionalCharge(): UnitInvoiceAdditionalCharge
  // Create a new instance of UnitInvoiceTaxLine
  def newUnitInvoiceTaxLine(): UnitInvoiceTaxLine
  // Create a new instance of Value
  def newValue(): Value
  // Create a new instance of Weight
  def newWeight(): Weight
}

object Content_ {
  @scala.inline
  def apply(
    newAccount: CallbackTo[Account],
    newAccountAddress: CallbackTo[AccountAddress],
    newAccountAdwordsLink: CallbackTo[AccountAdwordsLink],
    newAccountBusinessInformation: CallbackTo[AccountBusinessInformation],
    newAccountCustomerService: CallbackTo[AccountCustomerService],
    newAccountGoogleMyBusinessLink: CallbackTo[AccountGoogleMyBusinessLink],
    newAccountTax: CallbackTo[AccountTax],
    newAccountTaxTaxRule: CallbackTo[AccountTaxTaxRule],
    newAccountUser: CallbackTo[AccountUser],
    newAccountYouTubeChannelLink: CallbackTo[AccountYouTubeChannelLink],
    newAccountsCustomBatchRequest: CallbackTo[AccountsCustomBatchRequest],
    newAccountsCustomBatchRequestEntry: CallbackTo[AccountsCustomBatchRequestEntry],
    newAccountsCustomBatchRequestEntryLinkRequest: CallbackTo[AccountsCustomBatchRequestEntryLinkRequest],
    newAccountsLinkRequest: CallbackTo[AccountsLinkRequest],
    newAccountstatusesCustomBatchRequest: CallbackTo[AccountstatusesCustomBatchRequest],
    newAccountstatusesCustomBatchRequestEntry: CallbackTo[AccountstatusesCustomBatchRequestEntry],
    newAccounttaxCustomBatchRequest: CallbackTo[AccounttaxCustomBatchRequest],
    newAccounttaxCustomBatchRequestEntry: CallbackTo[AccounttaxCustomBatchRequestEntry],
    newAmount: CallbackTo[Amount],
    newCarrierRate: CallbackTo[CarrierRate],
    newCustomAttribute: CallbackTo[CustomAttribute],
    newCustomGroup: CallbackTo[CustomGroup],
    newCutoffTime: CallbackTo[CutoffTime],
    newDatafeed: CallbackTo[Datafeed],
    newDatafeedFetchSchedule: CallbackTo[DatafeedFetchSchedule],
    newDatafeedFormat: CallbackTo[DatafeedFormat],
    newDatafeedTarget: CallbackTo[DatafeedTarget],
    newDatafeedsCustomBatchRequest: CallbackTo[DatafeedsCustomBatchRequest],
    newDatafeedsCustomBatchRequestEntry: CallbackTo[DatafeedsCustomBatchRequestEntry],
    newDatafeedstatusesCustomBatchRequest: CallbackTo[DatafeedstatusesCustomBatchRequest],
    newDatafeedstatusesCustomBatchRequestEntry: CallbackTo[DatafeedstatusesCustomBatchRequestEntry],
    newDeliveryTime: CallbackTo[DeliveryTime],
    newError: CallbackTo[Error],
    newHeaders: CallbackTo[Headers],
    newHolidayCutoff: CallbackTo[HolidayCutoff],
    newInstallment: CallbackTo[Installment],
    newInventory: CallbackTo[Inventory],
    newInventoryCustomBatchRequest: CallbackTo[InventoryCustomBatchRequest],
    newInventoryCustomBatchRequestEntry: CallbackTo[InventoryCustomBatchRequestEntry],
    newInventoryPickup: CallbackTo[InventoryPickup],
    newInventorySetRequest: CallbackTo[InventorySetRequest],
    newInvoiceSummary: CallbackTo[InvoiceSummary],
    newInvoiceSummaryAdditionalChargeSummary: CallbackTo[InvoiceSummaryAdditionalChargeSummary],
    newLiaAboutPageSettings: CallbackTo[LiaAboutPageSettings],
    newLiaCountrySettings: CallbackTo[LiaCountrySettings],
    newLiaInventorySettings: CallbackTo[LiaInventorySettings],
    newLiaOnDisplayToOrderSettings: CallbackTo[LiaOnDisplayToOrderSettings],
    newLiaPosDataProvider: CallbackTo[LiaPosDataProvider],
    newLiaSettings: CallbackTo[LiaSettings],
    newLiasettingsCustomBatchRequest: CallbackTo[LiasettingsCustomBatchRequest],
    newLiasettingsCustomBatchRequestEntry: CallbackTo[LiasettingsCustomBatchRequestEntry],
    newLocationIdSet: CallbackTo[LocationIdSet],
    newLoyaltyPoints: CallbackTo[LoyaltyPoints],
    newOrderLegacyPromotion: CallbackTo[OrderLegacyPromotion],
    newOrderLegacyPromotionBenefit: CallbackTo[OrderLegacyPromotionBenefit],
    newOrderLineItemProductVariantAttribute: CallbackTo[OrderLineItemProductVariantAttribute],
    newOrderLineItemReturnInfo: CallbackTo[OrderLineItemReturnInfo],
    newOrderLineItemShippingDetails: CallbackTo[OrderLineItemShippingDetails],
    newOrderLineItemShippingDetailsMethod: CallbackTo[OrderLineItemShippingDetailsMethod],
    newOrderMerchantProvidedAnnotation: CallbackTo[OrderMerchantProvidedAnnotation],
    newOrderShipmentLineItemShipment: CallbackTo[OrderShipmentLineItemShipment],
    newOrderinvoicesCreateChargeInvoiceRequest: CallbackTo[OrderinvoicesCreateChargeInvoiceRequest],
    newOrderinvoicesCreateRefundInvoiceRequest: CallbackTo[OrderinvoicesCreateRefundInvoiceRequest],
    newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption: CallbackTo[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption],
    newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption: CallbackTo[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption],
    newOrderpaymentsNotifyAuthApprovedRequest: CallbackTo[OrderpaymentsNotifyAuthApprovedRequest],
    newOrderpaymentsNotifyAuthDeclinedRequest: CallbackTo[OrderpaymentsNotifyAuthDeclinedRequest],
    newOrderpaymentsNotifyChargeRequest: CallbackTo[OrderpaymentsNotifyChargeRequest],
    newOrderpaymentsNotifyRefundRequest: CallbackTo[OrderpaymentsNotifyRefundRequest],
    newOrdersAcknowledgeRequest: CallbackTo[OrdersAcknowledgeRequest],
    newOrdersCancelLineItemRequest: CallbackTo[OrdersCancelLineItemRequest],
    newOrdersCancelRequest: CallbackTo[OrdersCancelRequest],
    newOrdersCancelTestOrderByCustomerRequest: CallbackTo[OrdersCancelTestOrderByCustomerRequest],
    newOrdersCreateTestOrderRequest: CallbackTo[OrdersCreateTestOrderRequest],
    newOrdersCreateTestReturnRequest: CallbackTo[OrdersCreateTestReturnRequest],
    newOrdersCustomBatchRequest: CallbackTo[OrdersCustomBatchRequest],
    newOrdersCustomBatchRequestEntry: CallbackTo[OrdersCustomBatchRequestEntry],
    newOrdersCustomBatchRequestEntryCancel: CallbackTo[OrdersCustomBatchRequestEntryCancel],
    newOrdersCustomBatchRequestEntryCancelLineItem: CallbackTo[OrdersCustomBatchRequestEntryCancelLineItem],
    newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem: CallbackTo[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem],
    newOrdersCustomBatchRequestEntryInStoreRefundLineItem: CallbackTo[OrdersCustomBatchRequestEntryInStoreRefundLineItem],
    newOrdersCustomBatchRequestEntryRefund: CallbackTo[OrdersCustomBatchRequestEntryRefund],
    newOrdersCustomBatchRequestEntryRejectReturnLineItem: CallbackTo[OrdersCustomBatchRequestEntryRejectReturnLineItem],
    newOrdersCustomBatchRequestEntryReturnLineItem: CallbackTo[OrdersCustomBatchRequestEntryReturnLineItem],
    newOrdersCustomBatchRequestEntryReturnRefundLineItem: CallbackTo[OrdersCustomBatchRequestEntryReturnRefundLineItem],
    newOrdersCustomBatchRequestEntrySetLineItemMetadata: CallbackTo[OrdersCustomBatchRequestEntrySetLineItemMetadata],
    newOrdersCustomBatchRequestEntryShipLineItems: CallbackTo[OrdersCustomBatchRequestEntryShipLineItems],
    newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo: CallbackTo[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo],
    newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails: CallbackTo[OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails],
    newOrdersCustomBatchRequestEntryUpdateShipment: CallbackTo[OrdersCustomBatchRequestEntryUpdateShipment],
    newOrdersInStoreRefundLineItemRequest: CallbackTo[OrdersInStoreRefundLineItemRequest],
    newOrdersRefundRequest: CallbackTo[OrdersRefundRequest],
    newOrdersRejectReturnLineItemRequest: CallbackTo[OrdersRejectReturnLineItemRequest],
    newOrdersReturnLineItemRequest: CallbackTo[OrdersReturnLineItemRequest],
    newOrdersReturnRefundLineItemRequest: CallbackTo[OrdersReturnRefundLineItemRequest],
    newOrdersSetLineItemMetadataRequest: CallbackTo[OrdersSetLineItemMetadataRequest],
    newOrdersShipLineItemsRequest: CallbackTo[OrdersShipLineItemsRequest],
    newOrdersUpdateLineItemShippingDetailsRequest: CallbackTo[OrdersUpdateLineItemShippingDetailsRequest],
    newOrdersUpdateMerchantOrderIdRequest: CallbackTo[OrdersUpdateMerchantOrderIdRequest],
    newOrdersUpdateShipmentRequest: CallbackTo[OrdersUpdateShipmentRequest],
    newPosCustomBatchRequest: CallbackTo[PosCustomBatchRequest],
    newPosCustomBatchRequestEntry: CallbackTo[PosCustomBatchRequestEntry],
    newPosInventory: CallbackTo[PosInventory],
    newPosInventoryRequest: CallbackTo[PosInventoryRequest],
    newPosSale: CallbackTo[PosSale],
    newPosSaleRequest: CallbackTo[PosSaleRequest],
    newPosStore: CallbackTo[PosStore],
    newPostalCodeGroup: CallbackTo[PostalCodeGroup],
    newPostalCodeRange: CallbackTo[PostalCodeRange],
    newPrice: CallbackTo[Price],
    newProduct: CallbackTo[Product],
    newProductAspect: CallbackTo[ProductAspect],
    newProductDestination: CallbackTo[ProductDestination],
    newProductShipping: CallbackTo[ProductShipping],
    newProductShippingDimension: CallbackTo[ProductShippingDimension],
    newProductShippingWeight: CallbackTo[ProductShippingWeight],
    newProductTax: CallbackTo[ProductTax],
    newProductUnitPricingBaseMeasure: CallbackTo[ProductUnitPricingBaseMeasure],
    newProductUnitPricingMeasure: CallbackTo[ProductUnitPricingMeasure],
    newProductsCustomBatchRequest: CallbackTo[ProductsCustomBatchRequest],
    newProductsCustomBatchRequestEntry: CallbackTo[ProductsCustomBatchRequestEntry],
    newProductstatusesCustomBatchRequest: CallbackTo[ProductstatusesCustomBatchRequest],
    newProductstatusesCustomBatchRequestEntry: CallbackTo[ProductstatusesCustomBatchRequestEntry],
    newPromotion: CallbackTo[Promotion],
    newRateGroup: CallbackTo[RateGroup],
    newRow: CallbackTo[Row],
    newService: CallbackTo[Service],
    newShipmentInvoice: CallbackTo[ShipmentInvoice],
    newShipmentInvoiceLineItemInvoice: CallbackTo[ShipmentInvoiceLineItemInvoice],
    newShippingSettings: CallbackTo[ShippingSettings],
    newShippingsettingsCustomBatchRequest: CallbackTo[ShippingsettingsCustomBatchRequest],
    newShippingsettingsCustomBatchRequestEntry: CallbackTo[ShippingsettingsCustomBatchRequestEntry],
    newTable: CallbackTo[Table],
    newTestOrder: CallbackTo[TestOrder],
    newTestOrderCustomer: CallbackTo[TestOrderCustomer],
    newTestOrderCustomerMarketingRightsInfo: CallbackTo[TestOrderCustomerMarketingRightsInfo],
    newTestOrderLineItem: CallbackTo[TestOrderLineItem],
    newTestOrderLineItemProduct: CallbackTo[TestOrderLineItemProduct],
    newTestOrderPaymentMethod: CallbackTo[TestOrderPaymentMethod],
    newTransitTable: CallbackTo[TransitTable],
    newTransitTableTransitTimeRow: CallbackTo[TransitTableTransitTimeRow],
    newTransitTableTransitTimeRowTransitTimeValue: CallbackTo[TransitTableTransitTimeRowTransitTimeValue],
    newUnitInvoice: CallbackTo[UnitInvoice],
    newUnitInvoiceAdditionalCharge: CallbackTo[UnitInvoiceAdditionalCharge],
    newUnitInvoiceTaxLine: CallbackTo[UnitInvoiceTaxLine],
    newValue: CallbackTo[Value],
    newWeight: CallbackTo[Weight],
    Accounts: AccountsCollection = null,
    Accountstatuses: AccountstatusesCollection = null,
    Accounttax: AccounttaxCollection = null,
    Datafeeds: DatafeedsCollection = null,
    Datafeedstatuses: DatafeedstatusesCollection = null,
    Inventory: InventoryCollection = null,
    Liasettings: LiasettingsCollection = null,
    Orderinvoices: OrderinvoicesCollection = null,
    Orderpayments: OrderpaymentsCollection = null,
    Orderreports: OrderreportsCollection = null,
    Orderreturns: OrderreturnsCollection = null,
    Orders: OrdersCollection = null,
    Pos: PosCollection = null,
    Products: ProductsCollection = null,
    Productstatuses: ProductstatusesCollection = null,
    Shippingsettings: ShippingsettingsCollection = null
  ): Content_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAccount")(newAccount.toJsFn)
    __obj.updateDynamic("newAccountAddress")(newAccountAddress.toJsFn)
    __obj.updateDynamic("newAccountAdwordsLink")(newAccountAdwordsLink.toJsFn)
    __obj.updateDynamic("newAccountBusinessInformation")(newAccountBusinessInformation.toJsFn)
    __obj.updateDynamic("newAccountCustomerService")(newAccountCustomerService.toJsFn)
    __obj.updateDynamic("newAccountGoogleMyBusinessLink")(newAccountGoogleMyBusinessLink.toJsFn)
    __obj.updateDynamic("newAccountTax")(newAccountTax.toJsFn)
    __obj.updateDynamic("newAccountTaxTaxRule")(newAccountTaxTaxRule.toJsFn)
    __obj.updateDynamic("newAccountUser")(newAccountUser.toJsFn)
    __obj.updateDynamic("newAccountYouTubeChannelLink")(newAccountYouTubeChannelLink.toJsFn)
    __obj.updateDynamic("newAccountsCustomBatchRequest")(newAccountsCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newAccountsCustomBatchRequestEntry")(newAccountsCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newAccountsCustomBatchRequestEntryLinkRequest")(newAccountsCustomBatchRequestEntryLinkRequest.toJsFn)
    __obj.updateDynamic("newAccountsLinkRequest")(newAccountsLinkRequest.toJsFn)
    __obj.updateDynamic("newAccountstatusesCustomBatchRequest")(newAccountstatusesCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newAccountstatusesCustomBatchRequestEntry")(newAccountstatusesCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newAccounttaxCustomBatchRequest")(newAccounttaxCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newAccounttaxCustomBatchRequestEntry")(newAccounttaxCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newAmount")(newAmount.toJsFn)
    __obj.updateDynamic("newCarrierRate")(newCarrierRate.toJsFn)
    __obj.updateDynamic("newCustomAttribute")(newCustomAttribute.toJsFn)
    __obj.updateDynamic("newCustomGroup")(newCustomGroup.toJsFn)
    __obj.updateDynamic("newCutoffTime")(newCutoffTime.toJsFn)
    __obj.updateDynamic("newDatafeed")(newDatafeed.toJsFn)
    __obj.updateDynamic("newDatafeedFetchSchedule")(newDatafeedFetchSchedule.toJsFn)
    __obj.updateDynamic("newDatafeedFormat")(newDatafeedFormat.toJsFn)
    __obj.updateDynamic("newDatafeedTarget")(newDatafeedTarget.toJsFn)
    __obj.updateDynamic("newDatafeedsCustomBatchRequest")(newDatafeedsCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newDatafeedsCustomBatchRequestEntry")(newDatafeedsCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newDatafeedstatusesCustomBatchRequest")(newDatafeedstatusesCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newDatafeedstatusesCustomBatchRequestEntry")(newDatafeedstatusesCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newDeliveryTime")(newDeliveryTime.toJsFn)
    __obj.updateDynamic("newError")(newError.toJsFn)
    __obj.updateDynamic("newHeaders")(newHeaders.toJsFn)
    __obj.updateDynamic("newHolidayCutoff")(newHolidayCutoff.toJsFn)
    __obj.updateDynamic("newInstallment")(newInstallment.toJsFn)
    __obj.updateDynamic("newInventory")(newInventory.toJsFn)
    __obj.updateDynamic("newInventoryCustomBatchRequest")(newInventoryCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newInventoryCustomBatchRequestEntry")(newInventoryCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newInventoryPickup")(newInventoryPickup.toJsFn)
    __obj.updateDynamic("newInventorySetRequest")(newInventorySetRequest.toJsFn)
    __obj.updateDynamic("newInvoiceSummary")(newInvoiceSummary.toJsFn)
    __obj.updateDynamic("newInvoiceSummaryAdditionalChargeSummary")(newInvoiceSummaryAdditionalChargeSummary.toJsFn)
    __obj.updateDynamic("newLiaAboutPageSettings")(newLiaAboutPageSettings.toJsFn)
    __obj.updateDynamic("newLiaCountrySettings")(newLiaCountrySettings.toJsFn)
    __obj.updateDynamic("newLiaInventorySettings")(newLiaInventorySettings.toJsFn)
    __obj.updateDynamic("newLiaOnDisplayToOrderSettings")(newLiaOnDisplayToOrderSettings.toJsFn)
    __obj.updateDynamic("newLiaPosDataProvider")(newLiaPosDataProvider.toJsFn)
    __obj.updateDynamic("newLiaSettings")(newLiaSettings.toJsFn)
    __obj.updateDynamic("newLiasettingsCustomBatchRequest")(newLiasettingsCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newLiasettingsCustomBatchRequestEntry")(newLiasettingsCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newLocationIdSet")(newLocationIdSet.toJsFn)
    __obj.updateDynamic("newLoyaltyPoints")(newLoyaltyPoints.toJsFn)
    __obj.updateDynamic("newOrderLegacyPromotion")(newOrderLegacyPromotion.toJsFn)
    __obj.updateDynamic("newOrderLegacyPromotionBenefit")(newOrderLegacyPromotionBenefit.toJsFn)
    __obj.updateDynamic("newOrderLineItemProductVariantAttribute")(newOrderLineItemProductVariantAttribute.toJsFn)
    __obj.updateDynamic("newOrderLineItemReturnInfo")(newOrderLineItemReturnInfo.toJsFn)
    __obj.updateDynamic("newOrderLineItemShippingDetails")(newOrderLineItemShippingDetails.toJsFn)
    __obj.updateDynamic("newOrderLineItemShippingDetailsMethod")(newOrderLineItemShippingDetailsMethod.toJsFn)
    __obj.updateDynamic("newOrderMerchantProvidedAnnotation")(newOrderMerchantProvidedAnnotation.toJsFn)
    __obj.updateDynamic("newOrderShipmentLineItemShipment")(newOrderShipmentLineItemShipment.toJsFn)
    __obj.updateDynamic("newOrderinvoicesCreateChargeInvoiceRequest")(newOrderinvoicesCreateChargeInvoiceRequest.toJsFn)
    __obj.updateDynamic("newOrderinvoicesCreateRefundInvoiceRequest")(newOrderinvoicesCreateRefundInvoiceRequest.toJsFn)
    __obj.updateDynamic("newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption")(newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption.toJsFn)
    __obj.updateDynamic("newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption")(newOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption.toJsFn)
    __obj.updateDynamic("newOrderpaymentsNotifyAuthApprovedRequest")(newOrderpaymentsNotifyAuthApprovedRequest.toJsFn)
    __obj.updateDynamic("newOrderpaymentsNotifyAuthDeclinedRequest")(newOrderpaymentsNotifyAuthDeclinedRequest.toJsFn)
    __obj.updateDynamic("newOrderpaymentsNotifyChargeRequest")(newOrderpaymentsNotifyChargeRequest.toJsFn)
    __obj.updateDynamic("newOrderpaymentsNotifyRefundRequest")(newOrderpaymentsNotifyRefundRequest.toJsFn)
    __obj.updateDynamic("newOrdersAcknowledgeRequest")(newOrdersAcknowledgeRequest.toJsFn)
    __obj.updateDynamic("newOrdersCancelLineItemRequest")(newOrdersCancelLineItemRequest.toJsFn)
    __obj.updateDynamic("newOrdersCancelRequest")(newOrdersCancelRequest.toJsFn)
    __obj.updateDynamic("newOrdersCancelTestOrderByCustomerRequest")(newOrdersCancelTestOrderByCustomerRequest.toJsFn)
    __obj.updateDynamic("newOrdersCreateTestOrderRequest")(newOrdersCreateTestOrderRequest.toJsFn)
    __obj.updateDynamic("newOrdersCreateTestReturnRequest")(newOrdersCreateTestReturnRequest.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequest")(newOrdersCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntry")(newOrdersCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryCancel")(newOrdersCustomBatchRequestEntryCancel.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryCancelLineItem")(newOrdersCustomBatchRequestEntryCancelLineItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem")(newOrdersCustomBatchRequestEntryCreateTestReturnReturnItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryInStoreRefundLineItem")(newOrdersCustomBatchRequestEntryInStoreRefundLineItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryRefund")(newOrdersCustomBatchRequestEntryRefund.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryRejectReturnLineItem")(newOrdersCustomBatchRequestEntryRejectReturnLineItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryReturnLineItem")(newOrdersCustomBatchRequestEntryReturnLineItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryReturnRefundLineItem")(newOrdersCustomBatchRequestEntryReturnRefundLineItem.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntrySetLineItemMetadata")(newOrdersCustomBatchRequestEntrySetLineItemMetadata.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryShipLineItems")(newOrdersCustomBatchRequestEntryShipLineItems.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo")(newOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails")(newOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails.toJsFn)
    __obj.updateDynamic("newOrdersCustomBatchRequestEntryUpdateShipment")(newOrdersCustomBatchRequestEntryUpdateShipment.toJsFn)
    __obj.updateDynamic("newOrdersInStoreRefundLineItemRequest")(newOrdersInStoreRefundLineItemRequest.toJsFn)
    __obj.updateDynamic("newOrdersRefundRequest")(newOrdersRefundRequest.toJsFn)
    __obj.updateDynamic("newOrdersRejectReturnLineItemRequest")(newOrdersRejectReturnLineItemRequest.toJsFn)
    __obj.updateDynamic("newOrdersReturnLineItemRequest")(newOrdersReturnLineItemRequest.toJsFn)
    __obj.updateDynamic("newOrdersReturnRefundLineItemRequest")(newOrdersReturnRefundLineItemRequest.toJsFn)
    __obj.updateDynamic("newOrdersSetLineItemMetadataRequest")(newOrdersSetLineItemMetadataRequest.toJsFn)
    __obj.updateDynamic("newOrdersShipLineItemsRequest")(newOrdersShipLineItemsRequest.toJsFn)
    __obj.updateDynamic("newOrdersUpdateLineItemShippingDetailsRequest")(newOrdersUpdateLineItemShippingDetailsRequest.toJsFn)
    __obj.updateDynamic("newOrdersUpdateMerchantOrderIdRequest")(newOrdersUpdateMerchantOrderIdRequest.toJsFn)
    __obj.updateDynamic("newOrdersUpdateShipmentRequest")(newOrdersUpdateShipmentRequest.toJsFn)
    __obj.updateDynamic("newPosCustomBatchRequest")(newPosCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newPosCustomBatchRequestEntry")(newPosCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newPosInventory")(newPosInventory.toJsFn)
    __obj.updateDynamic("newPosInventoryRequest")(newPosInventoryRequest.toJsFn)
    __obj.updateDynamic("newPosSale")(newPosSale.toJsFn)
    __obj.updateDynamic("newPosSaleRequest")(newPosSaleRequest.toJsFn)
    __obj.updateDynamic("newPosStore")(newPosStore.toJsFn)
    __obj.updateDynamic("newPostalCodeGroup")(newPostalCodeGroup.toJsFn)
    __obj.updateDynamic("newPostalCodeRange")(newPostalCodeRange.toJsFn)
    __obj.updateDynamic("newPrice")(newPrice.toJsFn)
    __obj.updateDynamic("newProduct")(newProduct.toJsFn)
    __obj.updateDynamic("newProductAspect")(newProductAspect.toJsFn)
    __obj.updateDynamic("newProductDestination")(newProductDestination.toJsFn)
    __obj.updateDynamic("newProductShipping")(newProductShipping.toJsFn)
    __obj.updateDynamic("newProductShippingDimension")(newProductShippingDimension.toJsFn)
    __obj.updateDynamic("newProductShippingWeight")(newProductShippingWeight.toJsFn)
    __obj.updateDynamic("newProductTax")(newProductTax.toJsFn)
    __obj.updateDynamic("newProductUnitPricingBaseMeasure")(newProductUnitPricingBaseMeasure.toJsFn)
    __obj.updateDynamic("newProductUnitPricingMeasure")(newProductUnitPricingMeasure.toJsFn)
    __obj.updateDynamic("newProductsCustomBatchRequest")(newProductsCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newProductsCustomBatchRequestEntry")(newProductsCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newProductstatusesCustomBatchRequest")(newProductstatusesCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newProductstatusesCustomBatchRequestEntry")(newProductstatusesCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newPromotion")(newPromotion.toJsFn)
    __obj.updateDynamic("newRateGroup")(newRateGroup.toJsFn)
    __obj.updateDynamic("newRow")(newRow.toJsFn)
    __obj.updateDynamic("newService")(newService.toJsFn)
    __obj.updateDynamic("newShipmentInvoice")(newShipmentInvoice.toJsFn)
    __obj.updateDynamic("newShipmentInvoiceLineItemInvoice")(newShipmentInvoiceLineItemInvoice.toJsFn)
    __obj.updateDynamic("newShippingSettings")(newShippingSettings.toJsFn)
    __obj.updateDynamic("newShippingsettingsCustomBatchRequest")(newShippingsettingsCustomBatchRequest.toJsFn)
    __obj.updateDynamic("newShippingsettingsCustomBatchRequestEntry")(newShippingsettingsCustomBatchRequestEntry.toJsFn)
    __obj.updateDynamic("newTable")(newTable.toJsFn)
    __obj.updateDynamic("newTestOrder")(newTestOrder.toJsFn)
    __obj.updateDynamic("newTestOrderCustomer")(newTestOrderCustomer.toJsFn)
    __obj.updateDynamic("newTestOrderCustomerMarketingRightsInfo")(newTestOrderCustomerMarketingRightsInfo.toJsFn)
    __obj.updateDynamic("newTestOrderLineItem")(newTestOrderLineItem.toJsFn)
    __obj.updateDynamic("newTestOrderLineItemProduct")(newTestOrderLineItemProduct.toJsFn)
    __obj.updateDynamic("newTestOrderPaymentMethod")(newTestOrderPaymentMethod.toJsFn)
    __obj.updateDynamic("newTransitTable")(newTransitTable.toJsFn)
    __obj.updateDynamic("newTransitTableTransitTimeRow")(newTransitTableTransitTimeRow.toJsFn)
    __obj.updateDynamic("newTransitTableTransitTimeRowTransitTimeValue")(newTransitTableTransitTimeRowTransitTimeValue.toJsFn)
    __obj.updateDynamic("newUnitInvoice")(newUnitInvoice.toJsFn)
    __obj.updateDynamic("newUnitInvoiceAdditionalCharge")(newUnitInvoiceAdditionalCharge.toJsFn)
    __obj.updateDynamic("newUnitInvoiceTaxLine")(newUnitInvoiceTaxLine.toJsFn)
    __obj.updateDynamic("newValue")(newValue.toJsFn)
    __obj.updateDynamic("newWeight")(newWeight.toJsFn)
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (Accountstatuses != null) __obj.updateDynamic("Accountstatuses")(Accountstatuses.asInstanceOf[js.Any])
    if (Accounttax != null) __obj.updateDynamic("Accounttax")(Accounttax.asInstanceOf[js.Any])
    if (Datafeeds != null) __obj.updateDynamic("Datafeeds")(Datafeeds.asInstanceOf[js.Any])
    if (Datafeedstatuses != null) __obj.updateDynamic("Datafeedstatuses")(Datafeedstatuses.asInstanceOf[js.Any])
    if (Inventory != null) __obj.updateDynamic("Inventory")(Inventory.asInstanceOf[js.Any])
    if (Liasettings != null) __obj.updateDynamic("Liasettings")(Liasettings.asInstanceOf[js.Any])
    if (Orderinvoices != null) __obj.updateDynamic("Orderinvoices")(Orderinvoices.asInstanceOf[js.Any])
    if (Orderpayments != null) __obj.updateDynamic("Orderpayments")(Orderpayments.asInstanceOf[js.Any])
    if (Orderreports != null) __obj.updateDynamic("Orderreports")(Orderreports.asInstanceOf[js.Any])
    if (Orderreturns != null) __obj.updateDynamic("Orderreturns")(Orderreturns.asInstanceOf[js.Any])
    if (Orders != null) __obj.updateDynamic("Orders")(Orders.asInstanceOf[js.Any])
    if (Pos != null) __obj.updateDynamic("Pos")(Pos.asInstanceOf[js.Any])
    if (Products != null) __obj.updateDynamic("Products")(Products.asInstanceOf[js.Any])
    if (Productstatuses != null) __obj.updateDynamic("Productstatuses")(Productstatuses.asInstanceOf[js.Any])
    if (Shippingsettings != null) __obj.updateDynamic("Shippingsettings")(Shippingsettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content_]
  }
}

