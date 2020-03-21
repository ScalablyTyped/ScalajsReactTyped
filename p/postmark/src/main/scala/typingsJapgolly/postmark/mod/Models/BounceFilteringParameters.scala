package typingsJapgolly.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.BounceFilteringParameters")
@js.native
class BounceFilteringParameters protected ()
  extends typingsJapgolly.postmark.modelsMod.BounceFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    `type`: js.UndefOr[typingsJapgolly.postmark.bounceFilteringParametersMod.BounceType],
    inactive: js.UndefOr[Boolean],
    emailFilter: js.UndefOr[String],
    tag: js.UndefOr[String],
    messageID: js.UndefOr[String],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}

