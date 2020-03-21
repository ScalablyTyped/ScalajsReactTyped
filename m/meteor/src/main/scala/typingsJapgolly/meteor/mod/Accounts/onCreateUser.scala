package typingsJapgolly.meteor.mod.Accounts

import typingsJapgolly.meteor.AnonProfile
import typingsJapgolly.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.onCreateUser")
@js.native
object onCreateUser extends js.Object {
  def apply(func: js.Function2[/* options */ AnonProfile, /* user */ User_, Unit]): Unit = js.native
}

