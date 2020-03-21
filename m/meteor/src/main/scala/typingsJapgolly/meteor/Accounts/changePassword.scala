package typingsJapgolly.meteor.Accounts

import typingsJapgolly.meteor.Meteor.Error
import typingsJapgolly.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.changePassword")
@js.native
object changePassword extends js.Object {
  def apply(oldPassword: String, newPassword: String): Unit = js.native
  def apply(
    oldPassword: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

