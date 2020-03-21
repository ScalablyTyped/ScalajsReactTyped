package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonExamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: AnonExamType): Request_[ExamToken]
}

object ExamsResource {
  @scala.inline
  def apply(getToken: AnonExamType => CallbackTo[Request_[ExamToken]]): ExamsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonExamType) => getToken(t0).runNow()))
    __obj.asInstanceOf[ExamsResource]
  }
}

