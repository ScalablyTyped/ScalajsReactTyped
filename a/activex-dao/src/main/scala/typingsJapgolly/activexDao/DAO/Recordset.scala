package typingsJapgolly.activexDao.DAO

import typingsJapgolly.std.SafeArray
import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordset extends js.Object {
  var AbsolutePosition: Double = js.native
  val BOF: Boolean = js.native
  val BatchCollisionCount: Double = js.native
  val BatchCollisions: SafeArray[Bookmark] = js.native
  var BatchSize: Double = js.native
  var Bookmark: typingsJapgolly.activexDao.DAO.Bookmark = js.native
  val Bookmarkable: Boolean = js.native
  var CacheSize: Double = js.native
  var CacheStart: Bookmark = js.native
  var Connection: typingsJapgolly.activexDao.DAO.Connection = js.native
  val DateCreated: VarDate = js.native
  val EOF: Boolean = js.native
  val EditMode: EditModeEnum = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  var Filter: String = js.native
  var Index: String = js.native
  val LastModified: Bookmark = js.native
  val LastUpdated: VarDate = js.native
  var LockEdits: Boolean = js.native
  val Name: String = js.native
  val NoMatch: Boolean = js.native
  val ODBCFetchCount: Double = js.native
  val ODBCFetchDelay: Double = js.native
  val Parent: Database = js.native
  var PercentPosition: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: Double = js.native
  val RecordStatus: Double = js.native
  val Restartable: Boolean = js.native
  var Sort: String = js.native
  val StillExecuting: Boolean = js.native
  val Transactions: Boolean = js.native
  val Type: RecordsetTypeEnum = js.native
  val Updatable: Boolean = js.native
  var UpdateOptions: UpdateCriteriaEnum = js.native
  val ValidationRule: String = js.native
  val ValidationText: String = js.native
  val hStmt: Double = js.native
  def apply(FieldIndex: String): Field = js.native
  def apply(FieldIndex: Double): Field = js.native
  def AddNew(): Unit = js.native
  def Cancel(): Unit = js.native
  /** @param UpdateType [UpdateType=1] */
  def CancelUpdate(): Unit = js.native
  def CancelUpdate(UpdateType: Double): Unit = js.native
  def Clone(): Recordset = js.native
  def Close(): Unit = js.native
  def Collect(Item: js.Any): js.Any = js.native
  def CopyQueryDef(): QueryDef = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  def FillCache(): Unit = js.native
  def FillCache(Rows: Double): Unit = js.native
  def FillCache(Rows: Double, StartBookmark: String): Unit = js.native
  def FindFirst(Criteria: String): Unit = js.native
  def FindLast(Criteria: String): Unit = js.native
  def FindNext(Criteria: String): Unit = js.native
  def FindPrevious(Criteria: String): Unit = js.native
  def GetRows(): js.Any = js.native
  def GetRows(NumRows: Double): js.Any = js.native
  def Move(Rows: Double): Unit = js.native
  def Move(Rows: Double, StartBookmark: Bookmark): Unit = js.native
  def MoveFirst(): Unit = js.native
  /** @param Options [Options=0] */
  def MoveLast(): Unit = js.native
  def MoveLast(Options: Double): Unit = js.native
  def MoveNext(): Unit = js.native
  def MovePrevious(): Unit = js.native
  def NextRecordset(): Boolean = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  def Requery(): Unit = js.native
  def Requery(NewQueryDef: QueryDef): Unit = js.native
  def Seek(
    Comparison: String,
    Key1: js.Any,
    Key2: js.UndefOr[js.Any],
    Key3: js.UndefOr[js.Any],
    Key4: js.UndefOr[js.Any],
    Key5: js.UndefOr[js.Any],
    Key6: js.UndefOr[js.Any],
    Key7: js.UndefOr[js.Any],
    Key8: js.UndefOr[js.Any],
    Key9: js.UndefOr[js.Any],
    Key10: js.UndefOr[js.Any],
    Key11: js.UndefOr[js.Any],
    Key12: js.UndefOr[js.Any],
    Key13: js.UndefOr[js.Any]
  ): Unit = js.native
  /**
    * @param UpdateType [UpdateType=1]
    * @param Force [Force=false]
    */
  def Update(): Unit = js.native
  def Update(UpdateType: UpdateTypeEnum): Unit = js.native
  def Update(UpdateType: UpdateTypeEnum, Force: Boolean): Unit = js.native
}

