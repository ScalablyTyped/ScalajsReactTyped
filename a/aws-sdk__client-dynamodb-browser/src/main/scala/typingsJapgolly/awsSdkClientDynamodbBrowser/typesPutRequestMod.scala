package typingsJapgolly.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRequestMod {
  
  trait PutRequest extends StObject {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
      */
    var Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  }
  object PutRequest {
    
    inline def apply(Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): PutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRequest]
    }
    
    extension [Self <: PutRequest](x: Self) {
      
      inline def setItem(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledPutRequest
    extends StObject
       with PutRequest {
    
    /**
      * <p>A map of attribute name to attribute values, representing the primary key of an item to be processed by <code>PutItem</code>. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.</p>
      */
    @JSName("Item")
    var Item_UnmarshalledPutRequest: StringDictionary[UnmarshalledAttributeValue]
  }
  object UnmarshalledPutRequest {
    
    inline def apply(Item: StringDictionary[UnmarshalledAttributeValue]): UnmarshalledPutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledPutRequest]
    }
    
    extension [Self <: UnmarshalledPutRequest](x: Self) {
      
      inline def setItem(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
}
