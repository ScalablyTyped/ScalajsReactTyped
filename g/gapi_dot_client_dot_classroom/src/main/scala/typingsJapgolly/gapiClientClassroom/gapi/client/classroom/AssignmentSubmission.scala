package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentSubmission extends js.Object {
  /**
    * Attachments added by the student.
    * Drive files that correspond to materials with a share mode of
    * STUDENT_COPY may not exist yet if the student has not accessed the
    * assignment in Classroom.
    *
    * Some attachment metadata is only populated if the requesting user has
    * permission to access it. Identifier and alternate_link fields are always
    * available, but others (e.g. title) may not be.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
}

object AssignmentSubmission {
  @scala.inline
  def apply(attachments: js.Array[Attachment] = null): AssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentSubmission]
  }
}

