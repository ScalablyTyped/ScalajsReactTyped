package typingsJapgolly.reactShare.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.StyleHTMLAttributes
import typingsJapgolly.reactShare.CommonShareButtonPropstitCaption
import typingsJapgolly.reactShare.reactShareStrings.screenCenter
import typingsJapgolly.reactShare.reactShareStrings.windowCenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TumblrShareButton {
  def apply(
    url: String,
    additionalProps: HTMLAttributes[HTMLDivElement] = null,
    beforeOnClick: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    caption: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleHTMLAttributes[HTMLDivElement] = null,
    onClick: /* link */ String => Callback = null,
    onShareWindowClose: js.UndefOr[Callback] = js.undefined,
    openWindow: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    tags: js.Array[String] = null,
    title: String = null,
    windowHeight: Int | Double = null,
    windowPosition: windowCenter | screenCenter = null,
    windowWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CommonShareButtonPropstitCaption, 
    MountedWithRawType[
      CommonShareButtonPropstitCaption, 
      js.Object, 
      RawMounted[CommonShareButtonPropstitCaption, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
      if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps.asInstanceOf[js.Any])
    beforeOnClick.foreach(p => __obj.updateDynamic("beforeOnClick")(p.toJsFn))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* link */ java.lang.String) => onClick(t0).runNow()))
    onShareWindowClose.foreach(p => __obj.updateDynamic("onShareWindowClose")(p.toJsFn))
    if (!js.isUndefined(openWindow)) __obj.updateDynamic("openWindow")(openWindow.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactShare.CommonShareButtonPropstitCaption, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactShare.CommonShareButtonPropstitCaption])(children: _*)
  }
  @JSImport("react-share", "TumblrShareButton")
  @js.native
  object componentImport extends js.Object
  
}

