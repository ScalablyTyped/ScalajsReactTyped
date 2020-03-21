package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the device definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the device definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * Information about the device definition version.
    */
  var Definition: js.UndefOr[DeviceDefinitionVersion] = js.native
  /**
    * The ID of the device definition version.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The version of the device definition version.
    */
  var Version: js.UndefOr[string] = js.native
}

object GetDeviceDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CreationTimestamp: string = null,
    Definition: DeviceDefinitionVersion = null,
    Id: string = null,
    NextToken: string = null,
    Version: string = null
  ): GetDeviceDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionVersionResponse]
  }
}

