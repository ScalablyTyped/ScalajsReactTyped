package typingsJapgolly.ibmMobilefirst.WL.JSONStore

import typingsJapgolly.ibmMobilefirst.WL.Options
import typingsJapgolly.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore.changePassword")
@js.native
object changePassword extends js.Object {
  /**
    * Changes the password for the internal storage. You must have an initialized collection before calling WL.JSONStore.changePassword.
    */
  def apply(oldPassword: String, newPassword: String, username: String, options: Options): JQueryDeferred[_] = js.native
}

