package typingsJapgolly.instagramPrivateApi.accountRepositoryLoginResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginResponseRootObject extends js.Object {
  var logged_in_user: AccountRepositoryLoginResponseLoggedInUser
  var status: String
}

object AccountRepositoryLoginResponseRootObject {
  @scala.inline
  def apply(logged_in_user: AccountRepositoryLoginResponseLoggedInUser, status: String): AccountRepositoryLoginResponseRootObject = {
    val __obj = js.Dynamic.literal(logged_in_user = logged_in_user.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountRepositoryLoginResponseRootObject]
  }
}

