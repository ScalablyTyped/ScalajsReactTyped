package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressTLS describes the transport layer security associated with an Ingress.
  */
trait IngressTLSPatch extends StObject {
  
  /**
    * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
    */
  var hosts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
    */
  var secretName: js.UndefOr[Input[String]] = js.undefined
}
object IngressTLSPatch {
  
  inline def apply(): IngressTLSPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressTLSPatch]
  }
  
  extension [Self <: IngressTLSPatch](x: Self) {
    
    inline def setHosts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setHostsVarargs(value: Input[String]*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setSecretNameUndefined: Self = StObject.set(x, "secretName", js.undefined)
  }
}
