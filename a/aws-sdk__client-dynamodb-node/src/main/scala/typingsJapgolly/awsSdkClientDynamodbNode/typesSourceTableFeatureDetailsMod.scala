package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typingsJapgolly.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typingsJapgolly.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typingsJapgolly.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typingsJapgolly.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription
import typingsJapgolly.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typingsJapgolly.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typingsJapgolly.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typingsJapgolly.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import typingsJapgolly.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceTableFeatureDetailsMod {
  
  trait SourceTableFeatureDetails extends StObject {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    var SSEDescription: js.UndefOr[typingsJapgolly.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription] = js.undefined
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    var TimeToLiveDescription: js.UndefOr[
        typingsJapgolly.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
      ] = js.undefined
  }
  object SourceTableFeatureDetails {
    
    inline def apply(): SourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceTableFeatureDetails]
    }
    
    extension [Self <: SourceTableFeatureDetails](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
      
      inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      inline def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      inline def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  trait UnmarshalledSourceTableFeatureDetails
    extends StObject
       with SourceTableFeatureDetails {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    @JSName("SSEDescription")
    var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.undefined
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    @JSName("StreamDescription")
    var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.undefined
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    @JSName("TimeToLiveDescription")
    var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.undefined
  }
  object UnmarshalledSourceTableFeatureDetails {
    
    inline def apply(): UnmarshalledSourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
    }
    
    extension [Self <: UnmarshalledSourceTableFeatureDetails](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
      
      inline def setSSEDescription(value: UnmarshalledSSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamDescription(value: UnmarshalledStreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      inline def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      inline def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
}
