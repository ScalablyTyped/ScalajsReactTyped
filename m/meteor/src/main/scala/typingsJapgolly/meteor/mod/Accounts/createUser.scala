package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.AnonEmail
import typingsJapgolly.meteor.Meteor.Error
import typingsJapgolly.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: AnonEmail): String = js.native
  def apply(
    options: AnonEmail,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): String = js.native
}

