package typingsJapgolly.mobxReactDevtools.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobxReactDevtools.AnonBottom
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typingsJapgolly.mobxReactDevtools.mod.IDevToolProps
import typingsJapgolly.mobxReactDevtools.mod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MobxReactDevtools {
  def apply(
    className: String = null,
    highlightTimeout: Int | Double = null,
    noPanel: js.UndefOr[Boolean] = js.undefined,
    position: topRight | bottomRight | bottomLeft | topLeft | AnonBottom = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDevToolProps, default, Unit, IDevToolProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noPanel)) __obj.updateDynamic("noPanel")(noPanel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mobxReactDevtools.mod.IDevToolProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mobxReactDevtools.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mobxReactDevtools.mod.IDevToolProps])(children: _*)
  }
  @JSImport("mobx-react-devtools", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

