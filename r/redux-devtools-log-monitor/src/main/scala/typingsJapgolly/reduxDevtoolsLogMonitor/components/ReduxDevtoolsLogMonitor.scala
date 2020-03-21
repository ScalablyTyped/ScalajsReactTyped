package typingsJapgolly.reduxDevtoolsLogMonitor.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.base16.mod.ColorScheme
import typingsJapgolly.reduxDevtoolsLogMonitor.mod.ILogMonitorProps
import typingsJapgolly.reduxDevtoolsLogMonitor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxDevtoolsLogMonitor {
  def apply(
    expandActionRoot: js.UndefOr[Boolean] = js.undefined,
    expandStateRoot: js.UndefOr[Boolean] = js.undefined,
    preserveScrollTop: js.UndefOr[Boolean] = js.undefined,
    select: /* state */ js.Any => CallbackTo[js.Any] = null,
    theme: String | ColorScheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ILogMonitorProps, default, Unit, ILogMonitorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(expandActionRoot)) __obj.updateDynamic("expandActionRoot")(expandActionRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(expandStateRoot)) __obj.updateDynamic("expandStateRoot")(expandStateRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScrollTop)) __obj.updateDynamic("preserveScrollTop")(preserveScrollTop.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* state */ js.Any) => select(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxDevtoolsLogMonitor.mod.ILogMonitorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxDevtoolsLogMonitor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxDevtoolsLogMonitor.mod.ILogMonitorProps])(children: _*)
  }
  @JSImport("redux-devtools-log-monitor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

