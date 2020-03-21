package typingsJapgolly.rcNotification.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcNotification.noticeMod.NoticeProps
import typingsJapgolly.rcNotification.noticeMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notice {
  def apply(
    prefixCls: String,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: VdomNode = null,
    duration: Int | Double = null,
    holder: HTMLDivElement = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeProps, default, Unit, NoticeProps] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcNotification.noticeMod.NoticeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcNotification.noticeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcNotification.noticeMod.NoticeProps])(children: _*)
  }
  @JSImport("rc-notification/lib/Notice", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

