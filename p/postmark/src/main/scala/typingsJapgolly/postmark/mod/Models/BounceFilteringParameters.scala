package typingsJapgolly.postmark.mod.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.BounceFilteringParameters")
@js.native
open class BounceFilteringParameters protected ()
  extends typingsJapgolly.postmark.distClientModelsMod.BounceFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    `type`: js.UndefOr[
        typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType
      ],
    inactive: js.UndefOr[Boolean],
    emailFilter: js.UndefOr[String],
    tag: js.UndefOr[String],
    messageID: js.UndefOr[String],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}
