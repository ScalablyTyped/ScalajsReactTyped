package typingsJapgolly.dbMigratePg

import japgolly.scalajs.react.Callback
import typingsJapgolly.dbMigrateBase.mod.CallbackFunction
import typingsJapgolly.dbMigrateBase.mod.ColumnSpec
import typingsJapgolly.dbMigrateBase.mod.InternalOptions
import typingsJapgolly.dbMigrateBase.mod.^
import typingsJapgolly.pg.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("db-migrate-pg", "PgDriver")
  @js.native
  open class PgDriver protected () extends ^ {
    def this(connection: Client, schema: String, intern: InternalOptions) = this()
    
    def createColumnConstraint(spec: ColumnSpec, options: ColumnConstraintOptions, tableName: String, columnName: String): ColumnConstraint = js.native
    
    def createDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def createDatabaseAsync(dbName: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
    def createDatabaseAsync(dbName: String, options: CreateDatabaseOptions): typingsJapgolly.bluebird.mod.^[Any] = js.native
    
    def createSequence(sqName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions, callback: CallbackFunction): Unit = js.native
    
    def createSequenceAsync(sqName: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
    def createSequenceAsync(sqName: String, options: CreateSequenceOptions): typingsJapgolly.bluebird.mod.^[Any] = js.native
    
    def dropDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def dropDatabaseAsync(dbName: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
    def dropDatabaseAsync(dbName: String, options: DropDatabaseOptions): typingsJapgolly.bluebird.mod.^[Any] = js.native
    
    def dropSequence(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions, callback: CallbackFunction): Unit = js.native
    
    def dropSequenceAsync(dbName: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
    def dropSequenceAsync(dbName: String, options: DropSequenceOptions): typingsJapgolly.bluebird.mod.^[Any] = js.native
    
    def switchDatabase(options: String, callback: CallbackFunction): Unit = js.native
    def switchDatabase(options: SwitchDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def switchDatabaseAsync(options: String): typingsJapgolly.bluebird.mod.^[Any] = js.native
    def switchDatabaseAsync(options: SwitchDatabaseOptions): typingsJapgolly.bluebird.mod.^[Any] = js.native
  }
  
  trait ColumnConstraint extends StObject {
    
    var constraints: String
    
    def foreignKey(callback: CallbackFunction): Unit
  }
  object ColumnConstraint {
    
    inline def apply(constraints: String, foreignKey: CallbackFunction => Callback): ColumnConstraint = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], foreignKey = js.Any.fromFunction1((t0: CallbackFunction) => foreignKey(t0).runNow()))
      __obj.asInstanceOf[ColumnConstraint]
    }
    
    extension [Self <: ColumnConstraint](x: Self) {
      
      inline def setConstraints(value: String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setForeignKey(value: CallbackFunction => Callback): Self = StObject.set(x, "foreignKey", js.Any.fromFunction1((t0: CallbackFunction) => value(t0).runNow()))
    }
  }
  
  trait ColumnConstraintOptions extends StObject {
    
    var emitPrimaryKey: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnConstraintOptions {
    
    inline def apply(): ColumnConstraintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnConstraintOptions]
    }
    
    extension [Self <: ColumnConstraintOptions](x: Self) {
      
      inline def setEmitPrimaryKey(value: Boolean): Self = StObject.set(x, "emitPrimaryKey", value.asInstanceOf[js.Any])
      
      inline def setEmitPrimaryKeyUndefined: Self = StObject.set(x, "emitPrimaryKey", js.undefined)
    }
  }
  
  trait CreateDatabaseOptions extends StObject
  
  trait CreateSequenceOptions extends StObject {
    
    var temp: js.UndefOr[Boolean] = js.undefined
  }
  object CreateSequenceOptions {
    
    inline def apply(): CreateSequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSequenceOptions]
    }
    
    extension [Self <: CreateSequenceOptions](x: Self) {
      
      inline def setTemp(value: Boolean): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
      
      inline def setTempUndefined: Self = StObject.set(x, "temp", js.undefined)
    }
  }
  
  trait DropDatabaseOptions extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.undefined
  }
  object DropDatabaseOptions {
    
    inline def apply(): DropDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDatabaseOptions]
    }
    
    extension [Self <: DropDatabaseOptions](x: Self) {
      
      inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  trait DropSequenceOptions extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var ifExists: js.UndefOr[Boolean] = js.undefined
    
    var restrict: js.UndefOr[Boolean] = js.undefined
  }
  object DropSequenceOptions {
    
    inline def apply(): DropSequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropSequenceOptions]
    }
    
    extension [Self <: DropSequenceOptions](x: Self) {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
      
      inline def setRestrict(value: Boolean): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
      
      inline def setRestrictUndefined: Self = StObject.set(x, "restrict", js.undefined)
    }
  }
  
  trait SwitchDatabaseOptions extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
  }
  object SwitchDatabaseOptions {
    
    inline def apply(): SwitchDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchDatabaseOptions]
    }
    
    extension [Self <: SwitchDatabaseOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
}
