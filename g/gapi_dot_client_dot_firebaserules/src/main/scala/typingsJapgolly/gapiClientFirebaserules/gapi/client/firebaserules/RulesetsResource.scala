package typingsJapgolly.gapiClientFirebaserules.gapi.client.firebaserules

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken
import typingsJapgolly.gapiClientFirebaserules.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesetsResource extends js.Object {
  /**
    * Create a `Ruleset` from `Source`.
    *
    * The `Ruleset` is given a unique generated name which is returned to the
    * caller. `Source` containing syntactic or semantics errors will result in an
    * error response indicating the first error encountered. For a detailed view
    * of `Source` issues, use TestRuleset.
    */
  def create(request: AnonAccesstoken): Request_[Ruleset]
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: AnonAccesstoken): Request_[Ruleset]
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: AnonBearertoken): Request_[ListRulesetsResponse]
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Ruleset]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[Ruleset]],
    list: AnonBearertoken => CallbackTo[Request_[ListRulesetsResponse]]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebaserules.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[RulesetsResource]
  }
}

