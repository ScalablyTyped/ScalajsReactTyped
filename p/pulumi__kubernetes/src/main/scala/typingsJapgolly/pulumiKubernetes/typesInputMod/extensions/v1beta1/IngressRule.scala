package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
  */
trait IngressRule extends StObject {
  
  /**
    * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
    * 	  IP in the Spec of the parent Ingress.
    * 2. The `:` delimiter is not respected because ports are not allowed.
    * 	  Currently the port of an Ingress is implicitly :80 for http and
    * 	  :443 for https.
    * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
  
  var http: js.UndefOr[Input[HTTPIngressRuleValue]] = js.undefined
}
object IngressRule {
  
  inline def apply(): IngressRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressRule]
  }
  
  extension [Self <: IngressRule](x: Self) {
    
    inline def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttp(value: Input[HTTPIngressRuleValue]): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
  }
}
