package typingsJapgolly.emberQunit.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.emberTestHelpers.mod.ModuleCallbacks
import typingsJapgolly.qunit.Assert
import typingsJapgolly.qunit.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QUnitModuleCallbacks
  extends ModuleCallbacks
     with Hooks {
  @JSName("afterTeardown")
  var afterTeardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("beforeSetup")
  var beforeSetup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("setup")
  var setup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("teardown")
  var teardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
}

object QUnitModuleCallbacks {
  @scala.inline
  def apply(
    after: /* assert */ Assert => Callback = null,
    afterEach: /* assert */ Assert => Callback = null,
    afterTeardown: /* assert */ Assert => Callback = null,
    before: /* assert */ Assert => Callback = null,
    beforeEach: /* assert */ Assert => Callback = null,
    beforeSetup: /* assert */ Assert => Callback = null,
    integration: js.UndefOr[Boolean] = js.undefined,
    needs: js.Array[String] = null,
    setup: /* assert */ Assert => Callback = null,
    teardown: /* assert */ Assert => Callback = null,
    unit: js.UndefOr[Boolean] = js.undefined
  ): QUnitModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => after(t0).runNow()))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => afterEach(t0).runNow()))
    if (afterTeardown != null) __obj.updateDynamic("afterTeardown")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => afterTeardown(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => before(t0).runNow()))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => beforeEach(t0).runNow()))
    if (beforeSetup != null) __obj.updateDynamic("beforeSetup")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => beforeSetup(t0).runNow()))
    if (!js.isUndefined(integration)) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    if (needs != null) __obj.updateDynamic("needs")(needs.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => setup(t0).runNow()))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => teardown(t0).runNow()))
    if (!js.isUndefined(unit)) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[QUnitModuleCallbacks]
  }
}

