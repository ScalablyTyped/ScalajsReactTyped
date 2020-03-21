package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsByStatusResponse extends js.Object {
  /**
    * An array of Job objects that have the specified status.
    */
  var Jobs: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Jobs] = js.native
  /**
    *  A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified pipeline fit on one page or when you've reached the last page of results, the value of NextPageToken is null. 
    */
  var NextPageToken: js.UndefOr[Id] = js.native
}

object ListJobsByStatusResponse {
  @scala.inline
  def apply(Jobs: Jobs = null, NextPageToken: Id = null): ListJobsByStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByStatusResponse]
  }
}

