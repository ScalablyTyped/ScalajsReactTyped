package typingsJapgolly.dynogels.mod

import typingsJapgolly.awsSdk.dynamodbMod.AttributeNameList
import typingsJapgolly.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsJapgolly.awsSdk.dynamodbMod.ProjectionExpression
import typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOptions extends js.Object {
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  var ConsistentRead: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ConsistentRead] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ProjectionExpression: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ProjectionExpression] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.undefined
}

object GetItemOptions {
  @scala.inline
  def apply(
    AttributesToGet: AttributeNameList = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ProjectionExpression: ProjectionExpression = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null
  ): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemOptions]
  }
}

