package typingsJapgolly.meteor.mod.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.addEmail")
@js.native
object addEmail extends js.Object {
  def apply(userId: String, newEmail: String): Unit = js.native
  def apply(userId: String, newEmail: String, verified: Boolean): Unit = js.native
}

