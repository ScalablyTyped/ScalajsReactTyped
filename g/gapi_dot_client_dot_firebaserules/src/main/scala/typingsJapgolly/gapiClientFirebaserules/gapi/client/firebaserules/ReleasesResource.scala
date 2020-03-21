package typingsJapgolly.gapiClientFirebaserules.gapi.client.firebaserules

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken
import typingsJapgolly.gapiClientFirebaserules.AnonAlt
import typingsJapgolly.gapiClientFirebaserules.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleasesResource extends js.Object {
  /**
    * Create a `Release`.
    *
    * Release names should reflect the developer's deployment practices. For
    * example, the release name may include the environment name, application
    * name, application version, or any other name meaningful to the developer.
    * Once a `Release` refers to a `Ruleset`, the rules can be enforced by
    * Firebase Rules-enabled services.
    *
    * More than one `Release` may be 'live' concurrently. Consider the following
    * three `Release` names for `projects/foo` and the `Ruleset` to which they
    * refer.
    *
    * Release Name                    | Ruleset Name
    * --------------------------------|-------------
    * projects/foo/releases/prod      | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/beta | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/v23  | projects/foo/rulesets/uuid456
    *
    * The table reflects the `Ruleset` rollout in progress. The `prod` and
    * `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23`
    * refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be
    * updated using the UpdateRelease method.
    */
  def create(request: AnonAccesstoken): Request_[Release]
  /** Delete a `Release` by resource name. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Get a `Release` by name. */
  def get(request: AnonAccesstoken): Request_[Release]
  /** Get the `Release` executable to use when enforcing rules. */
  def getExecutable(request: AnonAlt): Request_[GetReleaseExecutableResponse]
  /**
    * List the `Release` values for a project. This list may optionally be
    * filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any
    * combination thereof.
    */
  def list(request: AnonBearertoken): Request_[ListReleasesResponse]
  /**
    * Update a `Release`.
    *
    * Only updates to the `ruleset_name` and `test_suite_name` fields will be
    * honored. `Release` rename is not supported. To create a `Release` use the
    * CreateRelease method.
    */
  def update(request: AnonAccesstoken): Request_[Release]
}

object ReleasesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Release]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[Release]],
    getExecutable: AnonAlt => CallbackTo[Request_[GetReleaseExecutableResponse]],
    list: AnonBearertoken => CallbackTo[Request_[ListReleasesResponse]],
    update: AnonAccesstoken => CallbackTo[Request_[Release]]
  ): ReleasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("getExecutable")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAlt) => getExecutable(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => update(t0).runNow()))
    __obj.asInstanceOf[ReleasesResource]
  }
}

