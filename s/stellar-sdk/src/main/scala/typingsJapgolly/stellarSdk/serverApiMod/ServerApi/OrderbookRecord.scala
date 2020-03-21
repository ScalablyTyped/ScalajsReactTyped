package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarSdk.AnonAmount
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderbookRecord
  extends BaseResponse[scala.Nothing] {
  var asks: js.Array[AnonAmount]
  var base: Asset
  var bids: js.Array[AnonAmount]
  var counter: Asset
}

object OrderbookRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsJapgolly.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    asks: js.Array[AnonAmount],
    base: Asset,
    bids: js.Array[AnonAmount],
    counter: Asset
  ): OrderbookRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asks = asks.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bids = bids.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrderbookRecord]
  }
}

