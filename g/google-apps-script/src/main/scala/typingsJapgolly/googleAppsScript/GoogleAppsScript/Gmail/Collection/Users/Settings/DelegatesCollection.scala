package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDelegatesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegatesCollection extends js.Object {
  // Adds a delegate with its verification status set directly to accepted, without sending any verification email. The delegate user must be a member of the same G Suite organization as the delegator user.
  // Gmail imposes limtations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization, but in general each user can have up to 25 delegates and up to 10 delegators.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: Delegate, userId: String): Delegate
  // Gets the specified delegate.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def get(userId: String, delegateEmail: String): Delegate
  // Lists the delegates for the specified account.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def list(userId: String): ListDelegatesResponse
  // Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, delegateEmail: String): Unit
}

object DelegatesCollection {
  @scala.inline
  def apply(
    create: (Delegate, String) => CallbackTo[Delegate],
    get: (String, String) => CallbackTo[Delegate],
    list: String => CallbackTo[ListDelegatesResponse],
    remove: (String, String) => Callback
  ): DelegatesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[DelegatesCollection]
  }
}

