package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
  */
trait PersistentVolumeClaimTemplatePatch extends StObject {
  
  /**
    * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
    */
  var metadata: ObjectMetaPatch
  
  /**
    * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
    */
  var spec: PersistentVolumeClaimSpecPatch
}
object PersistentVolumeClaimTemplatePatch {
  
  inline def apply(metadata: ObjectMetaPatch, spec: PersistentVolumeClaimSpecPatch): PersistentVolumeClaimTemplatePatch = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimTemplatePatch]
  }
  
  extension [Self <: PersistentVolumeClaimTemplatePatch](x: Self) {
    
    inline def setMetadata(value: ObjectMetaPatch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PersistentVolumeClaimSpecPatch): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
