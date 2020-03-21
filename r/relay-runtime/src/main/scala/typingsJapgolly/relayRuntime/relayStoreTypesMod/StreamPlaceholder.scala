package typingsJapgolly.relayRuntime.relayStoreTypesMod

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsJapgolly.relayRuntime.relayRuntimeStrings.stream_
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamPlaceholder extends IncrementalDataPlaceholder {
  val kind: stream_
  val label: String
  val node: NormalizationSelectableNode
  val parentID: DataID
  val path: js.Array[String]
  val variables: Variables
}

object StreamPlaceholder {
  @scala.inline
  def apply(
    kind: stream_,
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamPlaceholder]
  }
}

