package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
trait NodeDaemonEndpointsPatch extends StObject {
  
  /**
    * Endpoint on which Kubelet is listening.
    */
  var kubeletEndpoint: DaemonEndpointPatch
}
object NodeDaemonEndpointsPatch {
  
  inline def apply(kubeletEndpoint: DaemonEndpointPatch): NodeDaemonEndpointsPatch = {
    val __obj = js.Dynamic.literal(kubeletEndpoint = kubeletEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDaemonEndpointsPatch]
  }
  
  extension [Self <: NodeDaemonEndpointsPatch](x: Self) {
    
    inline def setKubeletEndpoint(value: DaemonEndpointPatch): Self = StObject.set(x, "kubeletEndpoint", value.asInstanceOf[js.Any])
  }
}
