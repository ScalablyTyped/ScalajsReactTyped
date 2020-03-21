package typingsJapgolly.reactRelay.mod

import typingsJapgolly.relayRuntime.commitMutationMod.MutationConfig
import typingsJapgolly.relayRuntime.commitMutationMod.MutationParameters
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "commitMutation")
@js.native
object commitMutation extends js.Object {
  def apply[TOperation /* <: MutationParameters */](
    environment: typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}

