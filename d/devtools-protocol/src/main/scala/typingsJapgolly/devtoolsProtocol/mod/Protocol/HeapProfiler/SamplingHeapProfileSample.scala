package typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingHeapProfileSample extends StObject {
  
  /**
    * Id of the corresponding profile tree node.
    */
  var nodeId: integer
  
  /**
    * Time-ordered sample ordinal number. It is unique across all profiles retrieved
    * between startSampling and stopSampling.
    */
  var ordinal: Double
  
  /**
    * Allocation size in bytes attributed to the sample.
    */
  var size: Double
}
object SamplingHeapProfileSample {
  
  inline def apply(nodeId: integer, ordinal: Double, size: Double): SamplingHeapProfileSample = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileSample]
  }
  
  extension [Self <: SamplingHeapProfileSample](x: Self) {
    
    inline def setNodeId(value: integer): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
