package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.Meteor.Connection
import typingsJapgolly.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.onLogout")
@js.native
object onLogout extends js.Object {
  def apply(func: js.Function): Unit = js.native
  def apply(func: js.Function2[/* user */ User_, /* connection */ Connection, Unit]): Unit = js.native
}

