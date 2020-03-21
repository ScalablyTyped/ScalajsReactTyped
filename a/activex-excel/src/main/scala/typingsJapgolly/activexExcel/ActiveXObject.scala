package typingsJapgolly.activexExcel

import typingsJapgolly.activexExcel.Excel.Application
import typingsJapgolly.activexExcel.Excel.Chart
import typingsJapgolly.activexExcel.Excel.ControlFormat
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.ApplicationInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.ApplicationInvokeParameter
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.ChartInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.ChartInvokeParameter
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeParameter
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.QueryTableInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.QueryTableInvokeParameter
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.WorkbookInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.WorkbookInvokeParameter
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.WorksheetInvokeArgNames
import typingsJapgolly.activexExcel.Excel.EventHelperTypes.WorksheetInvokeParameter
import typingsJapgolly.activexExcel.Excel.OLEObject
import typingsJapgolly.activexExcel.Excel.PageSetup
import typingsJapgolly.activexExcel.Excel.PivotField
import typingsJapgolly.activexExcel.Excel.PivotFieldSubtotal
import typingsJapgolly.activexExcel.Excel.QueryTable
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.Workbook
import typingsJapgolly.activexExcel.Excel.Worksheet
import typingsJapgolly.activexExcel.Excel.XlAxisGroup
import typingsJapgolly.activexExcel.Excel.XlAxisType
import typingsJapgolly.activexExcel.Excel.XlRangeValueDataType
import typingsJapgolly.activexExcel.activexExcelStrings.Activate
import typingsJapgolly.activexExcel.activexExcelStrings.AddRef
import typingsJapgolly.activexExcel.activexExcelStrings.AddinInstall
import typingsJapgolly.activexExcel.activexExcelStrings.AddinUninstall
import typingsJapgolly.activexExcel.activexExcelStrings.AfterCalculate
import typingsJapgolly.activexExcel.activexExcelStrings.AfterRefresh
import typingsJapgolly.activexExcel.activexExcelStrings.AfterSave
import typingsJapgolly.activexExcel.activexExcelStrings.AfterXmlExport
import typingsJapgolly.activexExcel.activexExcelStrings.AfterXmlImport
import typingsJapgolly.activexExcel.activexExcelStrings.Arg1
import typingsJapgolly.activexExcel.activexExcelStrings.Arg2
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeClose
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeDoubleClick
import typingsJapgolly.activexExcel.activexExcelStrings.BeforePrint
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeRefresh
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeRightClick
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeSave
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeXmlExport
import typingsJapgolly.activexExcel.activexExcelStrings.BeforeXmlImport
import typingsJapgolly.activexExcel.activexExcelStrings.Button
import typingsJapgolly.activexExcel.activexExcelStrings.Calculate
import typingsJapgolly.activexExcel.activexExcelStrings.Cancel
import typingsJapgolly.activexExcel.activexExcelStrings.Ch
import typingsJapgolly.activexExcel.activexExcelStrings.Change
import typingsJapgolly.activexExcel.activexExcelStrings.Colors
import typingsJapgolly.activexExcel.activexExcelStrings.Deactivate
import typingsJapgolly.activexExcel.activexExcelStrings.Description
import typingsJapgolly.activexExcel.activexExcelStrings.DragOver
import typingsJapgolly.activexExcel.activexExcelStrings.DragPlot
import typingsJapgolly.activexExcel.activexExcelStrings.ElementID
import typingsJapgolly.activexExcel.activexExcelStrings.FollowHyperlink
import typingsJapgolly.activexExcel.activexExcelStrings.GetIDsOfNames
import typingsJapgolly.activexExcel.activexExcelStrings.GetTypeInfo
import typingsJapgolly.activexExcel.activexExcelStrings.GetTypeInfoCount
import typingsJapgolly.activexExcel.activexExcelStrings.GotFocus
import typingsJapgolly.activexExcel.activexExcelStrings.HasAxis
import typingsJapgolly.activexExcel.activexExcelStrings.Invoke
import typingsJapgolly.activexExcel.activexExcelStrings.IsRefresh
import typingsJapgolly.activexExcel.activexExcelStrings.List
import typingsJapgolly.activexExcel.activexExcelStrings.LostFocus
import typingsJapgolly.activexExcel.activexExcelStrings.Map
import typingsJapgolly.activexExcel.activexExcelStrings.MouseDown
import typingsJapgolly.activexExcel.activexExcelStrings.MouseMove
import typingsJapgolly.activexExcel.activexExcelStrings.MouseUp
import typingsJapgolly.activexExcel.activexExcelStrings.NewChart
import typingsJapgolly.activexExcel.activexExcelStrings.NewSheet
import typingsJapgolly.activexExcel.activexExcelStrings.NewWorkbook
import typingsJapgolly.activexExcel.activexExcelStrings.Open
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableAfterValueChange
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableBeforeAllocateChanges
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableBeforeCommitChanges
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableBeforeDiscardChanges
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableChangeSync
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableCloseConnection
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableOpenConnection
import typingsJapgolly.activexExcel.activexExcelStrings.PivotTableUpdate
import typingsJapgolly.activexExcel.activexExcelStrings.PointIndex
import typingsJapgolly.activexExcel.activexExcelStrings.PrintQuality
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowActivate
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeClose
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeEdit
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowDeactivate
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowOpen
import typingsJapgolly.activexExcel.activexExcelStrings.ProtectedViewWindowResize
import typingsJapgolly.activexExcel.activexExcelStrings.Pvw
import typingsJapgolly.activexExcel.activexExcelStrings.QueryInterface
import typingsJapgolly.activexExcel.activexExcelStrings.Reason
import typingsJapgolly.activexExcel.activexExcelStrings.Release
import typingsJapgolly.activexExcel.activexExcelStrings.Resize
import typingsJapgolly.activexExcel.activexExcelStrings.Result
import typingsJapgolly.activexExcel.activexExcelStrings.RowsetComplete
import typingsJapgolly.activexExcel.activexExcelStrings.SaveAsUI
import typingsJapgolly.activexExcel.activexExcelStrings.Select
import typingsJapgolly.activexExcel.activexExcelStrings.SelectionChange
import typingsJapgolly.activexExcel.activexExcelStrings.SeriesChange
import typingsJapgolly.activexExcel.activexExcelStrings.SeriesIndex
import typingsJapgolly.activexExcel.activexExcelStrings.Sh
import typingsJapgolly.activexExcel.activexExcelStrings.Sheet
import typingsJapgolly.activexExcel.activexExcelStrings.SheetActivate
import typingsJapgolly.activexExcel.activexExcelStrings.SheetBeforeDoubleClick
import typingsJapgolly.activexExcel.activexExcelStrings.SheetBeforeRightClick
import typingsJapgolly.activexExcel.activexExcelStrings.SheetCalculate
import typingsJapgolly.activexExcel.activexExcelStrings.SheetChange
import typingsJapgolly.activexExcel.activexExcelStrings.SheetDeactivate
import typingsJapgolly.activexExcel.activexExcelStrings.SheetFollowHyperlink
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableAfterValueChange
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableBeforeAllocateChanges
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableBeforeCommitChanges
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableBeforeDiscardChanges
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableChangeSync
import typingsJapgolly.activexExcel.activexExcelStrings.SheetPivotTableUpdate
import typingsJapgolly.activexExcel.activexExcelStrings.SheetSelectionChange
import typingsJapgolly.activexExcel.activexExcelStrings.Shift
import typingsJapgolly.activexExcel.activexExcelStrings.Subtotals
import typingsJapgolly.activexExcel.activexExcelStrings.Success
import typingsJapgolly.activexExcel.activexExcelStrings.Sync
import typingsJapgolly.activexExcel.activexExcelStrings.SyncEventType
import typingsJapgolly.activexExcel.activexExcelStrings.Target
import typingsJapgolly.activexExcel.activexExcelStrings.TargetPivotTable
import typingsJapgolly.activexExcel.activexExcelStrings.TargetRange
import typingsJapgolly.activexExcel.activexExcelStrings.Url
import typingsJapgolly.activexExcel.activexExcelStrings.Value
import typingsJapgolly.activexExcel.activexExcelStrings.ValueChangeEnd
import typingsJapgolly.activexExcel.activexExcelStrings.ValueChangeStart
import typingsJapgolly.activexExcel.activexExcelStrings.Wb
import typingsJapgolly.activexExcel.activexExcelStrings.WindowActivate
import typingsJapgolly.activexExcel.activexExcelStrings.WindowDeactivate
import typingsJapgolly.activexExcel.activexExcelStrings.WindowResize
import typingsJapgolly.activexExcel.activexExcelStrings.Wn
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookActivate
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookAddinInstall
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookAddinUninstall
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookAfterSave
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookAfterXmlExport
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookAfterXmlImport
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookBeforeClose
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookBeforePrint
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookBeforeSave
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookBeforeXmlExport
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookBeforeXmlImport
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookDeactivate
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookNewChart
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookNewSheet
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookOpen
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookPivotTableCloseConnection
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookPivotTableOpenConnection
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookRowsetComplete
import typingsJapgolly.activexExcel.activexExcelStrings.WorkbookSync
import typingsJapgolly.activexExcel.activexExcelStrings.cNames
import typingsJapgolly.activexExcel.activexExcelStrings.itinfo
import typingsJapgolly.activexExcel.activexExcelStrings.lcid
import typingsJapgolly.activexExcel.activexExcelStrings.pctinfo
import typingsJapgolly.activexExcel.activexExcelStrings.pptinfo
import typingsJapgolly.activexExcel.activexExcelStrings.ppvObj
import typingsJapgolly.activexExcel.activexExcelStrings.rgdispid
import typingsJapgolly.activexExcel.activexExcelStrings.rgszNames
import typingsJapgolly.activexExcel.activexExcelStrings.riid
import typingsJapgolly.activexExcel.activexExcelStrings.x
import typingsJapgolly.activexExcel.activexExcelStrings.y
import typingsJapgolly.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewWorkbook,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowResize,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonValueChangeStart, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowResize,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookActivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinInstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinUninstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSuccess, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonMap, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeClose,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforePrint,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookDeactivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookOpen,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTargetWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTargetWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonDescription, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonArg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonArg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonSuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonResult, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonIsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforePrint,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonMapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewSheet,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableCloseConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableOpenConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonValueChangeStart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableChangeSync,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowActivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowDeactivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowResize,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableChangeSync,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableUpdate,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetRange, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Chart,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Workbook,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Worksheet,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Application,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Chart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: OLEObject,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: QueryTable,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Workbook,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Worksheet,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinInstall(
    obj: Workbook,
    event: AddinInstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinUninstall(
    obj: Workbook,
    event: AddinUninstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterCalculate(
    obj: Application,
    event: AfterCalculate,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Chart,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Worksheet,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Chart,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Workbook,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Worksheet,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: Chart,
    event: DragOver,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragPlot(
    obj: Chart,
    event: DragPlot,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEObject,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Chart,
    event: Invoke,
    argNames: ChartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ ChartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: OLEObject,
    event: Invoke,
    argNames: OLEObjectInvokeArgNames,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ OLEObjectInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: QueryTable,
    event: Invoke,
    argNames: QueryTableInvokeArgNames,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ QueryTableInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Workbook,
    event: Invoke,
    argNames: WorkbookInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WorkbookInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Worksheet,
    event: Invoke,
    argNames: WorksheetInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ WorksheetInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEObject,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Open(
    obj: Workbook,
    event: Open,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Application,
    event: Release,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Chart,
    event: Release,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: OLEObject,
    event: Release,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: QueryTable,
    event: Release,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Workbook,
    event: Release,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Worksheet,
    event: Release,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Resize(
    obj: Chart,
    event: Resize,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Colors(obj: Workbook, propertyName: Colors, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_HasAxis(
    obj: Chart,
    propertyName: HasAxis,
    parameterTypes: js.Tuple2[js.UndefOr[XlAxisType], js.UndefOr[XlAxisGroup]],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: ControlFormat, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_List(
    obj: ControlFormat,
    propertyName: List,
    parameterTypes: js.Array[scala.Nothing],
    newValue: SafeArray[String]
  ): Unit = js.native
  @JSName("set")
  def set_PrintQuality(obj: PageSetup, propertyName: PrintQuality, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Subtotals(
    obj: PivotField,
    propertyName: Subtotals,
    parameterTypes: js.Array[PivotFieldSubtotal],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_Value(obj: Range, propertyName: Value, parameterTypes: js.Array[XlRangeValueDataType], newValue: js.Any): Unit = js.native
}

