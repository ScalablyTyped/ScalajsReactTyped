package typingsJapgolly.webdriverio.WebdriverIO

import japgolly.scalajs.react.Callback
import typingsJapgolly.webdriver.WebDriver.DesiredCapabilities
import typingsJapgolly.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookFunctions extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[js.Error], 
      Unit
    ]
  ] = js.undefined
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ AnonDuration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ AnonDuration, Unit]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
  ] = js.undefined
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.undefined
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  var onComplete: js.UndefOr[
    js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]
  ] = js.undefined
  var onPrepare: js.UndefOr[
    js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
  ] = js.undefined
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
}

object HookFunctions {
  @scala.inline
  def apply(
    after: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Callback = null,
    afterCommand: (/* commandName */ String, /* args */ js.Array[js.Any], /* result */ js.Any, /* error */ js.UndefOr[js.Error]) => Callback = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Callback = null,
    afterSession: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Callback = null,
    afterSuite: /* suite */ Suite => Callback = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Callback = null,
    before: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Callback = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[js.Any]) => Callback = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Callback = null,
    beforeSession: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Callback = null,
    beforeSuite: /* suite */ Suite => Callback = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Callback = null,
    onComplete: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Callback = null,
    onPrepare: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Callback = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Callback = null
  ): HookFunctions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* result */ scala.Double, t1: /* capabilities */ typingsJapgolly.webdriver.WebDriver.DesiredCapabilities, t2: /* specs */ js.Array[java.lang.String]) => after(t0, t1, t2).runNow()))
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4((t0: /* commandName */ java.lang.String, t1: /* args */ js.Array[js.Any], t2: /* result */ js.Any, t3: /* error */ js.UndefOr[js.Error]) => afterCommand(t0, t1, t2, t3).runNow()))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5((t0: /* test */ js.Any, t1: /* context */ js.Any, t2: /* result */ typingsJapgolly.webdriverio.AnonDuration, t3: /* stepData */ js.UndefOr[js.Any], t4: /* world */ js.UndefOr[js.Any]) => afterHook(t0, t1, t2, t3, t4).runNow()))
    if (afterSession != null) __obj.updateDynamic("afterSession")(js.Any.fromFunction3((t0: /* config */ typingsJapgolly.webdriverio.WebdriverIO.Config, t1: /* capabilities */ typingsJapgolly.webdriver.WebDriver.DesiredCapabilities, t2: /* specs */ js.Array[java.lang.String]) => afterSession(t0, t1, t2).runNow()))
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1((t0: /* suite */ typingsJapgolly.webdriverio.WebdriverIO.Suite) => afterSuite(t0).runNow()))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3((t0: /* test */ typingsJapgolly.webdriverio.WebdriverIO.Test, t1: /* context */ js.Any, t2: /* result */ typingsJapgolly.webdriverio.AnonDuration) => afterTest(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2((t0: /* capabilities */ typingsJapgolly.webdriver.WebDriver.DesiredCapabilities, t1: /* specs */ js.Array[java.lang.String]) => before(t0, t1).runNow()))
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2((t0: /* commandName */ java.lang.String, t1: /* args */ js.Array[js.Any]) => beforeCommand(t0, t1).runNow()))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4((t0: /* test */ js.Any, t1: /* context */ js.Any, t2: /* stepData */ js.UndefOr[js.Any], t3: /* world */ js.UndefOr[js.Any]) => beforeHook(t0, t1, t2, t3).runNow()))
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(js.Any.fromFunction3((t0: /* config */ typingsJapgolly.webdriverio.WebdriverIO.Config, t1: /* capabilities */ typingsJapgolly.webdriver.WebDriver.DesiredCapabilities, t2: /* specs */ js.Array[java.lang.String]) => beforeSession(t0, t1, t2).runNow()))
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1((t0: /* suite */ typingsJapgolly.webdriverio.WebdriverIO.Suite) => beforeSuite(t0).runNow()))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2((t0: /* test */ typingsJapgolly.webdriverio.WebdriverIO.Test, t1: /* context */ js.Any) => beforeTest(t0, t1).runNow()))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction4((t0: /* exitCode */ scala.Double, t1: /* config */ typingsJapgolly.webdriverio.WebdriverIO.Config, t2: /* capabilities */ typingsJapgolly.webdriver.WebDriver.DesiredCapabilities, t3: /* results */ typingsJapgolly.webdriverio.WebdriverIO.Results) => onComplete(t0, t1, t2, t3).runNow()))
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(js.Any.fromFunction2((t0: /* config */ typingsJapgolly.webdriverio.WebdriverIO.Config, t1: /* capabilities */ js.Array[typingsJapgolly.webdriver.WebDriver.DesiredCapabilities]) => onPrepare(t0, t1).runNow()))
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2((t0: /* oldSessionId */ java.lang.String, t1: /* newSessionId */ java.lang.String) => onReload(t0, t1).runNow()))
    __obj.asInstanceOf[HookFunctions]
  }
}

