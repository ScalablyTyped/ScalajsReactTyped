package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be described.
    */
  var TableName: typingsJapgolly.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
}

