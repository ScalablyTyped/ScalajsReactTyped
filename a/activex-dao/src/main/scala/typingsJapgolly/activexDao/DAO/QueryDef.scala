package typingsJapgolly.activexDao.DAO

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.QueryDef")
@js.native
class QueryDef protected () extends js.Object {
  var CacheSize: Double = js.native
  var Connect: String = js.native
  @JSName("DAO.QueryDef_typekey")
  var DAODotQueryDef_typekey: QueryDef = js.native
  val DateCreated: VarDate = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  val LastUpdated: VarDate = js.native
  var MaxRecords: Double = js.native
  var Name: String = js.native
  var ODBCTimeout: Double = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  var Prepare: QueryDefStateEnum = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordsAffected: Double = js.native
  var ReturnsRecords: Boolean = js.native
  var SQL: String = js.native
  val StillExecuting: Boolean = js.native
  val Type: QueryDefTypeEnum = js.native
  val Updatable: Boolean = js.native
  val hStmt: Double = js.native
  def Cancel(): Unit = js.native
  def Close(): Unit = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def Execute(): Unit = js.native
  def Execute(Options: RecordsetOptionEnum): Unit = js.native
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def Parameters(Item: String): Parameter = js.native
  def Parameters(Item: Double): Parameter = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

