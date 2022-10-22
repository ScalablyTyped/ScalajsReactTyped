package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
trait VolumeAttachmentSpec extends StObject {
  
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
    */
  var attacher: Input[String]
  
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: Input[String]
  
  /**
    * Source represents the volume that should be attached.
    */
  var source: Input[VolumeAttachmentSource]
}
object VolumeAttachmentSpec {
  
  inline def apply(attacher: Input[String], nodeName: Input[String], source: Input[VolumeAttachmentSource]): VolumeAttachmentSpec = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSpec]
  }
  
  extension [Self <: VolumeAttachmentSpec](x: Self) {
    
    inline def setAttacher(value: Input[String]): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Input[VolumeAttachmentSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
