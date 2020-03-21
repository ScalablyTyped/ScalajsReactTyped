package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegistryRequest extends js.Object {
  /**
    * A description of the registry to be created.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.native
  var RegistryName: string = js.native
  /**
    * Tags to associate with the registry.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.schemasMod.Tags] = js.native
}

object CreateRegistryRequest {
  @scala.inline
  def apply(RegistryName: string, Description: stringMin0Max256 = null, Tags: Tags = null): CreateRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegistryRequest]
  }
}

