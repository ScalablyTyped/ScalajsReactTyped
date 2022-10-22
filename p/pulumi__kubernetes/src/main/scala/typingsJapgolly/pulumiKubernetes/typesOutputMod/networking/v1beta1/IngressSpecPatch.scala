package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
trait IngressSpecPatch extends StObject {
  
  /**
    * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
    */
  var backend: IngressBackendPatch
  
  /**
    * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
    */
  var ingressClassName: String
  
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
    */
  var rules: js.Array[IngressRulePatch]
  
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
    */
  var tls: js.Array[IngressTLSPatch]
}
object IngressSpecPatch {
  
  inline def apply(
    backend: IngressBackendPatch,
    ingressClassName: String,
    rules: js.Array[IngressRulePatch],
    tls: js.Array[IngressTLSPatch]
  ): IngressSpecPatch = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], ingressClassName = ingressClassName.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressSpecPatch]
  }
  
  extension [Self <: IngressSpecPatch](x: Self) {
    
    inline def setBackend(value: IngressBackendPatch): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setIngressClassName(value: String): Self = StObject.set(x, "ingressClassName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[IngressRulePatch]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: IngressRulePatch*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTls(value: js.Array[IngressTLSPatch]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsVarargs(value: IngressTLSPatch*): Self = StObject.set(x, "tls", js.Array(value*))
  }
}
