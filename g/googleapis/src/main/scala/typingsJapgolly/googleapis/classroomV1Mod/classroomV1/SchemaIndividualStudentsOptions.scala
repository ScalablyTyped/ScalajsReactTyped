package typingsJapgolly.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assignee details about a coursework/announcement. This field is set if and
  * only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait SchemaIndividualStudentsOptions extends js.Object {
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[String] = null): SchemaIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIndividualStudentsOptions]
  }
}

