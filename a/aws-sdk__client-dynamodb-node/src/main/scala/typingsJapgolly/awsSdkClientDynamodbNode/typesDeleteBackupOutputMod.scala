package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBackupOutputMod {
  
  trait DeleteBackupOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Contains the description of the backup created for the table.</p>
      */
    var BackupDescription: js.UndefOr[UnmarshalledBackupDescription] = js.undefined
  }
  object DeleteBackupOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteBackupOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBackupOutput]
    }
    
    extension [Self <: DeleteBackupOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBackupDescription(value: UnmarshalledBackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      inline def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
}
