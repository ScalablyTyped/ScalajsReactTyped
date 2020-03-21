package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.Meteor.Error
import typingsJapgolly.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.resetPassword")
@js.native
object resetPassword extends js.Object {
  def apply(token: String, newPassword: String): Unit = js.native
  def apply(
    token: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

