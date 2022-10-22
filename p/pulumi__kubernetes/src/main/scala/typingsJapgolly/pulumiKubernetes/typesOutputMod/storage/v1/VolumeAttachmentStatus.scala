package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
  */
trait VolumeAttachmentStatus extends StObject {
  
  /**
    * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachError: VolumeError
  
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
  var detachError: VolumeError
}
object VolumeAttachmentStatus {
  
  inline def apply(
    attachError: VolumeError,
    attached: Boolean,
    attachmentMetadata: StringDictionary[String],
    detachError: VolumeError
  ): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attachError = attachError.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], attachmentMetadata = attachmentMetadata.asInstanceOf[js.Any], detachError = detachError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
  
  extension [Self <: VolumeAttachmentStatus](x: Self) {
    
    inline def setAttachError(value: VolumeError): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
    
    inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadata(value: StringDictionary[String]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDetachError(value: VolumeError): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
  }
}
