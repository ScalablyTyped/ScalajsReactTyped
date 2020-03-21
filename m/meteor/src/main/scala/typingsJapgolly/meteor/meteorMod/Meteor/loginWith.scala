package typingsJapgolly.meteor.meteorMod.Meteor

import typingsJapgolly.meteor.AnonLoginStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWith")
@js.native
object loginWith extends js.Object {
  def apply[ExternalService](): Unit = js.native
  def apply[ExternalService](options: AnonLoginStyle): Unit = js.native
  def apply[ExternalService](
    options: AnonLoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

