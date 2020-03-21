package typingsJapgolly.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.dynamodbMod.ConditionExpression
import typingsJapgolly.awsSdk.dynamodbMod.ConditionalOperator
import typingsJapgolly.awsSdk.dynamodbMod.ExpectedAttributeMap
import typingsJapgolly.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity
import typingsJapgolly.awsSdk.dynamodbMod.ReturnItemCollectionMetrics
import typingsJapgolly.awsSdk.dynamodbMod.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object CreateItemOptions {
  @scala.inline
  def apply(
    ConditionExpression: ConditionExpression = null,
    ConditionalOperator: ConditionalOperator = null,
    Expected: ExpectedAttributeMap = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null,
    ReturnValues: ReturnValue = null,
    expected: StringDictionary[js.Any] = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): CreateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemOptions]
  }
}

