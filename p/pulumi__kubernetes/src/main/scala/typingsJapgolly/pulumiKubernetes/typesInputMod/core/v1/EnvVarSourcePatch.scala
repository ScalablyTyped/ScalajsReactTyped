package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var configMapKeyRef: js.UndefOr[Input[ConfigMapKeySelectorPatch]] = js.undefined
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelectorPatch]] = js.undefined
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelectorPatch]] = js.undefined
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: js.UndefOr[Input[SecretKeySelectorPatch]] = js.undefined
}
object EnvVarSourcePatch {
  
  inline def apply(): EnvVarSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSourcePatch]
  }
  
  extension [Self <: EnvVarSourcePatch](x: Self) {
    
    inline def setConfigMapKeyRef(value: Input[ConfigMapKeySelectorPatch]): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    inline def setFieldRef(value: Input[ObjectFieldSelectorPatch]): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    inline def setFieldRefUndefined: Self = StObject.set(x, "fieldRef", js.undefined)
    
    inline def setResourceFieldRef(value: Input[ResourceFieldSelectorPatch]): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    inline def setResourceFieldRefUndefined: Self = StObject.set(x, "resourceFieldRef", js.undefined)
    
    inline def setSecretKeyRef(value: Input[SecretKeySelectorPatch]): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}
