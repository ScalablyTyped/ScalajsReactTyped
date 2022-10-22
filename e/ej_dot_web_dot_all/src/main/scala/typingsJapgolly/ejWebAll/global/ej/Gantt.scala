package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Gantt")
@js.native
open class Gantt protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Gantt {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Gantt {
  
  @JSGlobal("ej.Gantt")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Gantt.BeginEditAction")
  @js.native
  object BeginEditAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.BeginEditAction & Double] = js.native
    
    /* 1 */ val Click: typingsJapgolly.ejWebAll.ej.Gantt.BeginEditAction.Click & Double = js.native
    
    /* 0 */ val DblClick: typingsJapgolly.ejWebAll.ej.Gantt.BeginEditAction.DblClick & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.DurationUnit")
  @js.native
  object DurationUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.DurationUnit & Double] = js.native
    
    /* 0 */ val Day: typingsJapgolly.ejWebAll.ej.Gantt.DurationUnit.Day & Double = js.native
    
    /* 1 */ val Hour: typingsJapgolly.ejWebAll.ej.Gantt.DurationUnit.Hour & Double = js.native
    
    /* 2 */ val Minute: typingsJapgolly.ejWebAll.ej.Gantt.DurationUnit.Minute & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Gantt.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Gantt.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.RowPosition & Double] = js.native
    
    /* 2 */ val AboveSelectedRow: typingsJapgolly.ejWebAll.ej.Gantt.RowPosition.AboveSelectedRow & Double = js.native
    
    /* 3 */ val BelowSelectedRow: typingsJapgolly.ejWebAll.ej.Gantt.RowPosition.BelowSelectedRow & Double = js.native
    
    /* 1 */ val Bottom: typingsJapgolly.ejWebAll.ej.Gantt.RowPosition.Bottom & Double = js.native
    
    /* 4 */ val Child: typingsJapgolly.ejWebAll.ej.Gantt.RowPosition.Child & Double = js.native
    
    /* 0 */ val Top: typingsJapgolly.ejWebAll.ej.Gantt.RowPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ScheduleHeaderType")
  @js.native
  object ScheduleHeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType & Double] = js.native
    
    /* 3 */ val Day: typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType.Day & Double = js.native
    
    /* 4 */ val Hour: typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType.Hour & Double = js.native
    
    /* 1 */ val Month: typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType.Month & Double = js.native
    
    /* 2 */ val Week: typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType.Week & Double = js.native
    
    /* 0 */ val Year: typingsJapgolly.ejWebAll.ej.Gantt.ScheduleHeaderType.Year & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.SelectionMode & Double] = js.native
    
    /* 1 */ val Cell: typingsJapgolly.ejWebAll.ej.Gantt.SelectionMode.Cell & Double = js.native
    
    /* 0 */ val Row: typingsJapgolly.ejWebAll.ej.Gantt.SelectionMode.Row & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.SelectionType & Double] = js.native
    
    /* 1 */ val Multiple: typingsJapgolly.ejWebAll.ej.Gantt.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typingsJapgolly.ejWebAll.ej.Gantt.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TaskSchedulingMode")
  @js.native
  object TaskSchedulingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.TaskSchedulingMode & Double] = js.native
    
    /* 0 */ val Auto: typingsJapgolly.ejWebAll.ej.Gantt.TaskSchedulingMode.Auto & Double = js.native
    
    /* 2 */ val Custom: typingsJapgolly.ejWebAll.ej.Gantt.TaskSchedulingMode.Custom & Double = js.native
    
    /* 1 */ val Manual: typingsJapgolly.ejWebAll.ej.Gantt.TaskSchedulingMode.Manual & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TaskType")
  @js.native
  object TaskType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.TaskType & Double] = js.native
    
    /* 2 */ val FixedDuration: typingsJapgolly.ejWebAll.ej.Gantt.TaskType.FixedDuration & Double = js.native
    
    /* 0 */ val FixedUnit: typingsJapgolly.ejWebAll.ej.Gantt.TaskType.FixedUnit & Double = js.native
    
    /* 1 */ val FixedWork: typingsJapgolly.ejWebAll.ej.Gantt.TaskType.FixedWork & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TimescaleRoundMode")
  @js.native
  object TimescaleRoundMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.TimescaleRoundMode & Double] = js.native
    
    /* 0 */ val Auto: typingsJapgolly.ejWebAll.ej.Gantt.TimescaleRoundMode.Auto & Double = js.native
    
    /* 2 */ val Month: typingsJapgolly.ejWebAll.ej.Gantt.TimescaleRoundMode.Month & Double = js.native
    
    /* 1 */ val Week: typingsJapgolly.ejWebAll.ej.Gantt.TimescaleRoundMode.Week & Double = js.native
    
    /* 3 */ val Year: typingsJapgolly.ejWebAll.ej.Gantt.TimescaleRoundMode.Year & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems & Double] = js.native
    
    /* 0 */ val Add: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Add & Double = js.native
    
    /* 4 */ val Cancel: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Cancel & Double = js.native
    
    /* 9 */ val CollapseAll: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.CollapseAll & Double = js.native
    
    /* 12 */ val CriticalPath: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.CriticalPath & Double = js.native
    
    /* 2 */ val Delete: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Delete & Double = js.native
    
    /* 1 */ val Edit: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Edit & Double = js.native
    
    /* 13 */ val ExcelExport: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.ExcelExport & Double = js.native
    
    /* 8 */ val ExpandAll: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.ExpandAll & Double = js.native
    
    /* 6 */ val Indent: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Indent & Double = js.native
    
    /* 11 */ val NextTimeSpan: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.NextTimeSpan & Double = js.native
    
    /* 7 */ val Outdent: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Outdent & Double = js.native
    
    /* 14 */ val PdfExport: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.PdfExport & Double = js.native
    
    /* 10 */ val PrevTimeSpan: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.PrevTimeSpan & Double = js.native
    
    /* 5 */ val Search: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Search & Double = js.native
    
    /* 3 */ val Update: typingsJapgolly.ejWebAll.ej.Gantt.ToolbarItems.Update & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ViewType")
  @js.native
  object ViewType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.ViewType & Double] = js.native
    
    /* 2 */ val HistogramView: typingsJapgolly.ejWebAll.ej.Gantt.ViewType.HistogramView & Double = js.native
    
    /* 0 */ val ProjectView: typingsJapgolly.ejWebAll.ej.Gantt.ViewType.ProjectView & Double = js.native
    
    /* 1 */ val ResourceView: typingsJapgolly.ejWebAll.ej.Gantt.ViewType.ResourceView & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.WorkUnit")
  @js.native
  object WorkUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.WorkUnit & Double] = js.native
    
    /* 0 */ val Day: typingsJapgolly.ejWebAll.ej.Gantt.WorkUnit.Day & Double = js.native
    
    /* 1 */ val Hour: typingsJapgolly.ejWebAll.ej.Gantt.WorkUnit.Hour & Double = js.native
    
    /* 2 */ val Minute: typingsJapgolly.ejWebAll.ej.Gantt.WorkUnit.Minute & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Gantt.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Gantt = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Gantt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Gantt.minutesPerInterval")
  @js.native
  object minutesPerInterval extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval & Double] = js.native
    
    /* 0 */ val Auto: typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval.Auto & Double = js.native
    
    /* 3 */ val FifteenMinutes: typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval.FifteenMinutes & Double = js.native
    
    /* 2 */ val FiveMinutes: typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval.FiveMinutes & Double = js.native
    
    /* 1 */ val OneMinute: typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval.OneMinute & Double = js.native
    
    /* 4 */ val ThirtyMinutes: typingsJapgolly.ejWebAll.ej.Gantt.minutesPerInterval.ThirtyMinutes & Double = js.native
  }
  
  @JSGlobal("ej.Gantt.workingTimeScale")
  @js.native
  object workingTimeScale extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Gantt.workingTimeScale & Double] = js.native
    
    /* 1 */ val TimeScale24Hours: typingsJapgolly.ejWebAll.ej.Gantt.workingTimeScale.TimeScale24Hours & Double = js.native
    
    /* 0 */ val TimeScale8Hours: typingsJapgolly.ejWebAll.ej.Gantt.workingTimeScale.TimeScale8Hours & Double = js.native
  }
}
