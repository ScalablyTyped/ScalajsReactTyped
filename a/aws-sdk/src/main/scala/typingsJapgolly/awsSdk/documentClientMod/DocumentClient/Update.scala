package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
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
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Key = js.native
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
  ] = js.native
  /**
    * Name of the table for the UpdateItem request.
    */
  var TableName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
    */
  var UpdateExpression: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.UpdateExpression = js.native
}

object Update {
  @scala.inline
  def apply(
    Key: Key,
    TableName: TableName,
    UpdateExpression: UpdateExpression,
    ConditionExpression: ConditionExpression = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: ExpressionAttributeValueMap = null,
    ReturnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure = null
  ): Update = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnValuesOnConditionCheckFailure != null) __obj.updateDynamic("ReturnValuesOnConditionCheckFailure")(ReturnValuesOnConditionCheckFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

