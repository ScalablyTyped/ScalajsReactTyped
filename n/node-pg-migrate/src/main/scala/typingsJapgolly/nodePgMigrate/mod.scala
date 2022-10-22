package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distDbMod.DBConnection
import typingsJapgolly.nodePgMigrate.distMigrationMod.CreateOptions
import typingsJapgolly.nodePgMigrate.distMigrationMod.FilenameFormat
import typingsJapgolly.nodePgMigrate.distMigrationMod.RunMigration
import typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.default
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typingsJapgolly.nodePgMigrate.distTypesMod.Logger
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typingsJapgolly.nodePgMigrate.distTypesMod.RunnerOption
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.js_
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.sql
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-pg-migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RunMigration]]]
  
  @JSImport("node-pg-migrate", "Migration")
  @js.native
  open class Migration protected ()
    extends typingsJapgolly.nodePgMigrate.distMigrationMod.Migration {
    def this(db: DBConnection, migrationPath: String, hasUpDown: MigrationBuilderActions, options: RunnerOption) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: Unit,
      logger: Logger
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions,
      logger: Logger
    ) = this()
  }
  /* static members */
  object Migration {
    
    @JSImport("node-pg-migrate", "Migration")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(name: String, directory: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: js_ | ts | sql): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: js_ | ts | sql, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: js_ | ts | sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: js_ | ts | sql,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: Unit, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("node-pg-migrate", "PgLiteral")
  @js.native
  open class PgLiteral protected () extends default {
    def this(value: String) = this()
  }
  /* static members */
  object PgLiteral {
    
    @JSImport("node-pg-migrate", "PgLiteral")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(str: String): typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.PgLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.PgLiteral]
  }
  
  @JSImport("node-pg-migrate", "PgType")
  @js.native
  object PgType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nodePgMigrate.distTypesMod.PgType & String] = js.native
    
    /* "bigint" */ val BIGINT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BIGINT & String = js.native
    
    /* "bigserial" */ val BIGSERIAL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BIGSERIAL & String = js.native
    
    /* "bit" */ val BIT_1: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BIT_1 & String = js.native
    
    /* "bit varying" */ val BIT_VARYING: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BIT_VARYING & String = js.native
    
    /* "bool" */ val BOOL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BOOL & String = js.native
    
    /* "boolean" */ val BOOLEAN: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BOOLEAN & String = js.native
    
    /* "box" */ val BOX: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BOX & String = js.native
    
    /* "bytea" */ val BYTEA: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.BYTEA & String = js.native
    
    /* "char" */ val CHAR: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.CHAR & String = js.native
    
    /* "character" */ val CHARACTER: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.CHARACTER & String = js.native
    
    /* "character varying" */ val CHARACTER_VARYING: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING & String = js.native
    
    /* "cidr" */ val CIDR: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.CIDR & String = js.native
    
    /* "circle" */ val CIRCLE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.CIRCLE & String = js.native
    
    /* "date" */ val DATE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.DATE & String = js.native
    
    /* "double precision" */ val DOUBLE_PRECISION: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION & String = js.native
    
    /* "float4" */ val FLOAT4: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.FLOAT4 & String = js.native
    
    /* "inet" */ val INET: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INET & String = js.native
    
    /* "int" */ val INT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INT & String = js.native
    
    /* "int2" */ val INT2: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INT2 & String = js.native
    
    /* "int4" */ val INT4: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INT4 & String = js.native
    
    /* "int8" */ val INT8: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INT8 & String = js.native
    
    /* "integer" */ val INTEGER: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INTEGER & String = js.native
    
    /* "interval" */ val INTERVAL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.INTERVAL & String = js.native
    
    /* "json" */ val JSON: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.JSON & String = js.native
    
    /* "jsonb" */ val JSONB: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.JSONB & String = js.native
    
    /* "line" */ val LINE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.LINE & String = js.native
    
    /* "lseg" */ val LSEG: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.LSEG & String = js.native
    
    /* "macaddr" */ val MACADDR: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.MACADDR & String = js.native
    
    /* "money" */ val MONEY: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.MONEY & String = js.native
    
    /* "numeric" */ val NUMERIC: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.NUMERIC & String = js.native
    
    /* "path" */ val PATH: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.PATH & String = js.native
    
    /* "pg_lsn" */ val PG_LSN: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.PG_LSN & String = js.native
    
    /* "point" */ val POINT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.POINT & String = js.native
    
    /* "polygon" */ val POLYGON: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.POLYGON & String = js.native
    
    /* "real" */ val REAL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.REAL & String = js.native
    
    /* "serial" */ val SERIAL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SERIAL & String = js.native
    
    /* "serial2" */ val SERIAL2: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SERIAL2 & String = js.native
    
    /* "serial4" */ val SERIAL4: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SERIAL4 & String = js.native
    
    /* "serial8" */ val SERIAL8: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SERIAL8 & String = js.native
    
    /* "smallint" */ val SMALLINT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SMALLINT & String = js.native
    
    /* "smallserial" */ val SMALLSERIAL: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL & String = js.native
    
    /* "text" */ val TEXT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TEXT & String = js.native
    
    /* "time" */ val TIME: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIME & String = js.native
    
    /* "timestamp" */ val TIMESTAMP: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIMESTAMP & String = js.native
    
    /* "timestamptz" */ val TIMESTAMPTZ: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ & String = js.native
    
    /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE & String = js.native
    
    /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE & String = js.native
    
    /* "timetz" */ val TIMETZ: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIMETZ & String = js.native
    
    /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE & String = js.native
    
    /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE & String = js.native
    
    /* "tsquery" */ val TSQUERY: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TSQUERY & String = js.native
    
    /* "tsvector" */ val TSVECTOR: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TSVECTOR & String = js.native
    
    /* "txid_snapshot" */ val TXID_SNAPSHOT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT & String = js.native
    
    /* "uuid" */ val UUID: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.UUID & String = js.native
    
    /* "varbit" */ val VARBIT: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.VARBIT & String = js.native
    
    /* "varchar" */ val VARCHAR: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.VARCHAR & String = js.native
    
    /* "xml" */ val XML: typingsJapgolly.nodePgMigrate.distTypesMod.PgType.XML & String = js.native
  }
}
