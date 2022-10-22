package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Grid")
@js.native
open class Grid protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Grid {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Grid {
  
  @JSGlobal("ej.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Grid.CellSelectionMode")
  @js.native
  object CellSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.CellSelectionMode & Double] = js.native
    
    /* 1 */ val Box: typingsJapgolly.ejWebAll.ej.Grid.CellSelectionMode.Box & Double = js.native
    
    /* 0 */ val Flow: typingsJapgolly.ejWebAll.ej.Grid.CellSelectionMode.Flow & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ClipMode")
  @js.native
  object ClipMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.ClipMode & Double] = js.native
    
    /* 1 */ val Clip: typingsJapgolly.ejWebAll.ej.Grid.ClipMode.Clip & Double = js.native
    
    /* 0 */ val Ellipsis: typingsJapgolly.ejWebAll.ej.Grid.ClipMode.Ellipsis & Double = js.native
    
    /* 2 */ val EllipsisWithTooltip: typingsJapgolly.ejWebAll.ej.Grid.ClipMode.EllipsisWithTooltip & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ColumnLayout")
  @js.native
  object ColumnLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.ColumnLayout & Double] = js.native
    
    /* 0 */ val Auto: typingsJapgolly.ejWebAll.ej.Grid.ColumnLayout.Auto & Double = js.native
    
    /* 1 */ val Fixed: typingsJapgolly.ejWebAll.ej.Grid.ColumnLayout.Fixed & Double = js.native
  }
  
  @JSGlobal("ej.Grid.DragBehavior")
  @js.native
  object DragBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.DragBehavior & Double] = js.native
    
    /* 1 */ val Copy: typingsJapgolly.ejWebAll.ej.Grid.DragBehavior.Copy & Double = js.native
    
    /* 0 */ val Move: typingsJapgolly.ejWebAll.ej.Grid.DragBehavior.Move & Double = js.native
  }
  
  @JSGlobal("ej.Grid.EditMode")
  @js.native
  object EditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.EditMode & Double] = js.native
    
    /* 3 */ val Batch: typingsJapgolly.ejWebAll.ej.Grid.EditMode.Batch & Double = js.native
    
    /* 1 */ val Dialog: typingsJapgolly.ejWebAll.ej.Grid.EditMode.Dialog & Double = js.native
    
    /* 2 */ val DialogTemplate: typingsJapgolly.ejWebAll.ej.Grid.EditMode.DialogTemplate & Double = js.native
    
    /* 6 */ val ExternalForm: typingsJapgolly.ejWebAll.ej.Grid.EditMode.ExternalForm & Double = js.native
    
    /* 7 */ val ExternalFormTemplate: typingsJapgolly.ejWebAll.ej.Grid.EditMode.ExternalFormTemplate & Double = js.native
    
    /* 4 */ val InlineForm: typingsJapgolly.ejWebAll.ej.Grid.EditMode.InlineForm & Double = js.native
    
    /* 5 */ val InlineTemplateForm: typingsJapgolly.ejWebAll.ej.Grid.EditMode.InlineTemplateForm & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.Grid.EditMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.EditingType")
  @js.native
  object EditingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.EditingType & Double] = js.native
    
    /* 1 */ val Boolean: typingsJapgolly.ejWebAll.ej.Grid.EditingType.Boolean & Double = js.native
    
    /* 4 */ val DatePicker: typingsJapgolly.ejWebAll.ej.Grid.EditingType.DatePicker & Double = js.native
    
    /* 5 */ val DateTimePicker: typingsJapgolly.ejWebAll.ej.Grid.EditingType.DateTimePicker & Double = js.native
    
    /* 3 */ val Dropdown: typingsJapgolly.ejWebAll.ej.Grid.EditingType.Dropdown & Double = js.native
    
    /* 2 */ val Numeric: typingsJapgolly.ejWebAll.ej.Grid.EditingType.Numeric & Double = js.native
    
    /* 0 */ val String: typingsJapgolly.ejWebAll.ej.Grid.EditingType.String & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FilterBarMode")
  @js.native
  object FilterBarMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.FilterBarMode & Double] = js.native
    
    /* 0 */ val Immediate: typingsJapgolly.ejWebAll.ej.Grid.FilterBarMode.Immediate & Double = js.native
    
    /* 1 */ val OnEnter: typingsJapgolly.ejWebAll.ej.Grid.FilterBarMode.OnEnter & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.FilterType & Double] = js.native
    
    /* 1 */ val Excel: typingsJapgolly.ejWebAll.ej.Grid.FilterType.Excel & Double = js.native
    
    /* 0 */ val Menu: typingsJapgolly.ejWebAll.ej.Grid.FilterType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.FormPosition & Double] = js.native
    
    /* 0 */ val BottomLeft: typingsJapgolly.ejWebAll.ej.Grid.FormPosition.BottomLeft & Double = js.native
    
    /* 1 */ val TopRight: typingsJapgolly.ejWebAll.ej.Grid.FormPosition.TopRight & Double = js.native
  }
  
  @JSGlobal("ej.Grid.GridLines")
  @js.native
  object GridLines extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.GridLines & Double] = js.native
    
    /* 0 */ val Both: typingsJapgolly.ejWebAll.ej.Grid.GridLines.Both & Double = js.native
    
    /* 1 */ val Horizontal: typingsJapgolly.ejWebAll.ej.Grid.GridLines.Horizontal & Double = js.native
    
    /* 3 */ val None: typingsJapgolly.ejWebAll.ej.Grid.GridLines.None & Double = js.native
    
    /* 2 */ val Vertical: typingsJapgolly.ejWebAll.ej.Grid.GridLines.Vertical & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Grid.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Grid.PrintMode")
  @js.native
  object PrintMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.PrintMode & Double] = js.native
    
    /* 0 */ val AllPages: typingsJapgolly.ejWebAll.ej.Grid.PrintMode.AllPages & Double = js.native
    
    /* 1 */ val CurrentPage: typingsJapgolly.ejWebAll.ej.Grid.PrintMode.CurrentPage & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.ResizeMode & Double] = js.native
    
    /* 2 */ val Control: typingsJapgolly.ejWebAll.ej.Grid.ResizeMode.Control & Double = js.native
    
    /* 1 */ val NextColumn: typingsJapgolly.ejWebAll.ej.Grid.ResizeMode.NextColumn & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.Grid.ResizeMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.RowPosition & Double] = js.native
    
    /* 1 */ val Bottom: typingsJapgolly.ejWebAll.ej.Grid.RowPosition.Bottom & Double = js.native
    
    /* 0 */ val Top: typingsJapgolly.ejWebAll.ej.Grid.RowPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.Grid.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.SelectionType & Double] = js.native
    
    /* 1 */ val Multiple: typingsJapgolly.ejWebAll.ej.Grid.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typingsJapgolly.ejWebAll.ej.Grid.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.Grid.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.SummaryType & Double] = js.native
    
    /* 0 */ val Average: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Average & Double = js.native
    
    /* 3 */ val Count: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Count & Double = js.native
    
    /* 5 */ val Custom: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Custom & Double = js.native
    
    /* 7 */ val FalseCount: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.FalseCount & Double = js.native
    
    /* 2 */ val Maximum: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Maximum & Double = js.native
    
    /* 1 */ val Minimum: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Minimum & Double = js.native
    
    /* 4 */ val Sum: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.Sum & Double = js.native
    
    /* 6 */ val TrueCount: typingsJapgolly.ejWebAll.ej.Grid.SummaryType.TrueCount & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ToolBarItems")
  @js.native
  object ToolBarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems & Double] = js.native
    
    /* 0 */ val Add: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Add & Double = js.native
    
    /* 4 */ val Cancel: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Cancel & Double = js.native
    
    /* 2 */ val Delete: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Delete & Double = js.native
    
    /* 1 */ val Edit: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Edit & Double = js.native
    
    /* 6 */ val PdfExport: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.PdfExport & Double = js.native
    
    /* 7 */ val PrintGrid: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.PrintGrid & Double = js.native
    
    /* 5 */ val Search: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Search & Double = js.native
    
    /* 3 */ val Update: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.Update & Double = js.native
    
    /* 8 */ val WordExport: typingsJapgolly.ejWebAll.ej.Grid.ToolBarItems.WordExport & Double = js.native
  }
  
  @JSGlobal("ej.Grid.UnboundType")
  @js.native
  object UnboundType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.UnboundType & Double] = js.native
    
    /* 3 */ val Cancel: typingsJapgolly.ejWebAll.ej.Grid.UnboundType.Cancel & Double = js.native
    
    /* 2 */ val Delete: typingsJapgolly.ejWebAll.ej.Grid.UnboundType.Delete & Double = js.native
    
    /* 0 */ val Edit: typingsJapgolly.ejWebAll.ej.Grid.UnboundType.Edit & Double = js.native
    
    /* 1 */ val Save: typingsJapgolly.ejWebAll.ej.Grid.UnboundType.Save & Double = js.native
  }
  
  @JSGlobal("ej.Grid.VirtualScrollMode")
  @js.native
  object VirtualScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.VirtualScrollMode & Double] = js.native
    
    /* 1 */ val Continuous: typingsJapgolly.ejWebAll.ej.Grid.VirtualScrollMode.Continuous & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.Grid.VirtualScrollMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.WrapMode")
  @js.native
  object WrapMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Grid.WrapMode & Double] = js.native
    
    /* 0 */ val Both: typingsJapgolly.ejWebAll.ej.Grid.WrapMode.Both & Double = js.native
    
    /* 1 */ val Content: typingsJapgolly.ejWebAll.ej.Grid.WrapMode.Content & Double = js.native
    
    /* 2 */ val Header: typingsJapgolly.ejWebAll.ej.Grid.WrapMode.Header & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Grid.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Grid = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Grid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
