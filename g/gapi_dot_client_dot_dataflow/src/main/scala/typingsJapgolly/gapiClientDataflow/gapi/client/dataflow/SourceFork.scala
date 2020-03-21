package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFork extends js.Object {
  /** DEPRECATED */
  var primary: js.UndefOr[SourceSplitShard] = js.undefined
  /** DEPRECATED */
  var primarySource: js.UndefOr[DerivedSource] = js.undefined
  /** DEPRECATED */
  var residual: js.UndefOr[SourceSplitShard] = js.undefined
  /** DEPRECATED */
  var residualSource: js.UndefOr[DerivedSource] = js.undefined
}

object SourceFork {
  @scala.inline
  def apply(
    primary: SourceSplitShard = null,
    primarySource: DerivedSource = null,
    residual: SourceSplitShard = null,
    residualSource: DerivedSource = null
  ): SourceFork = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primarySource != null) __obj.updateDynamic("primarySource")(primarySource.asInstanceOf[js.Any])
    if (residual != null) __obj.updateDynamic("residual")(residual.asInstanceOf[js.Any])
    if (residualSource != null) __obj.updateDynamic("residualSource")(residualSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFork]
  }
}

