package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def Apply(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Sort_typekey")
  var ExcelDotSort_typekey: Sort
  
  var Header: XlYesNoGuess
  
  var MatchCase: Boolean
  
  var Orientation: XlSortOrientation
  
  val Parent: Any
  
  def Rng(Address: String): Range
  def Rng(RowIndex: Double): Range
  def Rng(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Rng")
  val Rng_Original: Range
  
  def SetRange(Rng: Range): Unit
  
  def SortFields(Index: Any): SortField
  @JSName("SortFields")
  val SortFields_Original: SortFields
  
  var SortMethod: XlSortMethod
}
object Sort {
  
  inline def apply(
    Application: Application,
    Apply: Callback,
    Creator: XlCreator,
    ExcelDotSort_typekey: Sort,
    Header: XlYesNoGuess,
    MatchCase: Boolean,
    Orientation: XlSortOrientation,
    Parent: Any,
    Rng: Range,
    SetRange: Range => Callback,
    SortFields: SortFields,
    SortMethod: XlSortMethod
  ): Sort = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = Apply.toJsFn, Creator = Creator.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], MatchCase = MatchCase.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Rng = Rng.asInstanceOf[js.Any], SetRange = js.Any.fromFunction1((t0: Range) => SetRange(t0).runNow()), SortFields = SortFields.asInstanceOf[js.Any], SortMethod = SortMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sort_typekey")(ExcelDotSort_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSort_typekey(value: Sort): Self = StObject.set(x, "Excel.Sort_typekey", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: XlYesNoGuess): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "MatchCase", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: XlSortOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRng(value: Range): Self = StObject.set(x, "Rng", value.asInstanceOf[js.Any])
    
    inline def setSetRange(value: Range => Callback): Self = StObject.set(x, "SetRange", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setSortFields(value: SortFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    inline def setSortMethod(value: XlSortMethod): Self = StObject.set(x, "SortMethod", value.asInstanceOf[js.Any])
  }
}
