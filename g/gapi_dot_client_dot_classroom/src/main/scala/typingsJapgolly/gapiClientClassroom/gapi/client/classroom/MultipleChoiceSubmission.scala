package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleChoiceSubmission extends js.Object {
  /** Student's select choice. */
  var answer: js.UndefOr[String] = js.undefined
}

object MultipleChoiceSubmission {
  @scala.inline
  def apply(answer: String = null): MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleChoiceSubmission]
  }
}

