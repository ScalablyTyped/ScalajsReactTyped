package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JobTemplateSpec describes the data a Job should have when created from a template
  */
trait JobTemplateSpecPatch extends StObject {
  
  /**
    * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMetaPatch
  
  /**
    * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: JobSpecPatch
}
object JobTemplateSpecPatch {
  
  inline def apply(metadata: ObjectMetaPatch, spec: JobSpecPatch): JobTemplateSpecPatch = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplateSpecPatch]
  }
  
  extension [Self <: JobTemplateSpecPatch](x: Self) {
    
    inline def setMetadata(value: ObjectMetaPatch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: JobSpecPatch): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
