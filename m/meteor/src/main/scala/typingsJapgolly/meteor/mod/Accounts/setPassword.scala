package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.AnonLogout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.setPassword")
@js.native
object setPassword extends js.Object {
  def apply(userId: String, newPassword: String): Unit = js.native
  def apply(userId: String, newPassword: String, options: AnonLogout): Unit = js.native
}

