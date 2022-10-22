package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSignal extends StObject {
  
  /**
    * The camera node's name, from the application manifest.
    */
  var NodeInstanceId: typingsJapgolly.awsSdk.clientsPanoramaMod.NodeInstanceId
  
  /**
    * The signal value.
    */
  var Signal: NodeSignalValue
}
object NodeSignal {
  
  inline def apply(NodeInstanceId: NodeInstanceId, Signal: NodeSignalValue): NodeSignal = {
    val __obj = js.Dynamic.literal(NodeInstanceId = NodeInstanceId.asInstanceOf[js.Any], Signal = Signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSignal]
  }
  
  extension [Self <: NodeSignal](x: Self) {
    
    inline def setNodeInstanceId(value: NodeInstanceId): Self = StObject.set(x, "NodeInstanceId", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: NodeSignalValue): Self = StObject.set(x, "Signal", value.asInstanceOf[js.Any])
  }
}
