package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.std.SafeArray
import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ODBCConnection")
@js.native
class ODBCConnection protected () extends js.Object {
  var AlwaysUseConnectionFile: Boolean = js.native
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  var BackgroundQuery: Boolean = js.native
  var CommandText: String = js.native
  var CommandType: XlCmdType = js.native
  var Connection: String = js.native
  val Creator: XlCreator = js.native
  var EnableRefresh: Boolean = js.native
  @JSName("Excel.ODBCConnection_typekey")
  var ExcelDotODBCConnection_typekey: ODBCConnection = js.native
  val Parent: js.Any = js.native
  val RefreshDate: VarDate = js.native
  var RefreshOnFileOpen: Boolean = js.native
  var RefreshPeriod: Double = js.native
  val Refreshing: Boolean = js.native
  var RobustConnect: XlRobustConnect = js.native
  var SavePassword: Boolean = js.native
  var ServerCredentialsMethod: XlCredentialsMethod = js.native
  var ServerSSOApplicationID: String = js.native
  var SourceConnectionFile: String = js.native
  var SourceData: String | SafeArray[String] | PivotTable = js.native
  var SourceDataFile: String = js.native
  def CancelRefresh(): Unit = js.native
  def Refresh(): Unit = js.native
  def SaveAsODC(ODCFileName: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String): Unit = js.native
  def SaveAsODC(ODCFileName: String, Description: String, Keywords: String): Unit = js.native
}

