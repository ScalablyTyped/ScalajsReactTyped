package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeAddress contains information for the node's address.
  */
trait NodeAddressPatch extends StObject {
  
  /**
    * The node address.
    */
  var address: String
  
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  var `type`: String
}
object NodeAddressPatch {
  
  inline def apply(address: String, `type`: String): NodeAddressPatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddressPatch]
  }
  
  extension [Self <: NodeAddressPatch](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
