package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolResponse extends js.Object {
  /**
    * The container of metadata returned by the server to describe the pool.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.native
}

object DescribeUserPoolResponse {
  @scala.inline
  def apply(UserPool: UserPoolType = null): DescribeUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    if (UserPool != null) __obj.updateDynamic("UserPool")(UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolResponse]
  }
}

