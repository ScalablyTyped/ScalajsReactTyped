package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.NormalizationSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createNormalizationSelector")
@js.native
object createNormalizationSelector extends js.Object {
  def apply(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
}

