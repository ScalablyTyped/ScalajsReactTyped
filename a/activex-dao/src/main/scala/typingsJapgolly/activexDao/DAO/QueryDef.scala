package typingsJapgolly.activexDao.DAO

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDef extends StObject {
  
  var CacheSize: Double = js.native
  
  def Cancel(): Unit = js.native
  
  def Close(): Unit = js.native
  
  var Connect: String = js.native
  
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Any): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Any): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Any): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  
  /* private */ @JSName("DAO.QueryDef_typekey")
  var DAODotQueryDef_typekey: QueryDef = js.native
  
  val DateCreated: VarDate = js.native
  
  def Execute(): Unit = js.native
  def Execute(Options: RecordsetOptionEnum): Unit = js.native
  
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  
  val LastUpdated: VarDate = js.native
  
  var MaxRecords: Double = js.native
  
  var Name: String = js.native
  
  var ODBCTimeout: Double = js.native
  
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: Unit, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Type: Unit, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Type: Unit, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  
  def Parameters(Item: String): Parameter = js.native
  def Parameters(Item: Double): Parameter = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  
  var Prepare: QueryDefStateEnum = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val RecordsAffected: Double = js.native
  
  var ReturnsRecords: Boolean = js.native
  
  var SQL: String = js.native
  
  val StillExecuting: Boolean = js.native
  
  val Type: QueryDefTypeEnum = js.native
  
  val Updatable: Boolean = js.native
  
  val hStmt: Double = js.native
}
