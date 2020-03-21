package typingsJapgolly.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.dynamodbMod.AttributeUpdates
import typingsJapgolly.awsSdk.dynamodbMod.ConditionExpression
import typingsJapgolly.awsSdk.dynamodbMod.ConditionalOperator
import typingsJapgolly.awsSdk.dynamodbMod.ExpectedAttributeMap
import typingsJapgolly.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity
import typingsJapgolly.awsSdk.dynamodbMod.ReturnItemCollectionMetrics
import typingsJapgolly.awsSdk.dynamodbMod.ReturnValue
import typingsJapgolly.awsSdk.dynamodbMod.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateItemOptions extends js.Object {
  var AttributeUpdates: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.AttributeUpdates] = js.undefined
  var ConditionExpression: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  var UpdateExpression: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.UpdateExpression] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UpdateItemOptions {
  @scala.inline
  def apply(
    AttributeUpdates: AttributeUpdates = null,
    ConditionExpression: ConditionExpression = null,
    ConditionalOperator: ConditionalOperator = null,
    Expected: ExpectedAttributeMap = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null,
    ReturnValues: ReturnValue = null,
    UpdateExpression: UpdateExpression = null,
    expected: StringDictionary[js.Any] = null
  ): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributeUpdates != null) __obj.updateDynamic("AttributeUpdates")(AttributeUpdates.asInstanceOf[js.Any])
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateItemOptions]
  }
}

