package typingsJapgolly.stellarSdk.tradeAggregationCallBuilderMod

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/trade_aggregation_call_builder", "TradeAggregationCallBuilder")
@js.native
class TradeAggregationCallBuilder protected () extends CallBuilder[CollectionPage[TradeAggregationRecord]] {
  def this(
    serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
    base: Asset,
    counter: Asset,
    start_time: Double,
    end_time: Double,
    resolution: Double,
    offset: Double
  ) = this()
  var isValidOffset: js.Any = js.native
  var isValidResolution: js.Any = js.native
}

