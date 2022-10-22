package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerPort represents a network port in a single container.
  */
trait ContainerPortPatch extends StObject {
  
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
    */
  var containerPort: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
    */
  var hostPort: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}
object ContainerPortPatch {
  
  inline def apply(): ContainerPortPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerPortPatch]
  }
  
  extension [Self <: ContainerPortPatch](x: Self) {
    
    inline def setContainerPort(value: Input[Double]): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHostIP(value: Input[String]): Self = StObject.set(x, "hostIP", value.asInstanceOf[js.Any])
    
    inline def setHostIPUndefined: Self = StObject.set(x, "hostIP", js.undefined)
    
    inline def setHostPort(value: Input[Double]): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
