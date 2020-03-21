package typingsJapgolly.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsOutput extends js.Object {
  var IsTruncated: js.UndefOr[typingsJapgolly.awsSdk.importexportMod.IsTruncated] = js.native
  var Jobs: js.UndefOr[JobsList] = js.native
}

object ListJobsOutput {
  @scala.inline
  def apply(IsTruncated: js.UndefOr[Boolean] = js.undefined, Jobs: JobsList = null): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsOutput]
  }
}

