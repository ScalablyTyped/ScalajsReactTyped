package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableGlobalSecondaryIndex extends StObject {
  
  /**
    * Whether the index is currently backfilling.
    */
  var Backfilling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the index.
    */
  var IndexArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The total size in bytes of the index.
    */
  var IndexSizeBytes: js.UndefOr[SizeBytes] = js.undefined
  
  /**
    * The current status of the index.    ACTIVE     CREATING     DELETING     UPDATING   
    */
  var IndexStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of items in the index.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The key schema for the index.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined
  
  /**
    * Attributes that are copied from the table into an index.
    */
  var Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.undefined
  
  /**
    * Information about the provisioned throughput settings for the indexes.
    */
  var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.undefined
}
object AwsDynamoDbTableGlobalSecondaryIndex {
  
  inline def apply(): AwsDynamoDbTableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableGlobalSecondaryIndex]
  }
  
  extension [Self <: AwsDynamoDbTableGlobalSecondaryIndex](x: Self) {
    
    inline def setBackfilling(value: Boolean): Self = StObject.set(x, "Backfilling", value.asInstanceOf[js.Any])
    
    inline def setBackfillingUndefined: Self = StObject.set(x, "Backfilling", js.undefined)
    
    inline def setIndexArn(value: NonEmptyString): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
    
    inline def setIndexName(value: NonEmptyString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setIndexSizeBytes(value: SizeBytes): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
    
    inline def setIndexStatus(value: NonEmptyString): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProjection(value: AwsDynamoDbTableProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    
    inline def setProvisionedThroughput(value: AwsDynamoDbTableProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
