package typingsJapgolly.octokitAuthToken.typesMod

import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.app
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.installation
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.oauth
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.octokitAuthToken.typesMod.OAuthTokenAuthentication
  - typingsJapgolly.octokitAuthToken.typesMod.InstallationTokenAuthentication
  - typingsJapgolly.octokitAuthToken.typesMod.AppAuthentication
*/
trait Authentication extends js.Object

object Authentication {
  @scala.inline
  def OAuthTokenAuthentication(token: Token, tokenType: oauth, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  @scala.inline
  def InstallationTokenAuthentication(token: Token, tokenType: installation, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  @scala.inline
  def AppAuthentication(token: Token, tokenType: app, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
}

