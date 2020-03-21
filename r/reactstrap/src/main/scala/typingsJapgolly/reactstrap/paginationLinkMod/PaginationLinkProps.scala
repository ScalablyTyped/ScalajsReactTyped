package typingsJapgolly.reactstrap.paginationLinkMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var first: js.UndefOr[Boolean] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var next: js.UndefOr[Boolean] = js.undefined
  var previous: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object PaginationLinkProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    first: js.UndefOr[Boolean] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    next: js.UndefOr[Boolean] = js.undefined,
    previous: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): PaginationLinkProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationLinkProps]
  }
}

