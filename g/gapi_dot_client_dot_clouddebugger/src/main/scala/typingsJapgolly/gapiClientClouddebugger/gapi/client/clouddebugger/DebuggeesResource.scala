package typingsJapgolly.gapiClientClouddebugger.gapi.client.clouddebugger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouddebugger.AnonClientVersion
import typingsJapgolly.gapiClientClouddebugger.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebuggeesResource extends js.Object {
  var breakpoints: BreakpointsResource
  /** Lists all the debuggees that the user has access to. */
  def list(request: AnonClientVersion): Request_[ListDebuggeesResponse]
  /**
    * Registers the debuggee with the controller service.
    *
    * All agents attached to the same application must call this method with
    * exactly the same request content to get back the same stable `debuggee_id`.
    * Agents should call this method again whenever `google.rpc.Code.NOT_FOUND`
    * is returned from any controller method.
    *
    * This protocol allows the controller service to disable debuggees, recover
    * from data loss, or change the `debuggee_id` format. Agents must handle
    * `debuggee_id` value changing upon re-registration.
    */
  def register(request: AnonFields): Request_[RegisterDebuggeeResponse]
}

object DebuggeesResource {
  @scala.inline
  def apply(
    breakpoints: BreakpointsResource,
    list: AnonClientVersion => CallbackTo[Request_[ListDebuggeesResponse]],
    register: AnonFields => CallbackTo[Request_[RegisterDebuggeeResponse]]
  ): DebuggeesResource = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouddebugger.AnonClientVersion) => list(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouddebugger.AnonFields) => register(t0).runNow()))
    __obj.asInstanceOf[DebuggeesResource]
  }
}

