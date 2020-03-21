package typingsJapgolly.relayRuntime.relayStoreTypesMod

import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsJapgolly.relayRuntime.relayRuntimeStrings.defer_
import typingsJapgolly.relayRuntime.relayRuntimeStrings.stream_
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayStoreTypesMod.DeferPlaceholder
  - typingsJapgolly.relayRuntime.relayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends js.Object

object IncrementalDataPlaceholder {
  @scala.inline
  def DeferPlaceholder(
    data: PayloadData,
    kind: defer_,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): IncrementalDataPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncrementalDataPlaceholder]
  }
  @scala.inline
  def StreamPlaceholder(
    kind: stream_,
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): IncrementalDataPlaceholder = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncrementalDataPlaceholder]
  }
}

