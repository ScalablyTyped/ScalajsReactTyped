package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconTabProps
import typingsJapgolly.antDesignPro.noticeIconTabMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIconTab {
  def apply(
    locale: js.Any,
    onClear: js.Any => Callback,
    onClick: js.Any => Callback,
    onViewMore: js.Any => Callback,
    count: Int | Double = null,
    data: js.Array[_] = null,
    emptyImage: String = null,
    emptyText: VdomNode = null,
    list: js.Array[NoticeIconData] = null,
    name: String = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showViewMore: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeIconTabProps, default, Unit, NoticeIconTabProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: js.Any) => onClear(t0).runNow()))
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    __obj.updateDynamic("onViewMore")(js.Any.fromFunction1((t0: js.Any) => onViewMore(t0).runNow()))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emptyImage != null) __obj.updateDynamic("emptyImage")(emptyImage.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.rawNode.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.asInstanceOf[js.Any])
    if (!js.isUndefined(showViewMore)) __obj.updateDynamic("showViewMore")(showViewMore.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconTabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.noticeIconTabMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.noticeIconTabMod.NoticeIconTabProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

