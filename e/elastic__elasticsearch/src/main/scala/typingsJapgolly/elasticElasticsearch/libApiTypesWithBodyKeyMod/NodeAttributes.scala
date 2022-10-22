package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAttributes extends StObject {
  
  var attributes: Record[String, String]
  
  var ephemeral_id: Id
  
  var id: js.UndefOr[Id] = js.undefined
  
  var name: NodeName
  
  var roles: js.UndefOr[NodeRoles] = js.undefined
  
  var transport_address: TransportAddress
}
object NodeAttributes {
  
  inline def apply(
    attributes: Record[String, String],
    ephemeral_id: Id,
    name: NodeName,
    transport_address: TransportAddress
  ): NodeAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], ephemeral_id = ephemeral_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAttributes]
  }
  
  extension [Self <: NodeAttributes](x: Self) {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setEphemeral_id(value: Id): Self = StObject.set(x, "ephemeral_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: NodeRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: NodeRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
  }
}
