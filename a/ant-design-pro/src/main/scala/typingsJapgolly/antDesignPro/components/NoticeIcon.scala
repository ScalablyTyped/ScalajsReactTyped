package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.antDesignPro.AnonDictkey
import typingsJapgolly.antDesignPro.noticeIconMod.NoticeIconProps
import typingsJapgolly.antDesignPro.noticeIconMod.default
import typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIcon {
  def apply(
    bell: VdomNode = null,
    className: String = null,
    clearClose: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: AnonDictkey = null,
    onClear: /* tabName */ String => Callback = null,
    onItemClick: (/* item */ NoticeIconData, /* tabProps */ NoticeIconProps) => Callback = null,
    onPopupVisibleChange: /* visible */ Boolean => Callback = null,
    onTabChange: /* tabTile */ String => Callback = null,
    onViewMore: (/* tabProps */ NoticeIconProps, /* e */ MouseEvent) => Callback = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeIconProps, default, Unit, NoticeIconProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bell != null) __obj.updateDynamic("bell")(bell.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearClose)) __obj.updateDynamic("clearClose")(clearClose.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: /* tabName */ java.lang.String) => onClear(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconData, t1: /* tabProps */ typingsJapgolly.antDesignPro.noticeIconMod.NoticeIconProps) => onItemClick(t0, t1).runNow()))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onPopupVisibleChange(t0).runNow()))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* tabTile */ java.lang.String) => onTabChange(t0).runNow()))
    if (onViewMore != null) __obj.updateDynamic("onViewMore")(js.Any.fromFunction2((t0: /* tabProps */ typingsJapgolly.antDesignPro.noticeIconMod.NoticeIconProps, t1: /* e */ org.scalajs.dom.raw.MouseEvent) => onViewMore(t0, t1).runNow()))
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.noticeIconMod.NoticeIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.noticeIconMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.noticeIconMod.NoticeIconProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

