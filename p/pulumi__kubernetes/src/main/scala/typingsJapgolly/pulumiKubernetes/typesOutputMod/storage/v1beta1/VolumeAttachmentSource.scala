package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PersistentVolumeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
  */
trait VolumeAttachmentSource extends StObject {
  
  /**
    * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
    */
  var inlineVolumeSpec: PersistentVolumeSpec
  
  /**
    * Name of the persistent volume to attach.
    */
  var persistentVolumeName: String
}
object VolumeAttachmentSource {
  
  inline def apply(inlineVolumeSpec: PersistentVolumeSpec, persistentVolumeName: String): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec.asInstanceOf[js.Any], persistentVolumeName = persistentVolumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
  
  extension [Self <: VolumeAttachmentSource](x: Self) {
    
    inline def setInlineVolumeSpec(value: PersistentVolumeSpec): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeName(value: String): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
  }
}
