package typingsJapgolly.agGrid.gridOptionsMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessRowParams extends js.Object {
  var api: GridApi
  var columnApi: ColumnApi
  var context: js.Any
  var ePinnedLeftRow: HTMLElement
  var ePinnedRightRow: HTMLElement
  var eRow: HTMLElement
  var node: RowNode
  var rowIndex: Double
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit
}

object ProcessRowParams {
  @scala.inline
  def apply(
    addRenderedRowListener: (String, js.Function) => Callback,
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    ePinnedLeftRow: HTMLElement,
    ePinnedRightRow: HTMLElement,
    eRow: HTMLElement,
    node: RowNode,
    rowIndex: Double
  ): ProcessRowParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], ePinnedLeftRow = ePinnedLeftRow.asInstanceOf[js.Any], ePinnedRightRow = ePinnedRightRow.asInstanceOf[js.Any], eRow = eRow.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("addRenderedRowListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addRenderedRowListener(t0, t1).runNow()))
    __obj.asInstanceOf[ProcessRowParams]
  }
}

