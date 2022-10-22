package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServicePort contains information on service's port.
  */
trait ServicePortPatch extends StObject {
  
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
    */
  var nodePort: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The port that will be exposed by this service.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
    */
  var targetPort: js.UndefOr[Input[Double | String]] = js.undefined
}
object ServicePortPatch {
  
  inline def apply(): ServicePortPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePortPatch]
  }
  
  extension [Self <: ServicePortPatch](x: Self) {
    
    inline def setAppProtocol(value: Input[String]): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    inline def setAppProtocolUndefined: Self = StObject.set(x, "appProtocol", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodePort(value: Input[Double]): Self = StObject.set(x, "nodePort", value.asInstanceOf[js.Any])
    
    inline def setNodePortUndefined: Self = StObject.set(x, "nodePort", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setTargetPort(value: Input[Double | String]): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
    
    inline def setTargetPortUndefined: Self = StObject.set(x, "targetPort", js.undefined)
  }
}
