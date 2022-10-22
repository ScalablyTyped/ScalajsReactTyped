package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var attachError: js.UndefOr[Input[VolumeError]] = js.undefined
  
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attached: Input[Boolean]
  
  /**
    * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
    */
  var detachError: js.UndefOr[Input[VolumeError]] = js.undefined
}
object VolumeAttachmentStatus {
  
  inline def apply(attached: Input[Boolean]): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
  
  extension [Self <: VolumeAttachmentStatus](x: Self) {
    
    inline def setAttachError(value: Input[VolumeError]): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
    
    inline def setAttachErrorUndefined: Self = StObject.set(x, "attachError", js.undefined)
    
    inline def setAttached(value: Input[Boolean]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadata(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadataUndefined: Self = StObject.set(x, "attachmentMetadata", js.undefined)
    
    inline def setDetachError(value: Input[VolumeError]): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
    
    inline def setDetachErrorUndefined: Self = StObject.set(x, "detachError", js.undefined)
  }
}
