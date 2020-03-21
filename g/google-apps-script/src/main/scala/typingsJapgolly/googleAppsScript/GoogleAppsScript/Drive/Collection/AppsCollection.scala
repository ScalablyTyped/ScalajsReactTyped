package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.App
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.AppList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCollection extends js.Object {
  // Gets a specific app.
  def get(appId: String): App = js.native
  // Lists a user's installed apps.
  def list(): AppList = js.native
  // Lists a user's installed apps.
  def list(optionalArgs: js.Object): AppList = js.native
}

