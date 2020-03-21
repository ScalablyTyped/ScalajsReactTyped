package typingsJapgolly.unsplashJs.mod.UnsplashApi

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Response
import typingsJapgolly.unsplashJs.AnonBio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  def profile(): js.Promise[Response]
  def updateProfile(options: AnonBio): js.Promise[Response]
}

object CurrentUser {
  @scala.inline
  def apply(
    profile: CallbackTo[js.Promise[Response]],
    updateProfile: AnonBio => CallbackTo[js.Promise[Response]]
  ): CurrentUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profile")(profile.toJsFn)
    __obj.updateDynamic("updateProfile")(js.Any.fromFunction1((t0: typingsJapgolly.unsplashJs.AnonBio) => updateProfile(t0).runNow()))
    __obj.asInstanceOf[CurrentUser]
  }
}

