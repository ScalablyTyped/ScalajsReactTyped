package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostTableNestedHeaders extends js.Object {
  var container: js.Any
  var nestedHeaders: NestedHeaders
  var widthsCache: js.Array[_]
  def clear(): Unit
}

object GhostTableNestedHeaders {
  @scala.inline
  def apply(clear: Callback, container: js.Any, nestedHeaders: NestedHeaders, widthsCache: js.Array[_]): GhostTableNestedHeaders = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], widthsCache = widthsCache.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[GhostTableNestedHeaders]
  }
}

