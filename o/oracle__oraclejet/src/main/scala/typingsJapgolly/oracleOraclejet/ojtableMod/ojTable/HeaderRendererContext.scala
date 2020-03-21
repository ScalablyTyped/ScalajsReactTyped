package typingsJapgolly.oracleOraclejet.ojtableMod.ojTable

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.Anon22
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderRendererContext[K, D] extends js.Object {
  var columnHeaderDefaultRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  var columnHeaderSortableIconRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  var columnIndex: Double
  var componentElement: Element
  var data: String
  var headerContext: Anon22[K, D]
  var parentElement: Element
}

object HeaderRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: Double,
    componentElement: Element,
    data: String,
    headerContext: Anon22[K, D],
    parentElement: Element,
    columnHeaderDefaultRenderer: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Callback = null,
    columnHeaderSortableIconRenderer: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Callback = null
  ): HeaderRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headerContext = headerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    if (columnHeaderDefaultRenderer != null) __obj.updateDynamic("columnHeaderDefaultRenderer")(js.Any.fromFunction2((t0: /* param0 */ js.Object, t1: /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit]) => columnHeaderDefaultRenderer(t0, t1).runNow()))
    if (columnHeaderSortableIconRenderer != null) __obj.updateDynamic("columnHeaderSortableIconRenderer")(js.Any.fromFunction2((t0: /* param0 */ js.Object, t1: /* param1 */ js.Function1[/* param0 */ js.Object, scala.Unit]) => columnHeaderSortableIconRenderer(t0, t1).runNow()))
    __obj.asInstanceOf[HeaderRendererContext[K, D]]
  }
}

