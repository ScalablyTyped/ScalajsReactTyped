package typingsJapgolly.reactstrap.carouselItemMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselItemProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object CarouselItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    slide: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    onEnter.foreach(p => __obj.updateDynamic("onEnter")(p.toJsFn))
    onEntered.foreach(p => __obj.updateDynamic("onEntered")(p.toJsFn))
    onEntering.foreach(p => __obj.updateDynamic("onEntering")(p.toJsFn))
    onExit.foreach(p => __obj.updateDynamic("onExit")(p.toJsFn))
    onExited.foreach(p => __obj.updateDynamic("onExited")(p.toJsFn))
    onExiting.foreach(p => __obj.updateDynamic("onExiting")(p.toJsFn))
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselItemProps]
  }
}

