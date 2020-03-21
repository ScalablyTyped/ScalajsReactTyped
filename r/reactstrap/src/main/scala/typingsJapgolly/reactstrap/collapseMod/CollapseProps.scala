package typingsJapgolly.reactstrap.collapseMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.AnonHide
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var classNames: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var delay: js.UndefOr[AnonHide] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean] = js.undefined
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    classNames: String = null,
    cssModule: CSSModule = null,
    delay: AnonHide = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClosed: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    onOpened: js.UndefOr[Callback] = js.undefined,
    tag: String | ReactType[_] = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    onClosed.foreach(p => __obj.updateDynamic("onClosed")(p.toJsFn))
    onEntered.foreach(p => __obj.updateDynamic("onEntered")(p.toJsFn))
    onEntering.foreach(p => __obj.updateDynamic("onEntering")(p.toJsFn))
    onExit.foreach(p => __obj.updateDynamic("onExit")(p.toJsFn))
    onExited.foreach(p => __obj.updateDynamic("onExited")(p.toJsFn))
    onExiting.foreach(p => __obj.updateDynamic("onExiting")(p.toJsFn))
    onOpened.foreach(p => __obj.updateDynamic("onOpened")(p.toJsFn))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

