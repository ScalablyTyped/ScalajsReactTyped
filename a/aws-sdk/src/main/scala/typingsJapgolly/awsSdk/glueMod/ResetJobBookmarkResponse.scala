package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetJobBookmarkResponse extends js.Object {
  /**
    * The reset bookmark entry.
    */
  var JobBookmarkEntry: js.UndefOr[typingsJapgolly.awsSdk.glueMod.JobBookmarkEntry] = js.native
}

object ResetJobBookmarkResponse {
  @scala.inline
  def apply(JobBookmarkEntry: JobBookmarkEntry = null): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarkEntry != null) __obj.updateDynamic("JobBookmarkEntry")(JobBookmarkEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
}

