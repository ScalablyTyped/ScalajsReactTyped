package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.backTopMod.BackTopProps
import typingsJapgolly.antd.backTopMod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackTop {
  def apply(
    className: String = null,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    target: js.UndefOr[CallbackTo[HTMLElement | Window_]] = js.undefined,
    visibilityHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BackTopProps, default, Unit, BackTopProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    target.foreach(p => __obj.updateDynamic("target")(p.toJsFn))
    if (visibilityHeight != null) __obj.updateDynamic("visibilityHeight")(visibilityHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.backTopMod.BackTopProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.backTopMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.backTopMod.BackTopProps])(children: _*)
  }
  @JSImport("antd/lib/back-top", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

