package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YogaConfig extends js.Object {
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit
  def setPointScaleFactor(factor: Double): Unit
}

object YogaConfig {
  @scala.inline
  def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => CallbackTo[Boolean],
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, Boolean) => Callback,
    setPointScaleFactor: Double => Callback
  ): YogaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isExperimentalFeatureEnabled")(js.Any.fromFunction1((t0: typingsJapgolly.yogaLayout.mod.YogaExperimentalFeature) => isExperimentalFeatureEnabled(t0).runNow()))
    __obj.updateDynamic("setExperimentalFeatureEnabled")(js.Any.fromFunction2((t0: typingsJapgolly.yogaLayout.mod.YogaExperimentalFeature, t1: scala.Boolean) => setExperimentalFeatureEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setPointScaleFactor")(js.Any.fromFunction1((t0: scala.Double) => setPointScaleFactor(t0).runNow()))
    __obj.asInstanceOf[YogaConfig]
  }
}

