package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsJapgolly.stellarSdk.serverApiMod.ServerApi.TransactionRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/transaction_call_builder", JSImport.Namespace)
@js.native
object transactionCallBuilderMod extends js.Object {
  @js.native
  class TransactionCallBuilder protected () extends CallBuilder[CollectionPage[TransactionRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def includeFailed(value: Boolean): this.type = js.native
    def transaction(transactionId: String): this.type = js.native
  }
  
}

