package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListForwardingAddressesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddressesCollection extends js.Object {
  // Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: ForwardingAddress, userId: String): ForwardingAddress
  // Gets the specified forwarding address.
  def get(userId: String, forwardingEmail: String): ForwardingAddress
  // Lists the forwarding addresses for the specified account.
  def list(userId: String): ListForwardingAddressesResponse
  // Deletes the specified forwarding address and revokes any verification that may have been required.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, forwardingEmail: String): Unit
}

object ForwardingAddressesCollection {
  @scala.inline
  def apply(
    create: (ForwardingAddress, String) => CallbackTo[ForwardingAddress],
    get: (String, String) => CallbackTo[ForwardingAddress],
    list: String => CallbackTo[ListForwardingAddressesResponse],
    remove: (String, String) => Callback
  ): ForwardingAddressesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[ForwardingAddressesCollection]
  }
}

