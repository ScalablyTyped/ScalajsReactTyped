package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunStateChange extends js.Object {
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState = js.native
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: js.Date = js.native
}

object AssessmentRunStateChange {
  @scala.inline
  def apply(state: AssessmentRunState, stateChangedAt: js.Date): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
}

