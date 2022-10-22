package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var metadata: js.UndefOr[Input[ObjectMetaPatch]] = js.undefined
  
  /**
    * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: js.UndefOr[Input[JobSpecPatch]] = js.undefined
}
object JobTemplateSpecPatch {
  
  inline def apply(): JobTemplateSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateSpecPatch]
  }
  
  extension [Self <: JobTemplateSpecPatch](x: Self) {
    
    inline def setMetadata(value: Input[ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: Input[JobSpecPatch]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
