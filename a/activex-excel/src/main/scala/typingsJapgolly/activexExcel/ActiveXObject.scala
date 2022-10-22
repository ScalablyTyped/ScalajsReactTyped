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
import typingsJapgolly.activexExcel.anon.CNames
import typingsJapgolly.activexExcel.anon.CancelBoolean
import typingsJapgolly.activexExcel.anon.CancelIsRefresh
import typingsJapgolly.activexExcel.anon.CancelMap
import typingsJapgolly.activexExcel.anon.CancelPvw
import typingsJapgolly.activexExcel.anon.CancelSaveAsUI
import typingsJapgolly.activexExcel.anon.CancelTarget
import typingsJapgolly.activexExcel.anon.CancelTargetPivotTable
import typingsJapgolly.activexExcel.anon.CancelWb
import typingsJapgolly.activexExcel.anon.ChChart
import typingsJapgolly.activexExcel.anon.IsRefreshMap
import typingsJapgolly.activexExcel.anon.Itinfo
import typingsJapgolly.activexExcel.anon.MapUrl
import typingsJapgolly.activexExcel.anon.Pctinfo
import typingsJapgolly.activexExcel.anon.PpvObj
import typingsJapgolly.activexExcel.anon.ShTarget
import typingsJapgolly.activexExcel.anon.ShWb
import typingsJapgolly.activexExcel.anon.ShWorksheet
import typingsJapgolly.activexExcel.anon.ShWorksheetTargetPivotTable
import typingsJapgolly.activexExcel.anon.SuccessBoolean
import typingsJapgolly.activexExcel.anon.SyncEventTypeMsoSyncEventType
import typingsJapgolly.activexExcel.anon.TargetHyperlink
import typingsJapgolly.activexExcel.anon.TargetPivotTableTargetRange
import typingsJapgolly.activexExcel.anon.TargetPivotTableValueChangeEnd
import typingsJapgolly.activexExcel.anon.TargetWb
import typingsJapgolly.activexExcel.anon.WnWindow
import typingsJapgolly.activexExcel.anon.`0`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: NewWorkbook | ProtectedViewWindowActivate | ProtectedViewWindowDeactivate | ProtectedViewWindowOpen | ProtectedViewWindowResize | SheetActivate | SheetCalculate | SheetDeactivate | WorkbookActivate | WorkbookAddinInstall | WorkbookAddinUninstall | WorkbookDeactivate | WorkbookOpen,
    argNames: js.Array[Pvw | Sh | Wb],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typingsJapgolly.activexExcel.anon.Pvw) | (/* parameter */ typingsJapgolly.activexExcel.anon.Sh) | (/* parameter */ typingsJapgolly.activexExcel.anon.Wb), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange | SheetSelectionChange | WindowActivate | WindowDeactivate | WindowResize | WorkbookBeforeClose | WorkbookBeforePrint | WorkbookPivotTableCloseConnection | WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Sh | Wb, Cancel | Target | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ CancelWb) | (/* parameter */ ShTarget) | (/* parameter */ TargetWb) | (/* parameter */ typingsJapgolly.activexExcel.anon.Wn), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick | SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.Target, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges | SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AddRef | AfterCalculate | Release,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.TargetPivotTable, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.ValueChangeStart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.Success, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsJapgolly.activexExcel.anon.Map, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.IsRefresh, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.SaveAsUI, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsJapgolly.activexExcel.anon.Url, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsJapgolly.activexExcel.anon.Ch, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.Description, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexExcel.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsJapgolly.activexExcel.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Activate | AddRef | Calculate | Deactivate | DragOver | DragPlot | Release | Resize,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsJapgolly.activexExcel.anon.Arg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsJapgolly.activexExcel.anon.Arg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsJapgolly.activexExcel.anon.PointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: AddRef | GotFocus | LostFocus | Release,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose | BeforePrint | NewSheet | PivotTableCloseConnection | PivotTableOpenConnection | SheetActivate | SheetCalculate | SheetDeactivate | WindowActivate | WindowDeactivate | WindowResize,
    argNames: js.Array[Cancel | Sh | Target | Wn],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      (/* parameter */ `0`) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexExcel.anon.Sh) | (/* parameter */ WnWindow), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange | SheetPivotTableChangeSync | SheetPivotTableUpdate | SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      (/* parameter */ ShTarget) | (/* parameter */ ShWorksheetTargetPivotTable), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick | SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsJapgolly.activexExcel.anon.Target, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges | SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsJapgolly.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Activate | AddinInstall | AddinUninstall | AddRef | Deactivate | Open | Release,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsJapgolly.activexExcel.anon.Result, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ IsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ MapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsJapgolly.activexExcel.anon.Sheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsJapgolly.activexExcel.anon.TargetPivotTable, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsJapgolly.activexExcel.anon.ValueChangeStart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change | PivotTableChangeSync | PivotTableUpdate | SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[
      /* this */ Worksheet, 
      (/* parameter */ `0`) | (/* parameter */ typingsJapgolly.activexExcel.anon.TargetRange), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick | BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges | PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Activate | AddRef | Calculate | Deactivate | Release,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ PpvObj, Unit]
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
  def set_List(
    obj: ControlFormat,
    propertyName: typingsJapgolly.activexExcel.activexExcelStrings.List,
    parameterTypes: js.Array[Double],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_List(
    obj: ControlFormat,
    propertyName: typingsJapgolly.activexExcel.activexExcelStrings.List,
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
  def set_Value(obj: Range, propertyName: Value, parameterTypes: js.Array[XlRangeValueDataType], newValue: Any): Unit = js.native
}
