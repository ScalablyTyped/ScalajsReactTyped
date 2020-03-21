package typingsJapgolly.pulumiAws.inputMod.codebuild

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilterGroup extends js.Object {
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[Input[js.Array[Input[WebhookFilterGroupFilter]]]] = js.native
}

object WebhookFilterGroup {
  @scala.inline
  def apply(filters: Input[js.Array[Input[WebhookFilterGroupFilter]]] = null): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilterGroup]
  }
}

