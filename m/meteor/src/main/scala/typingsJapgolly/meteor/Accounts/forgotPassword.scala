package typingsJapgolly.meteor.Accounts

import typingsJapgolly.meteor.AnonEmailString
import typingsJapgolly.meteor.Meteor.Error
import typingsJapgolly.meteor.Meteor.TypedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: AnonEmailString): Unit = js.native
  def apply(
    options: AnonEmailString,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Error | TypedError], Unit]
  ): Unit = js.native
}

