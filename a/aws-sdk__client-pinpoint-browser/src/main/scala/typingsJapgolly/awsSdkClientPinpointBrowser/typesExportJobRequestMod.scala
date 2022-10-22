package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExportJobRequestMod {
  
  trait ExportJobRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
      */
    var RoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
      *
      * The URL should follow this format: s3://bucket-name/folder-name/
      *
      * Amazon Pinpoint will export endpoints to this location.
      */
    var S3UrlPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
      */
    var SegmentId: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the segment to export if specified.
      */
    var SegmentVersion: js.UndefOr[Double] = js.undefined
  }
  object ExportJobRequest {
    
    inline def apply(): ExportJobRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportJobRequest]
    }
    
    extension [Self <: ExportJobRequest](x: Self) {
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setS3UrlPrefix(value: String): Self = StObject.set(x, "S3UrlPrefix", value.asInstanceOf[js.Any])
      
      inline def setS3UrlPrefixUndefined: Self = StObject.set(x, "S3UrlPrefix", js.undefined)
      
      inline def setSegmentId(value: String): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
      
      inline def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
      
      inline def setSegmentVersion(value: Double): Self = StObject.set(x, "SegmentVersion", value.asInstanceOf[js.Any])
      
      inline def setSegmentVersionUndefined: Self = StObject.set(x, "SegmentVersion", js.undefined)
    }
  }
  
  type UnmarshalledExportJobRequest = ExportJobRequest
}
