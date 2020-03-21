package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Form
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnOpen extends AppsScriptEvent {
  var source: Form
}

object FormsOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Form, triggerUid: String, user: User): FormsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormsOnOpen]
  }
}

