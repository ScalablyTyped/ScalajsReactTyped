package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod.UnmarshalledReplicaSettingsDescription
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeGlobalTableSettingsOutputMod {
  
  trait DescribeGlobalTableSettingsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The name of the global table.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The region specific settings for the global table.</p>
      */
    var ReplicaSettings: js.UndefOr[js.Array[UnmarshalledReplicaSettingsDescription]] = js.undefined
  }
  object DescribeGlobalTableSettingsOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
    
    extension [Self <: DescribeGlobalTableSettingsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicaSettings(value: js.Array[UnmarshalledReplicaSettingsDescription]): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      inline def setReplicaSettingsVarargs(value: UnmarshalledReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value*))
    }
  }
}
