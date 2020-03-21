package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayStoreTypesMod.FragmentMap
import typingsJapgolly.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Props
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createFragmentSpecResolver")
@js.native
object createFragmentSpecResolver extends js.Object {
  def apply(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def apply(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}

