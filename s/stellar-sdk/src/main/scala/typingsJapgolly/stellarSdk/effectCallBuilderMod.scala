package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.EffectRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/effect_call_builder", JSImport.Namespace)
@js.native
object effectCallBuilderMod extends js.Object {
  @js.native
  class EffectCallBuilder protected () extends CallBuilder[CollectionPage[EffectRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def forOperation(operationId: String): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
}

