package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The name of the user that you want to delete.
    */
  var UserName: UserName_ = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, UserName: UserName_): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

