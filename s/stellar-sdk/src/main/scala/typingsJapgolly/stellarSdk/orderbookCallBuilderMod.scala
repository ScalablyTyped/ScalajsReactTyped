package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.OrderbookRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/orderbook_call_builder", JSImport.Namespace)
@js.native
object orderbookCallBuilderMod extends js.Object {
  @js.native
  class OrderbookCallBuilder protected () extends CallBuilder[OrderbookRecord] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      selling: Asset,
      buying: Asset
    ) = this()
  }
  
}

