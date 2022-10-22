package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProjectionMod.Projection
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProjectionMod.UnmarshalledProjection
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalSecondaryIndexInfoMod {
  
  trait GlobalSecondaryIndexInfo extends StObject {
    
    /**
      * <p>The name of the global secondary index.</p>
      */
    var IndexName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    var Projection: js.UndefOr[typingsJapgolly.awsSdkClientDynamodbBrowser.typesProjectionMod.Projection] = js.undefined
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index. </p>
      */
    var ProvisionedThroughput: js.UndefOr[
        typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
      ] = js.undefined
  }
  object GlobalSecondaryIndexInfo {
    
    inline def apply(): GlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexInfo]
    }
    
    extension [Self <: GlobalSecondaryIndexInfo](x: Self) {
      
      inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setKeySchema(value: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  trait UnmarshalledGlobalSecondaryIndexInfo
    extends StObject
       with GlobalSecondaryIndexInfo {
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[UnmarshalledProjection] = js.undefined
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index. </p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[UnmarshalledProvisionedThroughput] = js.undefined
  }
  object UnmarshalledGlobalSecondaryIndexInfo {
    
    inline def apply(): UnmarshalledGlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexInfo]
    }
    
    extension [Self <: UnmarshalledGlobalSecondaryIndexInfo](x: Self) {
      
      inline def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: UnmarshalledProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      inline def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
}
