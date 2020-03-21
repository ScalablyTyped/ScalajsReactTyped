package typingsJapgolly.angularFeatureFlags.mod.featureflags

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFlagsProvider extends js.Object {
  def setInitialFlags(flags: js.Array[FlagData]): Unit
}

object FeatureFlagsProvider {
  @scala.inline
  def apply(setInitialFlags: js.Array[FlagData] => Callback): FeatureFlagsProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setInitialFlags")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.angularFeatureFlags.mod.featureflags.FlagData]) => setInitialFlags(t0).runNow()))
    __obj.asInstanceOf[FeatureFlagsProvider]
  }
}

