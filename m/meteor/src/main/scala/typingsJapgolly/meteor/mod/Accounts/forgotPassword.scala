package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.AnonEmailString
import typingsJapgolly.meteor.Meteor.Error
import typingsJapgolly.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: AnonEmailString): Unit = js.native
  def apply(
    options: AnonEmailString,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

