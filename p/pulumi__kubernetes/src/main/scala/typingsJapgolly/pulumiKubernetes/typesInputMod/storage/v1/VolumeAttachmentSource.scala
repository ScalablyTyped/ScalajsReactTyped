package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PersistentVolumeSpec
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
  */
trait VolumeAttachmentSource extends StObject {
  
  /**
    * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
    */
  var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpec]] = js.undefined
  
  /**
    * Name of the persistent volume to attach.
    */
  var persistentVolumeName: js.UndefOr[Input[String]] = js.undefined
}
object VolumeAttachmentSource {
  
  inline def apply(): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
  
  extension [Self <: VolumeAttachmentSource](x: Self) {
    
    inline def setInlineVolumeSpec(value: Input[PersistentVolumeSpec]): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
    
    inline def setInlineVolumeSpecUndefined: Self = StObject.set(x, "inlineVolumeSpec", js.undefined)
    
    inline def setPersistentVolumeName(value: Input[String]): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeNameUndefined: Self = StObject.set(x, "persistentVolumeName", js.undefined)
  }
}
