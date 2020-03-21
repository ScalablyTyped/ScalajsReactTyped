package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stellarBase.mod.AssetType
import typingsJapgolly.stellarSdk.AnonValue
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.AccountThresholds
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BalanceLine
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecord
  extends BaseResponse[scala.Nothing] {
  var account_id: String = js.native
  var balances: js.Array[BalanceLine[AssetType]] = js.native
  var data_attr: StringDictionary[String] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var flags: Flags = js.native
  var home_domain: js.UndefOr[String] = js.native
  var id: String = js.native
  var inflation_destination: js.UndefOr[String] = js.native
  var last_modified_ledger: Double = js.native
  @JSName("offers")
  var offers_Original: CallCollectionFunction[OfferRecord] = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: String = js.native
  @JSName("payments")
  var payments_Original: CallCollectionFunction[PaymentOperationRecord] = js.native
  var sequence: String = js.native
  var signers: js.Array[AccountRecordSigners] = js.native
  var subentry_count: Double = js.native
  var thresholds: AccountThresholds = js.native
  @JSName("trades")
  var trades_Original: CallCollectionFunction[TradeRecord] = js.native
  def data(options: AnonValue): js.Promise[AnonValue] = js.native
  def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
  def offers(): js.Promise[CollectionPage[OfferRecord]] = js.native
  def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OfferRecord]] = js.native
  def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
  def payments(): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
  def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
  def trades(): js.Promise[CollectionPage[TradeRecord]] = js.native
  def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TradeRecord]] = js.native
}

