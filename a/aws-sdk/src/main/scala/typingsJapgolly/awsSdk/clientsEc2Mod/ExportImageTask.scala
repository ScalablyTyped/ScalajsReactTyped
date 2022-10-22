package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportImageTask extends StObject {
  
  /**
    * A description of the image being exported.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the export image task.
    */
  var ExportImageTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the image.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The percent complete of the export image task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the destination Amazon S3 bucket.
    */
  var S3ExportLocation: js.UndefOr[ExportTaskS3Location] = js.undefined
  
  /**
    * The status of the export image task. The possible values are active, completed, deleting, and deleted.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The status message for the export image task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the export image task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ExportImageTask {
  
  inline def apply(): ExportImageTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportImageTask]
  }
  
  extension [Self <: ExportImageTask](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExportImageTaskId(value: String): Self = StObject.set(x, "ExportImageTaskId", value.asInstanceOf[js.Any])
    
    inline def setExportImageTaskIdUndefined: Self = StObject.set(x, "ExportImageTaskId", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setS3ExportLocation(value: ExportTaskS3Location): Self = StObject.set(x, "S3ExportLocation", value.asInstanceOf[js.Any])
    
    inline def setS3ExportLocationUndefined: Self = StObject.set(x, "S3ExportLocation", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
