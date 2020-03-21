package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.TradeRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/trades_call_builder", JSImport.Namespace)
@js.native
object tradesCallBuilderMod extends js.Object {
  @js.native
  class TradesCallBuilder protected () extends CallBuilder[CollectionPage[TradeRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def forAccount(accountId: String): this.type = js.native
    def forAssetPair(base: Asset, counter: Asset): this.type = js.native
    def forOffer(offerId: String): this.type = js.native
  }
  
}

