package typingsJapgolly.jssPresetDefault.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultUnit: js.UndefOr[typingsJapgolly.jssPluginDefaultUnit.mod.Options] = js.undefined
  var observable: js.UndefOr[typingsJapgolly.jssPluginRuleValueObservable.mod.Options] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultUnit: typingsJapgolly.jssPluginDefaultUnit.mod.Options = null,
    observable: typingsJapgolly.jssPluginRuleValueObservable.mod.Options = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    if (observable != null) __obj.updateDynamic("observable")(observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

