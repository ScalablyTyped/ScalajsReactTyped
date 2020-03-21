package typingsJapgolly.reduxDevtoolsDockMonitor.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxDevtoolsDockMonitor.mod.DockPosition
import typingsJapgolly.reduxDevtoolsDockMonitor.mod.IDockMonitorProps
import typingsJapgolly.reduxDevtoolsDockMonitor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxDevtoolsDockMonitor {
  def apply(
    changePositionKey: String,
    toggleVisibilityKey: String,
    changeMonitorKey: String = null,
    defaultIsVisible: js.UndefOr[Boolean] = js.undefined,
    defaultPosition: DockPosition = null,
    defaultSize: Int | Double = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDockMonitorProps, default, Unit, IDockMonitorProps] = {
    val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
  
      if (changeMonitorKey != null) __obj.updateDynamic("changeMonitorKey")(changeMonitorKey.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsVisible)) __obj.updateDynamic("defaultIsVisible")(defaultIsVisible.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxDevtoolsDockMonitor.mod.IDockMonitorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxDevtoolsDockMonitor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxDevtoolsDockMonitor.mod.IDockMonitorProps])(children: _*)
  }
  @JSImport("redux-devtools-dock-monitor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

