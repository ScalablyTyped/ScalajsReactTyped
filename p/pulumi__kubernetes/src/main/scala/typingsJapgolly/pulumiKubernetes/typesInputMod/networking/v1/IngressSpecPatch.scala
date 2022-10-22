package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
trait IngressSpecPatch extends StObject {
  
  /**
    * DefaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
    */
  var defaultBackend: js.UndefOr[Input[IngressBackendPatch]] = js.undefined
  
  /**
    * IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -> IngressClass -> Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
    */
  var ingressClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
    */
  var rules: js.UndefOr[Input[js.Array[Input[IngressRulePatch]]]] = js.undefined
  
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
    */
  var tls: js.UndefOr[Input[js.Array[Input[IngressTLSPatch]]]] = js.undefined
}
object IngressSpecPatch {
  
  inline def apply(): IngressSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressSpecPatch]
  }
  
  extension [Self <: IngressSpecPatch](x: Self) {
    
    inline def setDefaultBackend(value: Input[IngressBackendPatch]): Self = StObject.set(x, "defaultBackend", value.asInstanceOf[js.Any])
    
    inline def setDefaultBackendUndefined: Self = StObject.set(x, "defaultBackend", js.undefined)
    
    inline def setIngressClassName(value: Input[String]): Self = StObject.set(x, "ingressClassName", value.asInstanceOf[js.Any])
    
    inline def setIngressClassNameUndefined: Self = StObject.set(x, "ingressClassName", js.undefined)
    
    inline def setRules(value: Input[js.Array[Input[IngressRulePatch]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Input[IngressRulePatch]*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTls(value: Input[js.Array[Input[IngressTLSPatch]]]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    inline def setTlsVarargs(value: Input[IngressTLSPatch]*): Self = StObject.set(x, "tls", js.Array(value*))
  }
}
