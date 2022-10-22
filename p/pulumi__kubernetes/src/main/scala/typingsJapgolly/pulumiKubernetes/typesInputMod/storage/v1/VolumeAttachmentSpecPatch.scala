package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
trait VolumeAttachmentSpecPatch extends StObject {
  
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
    */
  var attacher: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Source represents the volume that should be attached.
    */
  var source: js.UndefOr[Input[VolumeAttachmentSourcePatch]] = js.undefined
}
object VolumeAttachmentSpecPatch {
  
  inline def apply(): VolumeAttachmentSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAttachmentSpecPatch]
  }
  
  extension [Self <: VolumeAttachmentSpecPatch](x: Self) {
    
    inline def setAttacher(value: Input[String]): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
    
    inline def setAttacherUndefined: Self = StObject.set(x, "attacher", js.undefined)
    
    inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    inline def setSource(value: Input[VolumeAttachmentSourcePatch]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
