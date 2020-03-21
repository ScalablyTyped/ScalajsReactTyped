package typingsJapgolly.stellarSdk

import typingsJapgolly.std.Record
import typingsJapgolly.stellarBase.mod.AssetType
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.AccountThresholds
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BalanceLine
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.Flags
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.AccountRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CallFunctionTemplateOptions
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.EffectRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.OfferRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.OperationRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.PaymentOperationRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.TradeRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_response", JSImport.Namespace)
@js.native
object accountResponseMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord extends any ? std.Pick<stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, utility-types.utility-types/dist/mapped-types.SetComplement<keyof stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, '_links'>> : never */ @js.native
  class AccountResponse protected () extends js.Object {
    def this(response: AccountRecord) = this()
    val _baseAccount: js.Any = js.native
    val account_id: String = js.native
    val balances: js.Array[BalanceLine[AssetType]] = js.native
    val data_attr: Record[String, String] = js.native
    val flags: Flags = js.native
    val id: String = js.native
    val inflation_destination: String = js.native
    val last_modified_ledger: Double = js.native
    val paging_token: String = js.native
    var sequence: String = js.native
    val signers: js.Array[AccountRecordSigners] = js.native
    val subentry_count: Double = js.native
    val thresholds: AccountThresholds = js.native
    def accountId(): String = js.native
    def data(options: AnonValue): js.Promise[AnonValue] = js.native
    def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
    def incrementSequenceNumber(): Unit = js.native
    def offers(): js.Promise[CollectionPage[OfferRecord]] = js.native
    def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OfferRecord]] = js.native
    def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
    def payments(): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def sequenceNumber(): String = js.native
    def trades(): js.Promise[CollectionPage[TradeRecord]] = js.native
    def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TradeRecord]] = js.native
  }
  
}

