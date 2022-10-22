package typingsJapgolly.lesgo.anon

import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExpressionAttributeValueMap
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var ExpressionAttributeValues: ExpressionAttributeValueMap
  
  var Key: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
  
  var TableName: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  
  var UpdateExpression: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateExpression
}
object Key {
  
  inline def apply(
    ExpressionAttributeValues: ExpressionAttributeValueMap,
    Key: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key,
    TableName: TableName,
    UpdateExpression: UpdateExpression
  ): Key = {
    val __obj = js.Dynamic.literal(ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
  }
}
