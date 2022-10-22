package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder
  - typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends StObject
object IncrementalDataPlaceholder {
  
  inline def DeferPlaceholder(
    data: PayloadData,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "defer", label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder]
  }
  
  inline def StreamPlaceholder(
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = "stream", label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder]
  }
}
