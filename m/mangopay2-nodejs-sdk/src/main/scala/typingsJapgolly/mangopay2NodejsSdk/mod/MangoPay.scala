package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mod.models.RateLimit
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.AuthorizationData
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.Config
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.RequestOptions
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.ApiMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoPay extends StObject {
  
  var BankAccounts: typingsJapgolly.mangopay2NodejsSdk.typingsServicesBankAccountsMod.BankAccounts = js.native
  
  var BankingAliases: typingsJapgolly.mangopay2NodejsSdk.typingsServicesBankingAliasesMod.BankingAliases = js.native
  
  var CardPreAuthorizations: typingsJapgolly.mangopay2NodejsSdk.typingsServicesCardPreauthorizationsMod.CardPreAuthorizations = js.native
  
  var CardRegistrations: typingsJapgolly.mangopay2NodejsSdk.typingsServicesCardRegistrationsMod.CardRegistrations = js.native
  
  var Cards: typingsJapgolly.mangopay2NodejsSdk.typingsServicesCardsMod.Cards = js.native
  
  var Clients: typingsJapgolly.mangopay2NodejsSdk.typingsServicesClientsMod.Clients = js.native
  
  var DisputeDocuments: typingsJapgolly.mangopay2NodejsSdk.typingsServicesDisputeDocumentsMod.DisputeDocuments = js.native
  
  var Disputes: typingsJapgolly.mangopay2NodejsSdk.typingsServicesDisputesMod.Disputes = js.native
  
  var Events: typingsJapgolly.mangopay2NodejsSdk.typingsServicesEventsMod.Events = js.native
  
  var Hooks: typingsJapgolly.mangopay2NodejsSdk.typingsServicesHooksMod.Hooks = js.native
  
  var Idempotency: typingsJapgolly.mangopay2NodejsSdk.typingsServicesIdempotencyMod.Idempotency = js.native
  
  var KycDocuments: typingsJapgolly.mangopay2NodejsSdk.typingsServicesKycDocumentsMod.KycDocuments = js.native
  
  def Log(args: Any*): Unit = js.native
  
  var Mandates: typingsJapgolly.mangopay2NodejsSdk.typingsServicesMandatesMod.Mandates = js.native
  
  var PayIns: typingsJapgolly.mangopay2NodejsSdk.typingsServicesPayInsMod.PayIns = js.native
  
  var PayOuts: typingsJapgolly.mangopay2NodejsSdk.typingsServicesPayOutsMod.PayOuts = js.native
  
  var Refunds: typingsJapgolly.mangopay2NodejsSdk.typingsServicesRefundsMod.Refunds = js.native
  
  var Regulatory: typingsJapgolly.mangopay2NodejsSdk.typingsServicesRegulatoryMod.Regulatory = js.native
  
  var Reports: typingsJapgolly.mangopay2NodejsSdk.typingsServicesReportsMod.Reports = js.native
  
  var Repudiations: typingsJapgolly.mangopay2NodejsSdk.typingsServicesRepudiationsMod.Repudiations = js.native
  
  var Responses: typingsJapgolly.mangopay2NodejsSdk.typingsServicesResponsesMod.Responses = js.native
  
  var Transfers: typingsJapgolly.mangopay2NodejsSdk.typingsServicesTransfersMod.Transfers = js.native
  
  var UboDeclarations: typingsJapgolly.mangopay2NodejsSdk.typingsServicesUboDeclarationsMod.UboDeclarations = js.native
  
  var Users: typingsJapgolly.mangopay2NodejsSdk.typingsServicesUsersMod.Users = js.native
  
  var Wallets: typingsJapgolly.mangopay2NodejsSdk.typingsServicesWalletsMod.Wallets = js.native
  
  def authorize(): js.Promise[AuthorizationData] = js.native
  def authorize(callback: js.Function1[/* data */ AuthorizationData, Unit]): Unit = js.native
  
  def buildRequestData(entity: Any): Any = js.native
  
  def canReadSubRequestData(entity: Any, propertyName: Any): Boolean = js.native
  
  var config: Config = js.native
  
  def isExpired(): Boolean = js.native
  
  def method(method: ApiMethod, callback: js.Function1[/* repeated */ Any, Unit], options: RequestOptions): Any = js.native
  
  var models: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MangoPay.models */ Any = js.native
  
  var rateLimits: js.Array[RateLimit] = js.native
  
  var requestOptions: RequestOptions = js.native
}
