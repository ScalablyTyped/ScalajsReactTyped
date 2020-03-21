package typingsJapgolly.webdriverio.WebdriverIO

import japgolly.scalajs.react.Callback
import typingsJapgolly.webdriver.WebDriver.DesiredCapabilities
import typingsJapgolly.webdriverio.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks
  extends HooksArray
     with _Hooks

object Hooks {
  @scala.inline
  def apply(
    after: (js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    afterCommand: (/* commandName */ String, /* args */ js.Array[js.Any], /* result */ js.Any, /* error */ js.UndefOr[js.Error]) => Callback = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Callback = null,
    afterSession: (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    afterSuite: /* suite */ Suite => Callback = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Callback = null,
    before: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[js.Any]) => Callback = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Callback = null,
    beforeSession: (js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ]) = null,
    beforeSuite: /* suite */ Suite => Callback = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Callback = null,
    onComplete: (js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]
      ]
    ]) = null,
    onPrepare: (js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ]) = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Callback = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4((t0: /* commandName */ java.lang.String, t1: /* args */ js.Array[js.Any], t2: /* result */ js.Any, t3: /* error */ js.UndefOr[js.Error]) => afterCommand(t0, t1, t2, t3).runNow()))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5((t0: /* test */ js.Any, t1: /* context */ js.Any, t2: /* result */ typingsJapgolly.webdriverio.AnonDuration, t3: /* stepData */ js.UndefOr[js.Any], t4: /* world */ js.UndefOr[js.Any]) => afterHook(t0, t1, t2, t3, t4).runNow()))
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession.asInstanceOf[js.Any])
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1((t0: /* suite */ typingsJapgolly.webdriverio.WebdriverIO.Suite) => afterSuite(t0).runNow()))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3((t0: /* test */ typingsJapgolly.webdriverio.WebdriverIO.Test, t1: /* context */ js.Any, t2: /* result */ typingsJapgolly.webdriverio.AnonDuration) => afterTest(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2((t0: /* commandName */ java.lang.String, t1: /* args */ js.Array[js.Any]) => beforeCommand(t0, t1).runNow()))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4((t0: /* test */ js.Any, t1: /* context */ js.Any, t2: /* stepData */ js.UndefOr[js.Any], t3: /* world */ js.UndefOr[js.Any]) => beforeHook(t0, t1, t2, t3).runNow()))
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession.asInstanceOf[js.Any])
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1((t0: /* suite */ typingsJapgolly.webdriverio.WebdriverIO.Suite) => beforeSuite(t0).runNow()))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2((t0: /* test */ typingsJapgolly.webdriverio.WebdriverIO.Test, t1: /* context */ js.Any) => beforeTest(t0, t1).runNow()))
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare.asInstanceOf[js.Any])
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2((t0: /* oldSessionId */ java.lang.String, t1: /* newSessionId */ java.lang.String) => onReload(t0, t1).runNow()))
    __obj.asInstanceOf[Hooks]
  }
}

