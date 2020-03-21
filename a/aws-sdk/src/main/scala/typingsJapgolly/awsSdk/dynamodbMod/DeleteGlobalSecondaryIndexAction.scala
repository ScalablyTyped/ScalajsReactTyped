package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: typingsJapgolly.awsSdk.dynamodbMod.IndexName = js.native
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
}

