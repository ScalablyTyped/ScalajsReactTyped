package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs.SmimeInfoCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSendAsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAsCollection extends js.Object {
  var SmimeInfo: js.UndefOr[SmimeInfoCollection] = js.undefined
  // Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, userId: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
  // Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
  def get(userId: String, sendAsEmail: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
  // Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
  def list(userId: String): ListSendAsResponse
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority. This method supports patch semantics.
  def patch(
    resource: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
  // Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, sendAsEmail: String): Unit
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
  def update(
    resource: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
  // Sends a verification email to the specified send-as alias address. The verification status must be pending.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def verify(userId: String, sendAsEmail: String): Unit
}

object SendAsCollection {
  @scala.inline
  def apply(
    create: (typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String) => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs],
    get: (String, String) => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs],
    list: String => CallbackTo[ListSendAsResponse],
    patch: (typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs],
    remove: (String, String) => Callback,
    update: (typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs],
    verify: (String, String) => Callback,
    SmimeInfo: SmimeInfoCollection = null
  ): SendAsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, t1: java.lang.String, t2: java.lang.String) => patch(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, t1: java.lang.String, t2: java.lang.String) => update(t0, t1, t2).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => verify(t0, t1).runNow()))
    if (SmimeInfo != null) __obj.updateDynamic("SmimeInfo")(SmimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAsCollection]
  }
}

