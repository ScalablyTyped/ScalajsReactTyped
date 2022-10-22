package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
  *
  * 	{
  * 	  Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
  * 	  Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
  * 	}
  *
  * The resulting set of endpoints can be viewed as:
  *
  * 	a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
  * 	b: [ 10.10.1.1:309, 10.10.2.2:309 ]
  */
trait EndpointSubsetPatch extends StObject {
  
  /**
    * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
    */
  var addresses: js.Array[EndpointAddressPatch]
  
  /**
    * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
    */
  var notReadyAddresses: js.Array[EndpointAddressPatch]
  
  /**
    * Port numbers available on the related IP addresses.
    */
  var ports: js.Array[EndpointPortPatch]
}
object EndpointSubsetPatch {
  
  inline def apply(
    addresses: js.Array[EndpointAddressPatch],
    notReadyAddresses: js.Array[EndpointAddressPatch],
    ports: js.Array[EndpointPortPatch]
  ): EndpointSubsetPatch = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], notReadyAddresses = notReadyAddresses.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSubsetPatch]
  }
  
  extension [Self <: EndpointSubsetPatch](x: Self) {
    
    inline def setAddresses(value: js.Array[EndpointAddressPatch]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: EndpointAddressPatch*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setNotReadyAddresses(value: js.Array[EndpointAddressPatch]): Self = StObject.set(x, "notReadyAddresses", value.asInstanceOf[js.Any])
    
    inline def setNotReadyAddressesVarargs(value: EndpointAddressPatch*): Self = StObject.set(x, "notReadyAddresses", js.Array(value*))
    
    inline def setPorts(value: js.Array[EndpointPortPatch]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: EndpointPortPatch*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
