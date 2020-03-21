package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchPropertiesRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: typingsJapgolly.awsSdk.ssmMod.OperatingSystem = js.native
  /**
    * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.
    */
  var PatchSet: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.PatchSet] = js.native
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty = js.native
}

object DescribePatchPropertiesRequest {
  @scala.inline
  def apply(
    OperatingSystem: OperatingSystem,
    Property: PatchProperty,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    PatchSet: PatchSet = null
  ): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PatchSet != null) __obj.updateDynamic("PatchSet")(PatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
}

