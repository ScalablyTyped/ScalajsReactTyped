package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional delete to succeed.
    */
  var ConditionExpression: js.UndefOr[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  /**
    * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Key = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
  ] = js.native
  /**
    * Name of the table in which the item to be deleted resides.
    */
  var TableName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object Delete {
  @scala.inline
  def apply(
    Key: Key,
    TableName: TableName,
    ConditionExpression: ConditionExpression = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: ExpressionAttributeValueMap = null,
    ReturnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure = null
  ): Delete = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnValuesOnConditionCheckFailure != null) __obj.updateDynamic("ReturnValuesOnConditionCheckFailure")(ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

