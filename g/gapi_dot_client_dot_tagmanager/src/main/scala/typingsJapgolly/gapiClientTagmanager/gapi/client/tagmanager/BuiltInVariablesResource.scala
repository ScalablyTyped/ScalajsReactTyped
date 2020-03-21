package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonKey
import typingsJapgolly.gapiClientTagmanager.AnonOauthtoken
import typingsJapgolly.gapiClientTagmanager.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: AnonOauthtoken): Request_[CreateBuiltInVariableResponse]
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: AnonPath): Request_[Unit]
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: AnonKey): Request_[ListEnabledBuiltInVariablesResponse]
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: AnonPath): Request_[RevertBuiltInVariableResponse]
}

object BuiltInVariablesResource {
  @scala.inline
  def apply(
    create: AnonOauthtoken => CallbackTo[Request_[CreateBuiltInVariableResponse]],
    delete: AnonPath => CallbackTo[Request_[Unit]],
    list: AnonKey => CallbackTo[Request_[ListEnabledBuiltInVariablesResponse]],
    revert: AnonPath => CallbackTo[Request_[RevertBuiltInVariableResponse]]
  ): BuiltInVariablesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonOauthtoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonPath) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonPath) => revert(t0).runNow()))
    __obj.asInstanceOf[BuiltInVariablesResource]
  }
}

