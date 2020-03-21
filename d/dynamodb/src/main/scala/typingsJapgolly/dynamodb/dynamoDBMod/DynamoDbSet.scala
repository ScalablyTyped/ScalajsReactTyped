package typingsJapgolly.dynamodb.dynamoDBMod

import typingsJapgolly.dynamodb.dynamodbStrings.Binary
import typingsJapgolly.dynamodb.dynamodbStrings.Number
import typingsJapgolly.dynamodb.dynamodbStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dynamodb.dynamoDBMod.StringSet
  - typingsJapgolly.dynamodb.dynamoDBMod.NumberSet
  - typingsJapgolly.dynamodb.dynamoDBMod.BinarySet
*/
trait DynamoDbSet extends js.Object

object DynamoDbSet {
  @scala.inline
  def StringSet(`type`: String, values: js.Array[java.lang.String]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def NumberSet(`type`: Number, values: js.Array[Double]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def BinarySet(`type`: Binary, values: js.Array[binaryType]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
}

