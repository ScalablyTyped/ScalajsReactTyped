package typingsJapgolly.angularMeteor.mod.meteor

import typingsJapgolly.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRootScopeService
  extends typingsJapgolly.angular.mod.IRootScopeService {
  /**
    * The current logged in user and it's data. it is null if the user is not logged in. A reactive data source.
    */
  var currentUser: User_ = js.native
  /**
    * True if a login method (such as Meteor.loginWithPassword, Meteor.loginWithFacebook, or Accounts.createUser) is currently in progress.
    * A reactive data source. Can be use to display animation while user is logging in.
    */
  var loggingIn: Boolean = js.native
}

