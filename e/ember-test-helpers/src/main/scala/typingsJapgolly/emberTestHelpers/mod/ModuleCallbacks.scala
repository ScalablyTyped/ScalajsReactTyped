package typingsJapgolly.emberTestHelpers.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleCallbacks
  extends /* key */ StringDictionary[js.Any] {
  var afterTeardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeSetup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.undefined
  var integration: js.UndefOr[Boolean] = js.undefined
  var needs: js.UndefOr[js.Array[String]] = js.undefined
  var setup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.undefined
  var teardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.undefined
  var unit: js.UndefOr[Boolean] = js.undefined
}

object ModuleCallbacks {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    afterTeardown: /* assert */ js.UndefOr[js.Any] => Callback = null,
    beforeSetup: /* assert */ js.UndefOr[js.Any] => Callback = null,
    integration: js.UndefOr[Boolean] = js.undefined,
    needs: js.Array[String] = null,
    setup: /* assert */ js.UndefOr[js.Any] => Callback = null,
    teardown: /* assert */ js.UndefOr[js.Any] => Callback = null,
    unit: js.UndefOr[Boolean] = js.undefined
  ): ModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (afterTeardown != null) __obj.updateDynamic("afterTeardown")(js.Any.fromFunction1((t0: /* assert */ js.UndefOr[js.Any]) => afterTeardown(t0).runNow()))
    if (beforeSetup != null) __obj.updateDynamic("beforeSetup")(js.Any.fromFunction1((t0: /* assert */ js.UndefOr[js.Any]) => beforeSetup(t0).runNow()))
    if (!js.isUndefined(integration)) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    if (needs != null) __obj.updateDynamic("needs")(needs.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* assert */ js.UndefOr[js.Any]) => setup(t0).runNow()))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction1((t0: /* assert */ js.UndefOr[js.Any]) => teardown(t0).runNow()))
    if (!js.isUndefined(unit)) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleCallbacks]
  }
}

