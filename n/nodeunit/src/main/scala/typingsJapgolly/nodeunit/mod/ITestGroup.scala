package typingsJapgolly.nodeunit.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestGroup
  extends /* property */ StringDictionary[
      js.UndefOr[ITestGroup | ITestBody | (js.Function1[/* callback */ ICallbackFunction, Unit])]
    ] {
  /** The setUp function is run before each test */
  var setUp: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.undefined
  /** The tearDown function is run after each test calls test.done() */
  var tearDown: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.undefined
}

object ITestGroup {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[
      js.UndefOr[ITestGroup | ITestBody | (js.Function1[/* callback */ ICallbackFunction, Unit])]
    ] = null,
    setUp: /* callback */ ICallbackFunction => Callback = null,
    tearDown: /* callback */ ICallbackFunction => Callback = null
  ): ITestGroup = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (setUp != null) __obj.updateDynamic("setUp")(js.Any.fromFunction1((t0: /* callback */ typingsJapgolly.nodeunit.mod.ICallbackFunction) => setUp(t0).runNow()))
    if (tearDown != null) __obj.updateDynamic("tearDown")(js.Any.fromFunction1((t0: /* callback */ typingsJapgolly.nodeunit.mod.ICallbackFunction) => tearDown(t0).runNow()))
    __obj.asInstanceOf[ITestGroup]
  }
}

