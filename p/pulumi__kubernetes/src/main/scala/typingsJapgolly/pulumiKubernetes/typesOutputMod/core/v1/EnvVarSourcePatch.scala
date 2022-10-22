package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
trait EnvVarSourcePatch extends StObject {
  
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: ConfigMapKeySelectorPatch
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: ObjectFieldSelectorPatch
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: ResourceFieldSelectorPatch
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: SecretKeySelectorPatch
}
object EnvVarSourcePatch {
  
  inline def apply(
    configMapKeyRef: ConfigMapKeySelectorPatch,
    fieldRef: ObjectFieldSelectorPatch,
    resourceFieldRef: ResourceFieldSelectorPatch,
    secretKeyRef: SecretKeySelectorPatch
  ): EnvVarSourcePatch = {
    val __obj = js.Dynamic.literal(configMapKeyRef = configMapKeyRef.asInstanceOf[js.Any], fieldRef = fieldRef.asInstanceOf[js.Any], resourceFieldRef = resourceFieldRef.asInstanceOf[js.Any], secretKeyRef = secretKeyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVarSourcePatch]
  }
  
  extension [Self <: EnvVarSourcePatch](x: Self) {
    
    inline def setConfigMapKeyRef(value: ConfigMapKeySelectorPatch): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setFieldRef(value: ObjectFieldSelectorPatch): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    inline def setResourceFieldRef(value: ResourceFieldSelectorPatch): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRef(value: SecretKeySelectorPatch): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
  }
}
