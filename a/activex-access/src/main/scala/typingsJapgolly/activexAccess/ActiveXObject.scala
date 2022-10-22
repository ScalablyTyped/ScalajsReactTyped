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
import typingsJapgolly.activexAccess.anon.CancelChartObject
import typingsJapgolly.activexAccess.anon.ChartObject
import typingsJapgolly.activexAccess.anon.CommandAny
import typingsJapgolly.activexAccess.anon.DrawObject
import typingsJapgolly.activexAccess.anon.FieldListKeyAscii
import typingsJapgolly.activexAccess.anon.PDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: FieldList,
    event: FldListCheckItem | FldListClick | FldListDblClick | FldListGotFocus | FldListHdrDblClick | FldListLostFocus,
    argNames: js.Array[typingsJapgolly.activexAccess.activexAccessStrings.FieldList | FieldListIndex],
    handler: js.ThisFunction1[
      /* this */ FieldList, 
      (/* parameter */ typingsJapgolly.activexAccess.anon.FieldList) | (/* parameter */ typingsJapgolly.activexAccess.anon.FieldListIndex), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyDown | FldListKeyUp,
    argNames: js.Tuple3[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ typingsJapgolly.activexAccess.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseDown | FldListMouseMove | FldListMouseUp,
    argNames: js.Tuple5[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ typingsJapgolly.activexAccess.anon.X, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: DragDrop,
    argNames: js.Tuple5[SourceCtlName, SourceFieldList, SourceRow, X, Y],
    handler: js.ThisFunction1[
      /* this */ FieldList, 
      /* parameter */ typingsJapgolly.activexAccess.anon.SourceCtlName, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyPress,
    argNames: js.Tuple2[typingsJapgolly.activexAccess.activexAccessStrings.FieldList, KeyAscii],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnCreated | ColumnDeleted | ColumnSelected | ColumnSized,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ typingsJapgolly.activexAccess.anon.Column, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: BeforeUpdate | DblClick | Dirty | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ Attachment, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ Attachment, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ Attachment, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: AfterUpdate | AttachmentCurrent | Change | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ Attachment, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ BoundObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ BoundObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ BoundObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ BoundObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[
      /* this */ BoundObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Code, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ CheckBoxInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ CheckBoxInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ CheckBoxInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ CheckBoxInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ CheckBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ CheckBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Class,
    event: Initialize | Terminate,
    handler: js.ThisFunction1[/* this */ Class, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: BeforeUpdate | DblClick | Dirty | Exit | Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ComboBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: AfterUpdate | Change | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ComboBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: NotInList,
    argNames: js.Tuple2[NewData, Response],
    handler: js.ThisFunction1[
      /* this */ ComboBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.NewData, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ CustomControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[
      /* this */ CustomControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Code, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterFinalRender | AfterLayout | BeforeInsert | BeforeUpdate | BeginBatchEdit | DataChange | DblClick | Delete | Dirty | Open | PivotTableChange | RecordExit | Undo | UndoBatchEdit | Unload | ViewChange,
    argNames: js.Array[Cancel | Reason | drawObject],
    handler: js.ThisFunction1[
      /* this */ Form, 
      (/* parameter */ typingsJapgolly.activexAccess.anon.Cancel) | (/* parameter */ DrawObject) | (/* parameter */ typingsJapgolly.activexAccess.anon.Reason), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
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
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Status, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterRender,
    argNames: js.Tuple2[drawObject, chartObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ ChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: ApplyFilter,
    argNames: js.Tuple2[Cancel, ApplyType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.ApplyType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeDelConfirm,
    argNames: js.Tuple2[Cancel, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Response, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeRender,
    argNames: js.Tuple3[drawObject, chartObject, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ CancelChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeScreenTip,
    argNames: js.Tuple2[ScreenTipText, SourceObject],
    handler: js.ThisFunction1[
      /* this */ Form, 
      /* parameter */ typingsJapgolly.activexAccess.anon.ScreenTipText, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandBeforeExecute,
    argNames: js.Tuple2[Command, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Command, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandChecked,
    argNames: js.Tuple2[Command, Checked],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Checked, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandEnabled,
    argNames: js.Tuple2[Command, Enabled],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Enabled, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandExecute,
    argNames: js.Array[Command],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ CommandAny, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.DataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.FilterType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ typingsJapgolly.activexAccess.anon.Count, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ListBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ NavigationButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ NavigationButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ NavigationButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ NavigationButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: BeforeUpdate | DblClick | Dirty | Exit | Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ NavigationControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ NavigationControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ NavigationControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: AfterUpdate | Change | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ NavigationControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ ObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[
      /* this */ ObjectFrame, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Code, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ OptionButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OptionButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OptionButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ OptionGroup, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionGroup, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: AfterUpdate | Click | Enter,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ PageHdrFtrInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Click | Paint,
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ PageHdrFtrInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[
      /* this */ PageHdrFtrInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.FormatCount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[
      /* this */ PageHdrFtrInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.PrintCount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexAccess.Access.Page,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexAccess.Access.Page, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ PaletteButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ PaletteButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ PaletteButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ PaletteButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ Rectangle, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ Rectangle, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded | ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ References, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Report,
    event: DblClick | NoData | Open | Unload,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
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
    handler: js.ThisFunction1[
      /* this */ Report, 
      /* parameter */ typingsJapgolly.activexAccess.anon.ApplyType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.DataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[
      /* this */ Report, 
      /* parameter */ typingsJapgolly.activexAccess.anon.FilterType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ typingsJapgolly.activexAccess.anon.Count, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ SectionInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Click | Paint | Retreat,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ SectionInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[
      /* this */ SectionInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.FormatCount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[
      /* this */ SectionInReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.PrintCount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: Click | Paint,
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: SubForm,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SubForm, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: SubReport,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ SubReport, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ TabControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ TabControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: Change | Click,
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ TabControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ TabControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: BeforeUpdate | DblClick | Dirty | Exit | Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsJapgolly.activexAccess.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: AfterUpdate | Change | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ TextBox, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ ToggleButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ToggleButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ToggleButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ToggleButtonInOption, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: BeforeUpdate | DblClick | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: AfterUpdate | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: BeforeUpdate | DblClick | Dirty | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: AfterUpdate | Change | Click | Enter | GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ PDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, TargetFrameName, StatusCode, Cancel],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.StatusCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Progress, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ typingsJapgolly.activexAccess.anon.Code, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_AfterStartup(
    obj: FieldList,
    event: AfterStartup,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ js.Object, Unit]
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
    obj: Rectangle,
    event: Click,
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ js.Object, Unit]
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
  
  def set(obj: Attachment, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(
    obj: BoundObjectFrame,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: CheckBoxInOption,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(obj: CheckBox, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: ChildLabel, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: ComboBox, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(
    obj: CommandButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: CustomControlInReport,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: CustomControl,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(obj: EmptyCell, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: Form, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: Label, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: ListBox, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(
    obj: NavigationButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: NavigationControl,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: ObjectFrame,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: OptionButtonInOption,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: OptionButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: OptionGroup,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: typingsJapgolly.activexAccess.Access.Page,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(obj: SubForm, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: TabControl, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(obj: TextBox, propertyName: accName | accValue, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  def set(
    obj: ToggleButtonInOption,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: ToggleButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: WebBrowserControl,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_Columns(obj: ImexGrid, propertyName: Columns, parameterTypes: js.Array[Double], newValue: Any): Unit = js.native
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
}
