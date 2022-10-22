package typingsJapgolly.sharepoint.global.SP.JsGrid

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleManager
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.Style")
@js.native
open class Style ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.JsGrid.Style
object Style {
  
  @JSGlobal("SP.JsGrid.Style")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplyCellStyle")
  @js.native
  def ApplyCellStyle: js.Function2[/* td */ HTMLTableCellElement, /* style */ Any, Unit] = js.native
  inline def ApplyCellStyle_=(x: js.Function2[/* td */ HTMLTableCellElement, /* style */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyCellStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplyColumnContextMenuStyle")
  @js.native
  def ApplyColumnContextMenuStyle: js.Function2[/* domObj */ HTMLElement, /* style */ Any, Unit] = js.native
  inline def ApplyColumnContextMenuStyle_=(x: js.Function2[/* domObj */ HTMLElement, /* style */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyColumnContextMenuStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplyCornerHeaderBorderStyle")
  @js.native
  def ApplyCornerHeaderBorderStyle: js.Function3[/* domObj */ HTMLElement, /* colStyle */ Any, /* rowStyle */ Any, Unit] = js.native
  inline def ApplyCornerHeaderBorderStyle_=(x: js.Function3[/* domObj */ HTMLElement, /* colStyle */ Any, /* rowStyle */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyCornerHeaderBorderStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplyHeaderInnerBorderStyle")
  @js.native
  def ApplyHeaderInnerBorderStyle: js.Function3[/* domObj */ HTMLElement, /* bIsRowHeader */ Any, /* headerObject */ Any, Unit] = js.native
  inline def ApplyHeaderInnerBorderStyle_=(x: js.Function3[/* domObj */ HTMLElement, /* bIsRowHeader */ Any, /* headerObject */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyHeaderInnerBorderStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplyRowHeaderStyle")
  @js.native
  def ApplyRowHeaderStyle: js.Function3[
    /* domObj */ HTMLElement, 
    /* style */ Any, 
    /* fnGetHeaderSibling */ js.Function2[/* elem */ HTMLElement, /* previousElem */ Boolean, Unit], 
    Unit
  ] = js.native
  inline def ApplyRowHeaderStyle_=(
    x: js.Function3[
      /* domObj */ HTMLElement, 
      /* style */ Any, 
      /* fnGetHeaderSibling */ js.Function2[/* elem */ HTMLElement, /* previousElem */ Boolean, Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplyRowHeaderStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.ApplySplitterStyle")
  @js.native
  def ApplySplitterStyle: js.Function2[/* domObj */ HTMLElement, /* style */ Any, Unit] = js.native
  inline def ApplySplitterStyle_=(x: js.Function2[/* domObj */ HTMLElement, /* style */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApplySplitterStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.CreateStyle")
  @js.native
  def CreateStyle: js.Function2[/* styleType */ IStyleType, /* styleProps */ Any, Any] = js.native
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.CreateStyleFromCss")
  @js.native
  def CreateStyleFromCss: js.Function4[
    /* styleType */ IStyleType, 
    /* cssStyleName */ String, 
    /* optExistingStyle */ js.UndefOr[Any], 
    /* optClassId */ js.UndefOr[Any], 
    Any
  ] = js.native
  inline def CreateStyleFromCss_=(
    x: js.Function4[
      /* styleType */ IStyleType, 
      /* cssStyleName */ String, 
      /* optExistingStyle */ js.UndefOr[Any], 
      /* optClassId */ js.UndefOr[Any], 
      Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateStyleFromCss")(x.asInstanceOf[js.Any])
  
  inline def CreateStyle_=(x: js.Function2[/* styleType */ IStyleType, /* styleProps */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateStyle")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.GetCellStyleDefaultBackgroundColor")
  @js.native
  def GetCellStyleDefaultBackgroundColor: js.Function0[String] = js.native
  inline def GetCellStyleDefaultBackgroundColor_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetCellStyleDefaultBackgroundColor")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.MakeBorderString")
  @js.native
  def MakeBorderString: js.Function3[/* width */ Double, /* style */ String, /* color */ String, String] = js.native
  inline def MakeBorderString_=(x: js.Function3[/* width */ Double, /* style */ String, /* color */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MakeBorderString")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.MakeJsGridStyleManager")
  @js.native
  def MakeJsGridStyleManager: js.Function0[IStyleManager] = js.native
  inline def MakeJsGridStyleManager_=(x: js.Function0[IStyleManager]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MakeJsGridStyleManager")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.MergeCellStyles")
  @js.native
  def MergeCellStyles: js.Function2[/* majorStyle */ Any, /* minorStyle */ Any, Any] = js.native
  inline def MergeCellStyles_=(x: js.Function2[/* majorStyle */ Any, /* minorStyle */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MergeCellStyles")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SP.JsGrid.Style.SetRTL")
  @js.native
  def SetRTL: js.Function1[/* rtlObject */ Any, Unit] = js.native
  inline def SetRTL_=(x: js.Function1[/* rtlObject */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetRTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  object Type {
    
    @JSGlobal("SP.JsGrid.Style.Type")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SP.JsGrid.Style.Type.Cell")
    @js.native
    def Cell: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell = js.native
    inline def Cell_=(x: Cell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.GridPane")
    @js.native
    def GridPane: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane = js.native
    inline def GridPane_=(x: GridPane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GridPane")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.Header")
    @js.native
    def Header: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header = js.native
    inline def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.RowHeaderStyle")
    @js.native
    def RowHeaderStyle: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle = js.native
    inline def RowHeaderStyle_=(x: RowHeaderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowHeaderStyle")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.Splitter")
    @js.native
    def Splitter: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter = js.native
    
    @JSGlobal("SP.JsGrid.Style.Type.SplitterHandle")
    @js.native
    def SplitterHandle: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.SplitterHandle = js.native
    inline def SplitterHandle_=(x: SplitterHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SplitterHandle")(x.asInstanceOf[js.Any])
    
    inline def Splitter_=(x: Splitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Splitter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.TimescaleTier")
    @js.native
    def TimescaleTier: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier = js.native
    inline def TimescaleTier_=(x: TimescaleTier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimescaleTier")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.JsGrid.Style.Type.Widget")
    @js.native
    def Widget: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget = js.native
    inline def Widget_=(x: Widget): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widget")(x.asInstanceOf[js.Any])
  }
}
