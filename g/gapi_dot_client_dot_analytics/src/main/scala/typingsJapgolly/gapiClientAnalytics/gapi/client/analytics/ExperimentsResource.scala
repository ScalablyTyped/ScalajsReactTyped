package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonExperimentId
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonStartindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: AnonExperimentId): Request_[Unit]
  /** Returns an experiment to which the user has access. */
  def get(request: AnonExperimentId): Request_[Experiment]
  /** Create a new experiment. */
  def insert(request: AnonProfileId): Request_[Experiment]
  /** Lists experiments to which the user has access. */
  def list(request: AnonStartindex): Request_[Experiments]
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: AnonExperimentId): Request_[Experiment]
  /** Update an existing experiment. */
  def update(request: AnonExperimentId): Request_[Experiment]
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: AnonExperimentId => CallbackTo[Request_[Unit]],
    get: AnonExperimentId => CallbackTo[Request_[Experiment]],
    insert: AnonProfileId => CallbackTo[Request_[Experiment]],
    list: AnonStartindex => CallbackTo[Request_[Experiments]],
    patch: AnonExperimentId => CallbackTo[Request_[Experiment]],
    update: AnonExperimentId => CallbackTo[Request_[Experiment]]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonExperimentId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonExperimentId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonStartindex) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonExperimentId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonExperimentId) => update(t0).runNow()))
    __obj.asInstanceOf[ExperimentsResource]
  }
}

