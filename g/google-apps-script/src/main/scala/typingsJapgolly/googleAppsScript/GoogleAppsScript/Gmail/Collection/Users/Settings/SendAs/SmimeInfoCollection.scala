package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSmimeInfoResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoCollection extends js.Object {
  // Gets the specified S/MIME config for the specified send-as alias.
  def get(userId: String, sendAsEmail: String, id: String): SmimeInfo
  // Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
  def insert(resource: SmimeInfo, userId: String, sendAsEmail: String): SmimeInfo
  // Lists S/MIME configs for the specified send-as alias.
  def list(userId: String, sendAsEmail: String): ListSmimeInfoResponse
  // Deletes the specified S/MIME config for the specified send-as alias.
  def remove(userId: String, sendAsEmail: String, id: String): Unit
  // Sets the default S/MIME config for the specified send-as alias.
  def setDefault(userId: String, sendAsEmail: String, id: String): Unit
}

object SmimeInfoCollection {
  @scala.inline
  def apply(
    get: (String, String, String) => CallbackTo[SmimeInfo],
    insert: (SmimeInfo, String, String) => CallbackTo[SmimeInfo],
    list: (String, String) => CallbackTo[ListSmimeInfoResponse],
    remove: (String, String, String) => Callback,
    setDefault: (String, String, String) => Callback
  ): SmimeInfoCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => get(t0, t1, t2).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo, t1: java.lang.String, t2: java.lang.String) => insert(t0, t1, t2).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => list(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => remove(t0, t1, t2).runNow()))
    __obj.updateDynamic("setDefault")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => setDefault(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SmimeInfoCollection]
  }
}

