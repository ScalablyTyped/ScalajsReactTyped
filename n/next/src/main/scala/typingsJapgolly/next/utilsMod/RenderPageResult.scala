package typingsJapgolly.next.utilsMod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResult extends js.Object {
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var html: String
}

object RenderPageResult {
  @scala.inline
  def apply(html: String, head: js.Array[Element | Null] = null): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
}

