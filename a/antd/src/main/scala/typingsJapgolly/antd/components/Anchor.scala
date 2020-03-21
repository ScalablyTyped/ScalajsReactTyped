package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonHref
import typingsJapgolly.antd.anchorAnchorMod.AnchorContainer
import typingsJapgolly.antd.anchorAnchorMod.AnchorProps
import typingsJapgolly.antd.anchorMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Anchor {
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    className: String = null,
    getContainer: js.UndefOr[CallbackTo[AnchorContainer]] = js.undefined,
    getCurrentAnchor: js.UndefOr[CallbackTo[String]] = js.undefined,
    offsetTop: Int | Double = null,
    onChange: /* currentActiveLink */ String => Callback = null,
    onClick: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ AnonHref) => Callback = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOffset: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnchorProps, default, Unit, AnchorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    getContainer.foreach(p => __obj.updateDynamic("getContainer")(p.toJsFn))
    getCurrentAnchor.foreach(p => __obj.updateDynamic("getCurrentAnchor")(p.toJsFn))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* currentActiveLink */ java.lang.String) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* link */ typingsJapgolly.antd.AnonHref) => onClick(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.anchorAnchorMod.AnchorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.anchorMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.anchorAnchorMod.AnchorProps])(children: _*)
  }
  @JSImport("antd/lib/anchor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

