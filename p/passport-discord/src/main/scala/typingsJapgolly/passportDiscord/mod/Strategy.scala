package typingsJapgolly.passportDiscord.mod

import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strategy extends OAuth2Strategy {
  def checkScope(
    scope: String,
    accessToken: String,
    cb: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

