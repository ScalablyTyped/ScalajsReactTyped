package typingsJapgolly.stripe.mod

import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.stripe.AnonBindingsversion
import typingsJapgolly.stripe.AnonPartnerid
import typingsJapgolly.stripe.mod.resources.Accounts
import typingsJapgolly.stripe.mod.resources.ApplicationFees
import typingsJapgolly.stripe.mod.resources.Balance
import typingsJapgolly.stripe.mod.resources.BalanceTransaction
import typingsJapgolly.stripe.mod.resources.BitcoinReceivers
import typingsJapgolly.stripe.mod.resources.Charges
import typingsJapgolly.stripe.mod.resources.Checkout
import typingsJapgolly.stripe.mod.resources.CountrySpecs
import typingsJapgolly.stripe.mod.resources.Coupons
import typingsJapgolly.stripe.mod.resources.CreditNotes
import typingsJapgolly.stripe.mod.resources.Customers
import typingsJapgolly.stripe.mod.resources.Disputes
import typingsJapgolly.stripe.mod.resources.EphemeralKeys
import typingsJapgolly.stripe.mod.resources.Events
import typingsJapgolly.stripe.mod.resources.FileLinks
import typingsJapgolly.stripe.mod.resources.Files
import typingsJapgolly.stripe.mod.resources.InvoiceItems
import typingsJapgolly.stripe.mod.resources.Invoices
import typingsJapgolly.stripe.mod.resources.Issuing
import typingsJapgolly.stripe.mod.resources.OAuth
import typingsJapgolly.stripe.mod.resources.Orders
import typingsJapgolly.stripe.mod.resources.PaymentIntents
import typingsJapgolly.stripe.mod.resources.PaymentMethods
import typingsJapgolly.stripe.mod.resources.Payouts
import typingsJapgolly.stripe.mod.resources.Plans
import typingsJapgolly.stripe.mod.resources.Products
import typingsJapgolly.stripe.mod.resources.RecipientCards
import typingsJapgolly.stripe.mod.resources.Recipients
import typingsJapgolly.stripe.mod.resources.Refunds
import typingsJapgolly.stripe.mod.resources.Reviews
import typingsJapgolly.stripe.mod.resources.SKUs
import typingsJapgolly.stripe.mod.resources.SetupIntents
import typingsJapgolly.stripe.mod.resources.Sources
import typingsJapgolly.stripe.mod.resources.SubscriptionItems
import typingsJapgolly.stripe.mod.resources.Subscriptions
import typingsJapgolly.stripe.mod.resources.TaxRates
import typingsJapgolly.stripe.mod.resources.Tokens
import typingsJapgolly.stripe.mod.resources.Topups
import typingsJapgolly.stripe.mod.resources.Transfers
import typingsJapgolly.stripe.mod.resources.UsageRecordSummaries
import typingsJapgolly.stripe.mod.resources.UsageRecords
import typingsJapgolly.stripe.mod.resources.WebHooks
import typingsJapgolly.stripe.mod.resources.WebhookEndpoints
import typingsJapgolly.stripe.stripeStrings.request
import typingsJapgolly.stripe.stripeStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  var DEFAULT_API_VERSION: String = js.native
  var DEFAULT_BASE_PATH: String = js.native
  var DEFAULT_HOST: String = js.native
  var DEFAULT_PORT: String = js.native
  var DEFAULT_TIMEOUT: Double = js.native
  var PACKAGE_VERSION: String = js.native
  var StripeResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.StripeResource */ js.Any = js.native
  var USER_AGENT: AnonBindingsversion = js.native
  var USER_AGENT_SERIALIZED: String = js.native
  var accounts: Accounts = js.native
  var applicationFees: ApplicationFees = js.native
  var balance: Balance = js.native
  var balanceTransactions: BalanceTransaction = js.native
  var bitcoinReceivers: BitcoinReceivers = js.native
  var charges: Charges = js.native
  var checkout: Checkout = js.native
  var countrySpecs: CountrySpecs = js.native
  var coupons: Coupons = js.native
  var creditNotes: CreditNotes = js.native
  var customers: Customers = js.native
  var disputes: Disputes = js.native
  var ephemeralKeys: EphemeralKeys = js.native
  var events: Events = js.native
  var fileLinks: FileLinks = js.native
  var files: Files = js.native
  var invoiceItems: InvoiceItems = js.native
  var invoices: Invoices = js.native
  var issuing: Issuing = js.native
  var oauth: OAuth = js.native
  var orders: Orders = js.native
  var paymentIntents: PaymentIntents = js.native
  var paymentMethods: PaymentMethods = js.native
  var payouts: Payouts = js.native
  var plans: Plans = js.native
  var products: Products = js.native
  /**
    * @deprecated
    */
  var recipientCards: RecipientCards = js.native
  /**
    * @deprecated
    */
  var recipients: Recipients = js.native
  var refunds: Refunds = js.native
  var resources: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.resources */ js.Any = js.native
  var reviews: Reviews = js.native
  var setupIntents: SetupIntents = js.native
  var skus: SKUs = js.native
  var sources: Sources = js.native
  var subscriptionItems: SubscriptionItems = js.native
  var subscriptions: Subscriptions = js.native
  var taxRates: TaxRates = js.native
  var tokens: Tokens = js.native
  var topups: Topups = js.native
  var transfers: Transfers = js.native
  var usageRecordSummaries: UsageRecordSummaries = js.native
  var usageRecords: UsageRecords = js.native
  var webhookEndpoints: WebhookEndpoints = js.native
  var webhooks: WebHooks = js.native
  def getClientUserAgent(response: js.Function1[/* userAgent */ String, Unit]): Unit = js.native
  def getConstant(c: String): js.Any = js.native
  def getMaxNetworkRetries(): Double = js.native
  def getTelemetryEnabled(): Boolean = js.native
  @JSName("off")
  def off_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  def setApiKey(): Unit = js.native
  def setApiKey(key: String): Unit = js.native
  def setApiVersion(): Unit = js.native
  def setApiVersion(version: String): Unit = js.native
  def setAppInfo(): Unit = js.native
  def setAppInfo(info: AnonPartnerid): Unit = js.native
  def setHost(host: String): Unit = js.native
  def setHost(host: String, port: String): Unit = js.native
  def setHost(host: String, port: String, protocol: String): Unit = js.native
  def setHost(host: String, port: Double): Unit = js.native
  def setHost(host: String, port: Double, protocol: String): Unit = js.native
  def setHttpAgent(agent: Agent): Unit = js.native
  def setMaxNetworkRetries(maxNetworkRetries: Double): Unit = js.native
  def setPort(port: String): Unit = js.native
  def setPort(port: Double): Unit = js.native
  def setProtocol(protocol: String): Unit = js.native
  def setTelemetryEnabled(enabled: Boolean): Unit = js.native
  def setTimeout(): Unit = js.native
  def setTimeout(timeout: Double): Unit = js.native
}

