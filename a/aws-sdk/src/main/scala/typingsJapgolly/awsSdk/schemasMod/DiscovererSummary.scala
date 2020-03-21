package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscovererSummary extends js.Object {
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.native
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.native
  var State: js.UndefOr[DiscovererState] = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.schemasMod.Tags] = js.native
}

object DiscovererSummary {
  @scala.inline
  def apply(
    DiscovererArn: string = null,
    DiscovererId: string = null,
    SourceArn: string = null,
    State: DiscovererState = null,
    Tags: Tags = null
  ): DiscovererSummary = {
    val __obj = js.Dynamic.literal()
    if (DiscovererArn != null) __obj.updateDynamic("DiscovererArn")(DiscovererArn.asInstanceOf[js.Any])
    if (DiscovererId != null) __obj.updateDynamic("DiscovererId")(DiscovererId.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscovererSummary]
  }
}

