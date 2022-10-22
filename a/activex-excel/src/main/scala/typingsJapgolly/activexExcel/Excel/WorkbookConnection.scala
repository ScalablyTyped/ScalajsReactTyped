package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookConnection extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  var Description: String
  
  /* private */ @JSName("Excel.WorkbookConnection_typekey")
  var ExcelDotWorkbookConnection_typekey: WorkbookConnection
  
  var Name: String
  
  val ODBCConnection: typingsJapgolly.activexExcel.Excel.ODBCConnection
  
  val OLEDBConnection: typingsJapgolly.activexExcel.Excel.OLEDBConnection
  
  val Parent: Any
  
  def Ranges(Index: Any): Range
  @JSName("Ranges")
  val Ranges_Original: Ranges
  
  def Refresh(): Unit
  
  val Type: XlConnectionType
  
  var _Default: String
}
object WorkbookConnection {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: Callback,
    Description: String,
    ExcelDotWorkbookConnection_typekey: WorkbookConnection,
    Name: String,
    ODBCConnection: ODBCConnection,
    OLEDBConnection: OLEDBConnection,
    Parent: Any,
    Ranges: Ranges,
    Refresh: Callback,
    Type: XlConnectionType,
    _Default: String
  ): WorkbookConnection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ODBCConnection = ODBCConnection.asInstanceOf[js.Any], OLEDBConnection = OLEDBConnection.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorkbookConnection_typekey")(ExcelDotWorkbookConnection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookConnection]
  }
  
  extension [Self <: WorkbookConnection](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExcelDotWorkbookConnection_typekey(value: WorkbookConnection): Self = StObject.set(x, "Excel.WorkbookConnection_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setODBCConnection(value: ODBCConnection): Self = StObject.set(x, "ODBCConnection", value.asInstanceOf[js.Any])
    
    inline def setOLEDBConnection(value: OLEDBConnection): Self = StObject.set(x, "OLEDBConnection", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: Ranges): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setType(value: XlConnectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
