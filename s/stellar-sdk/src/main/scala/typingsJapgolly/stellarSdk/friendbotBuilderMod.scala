package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarSdk.callBuilderMod.CallBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/friendbot_builder", JSImport.Namespace)
@js.native
object friendbotBuilderMod extends js.Object {
  @js.native
  class FriendbotBuilder protected ()
    extends CallBuilder[js.Any] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      address: String
    ) = this()
  }
  
}

