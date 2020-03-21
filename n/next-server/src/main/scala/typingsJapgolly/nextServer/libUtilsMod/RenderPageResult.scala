package typingsJapgolly.nextServer.libUtilsMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nextServer.nextServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResult extends js.Object {
  var dataOnly: js.UndefOr[`true`] = js.undefined
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var html: String
}

object RenderPageResult {
  @scala.inline
  def apply(html: String, dataOnly: `true` = null, head: js.Array[Element | Null] = null): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (dataOnly != null) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
}

