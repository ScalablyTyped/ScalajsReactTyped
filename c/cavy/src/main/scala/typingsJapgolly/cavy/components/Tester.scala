package typingsJapgolly.cavy.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cavy.mod.TestHookStore
import typingsJapgolly.cavy.mod.TestReport
import typingsJapgolly.cavy.mod.TestScope
import typingsJapgolly.cavy.mod.TesterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tester {
  def apply(
    specs: js.Array[js.Function1[/* spec */ TestScope, Unit]],
    store: TestHookStore,
    clearAsyncStorage: js.UndefOr[Boolean] = js.undefined,
    reporter: /* report */ TestReport => Callback = null,
    sendReport: js.UndefOr[Boolean] = js.undefined,
    startDelay: Int | Double = null,
    waitTime: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TesterProps, typingsJapgolly.cavy.mod.Tester, Unit, TesterProps] = {
    val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
      if (!js.isUndefined(clearAsyncStorage)) __obj.updateDynamic("clearAsyncStorage")(clearAsyncStorage.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(js.Any.fromFunction1((t0: /* report */ typingsJapgolly.cavy.mod.TestReport) => reporter(t0).runNow()))
    if (!js.isUndefined(sendReport)) __obj.updateDynamic("sendReport")(sendReport.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (waitTime != null) __obj.updateDynamic("waitTime")(waitTime.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.cavy.mod.TesterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.cavy.mod.Tester](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.cavy.mod.TesterProps])(children: _*)
  }
  @JSImport("cavy", "Tester")
  @js.native
  object componentImport extends js.Object
  
}

