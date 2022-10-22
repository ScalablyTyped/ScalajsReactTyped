package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodTemplateSpec describes the data a pod should have when created from a template
  */
trait PodTemplateSpecPatch extends StObject {
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMetaPatch
  
  /**
    * Specification of the desired behavior of the pod. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: PodSpecPatch
}
object PodTemplateSpecPatch {
  
  inline def apply(metadata: ObjectMetaPatch, spec: PodSpecPatch): PodTemplateSpecPatch = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodTemplateSpecPatch]
  }
  
  extension [Self <: PodTemplateSpecPatch](x: Self) {
    
    inline def setMetadata(value: ObjectMetaPatch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PodSpecPatch): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
