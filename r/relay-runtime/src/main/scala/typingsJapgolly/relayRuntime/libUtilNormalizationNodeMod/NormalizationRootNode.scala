package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
*/
trait NormalizationRootNode extends StObject
object NormalizationRootNode {
  
  inline def ConcreteRequest(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
  }
  
  inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
  }
}
