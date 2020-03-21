package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarBase.mod.Asset
import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.PaymentPathRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/path_call_builder", JSImport.Namespace)
@js.native
object pathCallBuilderMod extends js.Object {
  @js.native
  class PathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      source: String,
      destination: String,
      destinationAsset: Asset,
      destinationAmount: String
    ) = this()
  }
  
}

