package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionStageState extends js.Object {
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[String] = js.undefined
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[String] = js.undefined
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[String] = js.undefined
}

object ExecutionStageState {
  @scala.inline
  def apply(
    currentStateTime: String = null,
    executionStageName: String = null,
    executionStageState: String = null
  ): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    if (currentStateTime != null) __obj.updateDynamic("currentStateTime")(currentStateTime.asInstanceOf[js.Any])
    if (executionStageName != null) __obj.updateDynamic("executionStageName")(executionStageName.asInstanceOf[js.Any])
    if (executionStageState != null) __obj.updateDynamic("executionStageState")(executionStageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionStageState]
  }
}

