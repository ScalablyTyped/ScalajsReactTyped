package typingsJapgolly.activexAccess

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexAccess.activexAccessInts.`0`
import typingsJapgolly.activexAccess.activexAccessInts.`10`
import typingsJapgolly.activexAccess.activexAccessInts.`11`
import typingsJapgolly.activexAccess.activexAccessInts.`16`
import typingsJapgolly.activexAccess.activexAccessInts.`17`
import typingsJapgolly.activexAccess.activexAccessInts.`18`
import typingsJapgolly.activexAccess.activexAccessInts.`19`
import typingsJapgolly.activexAccess.activexAccessInts.`1`
import typingsJapgolly.activexAccess.activexAccessInts.`20`
import typingsJapgolly.activexAccess.activexAccessInts.`21`
import typingsJapgolly.activexAccess.activexAccessInts.`22`
import typingsJapgolly.activexAccess.activexAccessInts.`23`
import typingsJapgolly.activexAccess.activexAccessInts.`24`
import typingsJapgolly.activexAccess.activexAccessInts.`25`
import typingsJapgolly.activexAccess.activexAccessInts.`26`
import typingsJapgolly.activexAccess.activexAccessInts.`27`
import typingsJapgolly.activexAccess.activexAccessInts.`2`
import typingsJapgolly.activexAccess.activexAccessInts.`3`
import typingsJapgolly.activexAccess.activexAccessInts.`4`
import typingsJapgolly.activexAccess.activexAccessInts.`5`
import typingsJapgolly.activexAccess.activexAccessInts.`6`
import typingsJapgolly.activexAccess.activexAccessInts.`7`
import typingsJapgolly.activexAccess.activexAccessInts.`8`
import typingsJapgolly.activexAccess.activexAccessInts.`9`
import typingsJapgolly.activexAccess.activexAccessStrings.SourceCtlName
import typingsJapgolly.activexAccess.activexAccessStrings.SourceFieldList
import typingsJapgolly.activexAccess.activexAccessStrings.SourceRow
import typingsJapgolly.activexAccess.activexAccessStrings.State
import typingsJapgolly.activexAccess.activexAccessStrings.TargetCtlName
import typingsJapgolly.activexAccess.activexAccessStrings.TargetFieldList
import typingsJapgolly.activexAccess.activexAccessStrings.TargetRow
import typingsJapgolly.activexAccess.activexAccessStrings.X
import typingsJapgolly.activexAccess.activexAccessStrings.Y
import typingsJapgolly.activexStdole.stdole.IFontDisp
import typingsJapgolly.activexStdole.stdole.IPictureDisp
import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccWizObjects {
  
  object EventHelperTypes {
    
    type FieldListDragOverArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, State, X, Y]
    
    trait FieldListDragOverParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val State: Double
      
      val X: Double
      
      val Y: Double
    }
    object FieldListDragOverParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        X: Double,
        Y: Double
      ): FieldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListDragOverParameter]
      }
      
      extension [Self <: FieldListDragOverParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragDropArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow]
    
    trait FieldListFldListDragDropParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val TargetCtlName: String
      
      val TargetFieldList: Double
      
      val TargetRow: Double
    }
    object FieldListFldListDragDropParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragDropParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragDropParameter]
      }
      
      extension [Self <: FieldListFldListDragDropParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        inline def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        inline def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragOverArgNames = js.Tuple7[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow, State]
    
    trait FieldListFldListDragOverParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val State: Double
      
      val TargetCtlName: String
      
      val TargetFieldList: Double
      
      val TargetRow: Double
    }
    object FieldListFldListDragOverParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragOverParameter]
      }
      
      extension [Self <: FieldListFldListDragOverParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        inline def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        inline def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        inline def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /** Field List Control */
  trait FieldList extends StObject {
    
    /* private */ @JSName("AccWizObjects.FieldList_typekey")
    var AccWizObjectsDotFieldList_typekey: FieldList
    
    def AddFieldList(
      bstrCaption: String,
      nLeft: Double,
      nTop: Double,
      nWidth: Double,
      nHeight: Double,
      nMultiSelectType: Double,
      cCols: Double,
      fShowPictures: Boolean
    ): Unit
    
    def AddJoinLine(
      IFieldList: Double,
      iField: Double,
      iForeignFieldList: Double,
      iForeignField: Double,
      lAttribs: Double
    ): Unit
    
    def DeleteFieldList(IFieldList: Double): Unit
    
    def DeleteJoinLine(IJoinLine: Double): Unit
    
    val FieldListCount: Double
    
    def FieldLists(IFieldList: Double): Any
    
    var HScrollPos: Double
    
    val JoinLineCount: Double
    
    def JoinLines(IJoinLine: Double): Any
    
    var PersistentHighlight: Boolean
    
    var Picture: IPictureDisp
    
    var PictureCols: Double
    
    var PictureRows: Double
    
    var ScrollBars: Double
    
    var SelectedFieldListIndex: Double
    
    def SetCursor(nCursorID: Double): Unit
    
    var VScrollPos: Double
  }
  object FieldList {
    
    inline def apply(
      AccWizObjectsDotFieldList_typekey: FieldList,
      AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Callback,
      AddJoinLine: (Double, Double, Double, Double, Double) => Callback,
      DeleteFieldList: Double => Callback,
      DeleteJoinLine: Double => Callback,
      FieldListCount: Double,
      FieldLists: Double => Any,
      HScrollPos: Double,
      JoinLineCount: Double,
      JoinLines: Double => Any,
      PersistentHighlight: Boolean,
      Picture: IPictureDisp,
      PictureCols: Double,
      PictureRows: Double,
      ScrollBars: Double,
      SelectedFieldListIndex: Double,
      SetCursor: Double => Callback,
      VScrollPos: Double
    ): FieldList = {
      val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Boolean) => (AddFieldList(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), AddJoinLine = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (AddJoinLine(t0, t1, t2, t3, t4)).runNow()), DeleteFieldList = js.Any.fromFunction1((t0: Double) => DeleteFieldList(t0).runNow()), DeleteJoinLine = js.Any.fromFunction1((t0: Double) => DeleteJoinLine(t0).runNow()), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1((t0: Double) => SetCursor(t0).runNow()), VScrollPos = VScrollPos.asInstanceOf[js.Any])
      __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldList]
    }
    
    extension [Self <: FieldList](x: Self) {
      
      inline def setAccWizObjectsDotFieldList_typekey(value: FieldList): Self = StObject.set(x, "AccWizObjects.FieldList_typekey", value.asInstanceOf[js.Any])
      
      inline def setAddFieldList(value: (String, Double, Double, Double, Double, Double, Double, Boolean) => Callback): Self = StObject.set(x, "AddFieldList", js.Any.fromFunction8((t0: String, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Boolean) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
      
      inline def setAddJoinLine(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "AddJoinLine", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setDeleteFieldList(value: Double => Callback): Self = StObject.set(x, "DeleteFieldList", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setDeleteJoinLine(value: Double => Callback): Self = StObject.set(x, "DeleteJoinLine", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setFieldListCount(value: Double): Self = StObject.set(x, "FieldListCount", value.asInstanceOf[js.Any])
      
      inline def setFieldLists(value: Double => Any): Self = StObject.set(x, "FieldLists", js.Any.fromFunction1(value))
      
      inline def setHScrollPos(value: Double): Self = StObject.set(x, "HScrollPos", value.asInstanceOf[js.Any])
      
      inline def setJoinLineCount(value: Double): Self = StObject.set(x, "JoinLineCount", value.asInstanceOf[js.Any])
      
      inline def setJoinLines(value: Double => Any): Self = StObject.set(x, "JoinLines", js.Any.fromFunction1(value))
      
      inline def setPersistentHighlight(value: Boolean): Self = StObject.set(x, "PersistentHighlight", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: IPictureDisp): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
      
      inline def setPictureCols(value: Double): Self = StObject.set(x, "PictureCols", value.asInstanceOf[js.Any])
      
      inline def setPictureRows(value: Double): Self = StObject.set(x, "PictureRows", value.asInstanceOf[js.Any])
      
      inline def setScrollBars(value: Double): Self = StObject.set(x, "ScrollBars", value.asInstanceOf[js.Any])
      
      inline def setSelectedFieldListIndex(value: Double): Self = StObject.set(x, "SelectedFieldListIndex", value.asInstanceOf[js.Any])
      
      inline def setSetCursor(value: Double => Callback): Self = StObject.set(x, "SetCursor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setVScrollPos(value: Double): Self = StObject.set(x, "VScrollPos", value.asInstanceOf[js.Any])
    }
  }
  
  /** ImexGrid Control */
  trait ImexGrid extends StObject {
    
    /* private */ @JSName("AccWizObjects.ImexGrid_typekey")
    var AccWizObjectsDotImexGrid_typekey: ImexGrid
    
    def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit
    
    def AddRow(RowText: String, Index: Double): Unit
    
    var AllowColumnSizing: Boolean
    
    var BackColor: OLE_COLOR
    
    def CalcBestColumns(): Unit
    
    var Caption: String
    
    def ClearColumns(): Unit
    
    def ClearRows(): Unit
    
    var ColumnClickBehavior: Double
    
    val ColumnCount: Double
    
    var ColumnState: Any
    
    def Columns(ColumnNumber: Double): Any
    
    def DeleteColumn(Index: Double): Unit
    
    def DeleteRow(Index: Double): Unit
    
    var Delimiters: String
    
    var DrawTextLogicalOrder: Boolean
    
    var FirstRowNumber: Double
    
    var Font: IFontDisp
    
    var GridBackColor: OLE_COLOR
    
    var GridFont: IFontDisp
    
    var GridHeader: Double
    
    var Painting: Boolean
    
    def Refresh(): Unit
    
    def ResetHScrollPos(): Unit
    
    def ResetVScrollPos(): Unit
    
    val RowCount: Double
    
    def RowText(RowNumber: Double): String
    
    var ShowColLines: Boolean
    
    var ShowRowHeaders: Boolean
    
    var StringDelimiters: String
  }
  object ImexGrid {
    
    inline def apply(
      AccWizObjectsDotImexGrid_typekey: ImexGrid,
      AddColumn: (String, Double, Double) => Callback,
      AddRow: (String, Double) => Callback,
      AllowColumnSizing: Boolean,
      BackColor: OLE_COLOR,
      CalcBestColumns: Callback,
      Caption: String,
      ClearColumns: Callback,
      ClearRows: Callback,
      ColumnClickBehavior: Double,
      ColumnCount: Double,
      ColumnState: Any,
      Columns: Double => Any,
      DeleteColumn: Double => Callback,
      DeleteRow: Double => Callback,
      Delimiters: String,
      DrawTextLogicalOrder: Boolean,
      FirstRowNumber: Double,
      Font: IFontDisp,
      GridBackColor: OLE_COLOR,
      GridFont: IFontDisp,
      GridHeader: Double,
      Painting: Boolean,
      Refresh: Callback,
      ResetHScrollPos: Callback,
      ResetVScrollPos: Callback,
      RowCount: Double,
      RowText: Double => String,
      ShowColLines: Boolean,
      ShowRowHeaders: Boolean,
      StringDelimiters: String
    ): ImexGrid = {
      val __obj = js.Dynamic.literal(AddColumn = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (AddColumn(t0, t1, t2)).runNow()), AddRow = js.Any.fromFunction2((t0: String, t1: Double) => (AddRow(t0, t1)).runNow()), AllowColumnSizing = AllowColumnSizing.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], CalcBestColumns = CalcBestColumns.toJsFn, Caption = Caption.asInstanceOf[js.Any], ClearColumns = ClearColumns.toJsFn, ClearRows = ClearRows.toJsFn, ColumnClickBehavior = ColumnClickBehavior.asInstanceOf[js.Any], ColumnCount = ColumnCount.asInstanceOf[js.Any], ColumnState = ColumnState.asInstanceOf[js.Any], Columns = js.Any.fromFunction1(Columns), DeleteColumn = js.Any.fromFunction1((t0: Double) => DeleteColumn(t0).runNow()), DeleteRow = js.Any.fromFunction1((t0: Double) => DeleteRow(t0).runNow()), Delimiters = Delimiters.asInstanceOf[js.Any], DrawTextLogicalOrder = DrawTextLogicalOrder.asInstanceOf[js.Any], FirstRowNumber = FirstRowNumber.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], GridBackColor = GridBackColor.asInstanceOf[js.Any], GridFont = GridFont.asInstanceOf[js.Any], GridHeader = GridHeader.asInstanceOf[js.Any], Painting = Painting.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, ResetHScrollPos = ResetHScrollPos.toJsFn, ResetVScrollPos = ResetVScrollPos.toJsFn, RowCount = RowCount.asInstanceOf[js.Any], RowText = js.Any.fromFunction1(RowText), ShowColLines = ShowColLines.asInstanceOf[js.Any], ShowRowHeaders = ShowRowHeaders.asInstanceOf[js.Any], StringDelimiters = StringDelimiters.asInstanceOf[js.Any])
      __obj.updateDynamic("AccWizObjects.ImexGrid_typekey")(AccWizObjectsDotImexGrid_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImexGrid]
    }
    
    extension [Self <: ImexGrid](x: Self) {
      
      inline def setAccWizObjectsDotImexGrid_typekey(value: ImexGrid): Self = StObject.set(x, "AccWizObjects.ImexGrid_typekey", value.asInstanceOf[js.Any])
      
      inline def setAddColumn(value: (String, Double, Double) => Callback): Self = StObject.set(x, "AddColumn", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddRow(value: (String, Double) => Callback): Self = StObject.set(x, "AddRow", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setAllowColumnSizing(value: Boolean): Self = StObject.set(x, "AllowColumnSizing", value.asInstanceOf[js.Any])
      
      inline def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
      
      inline def setCalcBestColumns(value: Callback): Self = StObject.set(x, "CalcBestColumns", value.toJsFn)
      
      inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
      
      inline def setClearColumns(value: Callback): Self = StObject.set(x, "ClearColumns", value.toJsFn)
      
      inline def setClearRows(value: Callback): Self = StObject.set(x, "ClearRows", value.toJsFn)
      
      inline def setColumnClickBehavior(value: Double): Self = StObject.set(x, "ColumnClickBehavior", value.asInstanceOf[js.Any])
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnState(value: Any): Self = StObject.set(x, "ColumnState", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: Double => Any): Self = StObject.set(x, "Columns", js.Any.fromFunction1(value))
      
      inline def setDeleteColumn(value: Double => Callback): Self = StObject.set(x, "DeleteColumn", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setDeleteRow(value: Double => Callback): Self = StObject.set(x, "DeleteRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setDelimiters(value: String): Self = StObject.set(x, "Delimiters", value.asInstanceOf[js.Any])
      
      inline def setDrawTextLogicalOrder(value: Boolean): Self = StObject.set(x, "DrawTextLogicalOrder", value.asInstanceOf[js.Any])
      
      inline def setFirstRowNumber(value: Double): Self = StObject.set(x, "FirstRowNumber", value.asInstanceOf[js.Any])
      
      inline def setFont(value: IFontDisp): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
      
      inline def setGridBackColor(value: OLE_COLOR): Self = StObject.set(x, "GridBackColor", value.asInstanceOf[js.Any])
      
      inline def setGridFont(value: IFontDisp): Self = StObject.set(x, "GridFont", value.asInstanceOf[js.Any])
      
      inline def setGridHeader(value: Double): Self = StObject.set(x, "GridHeader", value.asInstanceOf[js.Any])
      
      inline def setPainting(value: Boolean): Self = StObject.set(x, "Painting", value.asInstanceOf[js.Any])
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
      
      inline def setResetHScrollPos(value: Callback): Self = StObject.set(x, "ResetHScrollPos", value.toJsFn)
      
      inline def setResetVScrollPos(value: Callback): Self = StObject.set(x, "ResetVScrollPos", value.toJsFn)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
      
      inline def setRowText(value: Double => String): Self = StObject.set(x, "RowText", js.Any.fromFunction1(value))
      
      inline def setShowColLines(value: Boolean): Self = StObject.set(x, "ShowColLines", value.asInstanceOf[js.Any])
      
      inline def setShowRowHeaders(value: Boolean): Self = StObject.set(x, "ShowRowHeaders", value.asInstanceOf[js.Any])
      
      inline def setStringDelimiters(value: String): Self = StObject.set(x, "StringDelimiters", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexAccess.activexAccessInts.`26`
    - typingsJapgolly.activexAccess.activexAccessInts.`10`
    - typingsJapgolly.activexAccess.activexAccessInts.`25`
    - typingsJapgolly.activexAccess.activexAccessInts.`23`
    - typingsJapgolly.activexAccess.activexAccessInts.`22`
    - typingsJapgolly.activexAccess.activexAccessInts.`24`
    - typingsJapgolly.activexAccess.activexAccessInts.`3`
    - typingsJapgolly.activexAccess.activexAccessInts.`0`
    - typingsJapgolly.activexAccess.activexAccessInts.`16`
    - typingsJapgolly.activexAccess.activexAccessInts.`17`
    - typingsJapgolly.activexAccess.activexAccessInts.`6`
    - typingsJapgolly.activexAccess.activexAccessInts.`20`
    - typingsJapgolly.activexAccess.activexAccessInts.`19`
    - typingsJapgolly.activexAccess.activexAccessInts.`18`
    - typingsJapgolly.activexAccess.activexAccessInts.`5`
    - typingsJapgolly.activexAccess.activexAccessInts.`4`
    - typingsJapgolly.activexAccess.activexAccessInts.`27`
    - typingsJapgolly.activexAccess.activexAccessInts.`2`
    - typingsJapgolly.activexAccess.activexAccessInts.`8`
    - typingsJapgolly.activexAccess.activexAccessInts.`9`
    - typingsJapgolly.activexAccess.activexAccessInts.`11`
    - typingsJapgolly.activexAccess.activexAccessInts.`7`
    - typingsJapgolly.activexAccess.activexAccessInts.`21`
  */
  trait WIZ_CSIDL_FLAGS extends StObject
  object WIZ_CSIDL_FLAGS {
    
    inline def WIZ_CSIDL_APPDATA: `26` = 26.asInstanceOf[`26`]
    
    inline def WIZ_CSIDL_BITBUCKET: `10` = 10.asInstanceOf[`10`]
    
    inline def WIZ_CSIDL_COMMON_DESKTOPDIRECTORY: `25` = 25.asInstanceOf[`25`]
    
    inline def WIZ_CSIDL_COMMON_PROGRAMS: `23` = 23.asInstanceOf[`23`]
    
    inline def WIZ_CSIDL_COMMON_STARTMENU: `22` = 22.asInstanceOf[`22`]
    
    inline def WIZ_CSIDL_COMMON_STARTUP: `24` = 24.asInstanceOf[`24`]
    
    inline def WIZ_CSIDL_CONTROLS: `3` = 3.asInstanceOf[`3`]
    
    inline def WIZ_CSIDL_DESKTOP: `0` = 0.asInstanceOf[`0`]
    
    inline def WIZ_CSIDL_DESKTOPDIRECTORY: `16` = 16.asInstanceOf[`16`]
    
    inline def WIZ_CSIDL_DRIVES: `17` = 17.asInstanceOf[`17`]
    
    inline def WIZ_CSIDL_FAVORITES: `6` = 6.asInstanceOf[`6`]
    
    inline def WIZ_CSIDL_FONTS: `20` = 20.asInstanceOf[`20`]
    
    inline def WIZ_CSIDL_NETHOOD: `19` = 19.asInstanceOf[`19`]
    
    inline def WIZ_CSIDL_NETWORK: `18` = 18.asInstanceOf[`18`]
    
    inline def WIZ_CSIDL_PERSONAL: `5` = 5.asInstanceOf[`5`]
    
    inline def WIZ_CSIDL_PRINTERS: `4` = 4.asInstanceOf[`4`]
    
    inline def WIZ_CSIDL_PRINTHOOD: `27` = 27.asInstanceOf[`27`]
    
    inline def WIZ_CSIDL_PROGRAMS: `2` = 2.asInstanceOf[`2`]
    
    inline def WIZ_CSIDL_RECENT: `8` = 8.asInstanceOf[`8`]
    
    inline def WIZ_CSIDL_SENDTO: `9` = 9.asInstanceOf[`9`]
    
    inline def WIZ_CSIDL_STARTMENU: `11` = 11.asInstanceOf[`11`]
    
    inline def WIZ_CSIDL_STARTUP: `7` = 7.asInstanceOf[`7`]
    
    inline def WIZ_CSIDL_TEMPLATES: `21` = 21.asInstanceOf[`21`]
  }
  
  trait WIZ_FILETIME extends StObject {
    
    val dwHighDateTime: Double
    
    val dwLowDateTime: Double
  }
  object WIZ_FILETIME {
    
    inline def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
      val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_FILETIME]
    }
    
    extension [Self <: WIZ_FILETIME](x: Self) {
      
      inline def setDwHighDateTime(value: Double): Self = StObject.set(x, "dwHighDateTime", value.asInstanceOf[js.Any])
      
      inline def setDwLowDateTime(value: Double): Self = StObject.set(x, "dwLowDateTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexAccess.activexAccessInts.`1`
    - typingsJapgolly.activexAccess.activexAccessInts.`2`
  */
  trait WIZ_SLGP_FLAGS extends StObject
  object WIZ_SLGP_FLAGS {
    
    inline def WIZ_SLGP_SHORTPATH: `1` = 1.asInstanceOf[`1`]
    
    inline def WIZ_SLGP_UNCPRIORITY: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexAccess.activexAccessInts.`2`
    - typingsJapgolly.activexAccess.activexAccessInts.`1`
    - typingsJapgolly.activexAccess.activexAccessInts.`4`
  */
  trait WIZ_SLR_FLAGS extends StObject
  object WIZ_SLR_FLAGS {
    
    inline def WIZ_SLR_ANY_MATCH: `2` = 2.asInstanceOf[`2`]
    
    inline def WIZ_SLR_NO_UI: `1` = 1.asInstanceOf[`1`]
    
    inline def WIZ_SLR_UPDATE: `4` = 4.asInstanceOf[`4`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexAccess.activexAccessInts.`3`
    - typingsJapgolly.activexAccess.activexAccessInts.`7`
    - typingsJapgolly.activexAccess.activexAccessInts.`5`
  */
  trait WIZ_SW_FLAGS extends StObject
  object WIZ_SW_FLAGS {
    
    inline def WIZ_SW_MAXIMIZE: `3` = 3.asInstanceOf[`3`]
    
    inline def WIZ_SW_MINIMIZE: `7` = 7.asInstanceOf[`7`]
    
    inline def WIZ_SW_NORMAL: `5` = 5.asInstanceOf[`5`]
  }
  
  trait WIZ_WIN32_FIND_DATA extends StObject {
    
    val cAlternate: SafeArray[Double]
    
    val cFileName: SafeArray[Double]
    
    val dwFileAttributes: Double
    
    val dwReserved0: Double
    
    val dwReserved1: Double
    
    val ftCreationTime: WIZ_FILETIME
    
    val ftLastAccessTime: WIZ_FILETIME
    
    val ftLastWriteTime: WIZ_FILETIME
    
    val nFileSizeHigh: Double
    
    val nFileSizeLow: Double
  }
  object WIZ_WIN32_FIND_DATA {
    
    inline def apply(
      cAlternate: SafeArray[Double],
      cFileName: SafeArray[Double],
      dwFileAttributes: Double,
      dwReserved0: Double,
      dwReserved1: Double,
      ftCreationTime: WIZ_FILETIME,
      ftLastAccessTime: WIZ_FILETIME,
      ftLastWriteTime: WIZ_FILETIME,
      nFileSizeHigh: Double,
      nFileSizeLow: Double
    ): WIZ_WIN32_FIND_DATA = {
      val __obj = js.Dynamic.literal(cAlternate = cAlternate.asInstanceOf[js.Any], cFileName = cFileName.asInstanceOf[js.Any], dwFileAttributes = dwFileAttributes.asInstanceOf[js.Any], dwReserved0 = dwReserved0.asInstanceOf[js.Any], dwReserved1 = dwReserved1.asInstanceOf[js.Any], ftCreationTime = ftCreationTime.asInstanceOf[js.Any], ftLastAccessTime = ftLastAccessTime.asInstanceOf[js.Any], ftLastWriteTime = ftLastWriteTime.asInstanceOf[js.Any], nFileSizeHigh = nFileSizeHigh.asInstanceOf[js.Any], nFileSizeLow = nFileSizeLow.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
    }
    
    extension [Self <: WIZ_WIN32_FIND_DATA](x: Self) {
      
      inline def setCAlternate(value: SafeArray[Double]): Self = StObject.set(x, "cAlternate", value.asInstanceOf[js.Any])
      
      inline def setCFileName(value: SafeArray[Double]): Self = StObject.set(x, "cFileName", value.asInstanceOf[js.Any])
      
      inline def setDwFileAttributes(value: Double): Self = StObject.set(x, "dwFileAttributes", value.asInstanceOf[js.Any])
      
      inline def setDwReserved0(value: Double): Self = StObject.set(x, "dwReserved0", value.asInstanceOf[js.Any])
      
      inline def setDwReserved1(value: Double): Self = StObject.set(x, "dwReserved1", value.asInstanceOf[js.Any])
      
      inline def setFtCreationTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftCreationTime", value.asInstanceOf[js.Any])
      
      inline def setFtLastAccessTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastAccessTime", value.asInstanceOf[js.Any])
      
      inline def setFtLastWriteTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastWriteTime", value.asInstanceOf[js.Any])
      
      inline def setNFileSizeHigh(value: Double): Self = StObject.set(x, "nFileSizeHigh", value.asInstanceOf[js.Any])
      
      inline def setNFileSizeLow(value: Double): Self = StObject.set(x, "nFileSizeLow", value.asInstanceOf[js.Any])
    }
  }
  
  /** WizShellLinkA Class */
  trait WizShellLinkA extends StObject {
    
    /* private */ @JSName("AccWizObjects.WizShellLinkA_typekey")
    var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA
    
    /** GetArguments */
    def GetArguments(pszArgs: String, cchMaxPath: Double): Unit
    
    /** GetDescription */
    def GetDescription(pszName: String, cchMaxName: Double): Unit
    
    /** GetHotkey */
    def GetHotkey(pwHotkey: Double): Unit
    
    /** GetIDList */
    def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit
    
    /** GetIconLocation */
    def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit
    
    /** GetPath */
    def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit
    
    /** GetShowCmd */
    def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit
    
    /** GetWorkingDirectory */
    def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit
    
    /** Resolve */
    def Resolve(hWnd: Double, fflags: Double): Unit
    
    /** SetArguments */
    def SetArguments(pszArgs: String): Unit
    
    /** SetDescription */
    def SetDescription(pszName: String): Unit
    
    /** SetHotkey */
    def SetHotkey(wHotkey: Double): Unit
    
    /** SetIDList */
    def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit
    
    /** SetIconLocation */
    def SetIconLocation(pszIconPath: String, iIcon: Double): Unit
    
    /** SetPath */
    def SetPath(pszFile: String): Unit
    
    /** SetRelativePath */
    def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit
    
    /** SetShowCmd */
    def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit
    
    /** SetWorkingDirectory */
    def SetWorkingDirectory(pszDir: String): Unit
  }
  object WizShellLinkA {
    
    inline def apply(
      AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA,
      GetArguments: (String, Double) => Callback,
      GetDescription: (String, Double) => Callback,
      GetHotkey: Double => Callback,
      GetIDList: WIZ_CSIDL_FLAGS => Callback,
      GetIconLocation: (String, Double, Double) => Callback,
      GetPath: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Callback,
      GetShowCmd: WIZ_SW_FLAGS => Callback,
      GetWorkingDirectory: (String, Double) => Callback,
      Resolve: (Double, Double) => Callback,
      SetArguments: String => Callback,
      SetDescription: String => Callback,
      SetHotkey: Double => Callback,
      SetIDList: WIZ_CSIDL_FLAGS => Callback,
      SetIconLocation: (String, Double) => Callback,
      SetPath: String => Callback,
      SetRelativePath: (String, Double) => Callback,
      SetShowCmd: WIZ_SW_FLAGS => Callback,
      SetWorkingDirectory: String => Callback
    ): WizShellLinkA = {
      val __obj = js.Dynamic.literal(GetArguments = js.Any.fromFunction2((t0: String, t1: Double) => (GetArguments(t0, t1)).runNow()), GetDescription = js.Any.fromFunction2((t0: String, t1: Double) => (GetDescription(t0, t1)).runNow()), GetHotkey = js.Any.fromFunction1((t0: Double) => GetHotkey(t0).runNow()), GetIDList = js.Any.fromFunction1((t0: WIZ_CSIDL_FLAGS) => GetIDList(t0).runNow()), GetIconLocation = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (GetIconLocation(t0, t1, t2)).runNow()), GetPath = js.Any.fromFunction4((t0: String, t1: Double, t2: WIZ_WIN32_FIND_DATA, t3: Double) => (GetPath(t0, t1, t2, t3)).runNow()), GetShowCmd = js.Any.fromFunction1((t0: WIZ_SW_FLAGS) => GetShowCmd(t0).runNow()), GetWorkingDirectory = js.Any.fromFunction2((t0: String, t1: Double) => (GetWorkingDirectory(t0, t1)).runNow()), Resolve = js.Any.fromFunction2((t0: Double, t1: Double) => (Resolve(t0, t1)).runNow()), SetArguments = js.Any.fromFunction1((t0: String) => SetArguments(t0).runNow()), SetDescription = js.Any.fromFunction1((t0: String) => SetDescription(t0).runNow()), SetHotkey = js.Any.fromFunction1((t0: Double) => SetHotkey(t0).runNow()), SetIDList = js.Any.fromFunction1((t0: WIZ_CSIDL_FLAGS) => SetIDList(t0).runNow()), SetIconLocation = js.Any.fromFunction2((t0: String, t1: Double) => (SetIconLocation(t0, t1)).runNow()), SetPath = js.Any.fromFunction1((t0: String) => SetPath(t0).runNow()), SetRelativePath = js.Any.fromFunction2((t0: String, t1: Double) => (SetRelativePath(t0, t1)).runNow()), SetShowCmd = js.Any.fromFunction1((t0: WIZ_SW_FLAGS) => SetShowCmd(t0).runNow()), SetWorkingDirectory = js.Any.fromFunction1((t0: String) => SetWorkingDirectory(t0).runNow()))
      __obj.updateDynamic("AccWizObjects.WizShellLinkA_typekey")(AccWizObjectsDotWizShellLinkA_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizShellLinkA]
    }
    
    extension [Self <: WizShellLinkA](x: Self) {
      
      inline def setAccWizObjectsDotWizShellLinkA_typekey(value: WizShellLinkA): Self = StObject.set(x, "AccWizObjects.WizShellLinkA_typekey", value.asInstanceOf[js.Any])
      
      inline def setGetArguments(value: (String, Double) => Callback): Self = StObject.set(x, "GetArguments", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setGetDescription(value: (String, Double) => Callback): Self = StObject.set(x, "GetDescription", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setGetHotkey(value: Double => Callback): Self = StObject.set(x, "GetHotkey", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGetIDList(value: WIZ_CSIDL_FLAGS => Callback): Self = StObject.set(x, "GetIDList", js.Any.fromFunction1((t0: WIZ_CSIDL_FLAGS) => value(t0).runNow()))
      
      inline def setGetIconLocation(value: (String, Double, Double) => Callback): Self = StObject.set(x, "GetIconLocation", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetPath(value: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Callback): Self = StObject.set(x, "GetPath", js.Any.fromFunction4((t0: String, t1: Double, t2: WIZ_WIN32_FIND_DATA, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setGetShowCmd(value: WIZ_SW_FLAGS => Callback): Self = StObject.set(x, "GetShowCmd", js.Any.fromFunction1((t0: WIZ_SW_FLAGS) => value(t0).runNow()))
      
      inline def setGetWorkingDirectory(value: (String, Double) => Callback): Self = StObject.set(x, "GetWorkingDirectory", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setResolve(value: (Double, Double) => Callback): Self = StObject.set(x, "Resolve", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetArguments(value: String => Callback): Self = StObject.set(x, "SetArguments", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "SetDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetHotkey(value: Double => Callback): Self = StObject.set(x, "SetHotkey", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetIDList(value: WIZ_CSIDL_FLAGS => Callback): Self = StObject.set(x, "SetIDList", js.Any.fromFunction1((t0: WIZ_CSIDL_FLAGS) => value(t0).runNow()))
      
      inline def setSetIconLocation(value: (String, Double) => Callback): Self = StObject.set(x, "SetIconLocation", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetPath(value: String => Callback): Self = StObject.set(x, "SetPath", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRelativePath(value: (String, Double) => Callback): Self = StObject.set(x, "SetRelativePath", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetShowCmd(value: WIZ_SW_FLAGS => Callback): Self = StObject.set(x, "SetShowCmd", js.Any.fromFunction1((t0: WIZ_SW_FLAGS) => value(t0).runNow()))
      
      inline def setSetWorkingDirectory(value: String => Callback): Self = StObject.set(x, "SetWorkingDirectory", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
