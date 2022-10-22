package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketReplicationOutputMod {
  
  trait GetBucketReplicationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
      */
    var ReplicationConfiguration: js.UndefOr[UnmarshalledReplicationConfiguration] = js.undefined
  }
  object GetBucketReplicationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketReplicationOutput]
    }
    
    extension [Self <: GetBucketReplicationOutput](x: Self) {
      
      inline def setReplicationConfiguration(value: UnmarshalledReplicationConfiguration): Self = StObject.set(x, "ReplicationConfiguration", value.asInstanceOf[js.Any])
      
      inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "ReplicationConfiguration", js.undefined)
    }
  }
}
