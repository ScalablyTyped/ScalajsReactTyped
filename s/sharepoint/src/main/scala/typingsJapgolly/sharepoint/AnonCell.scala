package typingsJapgolly.sharepoint

import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var Cell: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell
  var GridPane: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane
  var Header: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header
  var RowHeaderStyle: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
  var Splitter: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
  var SplitterHandle: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
  var TimescaleTier: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
  var Widget: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget
}

object AnonCell {
  @scala.inline
  def apply(
    Cell: Cell,
    GridPane: GridPane,
    Header: Header,
    RowHeaderStyle: RowHeaderStyle,
    Splitter: Splitter,
    SplitterHandle: SplitterHandle,
    TimescaleTier: TimescaleTier,
    Widget: Widget
  ): AnonCell = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], GridPane = GridPane.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], RowHeaderStyle = RowHeaderStyle.asInstanceOf[js.Any], Splitter = Splitter.asInstanceOf[js.Any], SplitterHandle = SplitterHandle.asInstanceOf[js.Any], TimescaleTier = TimescaleTier.asInstanceOf[js.Any], Widget = Widget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCell]
  }
}

