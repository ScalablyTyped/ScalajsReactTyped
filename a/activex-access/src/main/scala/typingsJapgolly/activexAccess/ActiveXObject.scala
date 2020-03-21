package typingsJapgolly.activexAccess

import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListDragOverArgNames
import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListDragOverParameter
import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragDropArgNames
import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragDropParameter
import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragOverArgNames
import typingsJapgolly.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragOverParameter
import typingsJapgolly.activexAccess.AccWizObjects.FieldList
import typingsJapgolly.activexAccess.AccWizObjects.ImexGrid
import typingsJapgolly.activexAccess.Access.Attachment
import typingsJapgolly.activexAccess.Access.BoundObjectFrame
import typingsJapgolly.activexAccess.Access.CheckBox
import typingsJapgolly.activexAccess.Access.CheckBoxInOption
import typingsJapgolly.activexAccess.Access.ChildLabel
import typingsJapgolly.activexAccess.Access.Class
import typingsJapgolly.activexAccess.Access.ComboBox
import typingsJapgolly.activexAccess.Access.CommandButton
import typingsJapgolly.activexAccess.Access.Control
import typingsJapgolly.activexAccess.Access.ControlInReportEvents
import typingsJapgolly.activexAccess.Access.CustomControl
import typingsJapgolly.activexAccess.Access.CustomControlInReport
import typingsJapgolly.activexAccess.Access.EmptyCell
import typingsJapgolly.activexAccess.Access.EventHelperTypes.WebBrowserControlBeforeNavigate2ArgNames
import typingsJapgolly.activexAccess.Access.EventHelperTypes.WebBrowserControlBeforeNavigate2Parameter
import typingsJapgolly.activexAccess.Access.Form
import typingsJapgolly.activexAccess.Access.Image
import typingsJapgolly.activexAccess.Access.Label
import typingsJapgolly.activexAccess.Access.ListBox
import typingsJapgolly.activexAccess.Access.NavigationButton
import typingsJapgolly.activexAccess.Access.NavigationControl
import typingsJapgolly.activexAccess.Access.ObjectFrame
import typingsJapgolly.activexAccess.Access.OptionButton
import typingsJapgolly.activexAccess.Access.OptionButtonInOption
import typingsJapgolly.activexAccess.Access.OptionGroup
import typingsJapgolly.activexAccess.Access.PageHdrFtrInReport
import typingsJapgolly.activexAccess.Access.PaletteButton
import typingsJapgolly.activexAccess.Access.Rectangle
import typingsJapgolly.activexAccess.Access.References
import typingsJapgolly.activexAccess.Access.Report
import typingsJapgolly.activexAccess.Access.Section
import typingsJapgolly.activexAccess.Access.SectionInReport
import typingsJapgolly.activexAccess.Access.SubForm
import typingsJapgolly.activexAccess.Access.SubReport
import typingsJapgolly.activexAccess.Access.TabControl
import typingsJapgolly.activexAccess.Access.TextBox
import typingsJapgolly.activexAccess.Access.ToggleButton
import typingsJapgolly.activexAccess.Access.ToggleButtonInOption
import typingsJapgolly.activexAccess.Access.WebBrowserControl
import typingsJapgolly.activexAccess.activexAccessStrings.Activate
import typingsJapgolly.activexAccess.activexAccessStrings.AfterDelConfirm
import typingsJapgolly.activexAccess.activexAccessStrings.AfterFinalRender
import typingsJapgolly.activexAccess.activexAccessStrings.AfterInsert
import typingsJapgolly.activexAccess.activexAccessStrings.AfterLayout
import typingsJapgolly.activexAccess.activexAccessStrings.AfterRender
import typingsJapgolly.activexAccess.activexAccessStrings.AfterStartup
import typingsJapgolly.activexAccess.activexAccessStrings.AfterUpdate
import typingsJapgolly.activexAccess.activexAccessStrings.ApplyFilter
import typingsJapgolly.activexAccess.activexAccessStrings.ApplyType
import typingsJapgolly.activexAccess.activexAccessStrings.AttachmentCurrent
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeDelConfirm
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeInsert
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeNavigate2
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeQuery
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeRender
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeScreenTip
import typingsJapgolly.activexAccess.activexAccessStrings.BeforeUpdate
import typingsJapgolly.activexAccess.activexAccessStrings.BeginBatchEdit
import typingsJapgolly.activexAccess.activexAccessStrings.Button
import typingsJapgolly.activexAccess.activexAccessStrings.Cancel
import typingsJapgolly.activexAccess.activexAccessStrings.Change
import typingsJapgolly.activexAccess.activexAccessStrings.Checked
import typingsJapgolly.activexAccess.activexAccessStrings.Click
import typingsJapgolly.activexAccess.activexAccessStrings.Close
import typingsJapgolly.activexAccess.activexAccessStrings.Code
import typingsJapgolly.activexAccess.activexAccessStrings.Column
import typingsJapgolly.activexAccess.activexAccessStrings.ColumnCreated
import typingsJapgolly.activexAccess.activexAccessStrings.ColumnDeleted
import typingsJapgolly.activexAccess.activexAccessStrings.ColumnSelected
import typingsJapgolly.activexAccess.activexAccessStrings.ColumnSized
import typingsJapgolly.activexAccess.activexAccessStrings.Columns
import typingsJapgolly.activexAccess.activexAccessStrings.Command
import typingsJapgolly.activexAccess.activexAccessStrings.CommandBeforeExecute
import typingsJapgolly.activexAccess.activexAccessStrings.CommandChecked
import typingsJapgolly.activexAccess.activexAccessStrings.CommandEnabled
import typingsJapgolly.activexAccess.activexAccessStrings.CommandExecute
import typingsJapgolly.activexAccess.activexAccessStrings.Count
import typingsJapgolly.activexAccess.activexAccessStrings.Current
import typingsJapgolly.activexAccess.activexAccessStrings.DataChange
import typingsJapgolly.activexAccess.activexAccessStrings.DataErr
import typingsJapgolly.activexAccess.activexAccessStrings.DataSetChange
import typingsJapgolly.activexAccess.activexAccessStrings.DblClick
import typingsJapgolly.activexAccess.activexAccessStrings.Deactivate
import typingsJapgolly.activexAccess.activexAccessStrings.Delete
import typingsJapgolly.activexAccess.activexAccessStrings.Dirty
import typingsJapgolly.activexAccess.activexAccessStrings.DocumentComplete
import typingsJapgolly.activexAccess.activexAccessStrings.DragDrop
import typingsJapgolly.activexAccess.activexAccessStrings.DragOver
import typingsJapgolly.activexAccess.activexAccessStrings.Enabled
import typingsJapgolly.activexAccess.activexAccessStrings.Enter
import typingsJapgolly.activexAccess.activexAccessStrings.Error
import typingsJapgolly.activexAccess.activexAccessStrings.Exit
import typingsJapgolly.activexAccess.activexAccessStrings.FieldListIndex
import typingsJapgolly.activexAccess.activexAccessStrings.Filter
import typingsJapgolly.activexAccess.activexAccessStrings.FilterType
import typingsJapgolly.activexAccess.activexAccessStrings.FldListCheckItem
import typingsJapgolly.activexAccess.activexAccessStrings.FldListClick
import typingsJapgolly.activexAccess.activexAccessStrings.FldListDblClick
import typingsJapgolly.activexAccess.activexAccessStrings.FldListDragDrop
import typingsJapgolly.activexAccess.activexAccessStrings.FldListDragOver
import typingsJapgolly.activexAccess.activexAccessStrings.FldListGotFocus
import typingsJapgolly.activexAccess.activexAccessStrings.FldListHdrDblClick
import typingsJapgolly.activexAccess.activexAccessStrings.FldListKeyDown
import typingsJapgolly.activexAccess.activexAccessStrings.FldListKeyPress
import typingsJapgolly.activexAccess.activexAccessStrings.FldListKeyUp
import typingsJapgolly.activexAccess.activexAccessStrings.FldListLostFocus
import typingsJapgolly.activexAccess.activexAccessStrings.FldListMouseDown
import typingsJapgolly.activexAccess.activexAccessStrings.FldListMouseMove
import typingsJapgolly.activexAccess.activexAccessStrings.FldListMouseUp
import typingsJapgolly.activexAccess.activexAccessStrings.Format
import typingsJapgolly.activexAccess.activexAccessStrings.FormatCount
import typingsJapgolly.activexAccess.activexAccessStrings.GotFocus
import typingsJapgolly.activexAccess.activexAccessStrings.Initialize
import typingsJapgolly.activexAccess.activexAccessStrings.ItemAdded
import typingsJapgolly.activexAccess.activexAccessStrings.ItemRemoved
import typingsJapgolly.activexAccess.activexAccessStrings.KeyAscii
import typingsJapgolly.activexAccess.activexAccessStrings.KeyCode
import typingsJapgolly.activexAccess.activexAccessStrings.KeyDown
import typingsJapgolly.activexAccess.activexAccessStrings.KeyPress
import typingsJapgolly.activexAccess.activexAccessStrings.KeyUp
import typingsJapgolly.activexAccess.activexAccessStrings.Load
import typingsJapgolly.activexAccess.activexAccessStrings.LostFocus
import typingsJapgolly.activexAccess.activexAccessStrings.MouseDown
import typingsJapgolly.activexAccess.activexAccessStrings.MouseMove
import typingsJapgolly.activexAccess.activexAccessStrings.MouseUp
import typingsJapgolly.activexAccess.activexAccessStrings.MouseWheel
import typingsJapgolly.activexAccess.activexAccessStrings.NavigateError
import typingsJapgolly.activexAccess.activexAccessStrings.NewData
import typingsJapgolly.activexAccess.activexAccessStrings.NoData
import typingsJapgolly.activexAccess.activexAccessStrings.NotInList
import typingsJapgolly.activexAccess.activexAccessStrings.OnConnect
import typingsJapgolly.activexAccess.activexAccessStrings.OnDisconnect
import typingsJapgolly.activexAccess.activexAccessStrings.Open
import typingsJapgolly.activexAccess.activexAccessStrings.Page
import typingsJapgolly.activexAccess.activexAccessStrings.Paint
import typingsJapgolly.activexAccess.activexAccessStrings.PivotTableChange
import typingsJapgolly.activexAccess.activexAccessStrings.Print
import typingsJapgolly.activexAccess.activexAccessStrings.PrintCount
import typingsJapgolly.activexAccess.activexAccessStrings.Progress
import typingsJapgolly.activexAccess.activexAccessStrings.ProgressChange
import typingsJapgolly.activexAccess.activexAccessStrings.ProgressMax
import typingsJapgolly.activexAccess.activexAccessStrings.Query
import typingsJapgolly.activexAccess.activexAccessStrings.Reason
import typingsJapgolly.activexAccess.activexAccessStrings.RecordExit
import typingsJapgolly.activexAccess.activexAccessStrings.Reference
import typingsJapgolly.activexAccess.activexAccessStrings.Resize
import typingsJapgolly.activexAccess.activexAccessStrings.Response
import typingsJapgolly.activexAccess.activexAccessStrings.Retreat
import typingsJapgolly.activexAccess.activexAccessStrings.RowText
import typingsJapgolly.activexAccess.activexAccessStrings.ScreenTipText
import typingsJapgolly.activexAccess.activexAccessStrings.Selected
import typingsJapgolly.activexAccess.activexAccessStrings.SelectionChange
import typingsJapgolly.activexAccess.activexAccessStrings.Shift
import typingsJapgolly.activexAccess.activexAccessStrings.SourceCtlName
import typingsJapgolly.activexAccess.activexAccessStrings.SourceFieldList
import typingsJapgolly.activexAccess.activexAccessStrings.SourceObject
import typingsJapgolly.activexAccess.activexAccessStrings.SourceRow
import typingsJapgolly.activexAccess.activexAccessStrings.Status
import typingsJapgolly.activexAccess.activexAccessStrings.StatusCode
import typingsJapgolly.activexAccess.activexAccessStrings.TargetFrameName
import typingsJapgolly.activexAccess.activexAccessStrings.Terminate
import typingsJapgolly.activexAccess.activexAccessStrings.Timer
import typingsJapgolly.activexAccess.activexAccessStrings.URL
import typingsJapgolly.activexAccess.activexAccessStrings.Undo
import typingsJapgolly.activexAccess.activexAccessStrings.UndoBatchEdit
import typingsJapgolly.activexAccess.activexAccessStrings.Unload
import typingsJapgolly.activexAccess.activexAccessStrings.Updated
import typingsJapgolly.activexAccess.activexAccessStrings.ViewChange
import typingsJapgolly.activexAccess.activexAccessStrings.X
import typingsJapgolly.activexAccess.activexAccessStrings.Y
import typingsJapgolly.activexAccess.activexAccessStrings.accName
import typingsJapgolly.activexAccess.activexAccessStrings.accValue
import typingsJapgolly.activexAccess.activexAccessStrings.chartObject
import typingsJapgolly.activexAccess.activexAccessStrings.drawObject
import typingsJapgolly.activexAccess.activexAccessStrings.pDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: FieldList,
    event: DragDrop,
    argNames: js.Tuple5[SourceCtlName, SourceFieldList, SourceRow, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonSourceCtlName, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListCheckItem,
    argNames: js.Array[typingsJapgolly.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListClick,
    argNames: js.Array[typingsJapgolly.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListDblClick,
    argNames: js.Array[typingsJapgolly.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListGotFocus,
    argNames: js.Array[FieldListIndex],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListIndex, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListHdrDblClick,
    argNames: js.Array[typingsJapgolly.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyDown,
    argNames: js.Tuple3[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonShift, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyPress,
    argNames: js.Tuple2[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, KeyAscii],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyUp,
    argNames: js.Tuple3[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonShift, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListLostFocus,
    argNames: js.Array[FieldListIndex],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListIndex, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseDown,
    argNames: js.Tuple5[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseMove,
    argNames: js.Tuple5[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseUp,
    argNames: js.Tuple5[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnCreated,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnDeleted,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnSelected,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnSized,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: NotInList,
    argNames: js.Tuple2[NewData, Response],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonNewData, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeInsert | BeforeUpdate | BeginBatchEdit | DblClick | Delete | Dirty | Open | RecordExit | Undo | UndoBatchEdit | Unload,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Activate | AfterInsert | AfterUpdate | BeforeQuery | Click | Close | Current | DataSetChange | Deactivate | GotFocus | Load | LostFocus | OnConnect | OnDisconnect | Query | Resize | SelectionChange | Timer,
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterDelConfirm,
    argNames: js.Array[Status],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterFinalRender,
    argNames: js.Array[drawObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDrawObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterLayout,
    argNames: js.Array[drawObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDrawObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterRender,
    argNames: js.Tuple2[drawObject, chartObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: ApplyFilter,
    argNames: js.Tuple2[Cancel, ApplyType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonApplyType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeDelConfirm,
    argNames: js.Tuple2[Cancel, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeRender,
    argNames: js.Tuple3[drawObject, chartObject, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCancelChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeScreenTip,
    argNames: js.Tuple2[ScreenTipText, SourceObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonScreenTipText, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandBeforeExecute,
    argNames: js.Tuple2[Command, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandChecked,
    argNames: js.Tuple2[Command, Checked],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonChecked, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandEnabled,
    argNames: js.Tuple2[Command, Enabled],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonEnabled, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandExecute,
    argNames: js.Array[Command],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCommandAny, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: DataChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonFilterType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCount, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: PivotTableChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: ViewChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonFormatCount, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonPrintCount, Unit]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ AnonCancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ AnonButton, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ AnonButton, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ AnonButton, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Activate | Click | Close | Current | Deactivate | GotFocus | Load | LostFocus | Page | Resize | Timer,
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: ApplyFilter,
    argNames: js.Tuple2[Cancel, ApplyType],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonApplyType, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonDataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonFilterType, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCount, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: NoData,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Unload,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonFormatCount, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonPrintCount, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SubForm,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SubForm, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SubReport,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SubReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, TargetFrameName, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonStatusCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterStartup(
    obj: FieldList,
    event: AfterStartup,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: Attachment,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: BoundObjectFrame,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: CheckBoxInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: CheckBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ComboBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ListBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: NavigationControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionButtonInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionGroup,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: PaletteButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: TextBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ToggleButtonInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ToggleButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: WebBrowserControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentCurrent(
    obj: Attachment,
    event: AttachmentCurrent,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: WebBrowserControl,
    event: BeforeNavigate2,
    argNames: WebBrowserControlBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ WebBrowserControlBeforeNavigate2Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: Attachment,
    event: Change,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: NavigationControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TabControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: WebBrowserControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Attachment,
    event: Click,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: BoundObjectFrame,
    event: Click,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBoxInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Image,
    event: Click,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Label,
    event: Click,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: NavigationButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: NavigationControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ObjectFrame,
    event: Click,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButtonInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionGroup,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: PageHdrFtrInReport,
    event: Click,
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: Click,
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ js.Object, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: PaletteButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Rectangle,
    event: Click,
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: SectionInReport,
    event: Click,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Section,
    event: Click,
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: TabControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: TextBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButtonInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: WebBrowserControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: FieldList,
    event: DragOver,
    argNames: FieldListDragOverArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: Attachment,
    event: Enter,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: BoundObjectFrame,
    event: Enter,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CheckBoxInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CheckBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ComboBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CommandButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CustomControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ListBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: NavigationButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: NavigationControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ObjectFrame,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionButtonInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionGroup,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: PaletteButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: SubForm,
    event: Enter,
    handler: js.ThisFunction1[/* this */ SubForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: SubReport,
    event: Enter,
    handler: js.ThisFunction1[/* this */ SubReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: TextBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ToggleButtonInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ToggleButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: WebBrowserControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FldListDragDrop(
    obj: FieldList,
    event: FldListDragDrop,
    argNames: FieldListFldListDragDropArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListFldListDragDropParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FldListDragOver(
    obj: FieldList,
    event: FldListDragOver,
    argNames: FieldListFldListDragOverArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListFldListDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: Attachment,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: BoundObjectFrame,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CheckBoxInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CheckBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ComboBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CommandButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CustomControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ListBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: NavigationButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: NavigationControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ObjectFrame,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OptionButtonInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OptionButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: PaletteButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: TextBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ToggleButtonInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ToggleButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: WebBrowserControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Initialize(
    obj: Class,
    event: Initialize,
    handler: js.ThisFunction1[/* this */ Class, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: Attachment,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: BoundObjectFrame,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CheckBoxInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CheckBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ComboBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CommandButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CustomControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ListBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: NavigationButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: NavigationControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ObjectFrame,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OptionButtonInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OptionButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: PaletteButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: TextBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ToggleButtonInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ToggleButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: WebBrowserControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: PageHdrFtrInReport,
    event: Paint,
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: SectionInReport,
    event: Paint,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: Section,
    event: Paint,
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Retreat(
    obj: SectionInReport,
    event: Retreat,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Terminate(
    obj: Class,
    event: Terminate,
    handler: js.ThisFunction1[/* this */ Class, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Columns(obj: ImexGrid, propertyName: Columns, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_RowText(obj: ImexGrid, propertyName: RowText, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ComboBox, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: ControlInReportEvents,
    propertyName: Selected,
    parameterTypes: js.Array[Double],
    newValue: Double
  ): Unit = js.native
  @JSName("set")
  def set_Selected(obj: Control, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ListBox, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_accName(
    obj: CheckBoxInOption | ChildLabel | CustomControlInReport | OptionButtonInOption | ToggleButtonInOption | Attachment | BoundObjectFrame | CheckBox | ComboBox | CommandButton | CustomControl | EmptyCell | Form | Label | ListBox | NavigationButton | NavigationControl | ObjectFrame | OptionButton | OptionGroup | typingsJapgolly.activexAccess.Access.Page | SubForm | TabControl | TextBox | ToggleButton | WebBrowserControl,
    propertyName: accName,
    parameterTypes: js.Array[_],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_accValue(
    obj: CheckBoxInOption | ChildLabel | CustomControlInReport | OptionButtonInOption | ToggleButtonInOption | Attachment | BoundObjectFrame | CheckBox | ComboBox | CommandButton | CustomControl | EmptyCell | Form | Label | ListBox | NavigationButton | NavigationControl | ObjectFrame | OptionButton | OptionGroup | typingsJapgolly.activexAccess.Access.Page | SubForm | TabControl | TextBox | ToggleButton | WebBrowserControl,
    propertyName: accValue,
    parameterTypes: js.Array[_],
    newValue: String
  ): Unit = js.native
}

