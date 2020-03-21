package typingsJapgolly.awsSdkClientDynamodbNode.typesConditionMod

import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BEGINS_WITH
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BETWEEN
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CONTAINS
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.EQ
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GE
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GT
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IN
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LE
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LT
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NE
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_CONTAINS
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_NULL
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NULL
import typingsJapgolly.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCondition extends Condition {
  /**
    * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p>
    */
  @JSName("AttributeValueList")
  var AttributeValueList_UnmarshalledCondition: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.undefined
}

object UnmarshalledCondition {
  @scala.inline
  def apply(
    ComparisonOperator: EQ | NE | IN | LE | LT | GE | GT | BETWEEN | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | String,
    AttributeValueList: js.Array[UnmarshalledAttributeValue] = null
  ): UnmarshalledCondition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
    if (AttributeValueList != null) __obj.updateDynamic("AttributeValueList")(AttributeValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCondition]
  }
}

