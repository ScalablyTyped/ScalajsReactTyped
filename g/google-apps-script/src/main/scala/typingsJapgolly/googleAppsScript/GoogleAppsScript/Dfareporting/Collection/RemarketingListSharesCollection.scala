package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListShare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesCollection extends js.Object {
  // Gets one remarketing list share by remarketing list ID.
  def get(profileId: String, remarketingListId: String): RemarketingListShare
  // Updates an existing remarketing list share. This method supports patch semantics.
  def patch(resource: RemarketingListShare, profileId: String, remarketingListId: String): RemarketingListShare
  // Updates an existing remarketing list share.
  def update(resource: RemarketingListShare, profileId: String): RemarketingListShare
}

object RemarketingListSharesCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[RemarketingListShare],
    patch: (RemarketingListShare, String, String) => CallbackTo[RemarketingListShare],
    update: (RemarketingListShare, String) => CallbackTo[RemarketingListShare]
  ): RemarketingListSharesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListShare, t1: java.lang.String, t2: java.lang.String) => patch(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListShare, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[RemarketingListSharesCollection]
  }
}

