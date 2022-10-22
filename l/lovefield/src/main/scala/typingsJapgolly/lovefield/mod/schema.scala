package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lovefield.mod.raw.BackStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module raw
object schema {
  
  @JSImport("lovefield", "schema")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DataStoreType extends StObject
  @JSImport("lovefield", "schema.DataStoreType")
  @js.native
  object DataStoreType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DataStoreType & Double] = js.native
    
    @js.native
    sealed trait FIREBASE
      extends StObject
         with DataStoreType
    /* 3 */ val FIREBASE: typingsJapgolly.lovefield.mod.schema.DataStoreType.FIREBASE & Double = js.native
    
    @js.native
    sealed trait INDEXED_DB
      extends StObject
         with DataStoreType
    /* 0 */ val INDEXED_DB: typingsJapgolly.lovefield.mod.schema.DataStoreType.INDEXED_DB & Double = js.native
    
    @js.native
    sealed trait LOCAL_STORAGE
      extends StObject
         with DataStoreType
    /* 2 */ val LOCAL_STORAGE: typingsJapgolly.lovefield.mod.schema.DataStoreType.LOCAL_STORAGE & Double = js.native
    
    @js.native
    sealed trait MEMORY
      extends StObject
         with DataStoreType
    /* 1 */ val MEMORY: typingsJapgolly.lovefield.mod.schema.DataStoreType.MEMORY & Double = js.native
    
    @js.native
    sealed trait WEB_SQL
      extends StObject
         with DataStoreType
    /* 4 */ val WEB_SQL: typingsJapgolly.lovefield.mod.schema.DataStoreType.WEB_SQL & Double = js.native
  }
  
  inline def create(dbName: String, dbVersion: Double): Builder = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(dbName.asInstanceOf[js.Any], dbVersion.asInstanceOf[js.Any])).asInstanceOf[Builder]
  
  @js.native
  trait Builder extends StObject {
    
    def connect(): js.Promise[typingsJapgolly.lovefield.mod.schema.Database] = js.native
    def connect(options: ConnectOptions): js.Promise[typingsJapgolly.lovefield.mod.schema.Database] = js.native
    
    def createTable(tableName: String): TableBuilder = js.native
    
    def getSchema(): typingsJapgolly.lovefield.mod.schema.Database = js.native
    
    def setPragma(pragma: DatabasePragma): Unit = js.native
  }
  
  @js.native
  trait Column
    extends StObject
       with PredicateProvider {
    
    def as(name: String): Column = js.native
    
    def getName(): String = js.native
    
    def getNormalizedName(): String = js.native
  }
  
  trait ConnectOptions extends StObject {
    
    var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.undefined
    
    var storeType: js.UndefOr[DataStoreType] = js.undefined
    
    var webSqlDbSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setOnUpgrade(value: /* rawDb */ BackStore => js.Promise[Unit]): Self = StObject.set(x, "onUpgrade", js.Any.fromFunction1(value))
      
      inline def setOnUpgradeUndefined: Self = StObject.set(x, "onUpgrade", js.undefined)
      
      inline def setStoreType(value: DataStoreType): Self = StObject.set(x, "storeType", value.asInstanceOf[js.Any])
      
      inline def setStoreTypeUndefined: Self = StObject.set(x, "storeType", js.undefined)
      
      inline def setWebSqlDbSize(value: Double): Self = StObject.set(x, "webSqlDbSize", value.asInstanceOf[js.Any])
      
      inline def setWebSqlDbSizeUndefined: Self = StObject.set(x, "webSqlDbSize", js.undefined)
    }
  }
  
  trait Database extends StObject {
    
    def name(): String
    
    def pragma(): DatabasePragma
    
    def table(tableName: String): Table
    
    def tables(): js.Array[Table]
    
    def version(): Double
  }
  object Database {
    
    inline def apply(
      name: CallbackTo[String],
      pragma: CallbackTo[DatabasePragma],
      table: String => Table,
      tables: CallbackTo[js.Array[Table]],
      version: CallbackTo[Double]
    ): typingsJapgolly.lovefield.mod.schema.Database = {
      val __obj = js.Dynamic.literal(name = name.toJsFn, pragma = pragma.toJsFn, table = js.Any.fromFunction1(table), tables = tables.toJsFn, version = version.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.lovefield.mod.schema.Database]
    }
    
    extension [Self <: typingsJapgolly.lovefield.mod.schema.Database](x: Self) {
      
      inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
      
      inline def setPragma(value: CallbackTo[DatabasePragma]): Self = StObject.set(x, "pragma", value.toJsFn)
      
      inline def setTable(value: String => Table): Self = StObject.set(x, "table", js.Any.fromFunction1(value))
      
      inline def setTables(value: CallbackTo[js.Array[Table]]): Self = StObject.set(x, "tables", value.toJsFn)
      
      inline def setVersion(value: CallbackTo[Double]): Self = StObject.set(x, "version", value.toJsFn)
    }
  }
  
  trait DatabasePragma extends StObject {
    
    var enableBundledMode: Boolean
  }
  object DatabasePragma {
    
    inline def apply(enableBundledMode: Boolean): DatabasePragma = {
      val __obj = js.Dynamic.literal(enableBundledMode = enableBundledMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabasePragma]
    }
    
    extension [Self <: DatabasePragma](x: Self) {
      
      inline def setEnableBundledMode(value: Boolean): Self = StObject.set(x, "enableBundledMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITable extends StObject {
    
    def as(name: String): Table
    
    def createRow(value: js.Object): Row
    
    def getName(): String
  }
  object ITable {
    
    inline def apply(as: String => Table, createRow: js.Object => Row, getName: CallbackTo[String]): ITable = {
      val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = getName.toJsFn)
      __obj.asInstanceOf[ITable]
    }
    
    extension [Self <: ITable](x: Self) {
      
      inline def setAs(value: String => Table): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
      
      inline def setCreateRow(value: js.Object => Row): Self = StObject.set(x, "createRow", js.Any.fromFunction1(value))
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    }
  }
  
  trait IndexedColumn extends StObject {
    
    var autoIncrement: Boolean
    
    var name: String
    
    var order: Order
  }
  object IndexedColumn {
    
    inline def apply(autoIncrement: Boolean, name: String, order: Order): IndexedColumn = {
      val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedColumn]
    }
    
    extension [Self <: IndexedColumn](x: Self) {
      
      inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawForeignKeySpec extends StObject {
    
    var action: js.UndefOr[ConstraintAction] = js.undefined
    
    var local: String
    
    var ref: String
    
    var timing: js.UndefOr[ConstraintTiming] = js.undefined
  }
  object RawForeignKeySpec {
    
    inline def apply(local: String, ref: String): RawForeignKeySpec = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawForeignKeySpec]
    }
    
    extension [Self <: RawForeignKeySpec](x: Self) {
      
      inline def setAction(value: ConstraintAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setTiming(value: ConstraintTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    }
  }
  
  trait Table
    extends StObject
       with ITable
       with /* index */ StringDictionary[Column]
  object Table {
    
    inline def apply(as: String => Table, createRow: js.Object => Row, getName: CallbackTo[String]): Table = {
      val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = getName.toJsFn)
      __obj.asInstanceOf[Table]
    }
  }
  
  @js.native
  trait TableBuilder extends StObject {
    
    def addColumn(name: String, `type`: Type): TableBuilder = js.native
    
    def addForeignKey(name: String, spec: RawForeignKeySpec): TableBuilder = js.native
    
    def addIndex(name: String, columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean, order: Order): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Unit, order: Order): TableBuilder = js.native
    
    def addNullable(columns: js.Array[String]): TableBuilder = js.native
    
    def addPrimaryKey(columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | String], autoInc: Boolean): TableBuilder = js.native
    
    def addUnique(name: String, columns: js.Array[String]): TableBuilder = js.native
  }
}
