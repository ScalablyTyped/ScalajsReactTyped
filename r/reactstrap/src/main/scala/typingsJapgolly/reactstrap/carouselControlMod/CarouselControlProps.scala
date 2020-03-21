package typingsJapgolly.reactstrap.carouselControlMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.reactstrapStrings.next
import typingsJapgolly.reactstrap.reactstrapStrings.prev
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselControlProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* s */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var direction: prev | next
  var directionText: String
  def onClickHandler(): Unit
}

object CarouselControlProps {
  @scala.inline
  def apply(
    direction: prev | next,
    directionText: String,
    onClickHandler: Callback,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* s */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null
  ): CarouselControlProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText.asInstanceOf[js.Any])
    __obj.updateDynamic("onClickHandler")(onClickHandler.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselControlProps]
  }
}

