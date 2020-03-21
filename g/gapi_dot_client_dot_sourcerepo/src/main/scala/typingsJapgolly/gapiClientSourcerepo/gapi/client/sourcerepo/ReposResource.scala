package typingsJapgolly.gapiClientSourcerepo.gapi.client.sourcerepo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSourcerepo.AnonAccesstoken
import typingsJapgolly.gapiClientSourcerepo.AnonAlt
import typingsJapgolly.gapiClientSourcerepo.AnonBearertoken
import typingsJapgolly.gapiClientSourcerepo.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposResource extends js.Object {
  /**
    * Creates a repo in the given project with the given name.
    *
    * If the named repository already exists, `CreateRepo` returns
    * `ALREADY_EXISTS`.
    */
  def create(request: AnonAccesstoken): Request_[Repo]
  /** Deletes a repo. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Returns information about a repo. */
  def get(request: AnonAlt): Request_[Repo]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[Policy]
  /**
    * Returns all repos belonging to a project. The sizes of the repos are
    * not set by ListRepos.  To get the size of a repo, use GetRepo.
    */
  def list(request: AnonCallback): Request_[ListReposResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[TestIamPermissionsResponse]
}

object ReposResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Repo]],
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAlt => CallbackTo[Request_[Repo]],
    getIamPolicy: AnonBearertoken => CallbackTo[Request_[Policy]],
    list: AnonCallback => CallbackTo[Request_[ListReposResponse]],
    setIamPolicy: AnonBearertoken => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonBearertoken => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): ReposResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonBearertoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonBearertoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSourcerepo.AnonBearertoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[ReposResource]
  }
}

