package typingsJapgolly.lesgo.anon

import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExpressionAttributeValueMap
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyExpression
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionAttributeValues extends StObject {
  
  var ExpressionAttributeValues: ExpressionAttributeValueMap
  
  var KeyConditionExpression: KeyExpression
  
  var ProjectionExpression: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression
  
  var TableName: typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
}
object ExpressionAttributeValues {
  
  inline def apply(
    ExpressionAttributeValues: ExpressionAttributeValueMap,
    KeyConditionExpression: KeyExpression,
    ProjectionExpression: ProjectionExpression,
    TableName: TableName
  ): ExpressionAttributeValues = {
    val __obj = js.Dynamic.literal(ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any], KeyConditionExpression = KeyConditionExpression.asInstanceOf[js.Any], ProjectionExpression = ProjectionExpression.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionAttributeValues]
  }
  
  extension [Self <: ExpressionAttributeValues](x: Self) {
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setKeyConditionExpression(value: KeyExpression): Self = StObject.set(x, "KeyConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
