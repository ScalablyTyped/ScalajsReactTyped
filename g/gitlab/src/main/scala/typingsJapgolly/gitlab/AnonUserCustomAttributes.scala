package typingsJapgolly.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.servicesMod.UserCustomAttributes
import typingsJapgolly.gitlab.servicesMod.UserEmails
import typingsJapgolly.gitlab.servicesMod.UserGPGKeys
import typingsJapgolly.gitlab.servicesMod.UserImpersonationTokens
import typingsJapgolly.gitlab.servicesMod.UserKeys
import typingsJapgolly.gitlab.servicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserCustomAttributes extends js.Object {
  var UserCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsJapgolly.gitlab.servicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typingsJapgolly.gitlab.servicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typingsJapgolly.gitlab.servicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typingsJapgolly.gitlab.servicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typingsJapgolly.gitlab.servicesMod.UserKeys]
  var Users: Instantiable0[typingsJapgolly.gitlab.servicesMod.Users]
}

object AnonUserCustomAttributes {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], UserCustomAttributes],
    UserEmails: Instantiable0[UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): AnonUserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserCustomAttributes]
  }
}

