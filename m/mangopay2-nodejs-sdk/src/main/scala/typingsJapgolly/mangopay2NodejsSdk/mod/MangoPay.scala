package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.typesMod.ApiMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoPay extends js.Object {
  var BankAccounts: typingsJapgolly.mangopay2NodejsSdk.mod.BankAccounts = js.native
  var BankingAliases: typingsJapgolly.mangopay2NodejsSdk.mod.BankingAliases = js.native
  var CardPreAuthorizations: typingsJapgolly.mangopay2NodejsSdk.mod.CardPreAuthorizations = js.native
  var CardRegistrations: typingsJapgolly.mangopay2NodejsSdk.mod.CardRegistrations = js.native
  var Cards: typingsJapgolly.mangopay2NodejsSdk.mod.Cards = js.native
  var Clients: typingsJapgolly.mangopay2NodejsSdk.mod.Clients = js.native
  var DisputeDocuments: typingsJapgolly.mangopay2NodejsSdk.mod.DisputeDocuments = js.native
  var Disputes: typingsJapgolly.mangopay2NodejsSdk.mod.Disputes = js.native
  var Events: typingsJapgolly.mangopay2NodejsSdk.mod.Events = js.native
  var Hooks: typingsJapgolly.mangopay2NodejsSdk.mod.Hooks = js.native
  var KycDocuments: typingsJapgolly.mangopay2NodejsSdk.mod.KycDocuments = js.native
  var Mandates: typingsJapgolly.mangopay2NodejsSdk.mod.Mandates = js.native
  var PayIns: typingsJapgolly.mangopay2NodejsSdk.mod.PayIns = js.native
  var PayOuts: typingsJapgolly.mangopay2NodejsSdk.mod.PayOuts = js.native
  var Refunds: typingsJapgolly.mangopay2NodejsSdk.mod.Refunds = js.native
  var Reports: typingsJapgolly.mangopay2NodejsSdk.mod.Reports = js.native
  var Repudiations: typingsJapgolly.mangopay2NodejsSdk.mod.Repudiations = js.native
  var Responses: typingsJapgolly.mangopay2NodejsSdk.mod.Responses = js.native
  var Transfers: typingsJapgolly.mangopay2NodejsSdk.mod.Transfers = js.native
  var UboDeclarations: typingsJapgolly.mangopay2NodejsSdk.mod.UboDeclarations = js.native
  var Users: typingsJapgolly.mangopay2NodejsSdk.mod.Users = js.native
  var Wallets: typingsJapgolly.mangopay2NodejsSdk.mod.Wallets = js.native
  var config: Config = js.native
  var models: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MangoPay.models */ js.Any = js.native
  var requestOptions: RequestOptions = js.native
  def Log(args: js.Any*): Unit = js.native
  def authorize(): js.Promise[AuthorizationData] = js.native
  def authorize(callback: js.Function1[/* data */ AuthorizationData, Unit]): Unit = js.native
  def buildRequestData(entity: js.Any): js.Any = js.native
  def canReadSubRequestData(entity: js.Any, propertyName: js.Any): Boolean = js.native
  def isExpired(): Boolean = js.native
  def method(method: ApiMethod, callback: js.Function1[/* repeated */ js.Any, Unit], options: RequestOptions): js.Any = js.native
}

