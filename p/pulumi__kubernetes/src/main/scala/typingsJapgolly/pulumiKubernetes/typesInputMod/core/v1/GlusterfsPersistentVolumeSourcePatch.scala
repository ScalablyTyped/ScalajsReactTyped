package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
  */
trait GlusterfsPersistentVolumeSourcePatch extends StObject {
  
  /**
    * endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpoints: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpointsNamespace: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}
object GlusterfsPersistentVolumeSourcePatch {
  
  inline def apply(): GlusterfsPersistentVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlusterfsPersistentVolumeSourcePatch]
  }
  
  extension [Self <: GlusterfsPersistentVolumeSourcePatch](x: Self) {
    
    inline def setEndpoints(value: Input[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNamespace(value: Input[String]): Self = StObject.set(x, "endpointsNamespace", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNamespaceUndefined: Self = StObject.set(x, "endpointsNamespace", js.undefined)
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
