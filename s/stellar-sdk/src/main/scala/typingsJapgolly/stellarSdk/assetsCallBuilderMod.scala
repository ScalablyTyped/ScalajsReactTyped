package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.AssetRecord
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/assets_call_builder", JSImport.Namespace)
@js.native
object assetsCallBuilderMod extends js.Object {
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def forCode(value: String): AssetsCallBuilder = js.native
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
  
}

