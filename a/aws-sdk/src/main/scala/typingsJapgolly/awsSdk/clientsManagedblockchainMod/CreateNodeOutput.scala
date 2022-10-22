package typingsJapgolly.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeOutput extends StObject {
  
  /**
    * The unique identifier of the node.
    */
  var NodeId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateNodeOutput {
  
  inline def apply(): CreateNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodeOutput]
  }
  
  extension [Self <: CreateNodeOutput](x: Self) {
    
    inline def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
  }
}
