package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
trait EnvVarSource extends StObject {
  
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: js.UndefOr[Input[ConfigMapKeySelector]] = js.undefined
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.undefined
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.undefined
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: js.UndefOr[Input[SecretKeySelector]] = js.undefined
}
object EnvVarSource {
  
  inline def apply(): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSource]
  }
  
  extension [Self <: EnvVarSource](x: Self) {
    
    inline def setConfigMapKeyRef(value: Input[ConfigMapKeySelector]): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    inline def setFieldRef(value: Input[ObjectFieldSelector]): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    inline def setFieldRefUndefined: Self = StObject.set(x, "fieldRef", js.undefined)
    
    inline def setResourceFieldRef(value: Input[ResourceFieldSelector]): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    inline def setResourceFieldRefUndefined: Self = StObject.set(x, "resourceFieldRef", js.undefined)
    
    inline def setSecretKeyRef(value: Input[SecretKeySelector]): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}
