package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteObjectOutputMod {
  
  trait DeleteObjectOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object DeleteObjectOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectOutput]
    }
    
    extension [Self <: DeleteObjectOutput](x: Self) {
      
      inline def setDeleteMarker(value: Boolean): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
      
      inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
