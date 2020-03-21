package typingsJapgolly.gapiClientConsumersurveys.gapi.client.consumersurveys

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientConsumersurveys.AnonFields
import typingsJapgolly.gapiClientConsumersurveys.AnonKey
import typingsJapgolly.gapiClientConsumersurveys.AnonOauthtoken
import typingsJapgolly.gapiClientConsumersurveys.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: AnonKey): Request_[SurveysDeleteResponse]
  /** Retrieves information about the specified survey. */
  def get(request: AnonKey): Request_[Survey]
  /** Creates a survey. */
  def insert(request: AnonOauthtoken): Request_[Survey]
  /** Lists the surveys owned by the authenticated user. */
  def list(request: AnonFields): Request_[SurveysListResponse]
  /** Begins running a survey. */
  def start(request: AnonPrettyPrint): Request_[SurveysStartResponse]
  /** Stops a running survey. */
  def stop(request: AnonPrettyPrint): Request_[SurveysStopResponse]
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: AnonKey): Request_[Survey]
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: AnonKey => CallbackTo[Request_[SurveysDeleteResponse]],
    get: AnonKey => CallbackTo[Request_[Survey]],
    insert: AnonOauthtoken => CallbackTo[Request_[Survey]],
    list: AnonFields => CallbackTo[Request_[SurveysListResponse]],
    start: AnonPrettyPrint => CallbackTo[Request_[SurveysStartResponse]],
    stop: AnonPrettyPrint => CallbackTo[Request_[SurveysStopResponse]],
    update: AnonKey => CallbackTo[Request_[Survey]]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonPrettyPrint) => start(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonPrettyPrint) => stop(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[SurveysResource]
  }
}

