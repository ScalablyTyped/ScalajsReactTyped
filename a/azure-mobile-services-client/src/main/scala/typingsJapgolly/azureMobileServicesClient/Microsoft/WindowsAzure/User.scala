package typingsJapgolly.azureMobileServicesClient.Microsoft.WindowsAzure

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554220.aspx
trait User extends js.Object {
  // { [providerName: string]: { userId: string, accessToken: string, accessTokenSecret?: string }; };
  var accessTokens: js.Any
     // { [providerName: string]: string; }
  var level: String
  var mobileServiceAuthenticationToken: String
   //for level:string use one of LevelEnum: 'admin','anonymous','authenticated'
  var userId: String
  def getIdentities(): js.Any
}

object User {
  @scala.inline
  def apply(
    accessTokens: js.Any,
    getIdentities: CallbackTo[js.Any],
    level: String,
    mobileServiceAuthenticationToken: String,
    userId: String
  ): User = {
    val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mobileServiceAuthenticationToken = mobileServiceAuthenticationToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.updateDynamic("getIdentities")(getIdentities.toJsFn)
    __obj.asInstanceOf[User]
  }
}

