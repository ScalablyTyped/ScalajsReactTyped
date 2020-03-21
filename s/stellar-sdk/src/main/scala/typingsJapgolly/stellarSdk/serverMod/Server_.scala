package typingsJapgolly.stellarSdk.serverMod

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarBase.mod.Memo
import typingsJapgolly.stellarBase.mod.MemoType
import typingsJapgolly.stellarBase.mod.Operation
import typingsJapgolly.stellarBase.mod.Transaction
import typingsJapgolly.stellarSdk.AccountResponse
import typingsJapgolly.stellarSdk.accountCallBuilderMod.AccountCallBuilder
import typingsJapgolly.stellarSdk.assetsCallBuilderMod.AssetsCallBuilder
import typingsJapgolly.stellarSdk.effectCallBuilderMod.EffectCallBuilder
import typingsJapgolly.stellarSdk.friendbotBuilderMod.FriendbotBuilder
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.SubmitTransactionResponse
import typingsJapgolly.stellarSdk.ledgerCallBuilderMod.LedgerCallBuilder
import typingsJapgolly.stellarSdk.offerCallBuilderMod.OfferCallBuilder
import typingsJapgolly.stellarSdk.operationCallBuilderMod.OperationCallBuilder
import typingsJapgolly.stellarSdk.orderbookCallBuilderMod.OrderbookCallBuilder
import typingsJapgolly.stellarSdk.pathCallBuilderMod.PathCallBuilder
import typingsJapgolly.stellarSdk.paymentCallBuilderMod.PaymentCallBuilder
import typingsJapgolly.stellarSdk.serverMod.Server.Options
import typingsJapgolly.stellarSdk.serverMod.Server.Timebounds
import typingsJapgolly.stellarSdk.tradeAggregationCallBuilderMod.TradeAggregationCallBuilder
import typingsJapgolly.stellarSdk.tradesCallBuilderMod.TradesCallBuilder
import typingsJapgolly.stellarSdk.transactionCallBuilderMod.TransactionCallBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/server", "Server")
@js.native
class Server_ protected () extends js.Object {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
  val serverURL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any = js.native
  def accounts(): AccountCallBuilder = js.native
  def assets(): AssetsCallBuilder = js.native
  def effects(): EffectCallBuilder = js.native
  def feeStats(): js.Promise[FeeStatsResponse] = js.native
  def fetchBaseFee(): js.Promise[Double] = js.native
  def fetchTimebounds(seconds: Double): js.Promise[Timebounds] = js.native
  def fetchTimebounds(seconds: Double, _isRetry: Boolean): js.Promise[Timebounds] = js.native
  def friendbot(address: String): FriendbotBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  def offers(resource: String, resourceParams: String*): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  def paths(source: String, destination: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def strictReceivePaths(source: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictReceivePaths(source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]): PathCallBuilder = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[SubmitTransactionResponse] = js.native
  def tradeAggregation(
    base: Asset,
    counter: Asset,
    start_time: Double,
    end_time: Double,
    resolution: Double,
    offset: Double
  ): TradeAggregationCallBuilder = js.native
  def trades(): TradesCallBuilder = js.native
  def transactions(): TransactionCallBuilder = js.native
}

