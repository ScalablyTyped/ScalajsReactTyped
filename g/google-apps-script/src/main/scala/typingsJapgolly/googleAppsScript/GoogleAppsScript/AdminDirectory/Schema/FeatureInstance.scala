package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureInstance extends js.Object {
  var feature: js.UndefOr[Feature] = js.undefined
}

object FeatureInstance {
  @scala.inline
  def apply(feature: Feature = null): FeatureInstance = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureInstance]
  }
}

