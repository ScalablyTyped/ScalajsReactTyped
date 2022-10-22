package typingsJapgolly.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.clientsDynamodbMod.AttributeUpdates
import typingsJapgolly.awsSdk.clientsDynamodbMod.ConditionExpression
import typingsJapgolly.awsSdk.clientsDynamodbMod.ConditionalOperator
import typingsJapgolly.awsSdk.clientsDynamodbMod.ExpectedAttributeMap
import typingsJapgolly.awsSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typingsJapgolly.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity
import typingsJapgolly.awsSdk.clientsDynamodbMod.ReturnItemCollectionMetrics
import typingsJapgolly.awsSdk.clientsDynamodbMod.ReturnValue
import typingsJapgolly.awsSdk.clientsDynamodbMod.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateItemOptions extends StObject {
  
  var AttributeUpdates: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.AttributeUpdates] = js.undefined
  
  var ConditionExpression: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  
  var ConditionalOperator: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ConditionalOperator] = js.undefined
  
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  var ReturnItemCollectionMetrics: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  
  var UpdateExpression: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.UpdateExpression] = js.undefined
  
  var expected: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object UpdateItemOptions {
  
  inline def apply(): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateItemOptions]
  }
  
  extension [Self <: UpdateItemOptions](x: Self) {
    
    inline def setAttributeUpdates(value: AttributeUpdates): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
    
    inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    inline def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: StringDictionary[Any]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    inline def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
    
    inline def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
  }
}
