package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
  */
trait VolumeAttachmentStatusPatch extends StObject {
  
  /**
    * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachError: VolumeErrorPatch
  
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attached: Boolean
  
  /**
    * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachmentMetadata: StringDictionary[String]
  
  /**
    * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
    */
  var detachError: VolumeErrorPatch
}
object VolumeAttachmentStatusPatch {
  
  inline def apply(
    attachError: VolumeErrorPatch,
    attached: Boolean,
    attachmentMetadata: StringDictionary[String],
    detachError: VolumeErrorPatch
  ): VolumeAttachmentStatusPatch = {
    val __obj = js.Dynamic.literal(attachError = attachError.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], attachmentMetadata = attachmentMetadata.asInstanceOf[js.Any], detachError = detachError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatusPatch]
  }
  
  extension [Self <: VolumeAttachmentStatusPatch](x: Self) {
    
    inline def setAttachError(value: VolumeErrorPatch): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
    
    inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadata(value: StringDictionary[String]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDetachError(value: VolumeErrorPatch): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
  }
}
