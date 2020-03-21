package typingsJapgolly.pulumiAws.getNetworkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.ec2.GetNetworkInterfacesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfacesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetNetworkInterfacesFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired network interfaces.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetNetworkInterfacesArgs {
  @scala.inline
  def apply(filters: js.Array[GetNetworkInterfacesFilter] = null, tags: StringDictionary[js.Any] = null): GetNetworkInterfacesArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfacesArgs]
  }
}

