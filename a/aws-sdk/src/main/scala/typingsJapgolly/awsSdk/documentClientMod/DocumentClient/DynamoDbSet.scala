package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import typingsJapgolly.awsSdk.awsSdkStrings.Binary_
import typingsJapgolly.awsSdk.awsSdkStrings.Number_
import typingsJapgolly.awsSdk.awsSdkStrings.String_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.documentClientMod.DocumentClient.StringSet
  - typingsJapgolly.awsSdk.documentClientMod.DocumentClient.NumberSet
  - typingsJapgolly.awsSdk.documentClientMod.DocumentClient.BinarySet
*/
trait DynamoDbSet extends js.Object

object DynamoDbSet {
  @scala.inline
  def StringSet(`type`: String_, values: js.Array[java.lang.String]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def NumberSet(`type`: Number_, values: js.Array[scala.Double]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def BinarySet(`type`: Binary_, values: js.Array[binaryType]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
}

