package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.oauth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOAuthSecret extends js.Object {
  var key: String
  var secret: String
  var `type`: oauth
}

object AuthOAuthSecret {
  @scala.inline
  def apply(key: String, secret: String, `type`: oauth): AuthOAuthSecret = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOAuthSecret]
  }
}

