package typingsJapgolly.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualificationRequest extends js.Object {
  /**
    *  The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty. 
    */
  var Answer: js.UndefOr[String] = js.native
  /**
    * The ID of the Qualification request, a unique identifier generated when the request was submitted. 
    */
  var QualificationRequestId: js.UndefOr[String] = js.native
  /**
    *  The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    * The date and time the Qualification request had a status of Submitted. This is either the time the Worker submitted answers for a Qualification test, or the time the Worker requested the Qualification if the Qualification type does not have a test. 
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    *  The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the time the Worker requests the Qualification.
    */
  var Test: js.UndefOr[String] = js.native
  /**
    *  The ID of the Worker requesting the Qualification.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object QualificationRequest {
  @scala.inline
  def apply(
    Answer: String = null,
    QualificationRequestId: String = null,
    QualificationTypeId: EntityId = null,
    SubmitTime: js.Date = null,
    Test: String = null,
    WorkerId: CustomerId = null
  ): QualificationRequest = {
    val __obj = js.Dynamic.literal()
    if (Answer != null) __obj.updateDynamic("Answer")(Answer.asInstanceOf[js.Any])
    if (QualificationRequestId != null) __obj.updateDynamic("QualificationRequestId")(QualificationRequestId.asInstanceOf[js.Any])
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    if (Test != null) __obj.updateDynamic("Test")(Test.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualificationRequest]
  }
}

