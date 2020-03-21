package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetResponse extends js.Object {
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: typingsJapgolly.awsSdk.guarddutyMod.Location = js.native
  /**
    * The user friendly name for the IPSet.
    */
  var Name: typingsJapgolly.awsSdk.guarddutyMod.Name = js.native
  /**
    * The status of ipSet file uploaded.
    */
  var Status: IpSetStatus = js.native
  /**
    * The tags of the IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object GetIPSetResponse {
  @scala.inline
  def apply(Format: IpSetFormat, Location: Location, Name: Name, Status: IpSetStatus, Tags: TagMap = null): GetIPSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
}

